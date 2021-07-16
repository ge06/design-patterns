package com.designPatterns.facadePattern.facade;

import com.designPatterns.facadePattern.subSystem.Musteri;
import com.designPatterns.facadePattern.subSystem.bildirimSistemi.EmailBildirimi;
import com.designPatterns.facadePattern.subSystem.envanterSistemi.Stok;
import com.designPatterns.facadePattern.subSystem.envanterSistemi.SepettekiUrun;
import com.designPatterns.facadePattern.subSystem.odemeSistemi.Odeme;
import com.designPatterns.facadePattern.subSystem.sevkiyatSistemi.KargoSistemi;

import java.util.List;

public class SiparisFacade {
    private Stok stok;

    private List<SepettekiUrun> sepettekiUrunListesi;

    private Odeme odeme;

    private KargoSistemi kargoSistemi;

    private Musteri musteri;

    private EmailBildirimi emailBildirimi;


    public SiparisFacade(List<SepettekiUrun> sepettekiUrunListesi, Odeme odeme, KargoSistemi kargoSistemi, Musteri musteri) {
        this.stok = new Stok();
        this.sepettekiUrunListesi = sepettekiUrunListesi;
        this.odeme = odeme;
        this.kargoSistemi = kargoSistemi;
        this.musteri = musteri;
        this.emailBildirimi = new EmailBildirimi(musteri.getEmailAddress());
    }

    public void siparisVer(){
        if(isSiparisVerUygun()){
            musteri.ekle();
            odeme.odemeYap();
            kargoSistemi.bilgilendirKargoSirketiUrunTeslimatiIcin();
            stok.guncelleStok(sepettekiUrunListesi);
            emailBildirimi.gonderEmail();
        }
        else
            throw new RuntimeException("Sipariş Onaylanamadı");
    }

    public boolean isSiparisVerUygun(){
        return odeme.isOdemeYapilbilir() && sepettekiUrunListesi.stream().allMatch(sepettekiUrun -> stok.isUrunSistemdeBulunuyor(sepettekiUrun.getUrunNo()));
    }

    public Stok getStok() {
        return stok;
    }

    public void setStok(Stok stok) {
        this.stok = stok;
    }

    public Odeme getOdeme() {
        return odeme;
    }

    public void setOdeme(Odeme odeme) {
        this.odeme = odeme;
    }

    public KargoSistemi getKargoSistemi() {
        return kargoSistemi;
    }

    public void setKargoSistemi(KargoSistemi kargoSistemi) {
        this.kargoSistemi = kargoSistemi;
    }

    public Musteri getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }

    public List<SepettekiUrun> getSepettekiUrunListesi() {
        return sepettekiUrunListesi;
    }

    public void setSepettekiUrunListesi(List<SepettekiUrun> sepettekiUrunListesi) {
        this.sepettekiUrunListesi = sepettekiUrunListesi;
    }

    public EmailBildirimi getEmailBildirimi() {
        return emailBildirimi;
    }

    public void setEmailBildirimi(EmailBildirimi emailBildirimi) {
        this.emailBildirimi = emailBildirimi;
    }
}
