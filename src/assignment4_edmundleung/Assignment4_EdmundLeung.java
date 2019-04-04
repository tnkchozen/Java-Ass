/**
 * Name: Edmund Leung
 * Student ID: 991531421
 * Class: PROG24178 1191_69188, Winter 2019
 * Assignment #4: The Crew
 * Date: April 5, 2019
 * Program: Assignment4_EdmundLeung.java
 * Description: A JavaFX FXML program that add, search, update, display
 * and save using a GUI. 
 */
package assignment4_edmundleung;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Administrator
 */
public class Assignment4_EdmundLeung extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        stage.setTitle("The Crew");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
