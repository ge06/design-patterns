package chainOfResponsibility.sampleJavaCode;

public class LoginConfigurationService {

    public static AuthenticationControlService createControlChain() {
        AuthenticationControlService emailControlService = new EmailControlService();
        AuthenticationControlService loginControlService = new PasswordControlService();
        AuthenticationControlService userControlService = new UserControlService();
        AuthenticationControlService success = new SuccessControlService();

        emailControlService.setNext(loginControlService);
        loginControlService.setNext(userControlService);
        userControlService.setNext(success);

        System.out.println("--------");
        System.out.println();
        System.out.println("Control steps sequences;");
        System.out.println("STEP 1-> control email, is valid go step2. If not valid stop.");
        System.out.println("STEP 2-> control password is valid go step3. If not valid stop.");
        System.out.println("STEP 3-> control user exsists is db if success go step3. If not valid stop.");
        System.out.println("STEP 4-> everthing is ok. Print login info.");

        return emailControlService;
    }
}
