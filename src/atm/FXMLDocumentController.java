/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Ser Veresta
 */
public class FXMLDocumentController implements Initializable {

    String pin="";
    String PIN="6969";
    int chance = 3;
    int tmp;
    @FXML
    private Label label;
    @FXML
    private JFXPasswordField editPin;
    @FXML
    private JFXButton btn1;
    @FXML
    private JFXButton btn2;
    @FXML
    private JFXButton btn3;
    @FXML
    private JFXButton btn4;
    @FXML
    private JFXButton btn5;
    @FXML
    private JFXButton btn6;
    @FXML
    private JFXButton btn7;
    @FXML
    private JFXButton btn8;
    @FXML
    private JFXButton btn9;
    @FXML
    private JFXButton btnC;
    @FXML
    private JFXButton btn0;
    @FXML
    private JFXButton btnOK;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void tekan1(ActionEvent event) {
        pin += "1";
        editPin.setText(pin);
    }

    @FXML
    private void tekan2(ActionEvent event) {
         pin += "2";
         editPin.setText(pin);
    }

    @FXML
    private void tekan3(ActionEvent event) {
         pin += "3";
        editPin.setText(pin);
    }

    @FXML
    private void tekan4(ActionEvent event) {
         pin += "4";
        editPin.setText(pin);
    }

    @FXML
    private void tekan5(ActionEvent event) {
         pin += "5";
        editPin.setText(pin);
    }

    @FXML
    private void tekan6(ActionEvent event) {
         pin += "6";
        editPin.setText(pin);
    }

    @FXML
    private void tekan7(ActionEvent event) {
         pin += "7";
        editPin.setText(pin);
    }

    @FXML
    private void tekan8(ActionEvent event) {
         pin += "8";
        editPin.setText(pin);
    }

    @FXML
    private void tekan9(ActionEvent event) {
         pin += "9";
        editPin.setText(pin);
    }

    @FXML
    private void tekanC(ActionEvent event) {
         pin += "";
        editPin.setText(pin);
    }

    @FXML
    private void tekan0(ActionEvent event) {
         pin += "0";
        editPin.setText(pin);
    }

    @FXML
    private void tekanOK(ActionEvent event) {
        if(pin.equals(PIN)){
        try {
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLmenu.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 830, 450);
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Menu Awal");
            stage.show();
            
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        }
        }else{
            chance -= 1;
            JOptionPane.showMessageDialog(null,"Wrong Pin!! \nLeft"+chance+"Another Chance!");
            editPin.setText("");
            pin="";
            if(chance == 0){
                System.exit(0);
            }
        }
    }
    
}
