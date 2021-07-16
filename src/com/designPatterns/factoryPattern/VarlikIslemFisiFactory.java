package com.designPatterns.factoryPattern;

public class VarlikIslemFisiFactory {

    public static VarlikIslemFisi getVarlikIslemFisi(String vifTuru){
        switch (vifTuru){
            case "Devretme" : return new DevretmeVarlikIslemFisi();

            case "Devralma" : return new DevralmaVarlikIslemFisi();

            case "Envanter" : return new EnvanterVarlikIslemFisi();

            default: return null;
        }
    }
}
