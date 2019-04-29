package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;


public class Controller {

    Model database = new Model();

    @FXML private Label thankYouLabel;
    @FXML private TextField first_name;
    @FXML private TextField last_name;
    @FXML private TextField phoneNumber;

    private String fnameData;
    private String lnameData;
    private String phoneNumberData;

    public void submitButtonPress() {
        fnameData = first_name.getText();
        database.firstName = fnameData;
        lnameData = last_name.getText();
        database.lastName = lnameData;
        phoneNumberData = phoneNumber.getText();
        database.phoneNumber = phoneNumberData;
        thankYouLabel.setText("Submitted");
        database.database();
    }






}
