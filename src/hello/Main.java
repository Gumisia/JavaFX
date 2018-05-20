package hello;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
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

        Random rand = new Random(System.currentTimeMillis());

        /*
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
                    font = Font.font("SanSerif", 50);
                    break;
                case 2:
                    font = Font.font("MonoSpaced",30);
                    break;
                    default:
                        font = Font.font("MonoSpaced",30);


            }

            root.getChildren().add(text);


            text.setFont(font);
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


        }*/



        MenuBar menuBar = new MenuBar();

        Menu menu = new Menu("File");
        menu.getItems().add(new MenuItem("Exit"));

        ToggleGroup tg = new ToggleGroup();

        Menu menu2 = new Menu("Radio");
        RadioMenuItem r1 = new RadioMenuItem("r1");
        r1.setToggleGroup(tg);

        RadioMenuItem r2 = new RadioMenuItem("r2");
        r2.setToggleGroup(tg);

        menu2.getItems().add(r1);
        menu2.getItems().add(r2);

        menuBar.getMenus().add(menu);
        menuBar.getMenus().add(menu2);
        menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
//        root.getChildren().add(menuBar);

        Label fNameLabel = new Label("Imie: ");
        TextField fNameField = new TextField();
        Label lNameLabel = new Label("Nazwisko: ");
        TextField lNameField = new TextField();

        GridPane gp = new GridPane();
        gp.setHgap(5);
        gp.setVgap(5);

        gp.setPadding(new Insets(5));

        GridPane.setHalignment(fNameLabel, HPos.RIGHT);
        gp.add(fNameLabel, 0, 0);

        GridPane.setHalignment(fNameField, HPos.LEFT);
        gp.add(fNameField, 1, 0);

        GridPane.setHalignment(lNameLabel, HPos.RIGHT);
        gp.add(lNameLabel, 0, 1);

        GridPane.setHalignment(lNameField, HPos.LEFT);
        gp.add(lNameField, 1, 1);

//        fNameField.setLayoutX();
//        fNameField.setLayoutY();



        root.getChildren().add(gp);


        primaryStage.setTitle("First FX app");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
