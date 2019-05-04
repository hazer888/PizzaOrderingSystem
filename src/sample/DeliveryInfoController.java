package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;


public class DeliveryInfoController extends MenuController {

    Model database = new Model();


    @FXML private TextField streetAddress;
    @FXML private TextField suiteAptNum;
    @FXML private TextField city;
    @FXML private ComboBox state;
    @FXML private TextField zipCode;

    private String streetAddressData;
    private String suiteAptNumData;
    private String cityData;
    private String stateData;
    private String zipCodeData;

    public void submitButtonPress() {
        streetAddressData = streetAddress.getText();
        database.streetAddress = streetAddressData;

        suiteAptNumData = suiteAptNum.getText();
        database.suiteAptNum = suiteAptNumData;

        cityData = city.getText();
        database.city = cityData;

        stateData = state.getValue().toString();
        database.state = stateData;

        zipCodeData = zipCode.getText();
        database.zipCode = zipCodeData;


       // thankYouLabel.setText("Submitted");

        // insert person table below like above with address info and connect new button at checkout

        database.database();
    }








}
