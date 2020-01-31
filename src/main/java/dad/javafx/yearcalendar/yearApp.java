package dad.javafx.yearcalendar;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class yearApp extends Application {
	yearController yc = new yearController();
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Scene scene = new Scene(yc.getview());
		//scene.getStylesheets().add(getClass().getResource("calendario.css").toExternalForm());
		primaryStage.setTitle("Year Calendar");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
