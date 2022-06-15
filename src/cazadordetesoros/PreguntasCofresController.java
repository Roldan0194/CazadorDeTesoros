/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cazadordetesoros;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Roldan
 */
public class PreguntasCofresController implements Initializable {
    
        Label Pregunta;

        public void handleButtonRpt1(ActionEvent event)throws Exception{
            JOptionPane.showMessageDialog(null, "Cofre9");
            
        }
        public void handleButtonRpt2(ActionEvent event)throws Exception{
            JOptionPane.showMessageDialog(null, "Cofre9");         
        }
        public void handleButtonRpt3(ActionEvent event)throws Exception{
            JOptionPane.showMessageDialog(null, "Cofre9");         
        }
        public void handleButtonRpt4(ActionEvent event)throws Exception{
            JOptionPane.showMessageDialog(null, "Cofre9");          
        }
        
        public void recibirParametros(String Text){
            Pregunta.setText(Text);
        }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
