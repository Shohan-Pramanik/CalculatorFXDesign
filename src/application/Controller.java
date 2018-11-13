package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

public class Controller implements Initializable {
	@FXML
	Button btn_exit;
	@FXML
	TextField tv;

	private void handleButtonAction(ActionEvent event) {
		// Button was clicked, do something...
		tv.setText("Exiting");
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		btn_exit.setOnAction(this::handleButtonAction);
	}

}
