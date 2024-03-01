package com.example.javafxsondeneme;

public class Transport {
    private String kullaniciAdi;
    private String sifre;
    private String aracNo;
    private int seferNo;
    private int koltukNo;
    private String guzergah;
    private String koltukNumaralari;
    private String date;


    public Transport(String kullaniciAdi, String sifre, String aracNo, int seferNo, int koltukNo, String guzergah, String koltukNumaralari, String date) {
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        this.aracNo = aracNo;
        this.seferNo = seferNo;
        this.koltukNo = koltukNo;
        this.guzergah = guzergah;
        this.koltukNumaralari = koltukNumaralari;
        this.date = date;
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

    public String getAracNo() {
        return aracNo;
    }

    public void setAracNo(String aracNo) {
        this.aracNo = aracNo;
    }

    public int getSeferNo() {
        return seferNo;
    }

    public void setSeferNo(int seferNo) {
        this.seferNo = seferNo;
    }

    public int getKoltukNo() {
        return koltukNo;
    }

    public void setKoltukNo(int koltukNo) {
        this.koltukNo = koltukNo;
    }

    public String getGuzergah() {
        return guzergah;
    }

    public void setGuzergah(String guzergah) {
        this.guzergah = guzergah;
    }

    public String getKoltukNumaralari() {
        return koltukNumaralari;
    }

    public void setKoltukNumaralari(String koltukNumaralari) {
        this.koltukNumaralari = koltukNumaralari;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
