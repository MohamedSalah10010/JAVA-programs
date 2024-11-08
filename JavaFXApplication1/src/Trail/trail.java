package Trail;

//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//import javafx.scene.control.*;
//import javafx.scene.layout.*;
//import javafx.geometry.Insets;
//import javafx.geometry.*;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.*;
//import javafx.scene.text.Font;
//import javax.swing.border.Border;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.*;
import javafx.*;
import javafx.geometry.Pos;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class trail extends Application {

    @Override
    public void start(Stage primaryStage) {
       
// Create 64 rectangles and add to pane
GridPane p1 = new GridPane();
        int x[][]=new int[9][9];
   
 
     int i=0 ;  int j = 0; 
     
    
     
        for ( i = 0; i < 3; i++) {
            for ( j = 0; j < 3; j++) {

              TextField t = new TextField();
                t.setMaxWidth(35.0);
                t.setFont(new Font(18));
                t.setAlignment(Pos.CENTER);
          
//                if (i==3 || i==6 ||i==9||j==3 || j==6 ||j==9){
//                  t.setBorder (new Border(
//                new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
//                }
                    p1.setAlignment(Pos.CENTER);
                
                p1.add(t,j,i) ;
            }}

       
        for ( i = 7; i <10; i++) {
            for ( j = 7; j < 10; j++) {

              TextField t = new TextField();
                t.setMaxWidth(35.0);
                t.setFont(new Font(18));
                t.setAlignment(Pos.CENTER);
          
//                if (i==3 || i==6 ||i==9||j==3 || j==6 ||j==9){
//                  t.setBorder (new Border(
//                new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
//                }
                    p1.setAlignment(Pos.CENTER);
                
                p1.add(t,j,i) ;
            }}

        for ( i = 4; i < 7; i++) {
            for ( j = 4; j < 7; j++) {

              TextField t = new TextField();
                t.setMaxWidth(35.0);
                t.setFont(new Font(18));
                t.setAlignment(Pos.CENTER);
          
//                if (i==3 || i==6 ||i==9||j==3 || j==6 ||j==9){
//                  t.setBorder (new Border(
//                new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
//                }
                    p1.setAlignment(Pos.CENTER);
                
                p1.add(t,j,i) ;
            }}


// Create a scene and place it in the stage
Scene scene = new Scene(p1, 600, 500);
       
primaryStage.setTitle("A7a");
primaryStage.setScene(scene);
primaryStage.show(); // Display the stage;
} 

    public static void main(String[] args) {

        launch(args);
    }
}
