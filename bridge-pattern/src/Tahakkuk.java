public class Tahakkuk {

    private Long id;
    private String aciklama;

    public Tahakkuk(Long id, String aciklama) {
        this.id = id;
        this.aciklama = aciklama;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
}
