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
        
        //Variables de clase
        public Label Pregunta, Respuesta1, Respuesta2, Respuesta3, Respuesta4;
        public int cofreActual, puntajeActual;
        public boolean gate8State, gate7State, gate6State, gate5State, 
                gate4State, gate3State, gate2State, gate1State ;
        public boolean cofre9State, cofre8State, cofre7State, cofre6State, cofre5State, 
                cofre4State, cofre3State, cofre2State, cofre1State ;
        public int intCofre9, intCofre8 , intCofre7, intCofre6 , intCofre5,
                intCofre4, intCofre3, intCofre2, intCofre1;  
        //Metodo de botones de respuestas
        public void handleButtonRpt1(ActionEvent event)throws Exception{
            validarPregunta(cofreActual,1);
            EnvioRespuesta2(event);            
        }
        public void handleButtonRpt2(ActionEvent event)throws Exception{
            validarPregunta(cofreActual,2);
            EnvioRespuesta2(event);            
        }
        public void handleButtonRpt3(ActionEvent event)throws Exception{
            validarPregunta(cofreActual,3);
            EnvioRespuesta2(event);
        }
        public void handleButtonRpt4(ActionEvent event)throws Exception{
            validarPregunta(cofreActual,4);
            EnvioRespuesta2(event);            
        }
        //Metodo de obtencion de puntaje actual
        public void getPuntajeActual(int num){
            puntajeActual = num;
        }
        //Metodo de obtencion cofre actual
        public void setCofreActual(int num){
            cofreActual = num;
        }
        //Metodo de asignacion de estado cofres
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
        //Metodo de asignacion de intetos hechos
        public void setIntentosCofres(int num){
            switch(num){
                case 1 -> intCofre1 += 1;
                case 2 -> intCofre2 += 1;
                case 3 -> intCofre3 += 1;
                case 4 -> intCofre4 += 1;
                case 5 -> intCofre5 += 1;
                case 6 -> intCofre6 += 1;
                case 7 -> intCofre7 += 1;
                case 8 -> intCofre8 += 1;
                case 9 -> intCofre9 += 1;
            }
        }
        //Metodo de obtencion de estado de puertas
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
        //Metodo de obtencion de estado de cofres
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
        //Metodo de obtener intentos
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
        //Metodo de ingreso de pregunta a la vista
        public void setPregunta(int numCofre){
            List<String> pregunta = new ArrayList<String>();
            pregunta = ObtenerPreguntas(numCofre - 1);
            Pregunta.setText(pregunta.get(0));
            Respuesta1.setText(pregunta.get(1));
            Respuesta2.setText(pregunta.get(2));
            Respuesta3.setText(pregunta.get(3));
            Respuesta4.setText(pregunta.get(4));
        }
        //Metodo de validacion de respuesta           
        public void validarPregunta(int numCofre, int numRespuesta){
            List<String> pregunta = new ArrayList<String>();
            pregunta = ObtenerPreguntas(numCofre - 1);
            if (numRespuesta == Integer.parseInt(pregunta.get(5))){
                JOptionPane.showMessageDialog(null, "Respuesta correcta el cofre ha sido abierto y ha obtenido 100 puntos");
                setEstadoCofres(cofreActual);
                setIntentosCofres(cofreActual);
                puntajeActual += 100;
            }
            else {
                setIntentosCofres(cofreActual);
                JOptionPane.showMessageDialog(null, "Respuesta incorrecta");
            }
        }
        //Metodo Seleccion de preguntas
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
        
        List<String> pregunta9 = new ArrayList<String>();
        pregunta9.add("Pregunta9");
        pregunta9.add("Rpt1*");
        pregunta9.add("Rpt2");
        pregunta9.add("Rpt3");
        pregunta9.add("Rpt4");
        pregunta9.add("1");
        
        List<List<String>> preguntasCofres = new ArrayList<>();
        preguntasCofres.add(pregunta1);
        preguntasCofres.add(pregunta2);
        preguntasCofres.add(pregunta3);
        preguntasCofres.add(pregunta4);
        preguntasCofres.add(pregunta5);
        preguntasCofres.add(pregunta6);
        preguntasCofres.add(pregunta7);
        preguntasCofres.add(pregunta8);
        preguntasCofres.add(pregunta9);
        
        return preguntasCofres.get(NumPregunta);
    }
        //Metodo de apertura de esceneario y envio de variables con estado actual
        public void EnvioRespuesta2(Event evt)throws Exception{   
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/view/Escenario.fxml"));

            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            
            EscenarioController Escenario = (EscenarioController)fxmlLoader.getController();
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
