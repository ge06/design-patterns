package com.example.demo.hazirlamuhasebekaydi;

import com.example.demo.muhasebekaydiolustur.MuhasebeKaydiOlusturClass;
import com.example.demo.muhasebekaydiolustur.TahsilatKaydi;
import com.example.demo.muhasebekaydituru.MuhasebeKaydiTuruInterface;
import com.example.demo.muhasebekaydituru.MuhasebeKaydiTuruTahsilat;
import org.springframework.stereotype.Service;

@Service
public class HazirlaMuhasebeKaydiTahsilatEkle implements HazirlaMuhasebeKaydi {

    @Override
    public MuhasebeKaydiTuruInterface getMuhasebeKaydiTuru() {
        return MuhasebeKaydiTuruTahsilat.TAHSILAT_KAYDI_EKLE;
    }

    @Override
    public HazirlaMuhasebeKaydiDto olustur(MuhasebeKaydiOlusturClass muhasebeKaydiOlusturClass) {
        return new HazirlaMuhasebeKaydiDtoBuilder().ekle(
                olusturucu -> {
                    olusturucu.setTahsilatKaydi((TahsilatKaydi) muhasebeKaydiOlusturClass);
                    olusturucu.setAd("Said");
                }
        ).olustur();
    }
}
