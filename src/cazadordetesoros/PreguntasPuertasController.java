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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 * FXML Controller class
 *
 * @author Roldan
 */
public class PreguntasPuertasController implements Initializable {
    
    
        
        public void handleButtonRpt1(ActionEvent event)throws Exception{
            //loadStage("/view/Escenario.fxml", event);
            
            
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
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
