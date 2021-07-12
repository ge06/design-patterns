
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Customer alice = new Customer("Alice", "ali@cegmail.com", "+905554443322", LocalDate.of(2000, 1, 1));

        //PROBLEM ISTENEN VALIDDATION LARI COMBINE EDEMEMEK , OPEN CLOSE PRINCIPLE A UYMUYOR - CustomerRegistrationValidatorOOP
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
                .andThen(CustomerValidation.isNameValid())
                .apply(alice);

        nameValidationResult.getReason().ifPresent(System.out::println);

    }
}
