package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextArea tArea;
    private TextField tField;

    @FXML
    public void onSend(ActionEvent actionEvent) {
        String text = (tField).getText();
        tArea.appendText(text + "\n");
    }
}
