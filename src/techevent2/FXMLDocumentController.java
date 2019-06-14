/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techevent2;

import edu.esprit.services.implementation.UserService;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Youssef Jaballi
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private TextField Login;
    @FXML
    private TextField Pasword;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws Exception {
        UserService us = new UserService();
               try {
                   us.authentication(Login.getText(), Pasword.getText());
                   Parent root= FXMLLoader.load(getClass().getResource("FXMLaffiche.fxml"));
                   Login.getScene().setRoot(root);
                   
               } catch (SQLException ex) {
                   System.out.println("failed");
                   //Logger.getLogger(FXMLajoutController.class.getName()).log(Level.SEVERE, null, ex);
               } catch (IOException ex) {
                   System.out.println("failed");
                   //Logger.getLogger(FXMLajoutController.class.getName()).log(Level.SEVERE, null, ex);
               }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
