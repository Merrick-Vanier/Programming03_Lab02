/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.util.Random;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

/**
 * Github link: https://github.com/Merrick-Vanier/Programming03_Lab02
 * @author 6237800, Merrick MacInnis 
 */
public class Lab02 extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane();
        StackPane middle = new StackPane();
        Label topLabel = new Label("Random Image");
        Label botLabel = new Label("Voila");
        Label lblImage = new Label("");
        
        Random random = new Random();
        int rand = random.nextInt(20) + 1;
        Image img;
        String randStr = Integer.toString(rand);
        if (rand < 10) {
            img = new Image("file:images/10"+ randStr +".jpg");
        }
        else {
            img = new Image("file:images/1"+ rand +".jpg");
        }
        
        lblImage.setGraphic(new ImageView(img));
        middle.getChildren().addAll(lblImage);
        
        root.setTop(topLabel);
        root.setBottom(botLabel);
        root.setCenter(middle);
        
        Scene s = new Scene(root, 250, 300);
        stage.setTitle("Java Games");
        stage.setScene(s);
        stage.show();

    }
    
}
