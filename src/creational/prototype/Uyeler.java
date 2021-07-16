import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Uyeler implements Cloneable {

    private List<Uye> uyeListesi;

    public Uyeler() {
        uyeListesi = new ArrayList<Uye>();
    }

    public Uyeler(List<Uye> liste) {
        this.uyeListesi = liste;
    }

    public void uyeEkle(Uye uye) {
        uyeListesi.add(uye);
    }

    public List<Uye> getUyeListesi() {
        return uyeListesi;
    }


    public List<String > getUyeListesiAdlari() {
        return uyeListesi.stream().map(uye -> uye.getName()).collect(Collectors.toList());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<Uye> uyeListesi = new ArrayList<Uye>();
        for (Uye uye : this.getUyeListesi()) {
            uyeListesi.add(uye);
        }
        return new Uyeler(uyeListesi);
    }
}