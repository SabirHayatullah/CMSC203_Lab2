// Sabir Hayatullah
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;



public class FXMainPane extends VBox {

	Button hello, howdy, chinese, clear, exit;
    Label feedback; 
    TextField textField;
    
  
    HBox hbox1;
    HBox hbox2;
    VBox vbox;
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
    DataManager dataManager;     
	FXMainPane() {
		hbox1= new HBox();
        hbox2= new HBox();
    
         hello= new Button("Hello");
         howdy = new Button("Howdy");
         chinese = new Button("Chinese");
         clear = new Button("Clear");
         exit = new Button("Exit");
        
         feedback = new Label("Feedback");
         textField = new TextField();
         dataManager = new DataManager();
         
         
         
         
         
         //  set margins and set alignment of the components
         HBox.setMargin(hello, new Insets(10));
         HBox.setMargin(howdy, new Insets(10));
         HBox.setMargin(chinese, new Insets(10));
         HBox.setMargin(clear, new Insets(10));
         HBox.setMargin(exit, new Insets(10));
         hbox1.setAlignment(Pos.CENTER);
         hbox2.setAlignment(Pos.CENTER);
     

         
         
         
         hbox1.getChildren().addAll(hello, howdy, chinese, clear, exit);
         hbox2.getChildren().addAll(feedback, textField);
         getChildren().addAll(hbox1,hbox2);
         
         
         
         
         
          hello.setOnAction(new ButtonHandler());
          howdy.setOnAction(new ButtonHandler());
          chinese.setOnAction(new ButtonHandler());
          clear.setOnAction(new ButtonHandler());
          exit.setOnAction(new ButtonHandler());
     }
	
	
	
	
	
	
	class ButtonHandler implements EventHandler<ActionEvent>{
	   
	     public void handle(ActionEvent e) {
	        if (e.getTarget()==hello) {
	            textField.setText(dataManager.getHello());
	        }
	        else if (e.getTarget()==howdy) {
	            textField.setText(dataManager.getHowdy());
	        }
	        else if (e.getTarget()==chinese) {
	            textField.setText(dataManager.getChinese());
	        }
	        else if (e.getTarget()==clear) {
	            textField.setText("");
	        }
	        else if (e.getTarget()==exit) {
	            Platform.exit();
	            System.exit(0);
	        }
	    }
	  }
	
		
		
	}
	
	
	
