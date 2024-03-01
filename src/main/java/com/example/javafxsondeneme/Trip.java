package com.example.javafxsondeneme;

public class Trip {
    private String firmaAdi;
    private String aracNo;
    private String koltukSayilari;

    public Trip(String firmaAdi, String aracNo, String koltukSayilari) {
        this.firmaAdi = firmaAdi;
        this.aracNo = aracNo;
        this.koltukSayilari = koltukSayilari;
    }


    public String getFirmaAdi() {
        return firmaAdi;
    }

    public void setFirmaAdi(String firmaAdi) {
        this.firmaAdi = firmaAdi;
    }

    public String getAracNo() {
        return aracNo;
    }

    public void setAracNo(String aracNo) {
        this.aracNo = aracNo;
    }

    public String getKoltukSayilari() {
        return koltukSayilari;
    }

    public void setKoltukSayilari(String koltukSayilari) {
        this.koltukSayilari = koltukSayilari;
    }

    @Override
    public String toString() {
        return "OdemeEkrani{" +
                "firmaAdi='" + firmaAdi + '\'' +
                ", aracNo='" + aracNo + '\'' +
                ", koltukSayilari='" + koltukSayilari + '\'' +
                '}';
    }
}
