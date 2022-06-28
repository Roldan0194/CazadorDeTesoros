/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cazadordetesoros;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
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
        
    //Variables de clase
        public Button btnPuerta;
        public Label Pregunta, Respuesta1, Respuesta2, Respuesta3, Respuesta4;
        public List<String> preguntaActual;
        public int puertaActual, puntajeActual;
        public boolean gate8State, gate7State, gate6State, gate5State, 
                gate4State, gate3State, gate2State, gate1State ;
        public boolean cofre9State, cofre8State, cofre7State, cofre6State, cofre5State, 
                cofre4State, cofre3State, cofre2State, cofre1State ;
        public int intCofre9, intCofre8 , intCofre7, intCofre6 , intCofre5,
                intCofre4, intCofre3, intCofre2, intCofre1;  
        //Metodos botones respuesta
        public void handleButtonRpt1(ActionEvent event)throws Exception{
            validarPregunta(puertaActual,1);
            EnvioRespuesta(event);
        }
        public void handleButtonRpt2(ActionEvent event)throws Exception{
            validarPregunta(puertaActual,2);
            EnvioRespuesta(event);
        }
        public void handleButtonRpt3(ActionEvent event)throws Exception{
            validarPregunta(puertaActual,3);
            EnvioRespuesta(event);            
        }
        public void handleButtonRpt4(ActionEvent event)throws Exception{
            validarPregunta(puertaActual,4);
            EnvioRespuesta(event);
        }
        // Metodo obtener pubtaje actual
        public void getPuntajeActual(int num){
            puntajeActual = num;
        }
        // Metodo obtener estado puertas
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
        // Metodo cambiar estado a una puerta
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
        //Metodo obtener puerta actual
        public void setPuertaActual(int num){
            puertaActual = num;
        }
        //Metodo obtener estado de cofres
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
        //Metodo obtener cantidad de intentos por cofre
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
        //Metodo selecciobar pregunta actual
        public void setPregunta(int numPuerta){
            List<String> pregunta = new ArrayList<String>();
            pregunta = ObtenerPreguntas(numPuerta - 1);
            Pregunta.setText(pregunta.get(0));
            Respuesta1.setText(pregunta.get(1));
            Respuesta2.setText(pregunta.get(2));
            Respuesta3.setText(pregunta.get(3));
            Respuesta4.setText(pregunta.get(4));
        }
        //Metodo validar respuesta  
        public void validarPregunta(int numPuerta, int numRespuesta){
            List<String> pregunta = new ArrayList<String>();
            pregunta = ObtenerPreguntas(numPuerta - 1);
            if (numRespuesta == Integer.parseInt(pregunta.get(5))){
                JOptionPane.showMessageDialog(null, "Respuesta correcta puerta abierta");
                setStateTheGate(puertaActual);
            }
            else
                JOptionPane.showMessageDialog(null, "Respuesta incorrecta ");
        }
        //Metodo para seleccionar pregunta
        public List<String> ObtenerPreguntas(int NumPregunta){
        
        List<String> pregunta1 = new ArrayList<String>();
        pregunta1.add("Un oso recorre 26 km en dirección hacia el sur. Después, camina otros 19 km en dirección este. Por último, hace 57 km más hacia el norte, ¿cuántos kilómetros ha recorrido? ");
        pregunta1.add("102 Km*");
        pregunta1.add("98 Km");
        pregunta1.add("112 Km");
        pregunta1.add("120 Km");
        pregunta1.add("1");
        
        List<String> pregunta2 = new ArrayList<String>();
        pregunta2.add("Pregunta2");
        pregunta2.add("Rpt1");
        pregunta2.add("Rpt2");
        pregunta2.add("Rpt3*");
        pregunta2.add("Rpt4");
        pregunta2.add("3");
        
        List<String> pregunta3 = new ArrayList<String>();
        pregunta3.add("Pregunta3");
        pregunta3.add("Rpt1");
        pregunta3.add("Rpt2*");
        pregunta3.add("Rpt3");
        pregunta3.add("Rpt4");
        pregunta3.add("2");
        
        List<String> pregunta4 = new ArrayList<String>();
        pregunta4.add("Pregunta4");
        pregunta4.add("Rpt1*");
        pregunta4.add("Rpt2");
        pregunta4.add("Rpt3");
        pregunta4.add("Rpt4");
        pregunta4.add("1");
        
        List<String> pregunta5 = new ArrayList<String>();
        pregunta5.add("Pregunta5");
        pregunta5.add("Rpt1");
        pregunta5.add("Rpt2");
        pregunta5.add("Rpt3");
        pregunta5.add("Rpt4*");
        pregunta5.add("4");
        
        List<String> pregunta6 = new ArrayList<String>();
        pregunta6.add("Pregunta6");
        pregunta6.add("Rpt1*");
        pregunta6.add("Rpt2");
        pregunta6.add("Rpt3");
        pregunta6.add("Rpt4");
        pregunta6.add("1");
        
        List<String> pregunta7 = new ArrayList<String>();
        pregunta7.add("Pregunta7");
        pregunta7.add("Rpt1");
        pregunta7.add("Rpt2");
        pregunta7.add("Rpt3*");
        pregunta7.add("Rpt4");
        pregunta7.add("3");
        
        List<String> pregunta8 = new ArrayList<String>();
        pregunta8.add("Pregunta8");
        pregunta8.add("Rpt1");
        pregunta8.add("Rpt2*");
        pregunta8.add("Rpt3");
        pregunta8.add("Rpt4");
        pregunta8.add("2");
        
        List<List<String>> preguntasPuertas = new ArrayList<>();
        preguntasPuertas.add(pregunta1);
        preguntasPuertas.add(pregunta2);
        preguntasPuertas.add(pregunta3);
        preguntasPuertas.add(pregunta4);
        preguntasPuertas.add(pregunta5);
        preguntasPuertas.add(pregunta6);
        preguntasPuertas.add(pregunta7);
        preguntasPuertas.add(pregunta8);
        
        
        return preguntasPuertas.get(NumPregunta);
    }
        //Metodo de apertura de esceneario y envio de variables con estado actual
        public void EnvioRespuesta(Event evt)throws Exception{   
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/view/Escenario.fxml"));

            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            
            EscenarioController Escenario = (EscenarioController)fxmlLoader.getController();
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
