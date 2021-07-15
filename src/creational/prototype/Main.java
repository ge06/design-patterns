import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Uyeler uyeler = new Uyeler();
        Uye burak = new Uye("Burak");
        uyeler.uyeEkle(burak);
        Uye ahmet = new Uye("Ahmet");
        uyeler.uyeEkle(ahmet);
        uyeler.uyeEkle(new Uye("Mehmet"));

        Uyeler yeniUyeler = (Uyeler) uyeler.clone();
        burak = new Uye("burak enes");
        Uyeler yeniUyeler2 = (Uyeler) uyeler.clone();

        List<Uye> list = yeniUyeler.getUyeListesi();
        list.add(new Uye("Ayşe"));

        List<Uye> list1 = yeniUyeler2.getUyeListesi();
        list1.remove(ahmet);

        System.out.println("uyeler List: " + uyeler.getUyeListesiAdlari());
        System.out.println("yeniUye List: " + list.stream().map(uye -> uye.getName()).collect(Collectors.toList()));
        System.out.println("yeniUye2 List: " + list1.stream().map(uye -> uye.getName()).collect(Collectors.toList()));

    }
}
