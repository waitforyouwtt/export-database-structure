package com.yidiandian;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * @author 凤凰[小哥哥]
 * @version 1.0
 */
public class Main extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Parent login = FXMLLoader.load(getClass().getResource("/main.fxml"));
		primaryStage.setTitle("工具类");
		primaryStage.setScene(new Scene(login));
		primaryStage.show();
	}

}
