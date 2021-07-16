package com.example.demo.hazirlamuhasebekaydi;

import com.example.demo.muhasebekaydiolustur.MuhasebeKaydiOlusturClass;
import com.example.demo.muhasebekaydituru.MuhasebeKaydiTuruInterface;

public interface HazirlaMuhasebeKaydi {

    MuhasebeKaydiTuruInterface getMuhasebeKaydiTuru();

    HazirlaMuhasebeKaydiDto olustur(MuhasebeKaydiOlusturClass muhasebeKaydiOlusturClass);
}
