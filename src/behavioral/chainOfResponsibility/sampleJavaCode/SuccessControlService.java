package chainOfResponsibility.sampleJavaCode;

public class SuccessControlService extends AuthenticationControlService {

    @Override
    public void isValid(LoginInfo loginInfo) {
        System.out.println("Login Succesful");
        System.out.println("Email :"+ loginInfo.getEmail());
        System.out.println("Password :" + loginInfo.getPassword().substring(0,1)+"******");
    }
}
