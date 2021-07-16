package com.designPatterns.factoryPattern;

public class Main {
    public static void main(String[] args) {
     final VarlikIslemFisi varlikIslemFisi = VarlikIslemFisiFactory.getVarlikIslemFisi("Devretme");
     varlikIslemFisi.onayla();
    }
}
