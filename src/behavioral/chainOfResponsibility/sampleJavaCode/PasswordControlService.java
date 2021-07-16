package chainOfResponsibility.sampleJavaCode;

public class PasswordControlService extends AuthenticationControlService {

    @Override
    public void isValid(LoginInfo loginInfo) {
        if (loginInfo.getPassword() != null && !loginInfo.getPassword().isEmpty()){
            System.out.println("Password is correct");
            nextControl.isValid(loginInfo);
        }
        else{
            System.out.println("Password wrong.Please try again");
        }
    }
}
