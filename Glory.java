package boldness;

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
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Glory extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        Label runE = new Label("Enter Runnable:");
        grid.add(runE, 0, 0, 5, 1);
        final TextField textField = new TextField ();
        grid.add(textField, 1, 0, 15, 1);
       // textField.getText();
        Label run = new Label("Runnables");
        grid.add(run, 0, 2);
        Label runT = new Label("Running Threads");
        grid.add(runT, 4, 2);
        
        final ListView<String> runL = new ListView();
        final ObservableList<String> items = FXCollections.observableArrayList();
        grid.add(runL, 0, 3, 1, 7);
        
        final ListView<String> thrL = new ListView();
        final ObservableList<String> its = FXCollections.observableArrayList();
        grid.add(thrL, 4, 3, 1, 7);
        
        Button btn = new Button();
        btn.setText("Start");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        grid.add(btn, 0, 11);
        
        Button btn2 = new Button();
        btn2.setText("Stop");
        grid.add(btn2, 4, 11);
        //StackPane root = new StackPane();
        //root.getChildren().add(btn);
        
        Scene scene = new Scene(grid, 550, 500);
        
        primaryStage.setTitle("Glory");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }  
}
