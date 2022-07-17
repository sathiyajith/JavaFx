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
