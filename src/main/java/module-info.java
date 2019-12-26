module RainbowStudio {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	requires com.jfoenix;
	requires java.sql;
	requires poi;

	opens com.rainbowstudio to javafx.fxml;
	opens controller to javafx.fxml;
	exports com.rainbowstudio;
}