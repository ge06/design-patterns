package com.designPatterns.facadePattern.subSystem.bildirimSistemi;

public class EmailBildirimi {

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EmailBildirimi(String email) {
        this.email = email;
    }

    public void gonderEmail(){
        System.out.println("Siparişin onaylandığına dair email gönderildi");
    }
}
