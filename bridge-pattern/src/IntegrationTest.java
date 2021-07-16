public class IntegrationTest extends Test {

    public IntegrationTest(DomainTest domainTest) {
        this.domainTest = domainTest;
    }

    @Override
    public void test() {
        openTransaction();
        this.domainTest.test();
        rollback();
    }

    private void openTransaction() {

    }

    private void rollback() {

    }
}
