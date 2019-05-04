package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class WelcomeController {
    @FXML Button deliveryButton;
    @FXML Button goToMenuButton;

    Parent root;

    @FXML
    public void deliveryPressed() throws IOException {
        root = FXMLLoader.load(getClass().getResource("deliveryInfo.fxml"));
        Stage stage = (Stage)deliveryButton.getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }

    @FXML
    public void goToMenu() throws IOException {
        root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        Stage stage = (Stage)goToMenuButton.getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }
}
