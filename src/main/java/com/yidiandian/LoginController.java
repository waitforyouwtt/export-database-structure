package com.yidiandian;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;
/**
 *
 * @author 凤凰[小哥哥]
 * @version 1.0
 */
public class LoginController implements Initializable{

	@FXML
	private ImageView img;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Image image = new Image("/head_3.jpg");
		img.setImage(image);
		
	}
}
