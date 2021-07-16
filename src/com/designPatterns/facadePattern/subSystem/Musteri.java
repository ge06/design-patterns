package com.designPatterns.facadePattern.subSystem;

public class Musteri {

    private Long musteriId;

    private String musteriAdiSoyadi;

    private String address;

    private String emailAddress;

    public Musteri(String musteriAdiSoyadi, String address, String emailAddress) {
        this.musteriAdiSoyadi = musteriAdiSoyadi;
        this.address = address;
        this.emailAddress = emailAddress;
    }

    public void ekle(){
    }

    public Long getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(Long musteriId) {
        this.musteriId = musteriId;
    }

    public String getMusteriAdiSoyadi() {
        return musteriAdiSoyadi;
    }

    public void setMusteriAdiSoyadi(String musteriAdiSoyadi) {
        this.musteriAdiSoyadi = musteriAdiSoyadi;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
