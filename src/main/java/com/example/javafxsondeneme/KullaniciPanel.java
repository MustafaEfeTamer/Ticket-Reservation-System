package com.example.javafxsondeneme;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.*;

public class KullaniciPanel {
    @FXML
    private Button button1;

    @FXML
    private Button button2;


    @FXML
    private TextField biletAracAdi;

    @FXML
    private TextField biletFirmaAdi;

    @FXML
    private TextField gidisTarihi;

    @FXML
    private TextField kalkisYeri;

    @FXML
    private TextField varisYeri;

    @FXML
    private TextField yolcuSayisi;

    @FXML
    private Label sonuclar;

    @FXML
    private AnchorPane sceneKullaniciIciAnchorPane;

    ArrayList<Transport> transportArrayListFromAdminKullaniciIci = Admin.getSharedArrayList();

    String gidisTarihii;
    String kalkisYerii;
    String varisYerii;
    int yolcuSayisii;

    String biletAracNoo;
    String biletFirmaAdii;

    String[] sayilarDizisi;

    List<String> sayilarListesi;

    StringBuilder sonuclarText;

    private static ArrayList<Trip> stringArrayList = new ArrayList<>();

    SceneSwitcher sceneSwitcher = new SceneSwitcher();

    @FXML
    void onSwitchKullaniciIciClick(ActionEvent event) throws IOException {
        new SceneSwitch(sceneKullaniciIciAnchorPane, "hello-view2.fxml");
    }

    @FXML
    void seferBul(ActionEvent event) {
        if(transportArrayListFromAdminKullaniciIci == null){
            Admin admin = new Admin();
            ArrayList<Transport> transportArrayListFromAdminKullaniciIci2 = Admin.getSharedArrayList();

            // kullanıcıdan değerleri alıyoruz
            gidisTarihii = gidisTarihi.getText();
            kalkisYerii = kalkisYeri.getText();
            varisYerii = varisYeri.getText();
            yolcuSayisii = Integer.parseInt(yolcuSayisi.getText());

            sonuclarText = new StringBuilder();

            for(Transport transport : transportArrayListFromAdminKullaniciIci2){
                // Ana arrayListimizi parçalara ayırıyoruz
                if (transport == null || transport.getKoltukNumaralari() == null) {
                    continue; // null olan Company nesnelerini veya koltuk numaralarını atla
                }
                sayilarDizisi = transport.getKoltukNumaralari().split(" ");
                sayilarListesi = new ArrayList<>(Arrays.asList(sayilarDizisi));

                // Random bir şekilde sayilarListe'mizin boyutuna göre silinecek eleman sayısını belirliyoruz
                Random random = new Random();
                int silinecekSayi = random.nextInt(sayilarListesi.size() + 1);

                // sayilarListe 'mizden silinecek eleman sayısı kadar koltuk numarası siliyoruz
                if(silinecekSayi >= sayilarListesi.size()) {
                    // Eğer silinecek sayı, listenin boyutundan büyükse, listenin tamamını sil
                    sayilarListesi.clear();
                } else {
                    // Aksi takdirde, belirtilen sayıda rastgele elemanı sil
                    Collections.shuffle(sayilarListesi); // Liste içindeki elemanları karıştır
                    sayilarListesi.subList(0, silinecekSayi).clear(); // Belirtilen sayıda elemanı sil
                }

                // en son olarak label 'ımıza istenen değerleri yazdırıyoruz
                if(transport.getDate().equals(gidisTarihii) && sayilarListesi.size() >= yolcuSayisii){
                    if(transport.getGuzergah().contains(kalkisYerii) && transport.getGuzergah().contains(varisYerii) && transport.getGuzergah().indexOf(kalkisYerii) < transport.getGuzergah().indexOf(varisYerii)){
                        sonuclarText.append("Firma Adı: " + transport.getKullaniciAdi())
                                .append("  ")
                                .append("Sefer Numarası: " + transport.getSeferNo())
                                .append("  ")
                                .append("Arac Numarası: " + transport.getAracNo())
                                .append("  ")
                                .append("Boş Koltuk Sayısı: " + sayilarListesi.size())
                                .append("\n"); // Her satırı yeni bir satıra yaz
                        stringArrayList.add(new Trip(transport.getKullaniciAdi(), transport.getAracNo(), sayilarListesi.toString()));
                    }
                }
            }
            sonuclar.setText(sonuclarText.toString());
        }else{
            // kullanıcıdan değerleri alıyoruz
            gidisTarihii = gidisTarihi.getText();
            kalkisYerii = kalkisYeri.getText();
            varisYerii = varisYeri.getText();
            yolcuSayisii = Integer.parseInt(yolcuSayisi.getText());

            sonuclarText = new StringBuilder();

            for(Transport transport : transportArrayListFromAdminKullaniciIci){
                // Ana arrayListimizi parçalara ayırıyoruz
                if (transport == null || transport.getKoltukNumaralari() == null) {
                    continue; // null olan Company nesnelerini veya koltuk numaralarını atla
                }
                sayilarDizisi = transport.getKoltukNumaralari().split(" ");
                sayilarListesi = new ArrayList<>(Arrays.asList(sayilarDizisi));

                // Random bir şekilde sayilarListe'mizin boyutuna göre silinecek eleman sayısını belirliyoruz
                Random random = new Random();
                int silinecekSayi = random.nextInt(sayilarListesi.size() + 1);

                // sayilarListe 'mizden silinecek eleman sayısı kadar koltuk numarası siliyoruz
                if(silinecekSayi >= sayilarListesi.size()) {
                    // Eğer silinecek sayı, listenin boyutundan büyükse, listenin tamamını sil
                    sayilarListesi.clear();
                } else {
                    // Aksi takdirde, belirtilen sayıda rastgele elemanı sil
                    Collections.shuffle(sayilarListesi); // Liste içindeki elemanları karıştır
                    sayilarListesi.subList(0, silinecekSayi).clear(); // Belirtilen sayıda elemanı sil
                }

                // en son olarak label 'ımıza istenen değerleri yazdırıyoruz
                if(transport.getDate().equals(gidisTarihii) && sayilarListesi.size() >= yolcuSayisii){
                    if(transport.getGuzergah().contains(kalkisYerii) && transport.getGuzergah().contains(varisYerii) && transport.getGuzergah().indexOf(kalkisYerii) < transport.getGuzergah().indexOf(varisYerii)){
                        sonuclarText.append("Firma Adı: " + transport.getKullaniciAdi())
                                .append("  ")
                                .append("Sefer Numarası: " + transport.getSeferNo())
                                .append("  ")
                                .append("Arac Numarası: " + transport.getAracNo())
                                .append("  ")
                                .append("Boş Koltuk Sayısı: " + sayilarListesi.size())
                                .append("\n"); // Her satırı yeni bir satıra yaz
                        stringArrayList.add(new Trip(transport.getKullaniciAdi(), transport.getAracNo(), sayilarListesi.toString()));
                    }
                }
            }
            sonuclar.setText(sonuclarText.toString());
        }
    }

    @FXML
    void biletSec(ActionEvent event) {
        biletFirmaAdii = biletFirmaAdi.getText();
        biletAracNoo = biletAracAdi.getText();

        for(Trip trip : stringArrayList){
            if(trip.getFirmaAdi().equals(biletFirmaAdii) && trip.getAracNo().equals(biletAracNoo)){
                sceneSwitcher.switchToNewPage("hello-viewOdemeEkrani.fxml");
            }
        }
    }


    public static ArrayList<Trip> getSharedArrayList(){
        return stringArrayList;
    }
}
