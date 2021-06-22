import java.time.LocalDate;
import java.time.Period;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public interface CustomerValidation extends Function<Customer, ValidationResult> {

    static CustomerValidation isEmailValid(){
        return holds(customer -> customer.getEmail().contains("@"), "EMAIL_NOT_VALID");
    }

    static CustomerValidation isPhoneNumberValid(){
        return holds(customer -> customer.getPhoneNumber().startsWith("+90") ,"PHONE_NUMBER_NOT_VALID");
    }

    static CustomerValidation isAdultValid(){
        return holds(customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 18 , "IS_NOT_AN_ADULT");
    }

    static CustomerValidation holds(Predicate<Customer> p, String message){
        return customer -> p.test(customer) ? ValidationResult.valid() : ValidationResult.invalid(message);
    }

    default CustomerValidation andThen (CustomerValidation other){
        return customer -> {
            final ValidationResult result = this.apply(customer);
            return result.isValid() ? other.apply(customer) : result;
        };
    }

}

interface ValidationResult {

    static ValidationResult valid() {
        return ValidationSupport.valid();
    }

    static ValidationResult invalid(String reason) {
        return new Invalid(reason);
    }

    boolean isValid();

    Optional<String> getReason();
}

class ValidationSupport {
    private static final ValidationResult valid = new ValidationResult() {
        public boolean isValid() {
            return true;
        }

        public Optional<String> getReason() {
            return Optional.empty();
        }
    };

    static ValidationResult valid() {
        // since all valid results are indistinguishable,
        // the same instance can be reused to reduce garbage
        return valid;
    }
}

class Invalid implements ValidationResult {

    private final String reason;

    Invalid(String reason){
        this.reason = reason;
    }

    public boolean isValid(){
        return false;
    }

    public Optional<String> getReason(){
        return Optional.of(reason);
    }

}

