/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cazadordetesoros;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
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
public class PreguntasCofresController implements Initializable {
    
        Label Pregunta;
        
        public int cofreActual, puntajeActual;
        
        public boolean gate8State, gate7State, gate6State, gate5State, 
                gate4State, gate3State, gate2State, gate1State ;
        public boolean cofre9State, cofre8State, cofre7State, cofre6State, cofre5State, 
                cofre4State, cofre3State, cofre2State, cofre1State ;
        public int intCofre9, intCofre8 , intCofre7, intCofre6 , intCofre5,
                intCofre4, intCofre3, intCofre2, intCofre1;  

        public void handleButtonRpt1(ActionEvent event)throws Exception{
            setEstadoCofres(cofreActual);
            setIntentosCofres(cofreActual);
            puntajeActual += 100;
            JOptionPane.showMessageDialog(null, "Respuesta correcta, cofre abierto con un valor de 100 puntos");
            EnvioRespuesta2("RespuestaCorrecta",event);            
        }
        public void handleButtonRpt2(ActionEvent event)throws Exception{
            setIntentosCofres(cofreActual);
            JOptionPane.showMessageDialog(null, "Respuesta incorrecta");
            EnvioRespuesta2("RespuestaIncorrecta",event);            
        }
        public void handleButtonRpt3(ActionEvent event)throws Exception{
            setIntentosCofres(cofreActual);
            JOptionPane.showMessageDialog(null, "Respuesta incorrecta");
            EnvioRespuesta2("RespuestaIncorrecta",event);
        }
        public void handleButtonRpt4(ActionEvent event)throws Exception{
            setIntentosCofres(cofreActual);
            JOptionPane.showMessageDialog(null, "Respuesta incorrecta");
            EnvioRespuesta2("RespuestaIncorrecta",event);            
        }
        
        public void getPuntajeActual(int num){
            puntajeActual = num;
        }
        
        public void setCofreActual(int num){
            cofreActual = num;
        }
        public void setEstadoCofres(int num){
            switch(num){
                case 1:
                       cofre1State = true;
                    break;
                case 2:
                       cofre2State = true;
                    break;
                case 3:
                       cofre3State = true;
                    break;
                case 4:
                       cofre4State = true;
                    break;
                case 5:
                       cofre5State = true;
                    break;
                case 6:
                       cofre6State = true;
                    break;
                case 7:
                       cofre7State = true;
                    break;
                case 8:
                       cofre8State = true;
                    break;
                case 9:
                       cofre9State = true;
                    break;
            }
        }
        
        public void setIntentosCofres(int num){
            switch(num){
                case 1:
                       intCofre1 += 1;
                    break;
                case 2:
                       intCofre2 += 1;
                    break;
                case 3:
                       intCofre3 += 1;
                    break;
                case 4:
                       intCofre4 += 1;
                    break;
                case 5:
                       intCofre5 += 1;
                    break;
                case 6:
                       intCofre6 += 1;
                    break;
                case 7:
                       intCofre7 += 1;
                    break;
                case 8:
                       intCofre8 += 1;
                    break;
                case 9:
                       intCofre9 += 1;
                    break;
            }
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
        
        public void EnvioRespuesta2(String Rpt, Event evt)throws Exception{   
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/view/Escenario.fxml"));

            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            
            EscenarioController Escenario = (EscenarioController)fxmlLoader.getController();
            //Escenario.recibirRptCofre(Rpt);
            Escenario.setStateGates(gate1State, gate2State, gate3State, gate4State,
                    gate5State, gate6State, gate7State, gate8State);
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
        // TODO
    }    
    
}
