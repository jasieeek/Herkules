package pl.herkules.controller;

import javafx.fxml.FXML;

import java.awt.event.ActionEvent;


public class MenuController {

    @FXML
    public void sss(ActionEvent event) {
        System.out.println("Cos");
    }

    @FXML
    public void exit(ActionEvent event){
        System.exit(0);
    }

    public void sss(javafx.event.ActionEvent event) {
        System.out.println("cos");
    }

    public void exit(javafx.event.ActionEvent event) {
        System.exit(0);
    }
}
