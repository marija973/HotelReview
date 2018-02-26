package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SignupController implements Initializable{

    @FXML
    private AnchorPane parentPane;

    @FXML
    private JFXButton login;

    @FXML
    private JFXTextField name;

    @FXML
    private JFXButton signup;

    @FXML
    private JFXRadioButton male;

    @FXML
    private ToggleGroup genders;

    @FXML
    private JFXRadioButton female;

    @FXML
    private JFXRadioButton other;

    @FXML
    private JFXTextField location;

    @FXML
    private ImageView progress;

    @FXML
    private JFXPasswordField password;

    

    @FXML
    void signupAction(ActionEvent event) throws IOException {
    	
        login.getScene().getWindow().hide();
		Stage signup = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/FXML/SignUP.fxml"));
		Scene scene = new Scene(root,664,424);
		signup.setScene(scene);
		signup.show();
		//signup.setResizable(false);
    }
    @FXML
    public void loginAction(ActionEvent e) throws IOException
    {
   	 signup.getScene().getWindow().hide();
   	 
   	 progress.setVisible(false);
   	
   	 Stage login = new Stage();
   	 
		 Parent root = FXMLLoader.load(getClass().getResource("/FXML/LoginMain.fxml"));
        Scene scene = new Scene(root);
        login.setScene(scene);
        login.show();
        login.setResizable(false);
   	 
    }
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
