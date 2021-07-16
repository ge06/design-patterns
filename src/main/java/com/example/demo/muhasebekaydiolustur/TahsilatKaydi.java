package com.example.demo.muhasebekaydiolustur;

public class TahsilatKaydi implements MuhasebeKaydiOlusturClass {

    private int id;
    private String ad;

    public TahsilatKaydi(int id, String ad) {
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
}
