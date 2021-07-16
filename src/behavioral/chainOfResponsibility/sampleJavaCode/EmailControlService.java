package chainOfResponsibility.sampleJavaCode;

public class EmailControlService extends AuthenticationControlService {

    @Override
    public void isValid(LoginInfo loginInfo) {
        if (loginInfo.getEmail() != null && !loginInfo.getEmail().isEmpty()) {
            System.out.println("Email is correct");
            nextControl.isValid(loginInfo);
        }else {
            System.out.println("Email is not valid. Please try again.");
    }

}
}
