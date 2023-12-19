package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AddPet implements Initializable {
    @FXML
    private Button add;

    @FXML
    private TextField age;

    @FXML
    private Button back;

    @FXML
    private TextField id;

    @FXML
    private TextField name;

    @FXML
    private ChoiceBox<String> status;

    @FXML
    private ChoiceBox<String> type;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        status.getItems().addAll("Adopted","Not Adopted");
        type.getItems().addAll("Dog","Cat");

        status.setOnAction(this::chooseStatus);
        type.setOnAction(this::chooseType);
    }

    public void chooseStatus(ActionEvent event)
    {
        String value1=status.getValue();
        System.out.println(value1);
    }
    public void chooseType(ActionEvent event)
    {
        String value2= type.getValue();
        System.out.println(value2);
    }
}
