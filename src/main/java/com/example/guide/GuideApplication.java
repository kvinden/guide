package com.example.guide;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.*;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class GuideApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Pane pane = new Pane();

        Text text1 = new Text("Выбери картинку");
        text1.setX(20);
        text1.setY(20);
        text1.setFont(Font.font("Tahoma", FontWeight.BOLD,18));
        Text text2 = new Text();
        text2.setX(20);
        text2.setY(350);
        text2.setFont(Font.font("Tahoma",20));

        Image image1 = new Image(new FileInputStream("src/capreolus.jpg"));
        ImageView imageView1 = new ImageView(image1);
        imageView1.setFitHeight(200);
        imageView1.setFitWidth(200);
        imageView1.setX(20);
        imageView1.setY(60);
        Image image2 = new Image(new FileInputStream("src/caribou.jpg"));
        ImageView imageView2 = new ImageView(image2);
        imageView2.setFitHeight(200);
        imageView2.setFitWidth(200);
        imageView2.setX(240);
        imageView2.setY(60);
        Image image3 = new Image(new FileInputStream("src/cervus_elaphus.jpg"));
        ImageView imageView3 = new ImageView(image3);
        imageView3.setFitHeight(200);
        imageView3.setFitWidth(200);
        imageView3.setX(460);
        imageView3.setY(60);
        Image image4 = new Image(new FileInputStream("src/cervus_nippon.jpg"));
        ImageView imageView4 = new ImageView(image4);
        imageView4.setFitHeight(200);
        imageView4.setFitWidth(200);
        imageView4.setX(680);
        imageView4.setY(60);

        Button button1 = new Button();
        button1.setTranslateX(20);
        button1.setTranslateY(60);
        button1.setPrefSize(200,200);
        button1.setGraphic(imageView1);
        Button button2 = new Button();
        button2.setTranslateX(240);
        button2.setTranslateY(60);
        button2.setPrefSize(200,200);
        button2.setGraphic(imageView2);
        Button button3 = new Button();
        button3.setTranslateX(460);
        button3.setTranslateY(60);
        button3.setPrefSize(200,200);
        button3.setGraphic(imageView3);
        Button button4 = new Button();
        button4.setTranslateX(680);
        button4.setTranslateY(60);
        button4.setPrefSize(200,200);
        button4.setGraphic(imageView4);

        button1.setOnAction(value ->{
            text2.setText("Это косуля");
        });
        button2.setOnAction(value ->{
            text2.setText("Это северный олень");
        });
        button3.setOnAction(value ->{
            text2.setText("Это благородный олень");
        });
        button4.setOnAction(value ->{
            text2.setText("Это пятнистый олень");
        });

        pane.getChildren().addAll(imageView1,imageView2,imageView3,imageView4,button1,button2,button3,button4,text1,text2);

        Scene scene = new Scene(pane, 900, 500);
        primaryStage.setTitle("Справочник оленевода");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}