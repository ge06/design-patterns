package com.example.demo.factory;

import com.example.demo.muhasebekaydiolustur.MuhasebeKaydiOlusturClass;
import com.example.demo.hazirlamuhasebekaydi.HazirlaMuhasebeKaydiDto;
import com.example.demo.muhasebekaydituru.MuhasebeKaydiTuruInterface;

public interface HazirlaMuhasebeKaydiFactory {

    HazirlaMuhasebeKaydiDto olustur(MuhasebeKaydiTuruInterface muhasebeKaydiTuruInterface, MuhasebeKaydiOlusturClass muhasebeKaydiOlusturClass);
}
