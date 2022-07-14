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

        GridPane sampleGrid = new GridPane();
        sampleGrid.setAlignment(Pos.CENTER);
        sampleGrid.setVgap(10);
        sampleGrid.setHgap(10);
        sampleGrid.setPadding(new Insets(10,10,10,10));

        Text welcomeText = new Text("Welcome!");
        welcomeText.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD,20));
        sampleGrid.add(welcomeText,0,0);

        Label userName = new Label("Username: ");
        sampleGrid.add(userName,0,1);

        TextField userNameField = new TextField();
        sampleGrid.add(userNameField,1,1);

        Label password = new Label("Password: ");
        sampleGrid.add(password,0,2);

        TextField passwordField = new TextField();
        sampleGrid.add(passwordField,1,2);

        Text message = new Text();
        sampleGrid.add(message,1,6);

        Button validateButton = new Button("Sign In");
        validateButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                message.setFill(Color.FIREBRICK);
                message.setText("You have Signed In Successfully!");
            }
        });
        HBox buttonBox = new HBox(10);
        buttonBox.getChildren().add(validateButton);
        buttonBox.setAlignment(Pos.BOTTOM_RIGHT);
        sampleGrid.add(buttonBox,1,4);

        Scene primaryScene = new Scene(sampleGrid,500,500);
        primaryScene.getStylesheets().add(Main.class.getResource("loginPage.css").toExternalForm());
        primaryStage.setScene(primaryScene);
        primaryStage.show();
        primaryStage.setTitle("Grid Form");
    }


    public static void main(String[] args) {
        launch(args);
    }
}
