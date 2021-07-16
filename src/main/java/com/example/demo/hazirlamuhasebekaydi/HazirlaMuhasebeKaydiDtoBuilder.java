package com.example.demo.hazirlamuhasebekaydi;

import com.example.demo.muhasebekaydiolustur.TahsilatKaydi;

import java.util.function.Consumer;

public class HazirlaMuhasebeKaydiDtoBuilder {

    private int id;
    private String ad;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setTahsilatKaydi(TahsilatKaydi tahsilatKaydi) {
        this.id = tahsilatKaydi.getId();
        this.ad = tahsilatKaydi.getAd();
    }

    public HazirlaMuhasebeKaydiDtoBuilder ekle(Consumer<HazirlaMuhasebeKaydiDtoBuilder> function) {
        function.accept(this);
        return this;
    }

    public HazirlaMuhasebeKaydiDto olustur() {
        return new HazirlaMuhasebeKaydiDto(this);
    }
}
