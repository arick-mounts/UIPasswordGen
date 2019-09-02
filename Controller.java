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
import javafx.event.Event;
import javafx.concurrent.Task;

/*
 *This program is a password generator with a basic ui, allowing for several options to be chosen.
 *The Ui is made using Javafx
 *Java @ TCC
 *Arick Mounts
 */


public class Controller {
	 

	Generator gen = new Generator();

	@FXML
	TextField textArea;

	@FXML
    public void capsChecked(Event e){

        gen.flipCaps();
    }

    public void specChecked(Event e){

        gen.flipSpec();
    }

    public void numChecked(Event e){

        gen.flipNum();
    }

    @FXML
    public void selShort(Event e){
    	gen.setLength(8);

    }

    @FXML
    public void selMedium(Event e){
    	gen.setLength(16);
    }

    @FXML
    public void selLong(Event e){
    	gen.setLength(32);        
    }

    @FXML
    public void createPass(Event e){
    	Task<Void> task = new Task<Void>() {
              @Override
	        protected Void call() throws Exception {
	        	 textArea.setText(gen.generate());
                 return null;
   			}
    	};
        Thread th= new Thread(task);
        th.setDaemon(true);
        th.start();
	}
}