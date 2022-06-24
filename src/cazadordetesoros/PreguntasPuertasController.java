/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cazadordetesoros;

import java.net.URL;
import java.util.ResourceBundle;
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
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Roldan
 */
public class PreguntasPuertasController implements Initializable {
    
        EscenarioController Escenario;
        public Button btnPuerta;
        
        public Label Pregunta;
        
        public int puertaActual, puntajeActual;
        
        public boolean gate8State, gate7State, gate6State, gate5State, 
                gate4State, gate3State, gate2State, gate1State ;
        public boolean cofre9State, cofre8State, cofre7State, cofre6State, cofre5State, 
                cofre4State, cofre3State, cofre2State, cofre1State ;
        public int intCofre9, intCofre8 , intCofre7, intCofre6 , intCofre5,
                intCofre4, intCofre3, intCofre2, intCofre1;  

        
        public void handleButtonRpt1(ActionEvent event)throws Exception{
            setStateTheGate(puertaActual);
            JOptionPane.showMessageDialog(null, "Respuesta correcta puerta abierta");
            EnvioRespuesta("RespuestaCorrecta", event);
        }
        public void handleButtonRpt2(ActionEvent event)throws Exception{
            JOptionPane.showMessageDialog(null, "Respuesta incorrecta");
            /*if (gate1State)
                JOptionPane.showMessageDialog(null, "true");
            else
                JOptionPane.showMessageDialog(null, "false");*/
            EnvioRespuesta("RespuestaIncorrecta", event);
        }
        public void handleButtonRpt3(ActionEvent event)throws Exception{
            EnvioRespuesta("RespuestaIncorrecta", event);
            JOptionPane.showMessageDialog(null, "Respuesta incorrecta");
        }
        public void handleButtonRpt4(ActionEvent event)throws Exception{
            EnvioRespuesta("RespuestaIncorrecta", event);
            JOptionPane.showMessageDialog(null, "Respuesta incorrecta");
        }
        
        public void getPuntajeActual(int num){
            puntajeActual = num;
        }
        
        public void getStateGates(boolean gate8, boolean gate7, boolean gate6
        , boolean gate5, boolean gate4, boolean gate3, boolean gate2, boolean gate1){
            gate8State = gate8;
            gate7State = gate7;
            gate6State = gate6;
            gate5State = gate5;
            gate4State = gate4;
            gate3State = gate3;
            gate2State = gate2;
            gate1State = gate1;
        }
        
        public void setStateTheGate(int num){
            switch(num){
                case 1:
                       gate1State = true;
                    break;
                case 2:
                       gate2State = true;
                    break;
                case 3:
                       gate3State = true;
                    break;
                case 4:
                       gate4State = true;
                    break;
                case 5:
                       gate5State = true;
                    break;
                case 6:
                       gate6State = true;
                    break;
                case 7:
                       gate7State = true;
                    break;
                case 8:
                       gate8State = true;
                    break; 
            }
        }
        
        public void setPuertaActual(int num){
            puertaActual = num;
        }
        
        public void getEstadoCofres(boolean cofre1, boolean cofre2, boolean cofre3,
        boolean cofre4, boolean cofre5, boolean cofre6, boolean cofre7, boolean cofre8, boolean cofre9){
            cofre1State = cofre1;
            cofre2State = cofre2;
            cofre3State = cofre3;
            cofre4State = cofre4;
            cofre5State = cofre5;
            cofre6State = cofre6;
            cofre7State = cofre7;
            cofre8State = cofre8;
            cofre9State = cofre9;
        }
        
        public void getIntentos(int num1, int num2, int num3, int num4, int num5
                , int num6, int num7, int num8, int num9){
            intCofre1 = num1;
            intCofre2 = num2;
            intCofre3 = num3;
            intCofre4 = num4;
            intCofre5 = num5;
            intCofre6 = num6;
            intCofre7 = num7;
            intCofre8 = num8;
            intCofre9 = num9;
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
        
        public void EnvioRespuesta(String Rpt, Event evt)throws Exception{   
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/view/Escenario.fxml"));

            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            
            EscenarioController Escenario = (EscenarioController)fxmlLoader.getController();
            //Escenario.recibirRpt(Rpt);
            Escenario.setStateGates(gate1State, gate2State, gate3State, gate4State, gate5State,
                    gate6State, gate7State, gate8State);
            Escenario.setEstadoCofres(cofre1State, cofre2State, cofre3State, cofre4State, 
                    cofre5State, cofre6State, cofre7State, cofre8State, cofre9State);
            Escenario.setIntentos(intCofre1, intCofre2, intCofre3, intCofre4, intCofre5, 
                    intCofre6, intCofre7, intCofre8, intCofre9);
            Escenario.setPuntajeActual(puntajeActual);
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
        //PuertasVentana = this;
    }    
    
}
