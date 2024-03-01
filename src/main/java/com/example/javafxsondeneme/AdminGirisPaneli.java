package com.example.javafxsondeneme;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class AdminGirisPaneli {
    @FXML
    private Button button;

    @FXML
    private PasswordField sifre;

    @FXML
    private Label sonuc;

    @FXML
    private TextField userName;

    @FXML
    private AnchorPane scene1AnchorPane;

    SceneSwitcher sceneSwitcher = new SceneSwitcher();

    @FXML
    void onSwitch2Click(ActionEvent event) throws IOException {
        new SceneSwitch(scene1AnchorPane, "hello-view2.fxml");
    }

    @FXML
    void girisYap(ActionEvent event) {
        if (userName.getText().equals("admin") && sifre.getText().equals("admin123")){
            sonuc.setText("Admin paneline başarı ile giriş yapılmıştır");
            sceneSwitcher.switchToNewPage("hello-viewAdminIci.fxml");
        }else{
            sonuc.setText("Kullanıcı adı veya şifre hatalıdır");
        }
    }
}