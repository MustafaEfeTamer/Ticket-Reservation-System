package com.example.javafxsondeneme.firmalar;

import com.example.javafxsondeneme.Transport;
import com.example.javafxsondeneme.Admin;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Iterator;

public class FirmaAIci {

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private TextField aracNo;

    @FXML
    private TextField aracNoEkleme;

    @FXML
    private TextField aracNoSilme;

    @FXML
    private TextField koltukSayisi;

    @FXML
    private TextField seferNo;

    @FXML
    private TextField seferNoEkleme;

    @FXML
    private TextField seferNoSilme;
    @FXML
    private TextField aracNoSilmeSefer;

    @FXML
    private Label sonuc1;

    @FXML
    private Label sonuc2;

    @FXML
    private Label sonuc3;

    @FXML
    private Label sonuc4;

    @FXML
    private TextField guzergahEkleme;


    String aracNoo;
    int seferNoo;
    int koltukSayisii;
    String birlesmisMetin;
    String silinecekAracNo;
    String seferEklencekAracNo;
    int seferEklencekSeferNo;
    int seferSilincekSeferNo;
    String seferSilincekAracNo;
    String guzergah;

    private ArrayList<String> stringArrayList = new ArrayList<>();
    ArrayList<Transport> transportArrayListFromAdminA = Admin.getSharedArrayList();

    @FXML
    void aracEkleme(ActionEvent event) {
        if(transportArrayListFromAdminA == null){
            Admin admin = new Admin();
            ArrayList<Transport> transportArrayListFromAdminA2 = Admin.getSharedArrayList();
            // kullanıcıdan gerekli değerleri alıyoruz
            aracNoo = aracNo.getText();
            seferNoo = Integer.parseInt(seferNo.getText());
            koltukSayisii = Integer.parseInt(koltukSayisi.getText());
            transportArrayListFromAdminA2.add(new Transport("A Firması", "firmaA123", aracNoo, seferNoo, koltukSayisii, null, null, "12.12.2023"));
            transportArrayListFromAdminA2.add(new Transport("A Firması", "firmaA123", aracNoo, seferNoo, koltukSayisii, null, null, "13.12.2023"));
            transportArrayListFromAdminA2.add(new Transport("A Firması", "firmaA123", aracNoo, seferNoo, koltukSayisii, null, null, "14.12.2023"));
            transportArrayListFromAdminA2.add(new Transport("A Firması", "firmaA123", aracNoo, seferNoo, koltukSayisii, null, null, "15.12.2023"));
            transportArrayListFromAdminA2.add(new Transport("A Firması", "firmaA123", aracNoo, seferNoo, koltukSayisii, null, null, "16.12.2023"));
            transportArrayListFromAdminA2.add(new Transport("A Firması", "firmaA123", aracNoo, seferNoo, koltukSayisii, null, null, "17.12.2023"));
            transportArrayListFromAdminA2.add(new Transport("A Firması", "firmaA123", aracNoo, seferNoo, koltukSayisii, null, null, "18.12.2023"));

            // sadece aracNo sunu alıp String bir arrayListe atıyoruz
            stringArrayList.clear();   // stringArraylistin içine eleman atmadan önce içinin boş olduğundan emin olmak için içini siliyoruz
            for(Transport currentTransport : transportArrayListFromAdminA2){
                if(currentTransport.getKullaniciAdi().equals("A Firması") && currentTransport.getDate().equals("12.12.2023")){
                    stringArrayList.add(currentTransport.getAracNo());
                    stringArrayList.add("\n");
                }
            }
            // string arrayListi metine çeviriyoruz
            birlesmisMetin = String.join("", stringArrayList);
            sonuc1.setText(birlesmisMetin);
        }else{
            // kullanıcıdan gerekli değerleri alıyoruz
            aracNoo = aracNo.getText();
            seferNoo = Integer.parseInt(seferNo.getText());
            koltukSayisii = Integer.parseInt(koltukSayisi.getText());
            transportArrayListFromAdminA.add(new Transport("A Firması", "firmaA123", aracNoo, seferNoo, koltukSayisii, null, null, "12.12.2023"));
            transportArrayListFromAdminA.add(new Transport("A Firması", "firmaA123", aracNoo, seferNoo, koltukSayisii, null, null, "13.12.2023"));
            transportArrayListFromAdminA.add(new Transport("A Firması", "firmaA123", aracNoo, seferNoo, koltukSayisii, null, null, "14.12.2023"));
            transportArrayListFromAdminA.add(new Transport("A Firması", "firmaA123", aracNoo, seferNoo, koltukSayisii, null, null, "15.12.2023"));
            transportArrayListFromAdminA.add(new Transport("A Firması", "firmaA123", aracNoo, seferNoo, koltukSayisii, null, null, "16.12.2023"));
            transportArrayListFromAdminA.add(new Transport("A Firması", "firmaA123", aracNoo, seferNoo, koltukSayisii, null, null, "17.12.2023"));
            transportArrayListFromAdminA.add(new Transport("A Firması", "firmaA123", aracNoo, seferNoo, koltukSayisii, null, null, "18.12.2023"));

            // sadece aracNo sunu alıp String bir arrayListe atıyoruz
            stringArrayList.clear();    // stringArraylistin içine eleman atmadan önce içinin boş olduğundan emin olmak için içini siliyoruz
            for(Transport currentTransport : transportArrayListFromAdminA){
                if(currentTransport.getKullaniciAdi().equals("A Firması") && currentTransport.getDate().equals("12.12.2023")){
                    stringArrayList.add(currentTransport.getAracNo());
                    stringArrayList.add("\n");
                }
            }
            // string arrayListi metine çeviriyoruz
            birlesmisMetin = String.join("", stringArrayList);
            sonuc1.setText(birlesmisMetin);
        }
    }

    @FXML
    void aracSilme(ActionEvent event) {
        if(transportArrayListFromAdminA == null){
            Admin admin2 = new Admin();
            ArrayList<Transport> transportArrayListFromAdminA3 = Admin.getSharedArrayList();
            // kullanıcıdan gerekli değerleri alıyoruz
            silinecekAracNo = aracNoSilme.getText();
            Iterator<Transport> companyIterator = transportArrayListFromAdminA3.iterator();
            while(companyIterator.hasNext()){
                Transport tarananFirma = companyIterator.next();
                if(tarananFirma.getAracNo() == (null)){
                    continue;
                }
                if(tarananFirma.getAracNo().equals(silinecekAracNo) && tarananFirma.getKullaniciAdi().equals("A Firması")){
                    companyIterator.remove();
                }
            }
            stringArrayList.clear();     // stringArraylistin içine eleman atmadan önce içinin boş olduğundan emin olmak için içini siliyoruz
            for(Transport currentTransport : transportArrayListFromAdminA3){
                if(currentTransport.getKullaniciAdi().equals("A Firması") && currentTransport.getDate().equals("12.12.2023")){
                    stringArrayList.add(currentTransport.getAracNo());
                    stringArrayList.add("\n");
                }
            }
            // string arrayListi metine çeviriyoruz
            birlesmisMetin = String.join("", stringArrayList);
            sonuc2.setText(birlesmisMetin);
        }else{
            // kullanıcıdan gerekli değerleri alıyoruz
            silinecekAracNo = aracNoSilme.getText();
            Iterator<Transport> companyIterator = transportArrayListFromAdminA.iterator();
            while(companyIterator.hasNext()){
                Transport tarananFirma = companyIterator.next();
                if(tarananFirma.getAracNo() == (null)){
                    continue;
                }
                if(tarananFirma.getAracNo().equals(silinecekAracNo) && tarananFirma.getKullaniciAdi().equals("A Firması")){
                    companyIterator.remove();
                }
            }
            stringArrayList.clear();    // stringArraylistin içine eleman atmadan önce içinin boş olduğundan emin olmak için içini siliyoruz
            for(Transport currentTransport : transportArrayListFromAdminA){
                if(currentTransport.getKullaniciAdi().equals("A Firması") && currentTransport.getDate().equals("12.12.2023")){
                    stringArrayList.add(currentTransport.getAracNo());
                    stringArrayList.add("\n");
                }
            }
            // string arrayListi metine çeviriyoruz
            birlesmisMetin = String.join("", stringArrayList);
            sonuc2.setText(birlesmisMetin);
        }
    }

    @FXML
    void gunlukKarHesabi(ActionEvent event) {

    }

    @FXML
    void seferEkleme(ActionEvent event) {
        if(transportArrayListFromAdminA == null){
            Admin admin3 = new Admin();
            ArrayList<Transport> transportArrayListFromAdminA4 = Admin.getSharedArrayList();
            // kullanıcıdan değerleri alıyoruz
            seferEklencekAracNo = aracNoEkleme.getText();
            seferEklencekSeferNo = Integer.parseInt(seferNoEkleme.getText());
            guzergah = guzergahEkleme.getText();
            // Firma adı ve arac Nosu yardımı ile yeni güzergah ve sefer ekleme
            for(Transport transport : transportArrayListFromAdminA4){
                if(transport.getKullaniciAdi().equals("A Firması") && transport.getAracNo().equals(seferEklencekAracNo)){
                    transport.setGuzergah(guzergah);
                    transport.setSeferNo(seferEklencekSeferNo);
                }
            }
        }else{
            // kullanıcıdan değerleri alıyoruz
            seferEklencekAracNo = aracNoEkleme.getText();
            seferEklencekSeferNo = Integer.parseInt(seferNoEkleme.getText());
            guzergah = guzergahEkleme.getText();
            // Firma adı ve arac Nosu yardımı ile yeni güzergah ve sefer ekleme
            for(Transport transport : transportArrayListFromAdminA){
                if(transport.getKullaniciAdi().equals("A Firması") && transport.getAracNo().equals(seferEklencekAracNo)){
                    transport.setGuzergah(guzergah);
                    transport.setSeferNo(seferEklencekSeferNo);
                }
            }
        }
    }

    @FXML
    void seferSilme(ActionEvent event) {
        if(transportArrayListFromAdminA == null){
            Admin admin4 = new Admin();
            ArrayList<Transport> transportArrayListFromAdminA5 = Admin.getSharedArrayList();
            seferSilincekSeferNo = Integer.parseInt(seferNoSilme.getText());
            seferSilincekAracNo = aracNoSilmeSefer.getText();
            Iterator<Transport> iterator = transportArrayListFromAdminA5.iterator();
            while(iterator.hasNext()){
                Transport tarananFirma = iterator.next();
                if(tarananFirma.getSeferNo() == seferSilincekSeferNo && tarananFirma.getAracNo().equals(seferSilincekAracNo)){
                    tarananFirma.setSeferNo(0);
                    tarananFirma.setGuzergah(null);
                }
            }
        }else{
            seferSilincekSeferNo = Integer.parseInt(seferNoSilme.getText());
            seferSilincekAracNo = aracNoSilmeSefer.getText();
            Iterator<Transport> iterator = transportArrayListFromAdminA.iterator();
            while(iterator.hasNext()){
                Transport tarananFirma = iterator.next();
                if(tarananFirma.getSeferNo() == seferSilincekSeferNo && tarananFirma.getAracNo().equals(seferSilincekAracNo)){
                    tarananFirma.setSeferNo(0);
                    tarananFirma.setGuzergah(null);
                    sonuc3.setText("Arac No: " + tarananFirma.getAracNo() + "\nSefer No: " + tarananFirma.getSeferNo());
                }
            }
        }
    }
}
