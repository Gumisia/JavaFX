package hello;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Group root = new Group(); //podstawowa jednostka organizacyjna


        Button b = new Button("Click me");
        b.setLayoutX(300);
        b.setLayoutY(200);
        b.setOnAction(
                e -> System.out.println("Hello FX")
        );
//        Color c = Color.YELLOW; // to z awt !! uwazac!!

        root.getChildren().add(b);

        Scene scene = new Scene(root, 800, 600);



        primaryStage.setTitle("First FX app");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
