package com.example.javafxsondeneme;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class AnaGirisPaneli {

    @FXML
    private AnchorPane scene2AnchorPane;

    @FXML
    void onSwitch1(ActionEvent event) throws IOException {
        new SceneSwitch(scene2AnchorPane, "hello-view.fxml");
    }


    @FXML
    void onSwitch2(ActionEvent event) throws IOException {
        new SceneSwitch(scene2AnchorPane, "hello-view1_2.fxml");
    }


    @FXML
    void onSwitch3(ActionEvent event) throws IOException {
        new SceneSwitch(scene2AnchorPane, "hello-viewKullaniciIci.fxml");
    }
}


