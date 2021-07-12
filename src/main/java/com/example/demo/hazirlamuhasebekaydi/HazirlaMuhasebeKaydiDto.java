package com.example.demo.hazirlamuhasebekaydi;

public class HazirlaMuhasebeKaydiDto {

    private int id;
    private String ad;

    public HazirlaMuhasebeKaydiDto(int id, String ad) {
        this.id = id;
        this.ad = ad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    @Override
    public String toString() {
        return "HazirlaMuhasebeKaydiDto{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                '}';
    }

    public HazirlaMuhasebeKaydiDto(HazirlaMuhasebeKaydiDtoBuilder muhasebeKaydiDtoBuilder) {
        this.id = muhasebeKaydiDtoBuilder.getId();
        this.ad = muhasebeKaydiDtoBuilder.getAd();
    }
}
