
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Customer alice = new Customer("Alice", "ali@cegmail.com", "+905554443322", LocalDate.of(2000, 1, 1));


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
        ValidationResult validationResult = CustomerValidation
                .isEmailValid()
                .andThen(CustomerValidation.isPhoneNumberValid())
                .andThen(CustomerValidation.isAdultValid())
                .apply(alice);

        validationResult.getReason().ifPresent(System.out::println);

        //ILERIDE NAME VALIDATION I EKLENIRSE DIYE , OPEN CLOSED PRINCIPLE A GORE EXTENDS YAPILABILIR.
        ValidationResult nameValidationResult = CustomerValidation
                .isEmailValid()
                .andThen(CustomerValidation.isPhoneNumberValid())
                .andThen(CustomerValidation.isAdultValid())
                .andThen(CustomerNameValidation.isNameValid())
                .apply(alice);

        nameValidationResult.getReason().ifPresent(System.out::println);

    }
}
