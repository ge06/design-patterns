package com.designPatterns.strategyPattern.ornek2;

import com.designPatterns.strategyPattern.ornek2.context.Eleman;
import com.designPatterns.strategyPattern.ornek2.strategy.izinHesaplama.DepartmanAIzinHesap;
import com.designPatterns.strategyPattern.ornek2.strategy.izinHesaplama.DepartmanBIzinHesap;
import com.designPatterns.strategyPattern.ornek2.strategy.maasHesaplama.MuhendisMaasHesap;
import com.designPatterns.strategyPattern.ornek2.strategy.maasHesaplama.TeknisyenMaasHesap;
import com.designPatterns.strategyPattern.ornek2.strategy.maasHesaplama.YoneticiMaasHesap;

public class Main {
    public static void main (String[] args){
        Eleman eleman = new Eleman(new DepartmanAIzinHesap(), new YoneticiMaasHesap());
        int yoneticiMaas = eleman.maasHesapla();
        int yoneticiIzin = eleman.izinHesapla();

        eleman = new Eleman(new DepartmanBIzinHesap(), new MuhendisMaasHesap());
        int muhendisMaas = eleman.maasHesapla();
        int muhendisIzin = eleman.izinHesapla();

        eleman = new Eleman(new DepartmanBIzinHesap(), new TeknisyenMaasHesap());
        int teknisyenMaas = eleman.maasHesapla();
        int teknisyenIzin = eleman.izinHesapla();

        System.out.println("Yonetici maasi: " + yoneticiMaas + " Yonetici Izini: " + yoneticiIzin);
        System.out.println("Muhendis maasi: " + muhendisMaas + " Muhendis Izini: " + muhendisIzin);
        System.out.println("Teknisyen maasi: " + teknisyenMaas + " Teknisyen Izini: " + teknisyenIzin);
    }
}
