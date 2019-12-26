package com.rainbowstudio;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
	private static Scene scene;
	@Override
	public void start(Stage primaryStage) throws Exception {
		scene = new Scene(loadFXML("Main_Window"),Constants.DEFAULT_WINDOW_WIDTH,Constants.DEFAULT_WINDOW_HEIGHT);
		//scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
		primaryStage.setMinWidth(Constants.DEFAULT_WINDOW_WIDTH);
		primaryStage.setMinHeight(Constants.DEFAULT_WINDOW_HEIGHT);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.setTitle("Rainbow Studio Student Management System");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch();
	}

	static void setRoot(String fxml) throws IOException {
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
}
