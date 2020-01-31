package dad.javafx.yearcalendar;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;

import dad.javafx.monthcalendar.monthCalendar;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class yearController implements Initializable {
	// model
	private IntegerProperty anyo = new SimpleIntegerProperty();
	ArrayList<monthCalendar> mses;
	// view
	@FXML
	private VBox view;

	@FXML
	private BorderPane bp;

	@FXML
	private Button antAnyoButton;

	@FXML
	private Button sigAnyoButton;

	@FXML
	private Label anyoLabel;

	@FXML
	private GridPane gp;

	public yearController() {
		anyo.setValue(LocalDate.now().getYear());
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/yearcalendar.fxml"));
			loader.setController(this);
			loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		anyoLabel.textProperty().bind(anyo.asString());
		newyear();
		gp.setVgap(8.0);
		gp.setHgap(8.0);

	}

	@FXML
	private void onAntAnyoButton(ActionEvent event) {
		anyo.set(anyo.get() - 1);
		newyear();
	}

	@FXML
	private void onSigAnyoButton(ActionEvent event) {
		anyo.set(anyo.get() + 1);
		newyear();
	}

	private void newyear() {
		gp.getChildren().clear();

		monthCalendar enero = new monthCalendar(anyo.get(), 1);
		monthCalendar febrero = new monthCalendar(anyo.get(), 2);
		monthCalendar marzo = new monthCalendar(anyo.get(), 3);
		monthCalendar abril = new monthCalendar(anyo.get(), 4);
		monthCalendar mayo = new monthCalendar(anyo.get(), 5);
		monthCalendar junio = new monthCalendar(anyo.get(), 6);
		monthCalendar julio = new monthCalendar(anyo.get(), 7);
		monthCalendar agosto = new monthCalendar(anyo.get(), 8);
		monthCalendar septiembre = new monthCalendar(anyo.get(), 9);
		monthCalendar octubre = new monthCalendar(anyo.get(), 10);
		monthCalendar noviembre = new monthCalendar(anyo.get(), 11);
		monthCalendar diciembre = new monthCalendar(anyo.get(), 12);

		gp.add(enero, 0, 0);
		gp.add(febrero, 1, 0);
		gp.add(marzo, 2, 0);
		gp.add(abril, 3, 0);
		gp.add(mayo, 0, 1);
		gp.add(junio, 1, 1);
		gp.add(julio, 2, 1);
		gp.add(agosto, 3, 1);
		gp.add(septiembre, 0, 2);
		gp.add(octubre, 1, 2);
		gp.add(noviembre, 2, 2);
		gp.add(diciembre, 3, 2);
		
		mses = new ArrayList<monthCalendar>();
		
		mses.add(enero);
		mses.add(febrero);
		mses.add(marzo);
		mses.add(abril);
		mses.add(mayo);
		mses.add(junio);
		mses.add(julio);
		mses.add(agosto);
		mses.add(septiembre);
		mses.add(octubre);
		mses.add(noviembre);
		mses.add(diciembre);

		
	}
	
	private void setToday() {
		
	}

	public VBox getview() {
		return view;
	}
}
