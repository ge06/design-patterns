package com.designPatterns.facadePattern.subSystem.odemeSistemi;

public class Odeme {

    private String kartNumarasi;

    public Odeme(String kartNumarasi) {
        this.kartNumarasi = kartNumarasi;
    }

    public String getKartNumarasi() {
        return kartNumarasi;
    }

    public void setKartNumarasi(String kartNumarasi) {
        this.kartNumarasi = kartNumarasi;
    }

    public boolean isOdemeYapilbilir(){
        System.out.println("Banka sisteminden doğrulama yapıldı");
        return true;
    }

    public void odemeYap(){
        System.out.println("Odeme işlemi tamamlandı.");
    }
}
