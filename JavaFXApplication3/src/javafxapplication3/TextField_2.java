// Java program to create a textfield with a initial text
// and preferred column count and add a event handler to
// handle the event of textfield
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.control.Label;
import javafx.scene.shape.*;
import javafx.stage.Stage;
public class TextField_2 extends Application {

	// launch the application
	public void start(Stage s)
	{
		// set title for the stage
		s.setTitle("creating textfield");
                 Pane p= new Pane();
                 
                 Rectangle r= new Rectangle(100,100,200,200);
                 r.setArcHeight(100);
                 r.setArcWidth(100);
                 Circle c1= new Circle(50,50,80);
                 c1.centerXProperty().bind(p.heightProperty().add(20));
                 p.getChildren().add(c1);
		Scene sc = new Scene(p,1000,1000);

		// set the scene
		s.setScene(sc);

		s.show();
        
        };

		

		
	

	public static void main(String args[])
	{
		// launch the application
		launch(args);
	}
}
