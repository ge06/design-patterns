public class UnitTest extends Test {

    public UnitTest(DomainTest domainTest) {
        this.domainTest = domainTest;
    }

    @Override
    public void test() {
        this.domainTest.test();
    }
}
