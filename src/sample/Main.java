package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //Scene primaryScene = new Scene(sampleGrid,500,500);
        Scene primaryScene = new Scene(root,500,500);
        //primaryScene.getStylesheets().add(Main.class.getResource("loginPage.css").toExternalForm());
        primaryStage.setScene(primaryScene);
        primaryStage.show();
        primaryStage.setTitle("Grid Form");
    }


    public static void main(String[] args) {
        launch(args);
    }
}
