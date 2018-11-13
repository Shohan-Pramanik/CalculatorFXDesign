package application;
	
import javafx.application.*;
import javafx.fxml.FXMLLoader;
import javafx.stage.*;
import javafx.scene.Parent;
import javafx.scene.*;
//import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("FX.fxml"));
	    
        Scene scene = new Scene(root, 450, 475);
    
		stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
