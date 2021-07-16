package com.designPatterns.strategyPattern.ornek1.context;

import com.designPatterns.strategyPattern.ornek1.strategy.FaizStrategy;

public class Faiz {

    private FaizStrategy faizStrategy;

    public FaizStrategy getFaizStrategy() {
        return faizStrategy;
    }

    public void setFaizStrategy(FaizStrategy faizStrategy) {
        this.faizStrategy = faizStrategy;
    }
}
