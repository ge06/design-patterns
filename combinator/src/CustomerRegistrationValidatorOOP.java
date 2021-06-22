import java.time.LocalDate;
import java.time.Period;

public class CustomerRegistrationValidatorOOP {

    public boolean isUygun(Customer customer){
        return isEmailValid(customer) &&
                isPhoneNumberValid(customer) &&
                isAdult(customer) ;
    }

    private boolean isEmailValid(Customer customer) {
        if(customer.getEmail().contains("@")){
            return true;
        }
        System.out.println("LOG: Email not valid");
        return false;
    }

    private boolean isPhoneNumberValid(Customer customer) {
        if(customer.getPhoneNumber().startsWith("+90")){
            return true;
        }
        System.out.println("LOG: Phone number not valid");
        return false;
    }

    private boolean isAdult(Customer customer){
        if(Period.between(customer.getDob(), LocalDate.now()).getYears() > 18){
            return true;
        }
        System.out.println("LOG: Customer is not adult");
        return false;
    }
}
