package javafxpractica1.javafxpractica1;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;

public class PrimaryController {
	
	@FXML
	TextField user, password; 
	
    @FXML
    private void switchToSecondary() throws IOException {
		FXMLLoader fxmlLoader = App.setRoot("secondary");
		SecondaryController secondaryController = fxmlLoader.getController();
		secondaryController.labeluser.setText(user.getText().toString());
		secondaryController.labelpassword.setText(password.getText().toString());
    }
}
