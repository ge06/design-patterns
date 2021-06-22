import java.time.LocalDate;
import java.time.Period;

import java.util.function.Function;

public interface CustomerRegistrationValidatorFP extends Function<Customer, ValidationResult> {

    static CustomerRegistrationValidatorFP isEmailValid(){
        return customer -> customer.getEmail().contains("@") ? ValidationResult.SUCCESS : ValidationResult.EMAIL_NOT_VALID;
    }

    static CustomerRegistrationValidatorFP isPhoneNumberValid(){
        return customer -> customer.getPhoneNumber().startsWith("+90") ? ValidationResult.SUCCESS : ValidationResult.PHONE_NUMBER_NOT_VALID;
    }

    static CustomerRegistrationValidatorFP isAdultValid(){
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 18 ? ValidationResult.SUCCESS : ValidationResult.IS_NOT_AN_ADULT;
    }

    default CustomerRegistrationValidatorFP andThen (CustomerRegistrationValidatorFP other){
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(ValidationResult.SUCCESS) ? other.apply(customer) : result;
        };
    }

    default boolean isUygun(Customer customer){
        ValidationResult validationResult = this.apply(customer);
        if(!validationResult.equals(ValidationResult.SUCCESS)){
            System.out.println("LOG: "+validationResult);
            return false;
        }
        return true;
    }

}

