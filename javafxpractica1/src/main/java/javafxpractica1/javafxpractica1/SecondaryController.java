package javafxpractica1.javafxpractica1;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;

public class SecondaryController {

	@FXML 
	public Label labeluser, labelpassword;

    @FXML
    private void switchToPrimary() throws IOException {
    	FXMLLoader fxmlLoader = App.setRoot("primary");
		PrimaryController primaryController = fxmlLoader.getController();
		primaryController.user.setText(labeluser.getText().toString());
		primaryController.password.setText(labelpassword.getText().toString());
    }
}