package com.example.javafxsondeneme;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class SceneSwitcher {
    public void switchToNewPage(String fxml) {
        try {
            // FXML dosyasını yükle
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
            Parent root = loader.load();

            // Yeni bir sahne oluştur
            Scene newScene = new Scene(root);

            // Yeni bir aşama oluştur
            Stage newStage = new Stage();
            newStage.setTitle("Panel İçi");
            newStage.setScene(newScene);

            // Yeni sayfayı göster
            newStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
