package chainOfResponsibility.sampleJavaCode;

public class UserControlService extends AuthenticationControlService {

    @Override
    public void isValid(LoginInfo loginInfo) {
        if (!loginInfo.getEmail().isEmpty() && !loginInfo.getPassword().isEmpty()){
            System.out.println("User exists");
            nextControl.isValid(loginInfo);
        }
        else{
            System.out.println("User not exist in db.");
        }
    }
}
