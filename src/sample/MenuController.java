package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.awt.*;
import java.io.IOException;

public class MenuController {
    @FXML Button backButton;

    Parent root;

    @FXML
    public void backPressed() throws IOException {
        root = FXMLLoader.load(getClass().getResource("welcome.fxml"));
        Stage stage = (Stage)backButton.getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }

}
