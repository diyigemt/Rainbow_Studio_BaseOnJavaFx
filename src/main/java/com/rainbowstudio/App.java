package com.rainbowstudio;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
	private static Scene scene;
	private static Stage stage;
	@Override
	public void start(Stage primaryStage) throws Exception {
		scene = new Scene(loadFXML("Login_Window"),Constants.DEFAULT_WINDOW_WIDTH,Constants.DEFAULT_WINDOW_HEIGHT);
		//scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
		stage = primaryStage;
		setWindowSize(Constants.LOGIN_WINDOW_WIDTH, Constants.LOGIN_WINDOW_HEIGHT);
		stage.setScene(scene);
		stage.setResizable(false);
		//stage.setTitle("Rainbow Studio Student Management System");
		stage.setTitle("Login");
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}

	public static void setRoot(String fxml) throws IOException {
		scene.setRoot(loadFXML(fxml));
	}

	public static Parent loadFXML(String fxml) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
		return fxmlLoader.load();
	}
	public static Parent loadFXML(String fxml, Object controller) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
		fxmlLoader.setController(controller);
		return fxmlLoader.load();
	}
	public static void setWindowSize(int new_Width, int new_Height) {
		stage.setWidth(new_Width);
		stage.setHeight(new_Height);
	}
	public static void setWindowWidth(int new_Width) {
		stage.setWidth(new_Width);
	}
	public static void setWindowHeight(int new_Height) {
		stage.setHeight(new_Height);
	}
	public static void setTitle(String new_Title) {
		stage.setTitle(new_Title);
	}
}
