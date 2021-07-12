package com.example.demo.factory;

import com.example.demo.hazirlamuhasebekaydi.HazirlaMuhasebeKaydi;
import com.example.demo.hazirlamuhasebekaydi.HazirlaMuhasebeKaydiDto;
import com.example.demo.muhasebekaydiolustur.MuhasebeKaydiOlusturClass;
import com.example.demo.muhasebekaydituru.MuhasebeKaydiTuruInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Component
public class HazirlaMuhasebeKaydiFactoryImpl implements HazirlaMuhasebeKaydiFactory {

    Map<MuhasebeKaydiTuruInterface, HazirlaMuhasebeKaydi> lookUpMap;

    @Autowired
    public HazirlaMuhasebeKaydiFactoryImpl(Set<HazirlaMuhasebeKaydi> setOfHazirlaMuhasebeKaydi) {
        lookUpMap = new HashMap<>();
        setOfHazirlaMuhasebeKaydi.forEach(
                item -> lookUpMap.put(item.getMuhasebeKaydiTuru(), item)
        );
    }

    @Override
    public HazirlaMuhasebeKaydiDto olustur(MuhasebeKaydiTuruInterface muhasebeKaydiTuruInterface, MuhasebeKaydiOlusturClass muhasebeKaydiOlusturClass) {
        return lookUpMap.get(muhasebeKaydiTuruInterface).olustur(muhasebeKaydiOlusturClass);
    }
}
