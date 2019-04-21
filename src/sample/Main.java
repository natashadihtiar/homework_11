package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(new Scene(root));
        primaryStage.getScene().getStylesheets().add((getClass().getResource("style.css")).toExternalForm());  // CSS из внешнего файла
        root.styleProperty().setValue("-fx-background-color: yellow; -fx-background-radius: 20px; -fx-border-color: purple; -fx-border-radius: 10px; -fx-border-width: 5px;"); // CSS локально
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}