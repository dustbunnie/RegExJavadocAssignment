package com.example.regexjavadocassignment;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
/**
 * @author emily grega
 *
 */
public class HelloController {





    boolean flag = false;
    @FXML
    TextField FirstNameField, LastNameField, EmailField, DOBField, ZipField;

    @FXML
    Button AddButton;

    public void initialize() {
        /**
         * Checks all fields for validity
         * @param null
         * @return null
         *
         */
        // First name field
        FirstNameField.setOnKeyPressed(event -> {

            if (event.getCode() != KeyCode.TAB && flag) {
                FirstNameField.setStyle("-fx-border-color: black ; -fx-border-width: 1px ;");


                flag = false;
            }

        });
        FirstNameField.focusedProperty().addListener((observable, oldValue, newValue) -> {

                if (FirstNameField.getText().matches("[A-Za-z_\\s]{2,25}")) {
                    FirstNameField.setEditable(false);
                    FirstNameField.setBorder(null);
                } else {

                    FirstNameField.setStyle("-fx-border-color: red ; -fx-border-width: 4px ;");
                    FirstNameField.setVisible(true);
                    FirstNameField.requestFocus();
                    flag = true;
                }});


// Last name field

                LastNameField.setOnKeyPressed(event -> {

                    if (event.getCode() != KeyCode.TAB && flag) {
                        LastNameField.setStyle("-fx-border-color: black ; -fx-border-width: 1px ;");


                        flag = false;
                    }

                });
                LastNameField.focusedProperty().addListener((observable2, oldValue2, newValue2) -> {

                        if (LastNameField.getText().matches("[A-Za-z_\\s]{2,25}")) {
                            LastNameField.setEditable(false);
                            LastNameField.setBorder(null);
                        } else {

                            LastNameField.setStyle("-fx-border-color: red ; -fx-border-width: 4px ;");
                            LastNameField.setVisible(true);
                            LastNameField.requestFocus();
                            flag = true;
                        }


        });
//Email field

        EmailField.setOnKeyPressed(event -> {

            if (event.getCode() != KeyCode.TAB && flag) {
                EmailField.setStyle("-fx-border-color: black ; -fx-border-width: 1px ;");


                flag = false;
            }

        });
        EmailField.focusedProperty().addListener((observable, oldValue, newValue) -> {

            if (EmailField.getText().matches("[A-Za-z0-9]{3,15}@farmingdale.edu")) {
                EmailField.setEditable(false);
                EmailField.setBorder(null);
            } else {

                EmailField.setStyle("-fx-border-color: red ; -fx-border-width: 4px ;");
                EmailField.setVisible(true);
                EmailField.requestFocus();
                flag = true;
            }});



//Date of Birth Field
        DOBField.setOnKeyPressed(event -> {

            if (event.getCode() != KeyCode.TAB && flag) {
                DOBField.setStyle("-fx-border-color: black ; -fx-border-width: 1px ;");


                flag = false;
            }

        });
        DOBField.focusedProperty().addListener((observable, oldValue, newValue) -> {

            if (DOBField.getText().matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")) {

                DOBField.setEditable(false);
                DOBField.setBorder(null);
            } else {

                DOBField.setStyle("-fx-border-color: red ; -fx-border-width: 4px ;");
                DOBField.setVisible(true);
                DOBField.requestFocus();
                flag = true;
            }});

//Zip Code Field

        ZipField.setOnKeyPressed(event -> {

            if (event.getCode() != KeyCode.TAB && flag) {
                ZipField.setStyle("-fx-border-color: black ; -fx-border-width: 1px ;");


                flag = false;
            }

        });
        ZipField.focusedProperty().addListener((observable, oldValue, newValue) -> {

            if (ZipField.getText().matches("\\d{5}")) {
                System.out.println("Matches");
                ZipField.setEditable(false);
                ZipField.setBorder(null);

                AddButton.setDisable(false);
            } else {

                ZipField.setStyle("-fx-border-color: red ; -fx-border-width: 4px ;");
                ZipField.setVisible(true);
                ZipField.requestFocus();
                flag = true;


            }});

    }

    @FXML
    public void onAddButtonClick(){

System.out.println("UI changes here");

    }
}