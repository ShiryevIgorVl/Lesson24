package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public Button clTArea;
    @FXML
    private TextArea tArea;
    @FXML
    private TextField tField;


    public void onSend(ActionEvent actionEvent) {
        String text = tField.getText();
        tArea.appendText(text + "\n");
        tField.clear();
        tField.requestFocus();
    }

    public void clearTextArea(ActionEvent actionEvent) {
        tArea.clear();
    }
}
