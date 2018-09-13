package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Text text = new Text(); // создаем объект класса текст
        Font font = new Font("ComicSans", 45);
        text.setFont(font);// задаем шрифт
        text.setX(50);// задаем расположение текста по координатам x и y
        text.setY(150);

        text.setText("Welcome to Tutorialspoint");

        Group root = new Group(text);

        Scene scene = new Scene(root, 600, 300);

        primaryStage.setTitle("Third exer JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
