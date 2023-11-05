package com.example.regexjavadocassignment;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.regex.*;

public class HelloController {

    @FXML
    TextField FirstNameField, LastNameField, EmailField, DOBField, ZipField;

    @FXML
    Button AddButton;

    @FXML
    public void validateAll(){
        validateFirstName();
        validateLastName();


    }
    @FXML
    public int validateFirstName(){




        if (FirstNameField.getText().length()<2 || FirstNameField.getText().length()>25){
            FirstNameField.setStyle("-fx-background-color: red;");
            return 1;
        } else{
            FirstNameField.setStyle("-fx-background-color: white;");
            return 0;
        }
    }

    @FXML
    public int validateLastName(){
        String pattern = "[A-Za-z_\\s]{2,25}";
        if (LastNameField.getText().matches(pattern)){
            LastNameField.setStyle("-fx-background-color: white;");
            return 0;
        } else{
            LastNameField.setStyle("-fx-background-color: red;");
            LastNameField.requestFocus();
            return 1;
        }

    }

    @FXML
    public void validateZip(){

    }

    @FXML
    public void validateDOB(){

    }

    @FXML
    public void validateEmail(){

    }
    @FXML
    protected void onAddButtonClick() {

    }
}