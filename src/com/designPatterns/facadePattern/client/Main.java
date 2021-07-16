package com.designPatterns.facadePattern.client;

import com.designPatterns.facadePattern.facade.SiparisFacade;
import com.designPatterns.facadePattern.subSystem.Musteri;
import com.designPatterns.facadePattern.subSystem.envanterSistemi.SepettekiUrun;
import com.designPatterns.facadePattern.subSystem.odemeSistemi.Odeme;
import com.designPatterns.facadePattern.subSystem.sevkiyatSistemi.KargoSistemi;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SepettekiUrun> urunler = new ArrayList<>();
        Musteri musteri = new Musteri("müsteriAdiSoyadi", "address", "emailAddress");
        Odeme odeme = new Odeme("kartNumarasi");
        KargoSistemi kargoSistemi = new KargoSistemi(musteri.getAddress(), LocalDateTime.now(), "kargoSirketiAdi");

        urunler.add(new SepettekiUrun(1L, "x", 4, new BigDecimal(1000)));
        urunler.add(new SepettekiUrun(2L, "y", 1, new BigDecimal(1000)));
        urunler.add(new SepettekiUrun(3L, "x", 4, new BigDecimal(1000)));

        SiparisFacade siparisFacade = new SiparisFacade(urunler, odeme, kargoSistemi, musteri);


        siparisFacade.siparisVer();
    }
}
