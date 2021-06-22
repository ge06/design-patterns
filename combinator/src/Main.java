
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Customer alice = new Customer("Alice", "alice@gmail.com", "5554443322", LocalDate.of(2000, 1, 1));


        /**
         * THE PROBLEM, RETURN TYPE VALIDATION RESULT
         * KENDI ANDTHEN IMIZI YAZMAMIZ GEREKIYOR
         * ONCE APPLY SONRA DIGER FUNCTION I APPLY ETMEK ICIN
         Function<Customer, Function<> isEmailValid = customer -> customer.getEmail().contains("@") ? ValidationResult.SUCCESS : ValidationResult.EMAIL_NOT_VALID;
         Function<Customer, ValidationResult> isPhoneNumberValid = customer -> customer.getPhoneNumber().startsWith("+90") ? ValidationResult.SUCCESS : ValidationResult.PHONE_NUMBER_NOT_VALID;
         Function<Customer, ValidationResult> isAdult = customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 18 ? ValidationResult.SUCCESS : ValidationResult.IS_NOT_AN_ADULT;

         isEmailValid
         .andThen(isPhoneNumberValid)
         .andThen(isAdult)
         .apply(alice);
         */

        //OOP
        CustomerRegistrationValidatorOOP oop = new CustomerRegistrationValidatorOOP();

        System.out.println(oop.isUygun(alice));

        //FP
        boolean isUygun = CustomerRegistrationValidatorFP
                .isEmailValid()
                .andThen(CustomerRegistrationValidatorFP.isPhoneNumberValid())
                .andThen(CustomerRegistrationValidatorFP.isAdultValid())
                .isUygun(alice);

        System.out.println(isUygun);
    }
}
