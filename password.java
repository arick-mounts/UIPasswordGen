import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.CheckBox; 
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.fxml.FXML;
import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.geometry.Pos;

public class password extends Application {
	public static void main (String[] args){
		launch(args);
	}


	public void start (Stage primaryStage) throws Exception{
		primaryStage.setTitle("Password Generator");
		Parent root = FXMLLoader.load(getClass().getResource("layout.fxml"));

		

		
		primaryStage.setScene(new Scene(root, 400,350));
		primaryStage.show();
	}
}