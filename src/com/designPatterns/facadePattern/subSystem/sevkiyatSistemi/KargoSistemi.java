package com.designPatterns.facadePattern.subSystem.sevkiyatSistemi;

import java.time.LocalDateTime;

public class KargoSistemi {

    private String address;

    private LocalDateTime teslimatTarihi;

    private String secilenKargoSirketiAdi;

    public void bilgilendirKargoSirketiUrunTeslimatiIcin(){
        System.out.println("Ürün teslimatı için kargo şirketine bilgilendirme yapıldı");
    }

    public KargoSistemi(String address, LocalDateTime teslimatTarihi, String secilenKargoSirketiAdi) {
        this.address = address;
        this.teslimatTarihi = teslimatTarihi;
        this.secilenKargoSirketiAdi = secilenKargoSirketiAdi;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getTeslimatTarihi() {
        return teslimatTarihi;
    }

    public void setTeslimatTarihi(LocalDateTime teslimatTarihi) {
        this.teslimatTarihi = teslimatTarihi;
    }

    public String getSecilenKargoSirketiAdi() {
        return secilenKargoSirketiAdi;
    }

    public void setSecilenKargoSirketiAdi(String secilenKargoSirketiAdi) {
        this.secilenKargoSirketiAdi = secilenKargoSirketiAdi;
    }
}
