package com.designPatterns.facadePattern.subSystem.envanterSistemi;

import java.util.List;

public class Stok {
    public boolean isUrunSistemdeBulunuyor(Long urunNo) {
        return true;
    }

    public void guncelleStok(List<SepettekiUrun> sepettekiUrunListesi){
        System.out.println("Stok güncellendi");
    }
}
