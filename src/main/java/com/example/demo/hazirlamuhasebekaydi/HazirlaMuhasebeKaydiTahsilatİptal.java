package com.example.demo.hazirlamuhasebekaydi;

import com.example.demo.muhasebekaydiolustur.MuhasebeKaydiOlusturClass;
import com.example.demo.muhasebekaydiolustur.TahsilatKaydi;
import com.example.demo.muhasebekaydituru.MuhasebeKaydiTuruInterface;
import com.example.demo.muhasebekaydituru.MuhasebeKaydiTuruTahsilat;
import org.springframework.stereotype.Component;

@Component
public class HazirlaMuhasebeKaydiTahsilatİptal implements HazirlaMuhasebeKaydi {

    @Override
    public MuhasebeKaydiTuruInterface getMuhasebeKaydiTuru() {
        return MuhasebeKaydiTuruTahsilat.TAHSILAT_KAYDI_IPTAL;
    }

    @Override
    public HazirlaMuhasebeKaydiDto olustur(MuhasebeKaydiOlusturClass muhasebeKaydiOlusturClass) {
        TahsilatKaydi tahsilatKaydi = (TahsilatKaydi) muhasebeKaydiOlusturClass;
        return new HazirlaMuhasebeKaydiDtoBuilder().ekle(olusturucu -> olusturucu.setTahsilatKaydi(tahsilatKaydi)).olustur();
    }
}
