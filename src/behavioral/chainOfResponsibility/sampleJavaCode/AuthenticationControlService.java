package chainOfResponsibility.sampleJavaCode;

public abstract class AuthenticationControlService {

    public AuthenticationControlService nextControl;

    public  abstract void isValid(LoginInfo loginInfo);

    public void setNext(AuthenticationControlService authenticationControlService) {
        this.nextControl=authenticationControlService;
    }
}
