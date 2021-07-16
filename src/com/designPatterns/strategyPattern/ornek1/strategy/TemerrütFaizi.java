package com.designPatterns.strategyPattern.ornek1.strategy;

public class TemerrütFaizi extends FaizStrategy {
    @Override
    public double hesaplaFaizTutari() {
        System.out.println("Temerrüt Faizi tipinde faiz hesaplandı");
        return 0;
    }
}
