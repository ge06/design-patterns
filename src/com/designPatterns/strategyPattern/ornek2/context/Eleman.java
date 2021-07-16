package com.designPatterns.strategyPattern.ornek2.context;

import com.designPatterns.strategyPattern.ornek2.strategy.izinHesaplama.IzinHesap;
import com.designPatterns.strategyPattern.ornek2.strategy.maasHesaplama.MaasHesap;

public class Eleman {

    private IzinHesap izinHesap;

    private MaasHesap maasHesap;

    public Eleman(IzinHesap izinHesap, MaasHesap maasHesap) {
        this.izinHesap = izinHesap;
        this.maasHesap = maasHesap;
    }

    public int izinHesapla(){
        return izinHesap.izinHesapla();
    }

    public int maasHesapla(){
        return maasHesap.maasHesapla();
    }
}
