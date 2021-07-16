package com.designPatterns.strategyPattern.ornek1.strategy;

public class KanuniFaizYarısı extends FaizStrategy {
    @Override
    public double hesaplaFaizTutari() {
        System.out.println("Kanuni faiz tipinde faiz hesaplandı");
        return 0;
    }
}
