/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package htmleditorex;

import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.StackPane;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Stage;

public class HTMLEditorEx {// extends Application {
    
    private final String INITIAL_TEXT = "<html><body>Please write something.</body></html>";
    
    //@Override
    public void start2(Stage stage) {
       stage.setTitle("HTMLEditor Sample");
       stage.setWidth(650);
       stage.setHeight(300);   
       final HTMLEditor htmlEditor = new HTMLEditor();
       htmlEditor.setPrefHeight(245);
       Scene scene = new Scene(htmlEditor);    
             
       htmlEditor.setHtmlText(INITIAL_TEXT);
       stage.setScene(scene);
       stage.show();
    }   
}
