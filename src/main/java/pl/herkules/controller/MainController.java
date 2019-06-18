package pl.herkules.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pl.herkules.addtives.FileSelect;
import pl.herkules.scan.DietScan;

import java.io.File;
import java.io.IOException;

public class MainController {
    @FXML
    public void load(ActionEvent event) throws IOException {
        FileSelect fileSelect = new FileSelect();
        File tmpFile = fileSelect.openFile();
        if (tmpFile == null) {
            System.out.println("You don't choose a file. Try again.");
        } else {
            System.out.println("I process data...");
            DietScan scan = new DietScan();
            //skanowanie

            String text;
            text = scan.scan();

            if (!text.isEmpty()){
                System.out.println("Twoj raport: " + text);
                System.out.println("Przejscie do menu");
                Parent go = FXMLLoader.load((getClass().getResource("/fxml/menuScene.fxml")));
                Scene menuScene = new Scene(go);

                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(menuScene);
                window.setResizable(false);
                window.show();
            }
            else
                System.out.println("Nic nie znalazlem");
        }
    }
}
