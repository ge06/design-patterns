package com.example.demo.muhasebekaydituru;

import com.example.demo.muhasebekaydiolustur.MuhasebeKaydiOlusturClass;

public interface MuhasebeKaydiTuruInterface {

    default boolean isTersCalistir(MuhasebeKaydiOlusturClass muhasebeKaydiOlusturClass) {
        return false;
    }
}
