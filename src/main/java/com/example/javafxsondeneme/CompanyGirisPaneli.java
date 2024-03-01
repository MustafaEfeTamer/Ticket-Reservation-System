package com.example.javafxsondeneme;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.ArrayList;

public class CompanyGirisPaneli {
    @FXML
    private Button button;

    @FXML
    private PasswordField sifre;

    @FXML
    private Label sonuc;

    @FXML
    private TextField userName;

    @FXML
    private AnchorPane scene1_2AnchorPane;

    SceneSwitcher sceneSwitcher = new SceneSwitcher();


    @FXML
    void onSwitch1_2Click(ActionEvent event) throws IOException {
        new SceneSwitch(scene1_2AnchorPane, "hello-view2.fxml");
    }

    ArrayList<Transport> transportArrayListFromAdmin = Admin.getSharedArrayList(); // HelloControlAdminIci nin nesnesini oluşturmadan arraylistine ulaşmamı sağladı bu metod

    @FXML
    void girisYap(ActionEvent event) {
        if(userName.getText().equals("Firma A") && sifre.getText().equals("firmaA123")){
            if(transportArrayListFromAdmin == (null)){
                sonuc.setText("A firmasının paneline başarı ile giriş yapılmıştır");
                sceneSwitcher.switchToNewPage("hello-viewFirmaAIci.fxml");
            }else{
                for(int i = 0; i< transportArrayListFromAdmin.size(); i++){
                    if(transportArrayListFromAdmin.get(i).getKullaniciAdi().contains("A Firması")){
                        sonuc.setText("A firmasının paneline başarı ile giriş yapılmıştır");
                        sceneSwitcher.switchToNewPage("hello-viewFirmaAIci.fxml");
                        break;
                    }else if(i == transportArrayListFromAdmin.size()-1){
                        sonuc.setText("Kullanıcı adı veya şifre hatalıdırr");
                    }
                }
            }
        }else if(userName.getText().equals("Firma B") && sifre.getText().equals("firmaB123")){
            if(transportArrayListFromAdmin == (null)){
                sonuc.setText("B firmasının paneline başarı ile giriş yapılmıştır");
                sceneSwitcher.switchToNewPage("hello-viewFirmaBIci.fxml");
            }else{
                for(int i = 0; i< transportArrayListFromAdmin.size(); i++){
                    if(transportArrayListFromAdmin.get(i).getKullaniciAdi().contains("B Firması")){
                        sonuc.setText("B firmasının paneline başarı ile giriş yapılmıştır");
                        sceneSwitcher.switchToNewPage("hello-viewFirmaBIci.fxml");
                        break;
                    }else if(i == transportArrayListFromAdmin.size()-1){
                        sonuc.setText("Kullanıcı adı veya şifre hatalıdırr");
                    }
                }
            }
        }else if(userName.getText().equals("Firma C") && sifre.getText().equals("firmaC123")){
            if(transportArrayListFromAdmin == (null)){
                sonuc.setText("C firmasının paneline başarı ile giriş yapılmıştır");
                sceneSwitcher.switchToNewPage("hello-viewFirmaCIci.fxml");
            }else{
                for(int i = 0; i< transportArrayListFromAdmin.size(); i++){
                    if(transportArrayListFromAdmin.get(i).getKullaniciAdi().contains("C Firması")){
                        sonuc.setText("C firmasının paneline başarı ile giriş yapılmıştır");
                        sceneSwitcher.switchToNewPage("hello-viewFirmaCIci.fxml");
                        break;
                    }else if(i == transportArrayListFromAdmin.size()-1){
                        sonuc.setText("Kullanıcı adı veya şifre hatalıdırr");
                    }
                }
            }
        }else if(userName.getText().equals("Firma D") && sifre.getText().equals("firmaD123")){
            if(transportArrayListFromAdmin == (null)){
                sonuc.setText("D firmasının paneline başarı ile giriş yapılmıştır");
                sceneSwitcher.switchToNewPage("hello-viewFirmaDIci.fxml");
            }else{
                for(int i = 0; i< transportArrayListFromAdmin.size(); i++){
                    if(transportArrayListFromAdmin.get(i).getKullaniciAdi().contains("D Firması")){
                        sonuc.setText("D firmasının paneline başarı ile giriş yapılmıştır");
                        sceneSwitcher.switchToNewPage("hello-viewFirmaDIci.fxml");
                        break;
                    }else if(i == transportArrayListFromAdmin.size()-1){
                        sonuc.setText("Kullanıcı adı veya şifre hatalıdırr");
                    }
                }
            }
        }else if(userName.getText().equals("Firma F") && sifre.getText().equals("firmaF123")){
            if(transportArrayListFromAdmin == (null)){
                sonuc.setText("F firmasının paneline başarı ile giriş yapılmıştır");
                sceneSwitcher.switchToNewPage("hello-viewFirmaFIci.fxml");
            }else{
                for(int i = 0; i< transportArrayListFromAdmin.size(); i++){
                    if(transportArrayListFromAdmin.get(i).getKullaniciAdi().contains("F Firması")){
                        sonuc.setText("F firmasının paneline başarı ile giriş yapılmıştır");
                        sceneSwitcher.switchToNewPage("hello-viewFirmaFIci.fxml");
                        break;
                    }else if(i == transportArrayListFromAdmin.size()-1){
                        sonuc.setText("Kullanıcı adı veya şifre hatalıdırr");
                    }
                }
            }
        }else{
            sonuc.setText("Kullanıcı adı veya şifre hatalıdır");
        }
    }
}
