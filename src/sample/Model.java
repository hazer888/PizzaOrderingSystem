package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Model {

    String streetAddress = "";
    String suiteAptNum = "";
    String city = "";
    String state = "";
    String zipCode = "";

    String firstName = "";
    String lastName = "";
    String email = "";
    String phoneNumber = "";


    public void database() {

        try {

            // 1.) Get a connection to the database
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza?useSSL=false", "root", "Baseball02++");

            // 2.) Create a statement
            Statement myStatement = myConnection.createStatement();

            // System.out.println("Enter SQL Query: ");
            // String query = scan.nextLine();

            String statement = "INSERT INTO pizza.address (streetAddress, aptSuiteNum, city, state, zipCode) VALUES ('" + streetAddress + "', '" + suiteAptNum + "', '" +
                    city + "', '" + state + "', '" + zipCode + "');";
            myStatement.executeUpdate(statement);

            // 3.) Execute SQL query
            ResultSet resultSet = myStatement.executeQuery("select * from address");

            // 4.) Process the result set
            while (resultSet.next()) {
                System.out.println(resultSet.getString("streetAddress") + ", " + resultSet.getString("city"));
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
