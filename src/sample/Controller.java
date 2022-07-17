package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private Text validationMessage;

    @FXML protected void handleValidation(ActionEvent e)
    {
        validationMessage.setText("Signed In Successfully! ");
    }
}
