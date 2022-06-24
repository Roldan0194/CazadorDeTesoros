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
        public Button btnCofre9, btnCofre8, btnCofre7, btnCofre6, btnCofre5,
                btnCofre4, btnCofre3, btnCofre2, btnCofre1;
        public boolean gate8State, gate7State, gate6State, gate5State, 
                gate4State, gate3State, gate2State, gate1State ;
        public boolean cofre9State, cofre8State, cofre7State, cofre6State, cofre5State, 
                cofre4State, cofre3State, cofre2State, cofre1State ;
        public int intCofre9, intCofre8 , intCofre7, intCofre6 , intCofre5,
                intCofre4, intCofre3, intCofre2, intCofre1;
        public int puntajeActual;
        
        @FXML
        public Label labelPuntajeActual;
        
        //METODOS DE LOS BOTONES DE LOS COFRES
        @FXML
        public void handleButtonCofre1(ActionEvent event)throws Exception{
                       
        }
        public void handleButtonCofre2(ActionEvent event) throws Exception{
            
            
        }
        public void handleButtonCofre3(ActionEvent event) throws Exception{
            
        }
        public void handleButtonCofre4(ActionEvent event) throws Exception{
            
        }
        public void handleButtonCofre5(ActionEvent event) throws Exception{
            
        }
        public void handleButtonCofre6(ActionEvent event) throws Exception{
            
        }
        public void handleButtonCofre7(ActionEvent event) throws Exception{
            
        }
        public void handleButtonCofre8(ActionEvent event) throws Exception{
            if (gate6State && !cofre8State && intCofre8 != 2)
                PreguntaCofres("/view/preguntasCofres.fxml",event, 8);
            else if(cofre8State)
                JOptionPane.showMessageDialog(null, "Este Cofre ya esta abierto"); 
            else if(intCofre8 == 2)
                JOptionPane.showMessageDialog(null, "Ya se usaron los dos intentos permitidos"); 
            else
                JOptionPane.showMessageDialog(null, "Se debe abrir primero la puerta");              
        }
        public void handleButtonCofre9(ActionEvent event) throws Exception{
            if (gate7State && !cofre9State && intCofre9 != 2)
                PreguntaCofres("/view/preguntasCofres.fxml",event, 9);
            else if(cofre9State)
                JOptionPane.showMessageDialog(null, "Este Cofre ya esta abierto"); 
            else if(intCofre9 == 2)
                JOptionPane.showMessageDialog(null, "Ya se usaron los dos intentos permitidos"); 
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
              
        public void setPuntajeActual(int num){
            puntajeActual = num;
            labelPuntajeActual.setText("Puntaje: " + puntajeActual + " puntos");
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
        
        public void setEstadoCofres(boolean cofre1, boolean cofre2, boolean cofre3,
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
        
        public void setIntentos(int num1, int num2, int num3, int num4, int num5
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
            Puerta.getEstadoCofres(cofre1State, cofre2State, cofre3State, cofre4State, cofre5State, 
                    cofre6State, cofre7State, cofre8State, cofre9State);
            Puerta.getIntentos(intCofre1, intCofre2, intCofre3, intCofre4, intCofre5, 
                    intCofre6, intCofre7, intCofre8, intCofre9);
            Puerta.setPuertaActual(numGate);
            Puerta.getPuntajeActual(puntajeActual);
            stage.show();
            
            Object evtSource = evt.getSource();
            Node NodoSource = (Node) evtSource;
            Scene EscenaAnt = NodoSource.getScene();
            Window VentanaActual = EscenaAnt.getWindow();
            Stage stage1 = (Stage) VentanaActual;
            stage1.hide();
     }
        
        public void PreguntaCofres(String Url, Event evt, int numCofre)throws Exception{   
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource(Url));

            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            
            PreguntasCofresController Cofre = (PreguntasCofresController)fxmlLoader.getController();
            Cofre.getStateGates(gate8State, gate7State, gate6State, gate5State,
                    gate4State, gate3State, gate2State, gate1State);
            Cofre.getEstadoCofres(cofre1State, cofre2State, cofre3State, cofre4State, cofre5State, 
                    cofre6State, cofre7State, cofre8State, cofre9State);
            Cofre.getIntentos(intCofre1, intCofre2, intCofre3, intCofre4, intCofre5,
                    intCofre6, intCofre7, intCofre8, intCofre9);
            Cofre.setCofreActual(numCofre);
            Cofre.getPuntajeActual(puntajeActual);
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
