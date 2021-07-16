public class Main {

    public static void main(String[] args) {
        
        //Dependency inversion kullanılıp, object inject edilir. Böylelikle iki obje arasındaki coupling azalır.
        
        //Composition over inheritance mantığında, UnitTest i extends eden TestTahakkuk class ı oluşturulsaydı, ileride UnitTest içerisinde yapılabilecek
        //bir kod parçası değişimi TestTahhakkuk classının içersinde problemlere sebep olabilir. Bu da Open Closed principle a uymayan bir casedir.
        
        //Bridge Pattern ile Implmentasyonlar ile Abstractionlar birbirinden ayrılır. Bu şekilde değişimlere açık hale gelecektir.
        
        UnitTest tahakkukUnitTest = new UnitTest(new TestTahakkuk());
        tahakkukUnitTest.test();
    }
}
