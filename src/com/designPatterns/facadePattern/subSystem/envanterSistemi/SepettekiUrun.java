package com.designPatterns.facadePattern.subSystem.envanterSistemi;

import java.math.BigDecimal;

public class SepettekiUrun {
    private Long urunNo;

    private String urunAdi;

    private Integer adet;

    private BigDecimal fiyat;


    public SepettekiUrun(Long urunNo, String urunAdi, Integer adet, BigDecimal fiyat) {
        this.urunNo = urunNo;
        this.urunAdi = urunAdi;
        this.adet = adet;
        this.fiyat = fiyat;
    }

    public Integer getAdet() {
        return adet;
    }

    public void setAdet(Integer adet) {
        this.adet = adet;
    }

    public BigDecimal getFiyat() {
        return fiyat;
    }

    public void setFiyat(BigDecimal fiyat) {
        this.fiyat = fiyat;
    }

    public Long getUrunNo() {
        return urunNo;
    }

    public void setUrunNo(Long urunNo) {
        this.urunNo = urunNo;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }
}
