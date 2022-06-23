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
        
        public boolean gate8State, gate7State, gate6State, gate5State, 
                gate4State, gate3State, gate2State, gate1State ;

        public void handleButtonRpt1(ActionEvent event)throws Exception{
            EnvioRespuesta2("RespuestaCorrecta",event);
            JOptionPane.showMessageDialog(null, "Respuesta correcta, cofre abierto con un valor de 100 puntos");
        }
        public void handleButtonRpt2(ActionEvent event)throws Exception{
            //EnvioRespuesta2("RespuestaIncorrecta",event);
            //JOptionPane.showMessageDialog(null, "Respuesta incorrecta");
            if (gate1State)
                JOptionPane.showMessageDialog(null, "true");
            else
                JOptionPane.showMessageDialog(null, "false");
        }
        public void handleButtonRpt3(ActionEvent event)throws Exception{
            EnvioRespuesta2("RespuestaIncorrecta",event);
            JOptionPane.showMessageDialog(null, "Respuesta incorrecta");
        }
        public void handleButtonRpt4(ActionEvent event)throws Exception{
            EnvioRespuesta2("RespuestaIncorrecta",event);
            JOptionPane.showMessageDialog(null, "Respuesta incorrecta");
        }
        
        public void recibirParametros(String Text){
            Pregunta.setText(Text);
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
    
        
        public void EnvioRespuesta2(String Rpt, Event evt)throws Exception{   
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/view/Escenario.fxml"));

            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            
            EscenarioController Escenario = (EscenarioController)fxmlLoader.getController();
            //Escenario.recibirRptCofre(Rpt);
            Escenario.setStateGates(gate1State, gate2State, gate3State, gate4State, gate5State, gate6State, gate7State, gate8State);
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
