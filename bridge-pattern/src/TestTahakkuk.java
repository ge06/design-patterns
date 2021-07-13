public class TestTahakkuk implements DomainTest {

    @Override
    public void test() {
        Tahakkuk tahakkuk = new Tahakkuk(1L, "aciklama");
        if(!tahakkuk.getId().equals(2L)) throw new RuntimeException("Hatali case");
    }
}
