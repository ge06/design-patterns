package com.designPatterns.strategyPattern.ornek1;

import com.designPatterns.strategyPattern.ornek1.context.Faiz;
import com.designPatterns.strategyPattern.ornek1.strategy.BorclarKanunuFaizi;

public class Main {
    public static void main(String[] args) {
        Faiz faiz = new Faiz();
        faiz.setFaizStrategy(new BorclarKanunuFaizi());

        faiz.getFaizStrategy().hesaplaFaizTutari();
    }
}
