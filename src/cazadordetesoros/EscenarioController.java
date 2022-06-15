/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cazadordetesoros;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.Window;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Roldan
 */
public class EscenarioController implements Initializable {
    
        public Button gate8;
        public Button gate7;
        public Button gate6;
        public Button gate5;
        public Button gate4;
        public Button gate3;
        public Button gate2;
        public Button gate1;
        
        @FXML
        public Label labelPruebas;
        
        //METODOS DE LOS BOTONES DE LOS COFRES
        @FXML
        public void handleButtonCofre1(ActionEvent event){
            labelPruebas.setText("Boton1");
        }
        public void handleButtonCofre2(ActionEvent event){
            labelPruebas.setText("Boton2");
        }
        public void handleButtonCofre3(ActionEvent event){
            labelPruebas.setText("Boton3");
        }
        public void handleButtonCofre4(ActionEvent event){
            labelPruebas.setText("Boton4");
        }
        public void handleButtonCofre5(ActionEvent event){
            labelPruebas.setText("Boton5");
        }
        public void handleButtonCofre6(ActionEvent event){
            labelPruebas.setText("Boton6");
        }
        public void handleButtonCofre7(ActionEvent event){
            labelPruebas.setText("Boton7");
        }
        public void handleButtonCofre8(ActionEvent event){
            labelPruebas.setText("Boton8");
        }
        public void handleButtonCofre9(ActionEvent event){
            labelPruebas.setText("Boton9");
            JOptionPane.showMessageDialog(null, "Cofre9");
        }
        ///METODOS DE LOS BOTONES DE LAS PUERTAS
        public void handleButtonGate8(ActionEvent event)throws Exception{
            loadStage("/view/preguntasPuertas.fxml" , event);
            labelPruebas.setText("gate8");
            //gate8.setVisible(false);
        }
        public void handleButtonGate7(ActionEvent event){
            labelPruebas.setText("gate7");
            gate7.setVisible(false);
        }
        public void handleButtonGate6(ActionEvent event){
            labelPruebas.setText("gate6");
            gate6.setVisible(false);
        }
        public void handleButtonGate5(ActionEvent event){
            labelPruebas.setText("gate5");
            gate5.setVisible(false);
        }
        public void handleButtonGate4(ActionEvent event){
            labelPruebas.setText("gate4");
            gate4.setVisible(false);
        }
        public void handleButtonGate3(ActionEvent event){
            labelPruebas.setText("gate3");
            gate3.setVisible(false);
        }
        public void handleButtonGate2(ActionEvent event){
            labelPruebas.setText("gate2");
            gate2.setVisible(false);
        }
        public void handleButtonGate1(ActionEvent event){
            labelPruebas.setText("gate1");
            gate1.setVisible(false);
        }
        
        
        public void loadStage(String url, Event evt)throws Exception{
        
        Object evtSource = evt.getSource();
        Node NodoSource = (Node) evtSource;
        Scene EscenaAnt = NodoSource.getScene();
        Window VentanaActual = EscenaAnt.getWindow();
        Stage stage = (Stage) VentanaActual;
        //stage.hide();
        
        Parent root = (Parent) FXMLLoader.load(getClass().getResource(url));
        Scene EscenaNueva = new Scene(root);
        Stage StageNuevo = new Stage();
        StageNuevo.setScene(EscenaNueva);
        StageNuevo.show();        
        
     }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
