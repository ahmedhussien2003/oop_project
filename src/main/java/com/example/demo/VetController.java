package com.example.demo;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import main.MyListener;
import oop.vet;

import java.io.IOException;
import java.util.Objects;

public class VetController {
    @FXML
    private Label vetid;

    @FXML
    private Label vetname;

    @FXML
    private Label vetpassword;

    @FXML
    private SplitMenuButton vetpet;


    @FXML
    private void click(MouseEvent mouseEvent) {
        myListener.onClickListener(vet2);
    }
    private vet vet2;
    private MyListener myListener;

    public void setData(vet vet2, MyListener myListener) {
        this.vet2 = vet2;
        this.myListener = myListener;
        vetname.setText(vet2.getName());
        vetid.setText(vet2.getId());
        vetpassword.setText(vet2.getPhone());
        vetpet.setText("12");
//        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/vet1.jpg")));
//        vetimage.setImage(image);



    }

}
