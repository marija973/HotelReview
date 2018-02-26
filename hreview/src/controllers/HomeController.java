package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class HomeController implements Initializable {

    @FXML
    private AnchorPane homeAnchor;

    @FXML
    private JFXButton maruti;

    HomePageController homePage;
    AnchorPane u;
	  
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
 
		
	}
	
	@FXML
	public void marutiAction(ActionEvent e) throws IOException
	{
	  
	//System.out.println("hi");
	Stage signup = new Stage();
	Parent root = FXMLLoader.load(getClass().getResource("/FXML/Maruti.fxml"));
	Scene scene = new Scene(root);
	signup.setScene(scene);
	signup.show();
	signup.setResizable(false);
	  
	}

	
	private Stage setScene(Scene scene) {
		// TODO Auto-generated method stub
		return null;
	}
	
	 

	

	
	
}
