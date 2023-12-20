package com.example.forntend;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Main extends Application {
    double x,y = 0;
    @Override
    public void start(Stage primaryStage) throws Exception {
//        try{
//            FXMLLoader root = new FXMLLoader(Main.class.getResource("NFT-page.fxml"));
//            Scene scene = new Scene(root.load());// 500 chieu dai 300 chieu rong Tạo một đối tượng Scene với StackPane làm nền Scene là một vùng chứa các thành phần giao diện người dùng trong JavaFX.
//            primaryStage.setScene(scene);//add scene vao stage
//            primaryStage.show();
//        } catch (Exception e){
//            System.out.println(e.getMessage());
//        }
        Parent root = FXMLLoader.load(getClass().getResource("NFT-page.fxml"));
        primaryStage.initStyle(StageStyle.UNDECORATED);
//        primaryStage.setScene(new Scene(root, 800, 500));
//        primaryStage.show();


        root.setOnMousePressed(event -> {
            x = event.getSceneX();
            y = event.getSceneY();
        });

        root.setOnMouseDragged(event -> {
            primaryStage.setX(event.getScreenX() - x);
            primaryStage.setY(event.getScreenY() - y);
        });

        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
