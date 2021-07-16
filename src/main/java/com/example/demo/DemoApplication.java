package com.example.demo;

import com.example.demo.factory.HazirlaMuhasebeKaydiFactory;
import com.example.demo.hazirlamuhasebekaydi.HazirlaMuhasebeKaydiDto;
import com.example.demo.muhasebekaydiolustur.TahsilatKaydi;
import com.example.demo.muhasebekaydituru.MuhasebeKaydiTuruTahsilat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    @Lazy HazirlaMuhasebeKaydiFactory hazirlaMuhasebeKaydiFactory;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        HazirlaMuhasebeKaydiDto hazirlaMuhasebeKaydiDto = hazirlaMuhasebeKaydiFactory.olustur(MuhasebeKaydiTuruTahsilat.TAHSILAT_KAYDI_IPTAL, new TahsilatKaydi(1, "Mahmut"));
        HazirlaMuhasebeKaydiDto furkan = hazirlaMuhasebeKaydiFactory.olustur(MuhasebeKaydiTuruTahsilat.TAHSILAT_KAYDI_EKLE, new TahsilatKaydi(2, "Furkan"));

        System.out.println(hazirlaMuhasebeKaydiDto);
        System.out.println(furkan);
    }
}
