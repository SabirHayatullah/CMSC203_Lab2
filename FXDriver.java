// Sabir Hayatullah
/*In the start() method, an instance of FXMainPane
 *  (which extends VBox) is created 
 *  and set as the root of a new Scene. 
 *  The Scene is then added to the Stage, 
 *  which is given a title and shown.
 */
import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class FXDriver extends Application {
	   
	/**
	 * The main method for the GUI example program JavaFX version
	 * @param args not used
	 * @throws IOException
	 */
	public static void main(String[] args) {
		launch(args);   
	}
		   
	@Override
	public void start(Stage stage) throws IOException {
		 //call the main scene which is a BorderPane
        FXMainPane root = new FXMainPane();
        stage.setScene(new Scene(root, 500, 350));
        // Set stage title and show the stage.
        stage.setTitle("Hello World GUI");
        stage.show();

	}
}
