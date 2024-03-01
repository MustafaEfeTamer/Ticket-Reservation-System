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

public class FirmaBIci {


    @FXML
    private TextField aracNo;

    @FXML
    private TextField aracNoEkleme;

    @FXML
    private TextField aracNoSilme;

    @FXML
    private TextField aracNoSilmeSefer;

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
    private TextField guzergahEkleme;

    @FXML
    private TextField koltukSayisi;

    @FXML
    private TextField seferNo;

    @FXML
    private TextField seferNoEkleme;

    @FXML
    private TextField seferNoSilme;

    @FXML
    private Label sonuc1;

    @FXML
    private Label sonuc2;

    @FXML
    private Label sonuc3;

    @FXML
    private Label sonuc4;

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
    ArrayList<Transport> transportArrayListFromAdminB = Admin.getSharedArrayList();

    @FXML
    void aracEkleme(ActionEvent event) {
        if(transportArrayListFromAdminB == null){
            Admin admin = new Admin();
            ArrayList<Transport> transportArrayListFromAdminB2 = Admin.getSharedArrayList();
            // kullanıcıdan gerekli değerleri alıyoruz
            aracNoo = aracNo.getText();
            seferNoo = Integer.parseInt(seferNo.getText());
            koltukSayisii = Integer.parseInt(koltukSayisi.getText());
            transportArrayListFromAdminB2.add(new Transport("B Firması", "firmaB123", aracNoo, seferNoo, koltukSayisii, null, null, "12.12.2023"));
            transportArrayListFromAdminB2.add(new Transport("B Firması", "firmaB123", aracNoo, seferNoo, koltukSayisii, null, null, "13.12.2023"));
            transportArrayListFromAdminB2.add(new Transport("B Firması", "firmaB123", aracNoo, seferNoo, koltukSayisii, null, null, "14.12.2023"));
            transportArrayListFromAdminB2.add(new Transport("B Firması", "firmaB123", aracNoo, seferNoo, koltukSayisii, null, null, "15.12.2023"));
            transportArrayListFromAdminB2.add(new Transport("B Firması", "firmaB123", aracNoo, seferNoo, koltukSayisii, null, null, "16.12.2023"));
            transportArrayListFromAdminB2.add(new Transport("B Firması", "firmaB123", aracNoo, seferNoo, koltukSayisii, null, null, "17.12.2023"));
            transportArrayListFromAdminB2.add(new Transport("B Firması", "firmaB123", aracNoo, seferNoo, koltukSayisii, null, null, "18.12.2023"));

            // sadece aracNo sunu alıp String bir arrayListe atıyoruz
            stringArrayList.clear();   // stringArraylistin içine eleman atmadan önce içinin boş olduğundan emin olmak için içini siliyoruz
            for(Transport currentTransport : transportArrayListFromAdminB2){
                if(currentTransport.getKullaniciAdi().equals("B Firması") && currentTransport.getDate().equals("12.12.2023")){
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
            transportArrayListFromAdminB.add(new Transport("B Firması", "firmaB123", aracNoo, seferNoo, koltukSayisii, null, null, "12.12.2023"));
            transportArrayListFromAdminB.add(new Transport("B Firması", "firmaB123", aracNoo, seferNoo, koltukSayisii, null, null, "13.12.2023"));
            transportArrayListFromAdminB.add(new Transport("B Firması", "firmaB123", aracNoo, seferNoo, koltukSayisii, null, null, "14.12.2023"));
            transportArrayListFromAdminB.add(new Transport("B Firması", "firmaB123", aracNoo, seferNoo, koltukSayisii, null, null, "15.12.2023"));
            transportArrayListFromAdminB.add(new Transport("B Firması", "firmaB123", aracNoo, seferNoo, koltukSayisii, null, null, "16.12.2023"));
            transportArrayListFromAdminB.add(new Transport("B Firması", "firmaB123", aracNoo, seferNoo, koltukSayisii, null, null, "17.12.2023"));
            transportArrayListFromAdminB.add(new Transport("B Firması", "firmaB123", aracNoo, seferNoo, koltukSayisii, null, null, "18.12.2023"));

            // sadece aracNo sunu alıp String bir arrayListe atıyoruz
            stringArrayList.clear();    // stringArraylistin içine eleman atmadan önce içinin boş olduğundan emin olmak için içini siliyoruz
            for(Transport currentTransport : transportArrayListFromAdminB){
                if(currentTransport.getKullaniciAdi().equals("B Firması") && currentTransport.getDate().equals("12.12.2023")){
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
        if(transportArrayListFromAdminB == null){
            Admin admin2 = new Admin();
            ArrayList<Transport> transportArrayListFromAdminB3 = Admin.getSharedArrayList();
            // kullanıcıdan gerekli değerleri alıyoruz
            silinecekAracNo = aracNoSilme.getText();
            Iterator<Transport> companyIterator = transportArrayListFromAdminB3.iterator();
            while(companyIterator.hasNext()){
                Transport tarananFirma = companyIterator.next();
                if(tarananFirma.getAracNo() == (null)){
                    continue;
                }
                if(tarananFirma.getAracNo().equals(silinecekAracNo) && tarananFirma.getKullaniciAdi().equals("B Firması")){
                    companyIterator.remove();
                }
            }
            // stringArraylistin içine eleman atmadan önce içinin boş olduğundan emin olmak için içini siliyoruz
            stringArrayList.clear();     // stringArraylistin içine eleman atmadan önce içinin boş olduğundan emin olmak için içini siliyoruz
            for(Transport currentTransport : transportArrayListFromAdminB3){
                if(currentTransport.getKullaniciAdi().equals("B Firması") && currentTransport.getDate().equals("12.12.2023")){
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
            Iterator<Transport> companyIterator = transportArrayListFromAdminB.iterator();
            while(companyIterator.hasNext()){
                Transport tarananFirma = companyIterator.next();
                if(tarananFirma.getAracNo() == (null)){
                    continue;
                }
                if(tarananFirma.getAracNo().equals(silinecekAracNo) && tarananFirma.getKullaniciAdi().equals("B Firması")){
                    companyIterator.remove();
                }
            }
            stringArrayList.clear();    // stringArraylistin içine eleman atmadan önce içinin boş olduğundan emin olmak için içini siliyoruz
            for(Transport currentTransport : transportArrayListFromAdminB){
                if(currentTransport.getKullaniciAdi().equals("B Firması") && currentTransport.getDate().equals("12.12.2023")){
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
        if(transportArrayListFromAdminB == null){
            Admin admin3 = new Admin();
            ArrayList<Transport> transportArrayListFromAdminB4 = Admin.getSharedArrayList();
            // kullanıcıdan değerleri alıyoruz
            seferEklencekAracNo = aracNoEkleme.getText();
            seferEklencekSeferNo = Integer.parseInt(seferNoEkleme.getText());
            guzergah = guzergahEkleme.getText();
            // Firma adı ve arac Nosu yardımı ile yeni güzergah ve sefer ekleme
            for(Transport transport : transportArrayListFromAdminB4){
                if(transport.getKullaniciAdi().equals("B Firması") && transport.getAracNo().equals(seferEklencekAracNo)){
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
            for(Transport transport : transportArrayListFromAdminB){
                if(transport.getKullaniciAdi().equals("B Firması") && transport.getAracNo().equals(seferEklencekAracNo)){
                    transport.setGuzergah(guzergah);
                    transport.setSeferNo(seferEklencekSeferNo);
                }
            }
        }
    }

    @FXML
    void seferSilme(ActionEvent event) {
        if(transportArrayListFromAdminB == null){
            Admin admin4 = new Admin();
            ArrayList<Transport> transportArrayListFromAdminB5 = Admin.getSharedArrayList();
            seferSilincekSeferNo = Integer.parseInt(seferNoSilme.getText());
            seferSilincekAracNo = aracNoSilmeSefer.getText();
            Iterator<Transport> iterator = transportArrayListFromAdminB5.iterator();
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
            Iterator<Transport> iterator = transportArrayListFromAdminB.iterator();
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
