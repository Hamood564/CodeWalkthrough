package tqcfx.gui;

import java.net.URL;
import java.util.ResourceBundle;

import MaltState.maltStateMain;
import Statemachine.behaviour_idle;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Test extends Application{
	
	


	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		
		//Creating a TabPane
		TabPane module = new TabPane();
		//Create Functionality tab
		Tab functionality = new Tab();
		//Create Allocation tab
		Tab allocation = new Tab();
		//Create Linkage tab
		Tab linkage = new Tab();
		//Create Global Settings tab
		Tab global = new Tab();
		
		//Setting tab Text
		functionality.setText("Functionality");
		allocation.setText("Allocation");
		linkage.setText("Linkage");
		global.setText("Global");
		
			
		
		
		//setting text to pane
		Text t = new Text();
		t.setText("This is a text sample");
		
		
		
		//setting button and action.........................................
		Button btn = new Button("Test ");
//		btn.setOnAction((e) -> System.out.println("Testyy"));
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				behaviour_idle bh1 = new behaviour_idle();
				bh1.statecall();
				
				
			}
		});
		
		Button btn2 = new Button("Test 2");
//		btn.setOnAction((e) -> System.out.println("Testyy"));
		
		
//		StackPane root = new StackPane();
//		root.getChildren().add(btn);
		// finish button and action...................................................
		
		
		//Setting buttons to tab
		functionality.setContent(btn);
		global.setContent(t);
		
		
		//adding tabs to tabPane
		module.getTabs().addAll(global,functionality,allocation,linkage);
		
//		//Setting the anchor pane as layout
//		AnchorPane anchor = new AnchorPane();
//		anchor.setTopAnchor(module,15.0);
//		anchor.setBottomAnchor(module, 15.0);
//		anchor.setRightAnchor(module,15.0);
//		anchor.setLeftAnchor(module, 15.0);
//		anchor.getChildren().addAll(module);
//		anchor.setStyle("-fx-background-color: #647687");
//		
//		
//		
//		//Setting the stage
//		Scene scene = new Scene(anchor, 1000, 300);
		
		
		
		
		
		
		Parent root = FXMLLoader.load(getClass().getResource("TQCMainScene.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("TEst TQC FX");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	
		
		
	 
	  
	 

}
