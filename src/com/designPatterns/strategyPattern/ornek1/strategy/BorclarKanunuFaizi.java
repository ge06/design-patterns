package com.designPatterns.strategyPattern.ornek1.strategy;

public class BorclarKanunuFaizi extends FaizStrategy {
    @Override
    public double hesaplaFaizTutari() {
        System.out.println("Borclar Kanunu Faizi tipinde faiz hesaplandı");
        return 0;
    }
}
