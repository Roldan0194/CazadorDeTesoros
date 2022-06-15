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

        public void handleButtonRpt1(ActionEvent event)throws Exception{
            EnvioRespuesta2("RespuestaCorrecta",event);
            JOptionPane.showMessageDialog(null, "Respuesta correcta, cofre abierto con un valor de 100 puntos");
        }
        public void handleButtonRpt2(ActionEvent event)throws Exception{
            EnvioRespuesta2("RespuestaIncorrecta",event);
            JOptionPane.showMessageDialog(null, "Respuesta incorrecta");
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
    
        
        public void EnvioRespuesta2(String Rpt, Event evt)throws Exception{   
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/view/Escenario.fxml"));

            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            
            EscenarioController Escenario = (EscenarioController)fxmlLoader.getController();
            Escenario.recibirRptCofre(Rpt);
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
