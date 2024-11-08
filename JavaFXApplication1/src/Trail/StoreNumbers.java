
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.border;

 public class StoreNumbers extends Application {

    /**
     *
     * @param stage
     * @throws Exception
     */
    @Override
  public void start(Stage stage) throws Exception {
    Pane pane1 = new Pane();
    Pane pane2 = new Pane();
    TitledPane titledPane1 = new TitledPane("Panel 1", pane1);
    TitledPane titledPane2 = new TitledPane("Panel 2", pane2);
    SplitPane rootPane = new SplitPane();
    rootPane.getItems().add(titledPane1);
    rootPane.getItems().add(pane2);
    Border Border = new Border(borderStroke);


    Scene scene = new Scene(rootPane);
    stage.setWidth(400);
    stage.setHeight(300);
    stage.setScene(scene);
    stage.show();
    pane1.setBorder(Border);
    pane2.setBorder(Border);
    titledPane1.setBorder(Border);
    titledPane2.setBorder(Border);
    titledPane1.prefHeightProperty().bind(rootPane.heightProperty());
  }

  public static void main(String[] args) {
    launch(args);
  }
}