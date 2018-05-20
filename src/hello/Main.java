package hello;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.text.Text;

import java.util.Random;

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
/*
        Random rand = new Random(System.currentTimeMillis());

        for(int i=0; i<100; i++){
            int x = rand.nextInt((int)scene.getWidth());
            int y = rand.nextInt((int)scene.getHeight());
            Text text = new Text(x, y, "Hello FX");

            Font font;
            switch (rand.nextInt(3)){
                case 0:
                    font = Font.font("SanSerif", 15+rand.nextInt(30));
                    break;
                case 1:
                    font = Font.font("SanSerif", 30);
                    break;
                case 2:
                    font = Font.font("MonoSpaced",30);
                    break;
            }

            root.getChildren().add(text);

            text.setRotate(
                    rand.nextInt(360)
            );


            text.setFill(
                    Color.rgb(
                            rand.nextInt(255),
                            rand.nextInt(255),
                            rand.nextInt(255)
                    )
            );


        }

*/

        MenuBar menuBar = new MenuBar();

        Menu menu = new Menu("File");
        menu.getItems().add(new MenuItem("Exit"));

        menuBar.getMenus().add(menu);
        menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
        root.getChildren().add(menuBar);


        primaryStage.setTitle("First FX app");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
