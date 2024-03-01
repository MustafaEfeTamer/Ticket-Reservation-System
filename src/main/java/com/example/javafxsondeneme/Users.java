package com.example.javafxsondeneme;

public abstract class Users {

    public String kullaniciAdi;
    public String sifre;


    public Users(String kullaniciAdi, String sifre) {
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    abstract void sistemeGiris();

    public void aracEkle(){

    }

    public void aracSil(){

    }

    public void seferEkle(){

    }

    public void seferCikar(){

    }

    public void gunlukKarHesabi(){

    }
}
