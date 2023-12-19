package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class TotalMoney implements Initializable {
    @FXML
    private Button backButton;

    @FXML
    private Button calculateButton;

    @FXML
    private GridPane donatedMoneyGrid;

    @FXML
    private ScrollPane scroll;

    @FXML
    private TextField totalMoneyBox;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
