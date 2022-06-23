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
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Roldan
 */
public class EscenarioController implements Initializable {
        
        //EscenarioController EscenarioVentana;
        //PreguntasPuertasController PPuertas;
        String Respuesta = "";
        public Button gate8, gate7, gate6, gate5, gate4, gate3, gate2, gate1;
        public boolean gate8State, gate7State, gate6State, gate5State, 
                gate4State, gate3State, gate2State, gate1State ;
            
        
        @FXML
        public Label labelPruebas;
        
        //METODOS DE LOS BOTONES DE LOS COFRES
        @FXML
        public void handleButtonCofre1(ActionEvent event)throws Exception{
            //labelPruebas.setText("Boton1");           
        }
        public void handleButtonCofre2(ActionEvent event){
            //labelPruebas.setText("Boton2");
            
        }
        public void handleButtonCofre3(ActionEvent event){
            //labelPruebas.setText("Boton3");
        }
        public void handleButtonCofre4(ActionEvent event){
            //labelPruebas.setText("Boton4");
        }
        public void handleButtonCofre5(ActionEvent event){
            //labelPruebas.setText("Boton5");
        }
        public void handleButtonCofre6(ActionEvent event){
            //labelPruebas.setText("Boton6");
        }
        public void handleButtonCofre7(ActionEvent event){
            //labelPruebas.setText("Boton7");
        }
        public void handleButtonCofre8(ActionEvent event){
            //labelPruebas.setText("Boton8");
        }
        public void handleButtonCofre9(ActionEvent event) throws Exception{
            if (gate7State)
                PreguntaCofres("/view/preguntasCofres.fxml",event);
            else
                JOptionPane.showMessageDialog(null, "Se debe abrir primero la puerta"); 
        }
        ///METODOS DE LOS BOTONES DE LAS PUERTAS
        public void handleButtonGate8(ActionEvent event)throws Exception{
            PreguntaPuerta("/view/preguntasPuertas.fxml" , event, 8);
        }
        public void handleButtonGate7(ActionEvent event) throws Exception{
            if (gate8State)
            PreguntaPuerta("/view/preguntasPuertas.fxml" , event, 7);
            else 
                JOptionPane.showMessageDialog(null, "Se debe abrir primero la puerta principal");
        }
        public void handleButtonGate6(ActionEvent event)throws Exception{
            if (gate8State)
            PreguntaPuerta("/view/preguntasPuertas.fxml" , event, 6);
            else 
                JOptionPane.showMessageDialog(null, "Se debe abrir primero la puerta principal");
        }
        public void handleButtonGate5(ActionEvent event)throws Exception{
            if (gate8State)
            PreguntaPuerta("/view/preguntasPuertas.fxml" , event, 5);
            else 
                JOptionPane.showMessageDialog(null, "Se debe abrir primero la puerta principal");
        }
        public void handleButtonGate4(ActionEvent event)throws Exception{
            if (gate8State)
            PreguntaPuerta("/view/preguntasPuertas.fxml" , event, 4);
            else 
                JOptionPane.showMessageDialog(null, "Se debe abrir primero la puerta principal");
        }
        public void handleButtonGate3(ActionEvent event)throws Exception{
            if (gate8State)
            PreguntaPuerta("/view/preguntasPuertas.fxml" , event, 3);
            else 
                JOptionPane.showMessageDialog(null, "Se debe abrir primero la puerta principal");
        }
        public void handleButtonGate2(ActionEvent event)throws Exception{
            if (gate8State)
            PreguntaPuerta("/view/preguntasPuertas.fxml" , event, 2);
            else 
                JOptionPane.showMessageDialog(null, "Se debe abrir primero la puerta principal");
        }
        public void handleButtonGate1(ActionEvent event)throws Exception{
            if (gate8State && gate7State && gate6State && gate5State
                    && gate4State && gate3State && gate2State)
            PreguntaPuerta("/view/preguntasPuertas.fxml" , event, 1);
            else 
                JOptionPane.showMessageDialog(null, "Se deben abrir primero todas las puertas para abrir la sala final");
        }
        
        public void recibirRpt (String texto){
            labelPruebas.setText("BotonRpt");
            Respuesta = texto;
            if (Respuesta == "RespuestaCorrecta"){
                gate7.setVisible(false);
                gate7State = true;
            }  
         
        }
        public void recibirRptCofre (String texto){
            labelPruebas.setText("BotonRpt");
            Respuesta = texto;
            if (gate7State){
                if (Respuesta == "RespuestaCorrecta"){
                    JOptionPane.showMessageDialog(null, "CofreAbierto");              
                } 
            }
        }      
       
        public void setStateGates(boolean gate1, boolean gate2, boolean gate3
        , boolean gate4, boolean gate5, boolean gate6, boolean gate7, boolean gate8){
            gate8State = gate8;
            gate7State = gate7;
            gate6State = gate6;
            gate5State = gate5;
            gate4State = gate4;
            gate3State = gate3;
            gate2State = gate2;
            gate1State = gate1;
            if (gate8State)
                this.gate8.setVisible(false);
            if (gate7State)
                this.gate7.setVisible(false);
            if (gate6State)
                this.gate6.setVisible(false);
            if (gate5State)
                this.gate5.setVisible(false);
            if (gate4State)
                this.gate4.setVisible(false);
            if (gate3State)
                this.gate3.setVisible(false);
            if (gate2State)
                this.gate2.setVisible(false);
            if (gate1State)
                this.gate1.setVisible(false);  
        }
        
        
        
        
        public void loadStage(String url, Event evt)throws Exception{
        
        Object evtSource = evt.getSource();
        Node NodoSource = (Node) evtSource;
        Scene EscenaAnt = NodoSource.getScene();
        Window VentanaActual = EscenaAnt.getWindow();
        Stage stage = (Stage) VentanaActual;
        stage.hide();
               
        Parent root = (Parent) FXMLLoader.load(getClass().getResource(url));
        Scene EscenaNueva = new Scene(root);
        Stage StageNuevo = new Stage();
        StageNuevo.setScene(EscenaNueva);      
        StageNuevo.show();        
        
     }
        
        public void PreguntaPuerta(String Url, Event evt, int numGate)throws Exception{   
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource(Url));

            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            
            PreguntasPuertasController Puerta = (PreguntasPuertasController)fxmlLoader.getController();
            Puerta.getStateGates(gate8State,gate7State,gate6State,gate5State
            ,gate4State,gate3State,gate2State,gate1State);
            Puerta.setPuertaActual(numGate);
            stage.show();
            
            Object evtSource = evt.getSource();
            Node NodoSource = (Node) evtSource;
            Scene EscenaAnt = NodoSource.getScene();
            Window VentanaActual = EscenaAnt.getWindow();
            Stage stage1 = (Stage) VentanaActual;
            stage1.hide();
     }
        
        public void PreguntaCofres(String Url, Event evt)throws Exception{   
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource(Url));

            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            
            PreguntasCofresController Cofre = (PreguntasCofresController)fxmlLoader.getController();
            Cofre.getStateGates(gate8State, gate7State, gate6State, gate5State,
                    gate4State, gate3State, gate2State, gate1State);
            stage.show();
            
            Object evtSource = evt.getSource();
            Node NodoSource = (Node) evtSource;
            Scene EscenaAnt = NodoSource.getScene();
            Window VentanaActual = EscenaAnt.getWindow();
            Stage stage1 = (Stage) VentanaActual;
            stage1.hide();
     }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //EscenarioVentana = this;
        //gate8.setVisible(false);
    }    
    
}
