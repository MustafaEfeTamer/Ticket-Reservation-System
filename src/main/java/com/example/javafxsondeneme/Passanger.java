package com.example.javafxsondeneme;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Arrays;

public class Passanger {


    @FXML
    private Label bosKoltuklarLabel;

    @FXML
    private Label rezerveEdilmislerLabel;

    @FXML
    private Label basariMesaji;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private TextField a1;

    @FXML
    private TextField a2;

    @FXML
    private TextField a3;

    @FXML
    private TextField a4;

    @FXML
    private TextField a5;

    private String koltukNumarasi;
    private String yolcuAdi;
    private String yolcuSoyadi;
    private String TcKimlik;
    private String dogumTarihi;


    ArrayList<Trip> trip = KullaniciPanel.getSharedArrayList();
    ArrayList<String> kullaniciBilgileri = new ArrayList<>();
    StringBuilder sonuclarText = new StringBuilder();


    @FXML
    void bosKoltuklar(ActionEvent event) {
        // StringBuilder'ı sıfırla
        sonuclarText.setLength(0);
        sonuclarText.append("").append(trip.get(0).getKoltukSayilari());
        bosKoltuklarLabel.setText(sonuclarText.toString());
    }


    @FXML
    void rezerveEdilmisler(ActionEvent event) {

    }

    @FXML
    void odemeYap(ActionEvent event) {
        basariMesaji.setText("Ödeme başarıyla yapılmıştır");
        koltukNumarasi = a1.getText();
        yolcuAdi = a2.getText();
        yolcuSoyadi = a3.getText();
        TcKimlik = a4.getText();
        dogumTarihi = a5.getText();
        kullaniciBilgileri.add(koltukNumarasi);
        kullaniciBilgileri.add(yolcuAdi);
        kullaniciBilgileri.add(yolcuSoyadi);
        kullaniciBilgileri.add(TcKimlik);
        kullaniciBilgileri.add(dogumTarihi);
    }
}
