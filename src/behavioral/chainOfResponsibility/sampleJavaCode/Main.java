package chainOfResponsibility.sampleJavaCode;

public class Main {

    public static void main(String[] args) {

        LoginInfo loginInfo = new LoginInfo();
        loginInfo.setEmail("test@mail.com");
        loginInfo.setPassword("pass");


        AuthenticationControlService controlService = LoginConfigurationService.createControlChain();
        System.out.println("---------------");
        System.out.println("Case: Happy Path");
        controlService.isValid(loginInfo);

        System.out.println("---------------");
        System.out.println("Case: There is no email info");

        LoginInfo loginInfo2 = new LoginInfo();
        controlService.isValid(loginInfo2);

        System.out.println("---------------");
        System.out.println("Case: There is no pass info");

        LoginInfo loginInfo3 = new LoginInfo();
        loginInfo3.setEmail("test3@test");
        controlService.isValid(loginInfo3);
    }

}
