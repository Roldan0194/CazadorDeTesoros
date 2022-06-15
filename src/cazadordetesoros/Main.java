/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package cazadordetesoros;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 *
 * @author Roldan
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("/view/Inicio.fxml"));
        primaryStage.setTitle("CazadorDeTesoros");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
