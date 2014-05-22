package scripturelist;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author リン
 */
public class ScriptureList extends Application {
    
     @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
               
        Label inS = new Label("Scripture");
        grid.add(inS, 0, 0);
        final TextField textField = new TextField ();
        grid.add(textField, 0 , 1);
       // textField.getText();
        Label outS = new Label("Scriptures:");
        grid.add(outS, 3, 0);
        //HBox hb = new HBox();
        //hb.getChildren().addAll(label1, textField);
        //hb.setSpacing(10);
        
        final ListView<String> scList = new ListView();
        final ObservableList<String> items = FXCollections.observableArrayList();
        grid.add(scList, 3,1,1,10);
        
        Button btn = new Button();
        btn.setText("Add to list");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //System.out.println(textField.getText());
                items.add(textField.getText());
                scList.setItems(items);
                textField.clear();
                textField.requestFocus();
            }
        });
        grid.add(btn, 2, 1);
        //StackPane root = new StackPane();
        //root.getChildren().add(btn);
        
        Scene scene = new Scene(grid, 550, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Favorite Scriptures Application");
        primaryStage.show();
    }
   
    public static void main(String[] args) {
        launch(args);
    }
}
