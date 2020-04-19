/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olamundoxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

/**
 *
 * @author Gabriel Toth
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblM;
    private Button btnC;
            
    @FXML
    private void clicouBotao(ActionEvent event) {
        lblM.setText("Ou clica né, e era apenas um botão... :(");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
