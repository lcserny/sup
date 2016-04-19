package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller
{
    @FXML
    public TextField firstName;

    public void handleSupButtonClick(ActionEvent actionEvent)
    {
        System.out.printf("Sup %s!%n", firstName.getText());
    }
}
