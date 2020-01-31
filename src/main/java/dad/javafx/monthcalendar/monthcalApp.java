package dad.javafx.monthcalendar;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class monthcalApp extends Application {
	monthCalendar mc = new monthCalendar(2020,2);
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		Scene scene = new Scene(mc);

		primaryStage.setTitle("MonthCalendar.");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
