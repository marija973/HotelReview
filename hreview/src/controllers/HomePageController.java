package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPopup;
import com.jfoenix.controls.JFXRippler;
import com.jfoenix.controls.JFXToolbar;

//import Controllers.HomePageController;
import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;


public class HomePageController implements Initializable {
	
	@FXML
    private Text welcome;
	
    @FXML
    private AnchorPane anchor;

    @FXML
    private JFXToolbar toolBar;

    @FXML
    private HBox toolBarRight;

    @FXML
    private Label lblMenu;

    @FXML
    private VBox overflowContainer;

    @FXML
    private JFXButton btnLogOut;

    @FXML
    private JFXButton btnExit;
	
	@FXML AnchorPane holderPane;
	AnchorPane home;
	

	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
	   createPage();
	  
	}

	
	
	

	private void createPage() {
		// TODO Auto-generated method stub
		try {
			home = FXMLLoader.load(getClass().getResource("/FXML/HOME.fxml"));
			setNode(home);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}







	public void setNode(Node node)
	{
		holderPane.getChildren().clear();
		holderPane.getChildren().add((Node) node);
		
		FadeTransition ft = new FadeTransition(Duration.millis(1500));
        ft.setNode(node);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
		
		
	}


	
	private static HomePageController instance;
	
	public HomePageController()
	{
		instance = this;
	}
	
	public static HomePageController getInstance()
	{
		return instance;
	}	
	
   
	
	
}
