package dad.javafx.monthcalendar;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.ResourceBundle;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class monthCalendar extends GridPane implements Initializable {
	// model
	private IntegerProperty month = new SimpleIntegerProperty();
	private IntegerProperty year = new SimpleIntegerProperty();
	private ArrayList<StringProperty> dias = new ArrayList<StringProperty>();
	private ArrayList<Label> labels = new ArrayList<Label>();
	private StringProperty mesNombre = new SimpleStringProperty();

	private StringProperty label1prop = new SimpleStringProperty();
	private StringProperty label2prop = new SimpleStringProperty();
	private StringProperty label3prop = new SimpleStringProperty();
	private StringProperty label4prop = new SimpleStringProperty();
	private StringProperty label5prop = new SimpleStringProperty();
	private StringProperty label6prop = new SimpleStringProperty();
	private StringProperty label7prop = new SimpleStringProperty();
	private StringProperty label8prop = new SimpleStringProperty();
	private StringProperty label9prop = new SimpleStringProperty();
	private StringProperty label10prop = new SimpleStringProperty();
	private StringProperty label11prop = new SimpleStringProperty();
	private StringProperty label12prop = new SimpleStringProperty();
	private StringProperty label13prop = new SimpleStringProperty();
	private StringProperty label14prop = new SimpleStringProperty();
	private StringProperty label15prop = new SimpleStringProperty();
	private StringProperty label16prop = new SimpleStringProperty();
	private StringProperty label17prop = new SimpleStringProperty();
	private StringProperty label18prop = new SimpleStringProperty();
	private StringProperty label19prop = new SimpleStringProperty();
	private StringProperty label20prop = new SimpleStringProperty();
	private StringProperty label21prop = new SimpleStringProperty();
	private StringProperty label22prop = new SimpleStringProperty();
	private StringProperty label23prop = new SimpleStringProperty();
	private StringProperty label24prop = new SimpleStringProperty();
	private StringProperty label25prop = new SimpleStringProperty();
	private StringProperty label26prop = new SimpleStringProperty();
	private StringProperty label27prop = new SimpleStringProperty();
	private StringProperty label28prop = new SimpleStringProperty();
	private StringProperty label29prop = new SimpleStringProperty();
	private StringProperty label30prop = new SimpleStringProperty();
	private StringProperty label31prop = new SimpleStringProperty();
	private StringProperty label32prop = new SimpleStringProperty();
	private StringProperty label33prop = new SimpleStringProperty();
	private StringProperty label34prop = new SimpleStringProperty();
	private StringProperty label35prop = new SimpleStringProperty();
	private StringProperty label36prop = new SimpleStringProperty();
	private StringProperty label37prop = new SimpleStringProperty();
	private StringProperty label38prop = new SimpleStringProperty();
	private StringProperty label39prop = new SimpleStringProperty();
	private StringProperty label40prop = new SimpleStringProperty();
	private StringProperty label41prop = new SimpleStringProperty();
	private StringProperty label42prop = new SimpleStringProperty();
	// view

	@FXML
	private GridPane monthview;

	@FXML
	private Label lunesLabel;

	@FXML
	private Label martesLabel;

	@FXML
	private Label miercolesLabel;

	@FXML
	private Label juevesLabel;

	@FXML
	private Label viernesLabel;

	@FXML
	private Label sabadoLabel;

	@FXML
	private Label domingoLabel;
	
	@FXML
	private Label Label1;

	@FXML
	private Label Label2;

	@FXML
	private Label Label3;

	@FXML
	private Label Label4;

	@FXML
	private Label Label5;

	@FXML
	private Label Label6;

	@FXML
	private Label Label7;

	@FXML
	private Label Label8;

	@FXML
	private Label Label9;

	@FXML
	private Label Label10;

	@FXML
	private Label Label11;

	@FXML
	private Label Label12;

	@FXML
	private Label Label13;

	@FXML
	private Label Label14;

	@FXML
	private Label Label15;

	@FXML
	private Label Label16;

	@FXML
	private Label Label17;

	@FXML
	private Label Label18;

	@FXML
	private Label Label19;

	@FXML
	private Label Label20;

	@FXML
	private Label Label21;

	@FXML
	private Label Label22;

	@FXML
	private Label Label23;

	@FXML
	private Label Label29;

	@FXML
	private Label Label24;

	@FXML
	private Label Label37;

	@FXML
	private Label Label30;

	@FXML
	private Label Label36;

	@FXML
	private Label Label31;

	@FXML
	private Label Label38;

	@FXML
	private Label Label25;

	@FXML
	private Label Label32;

	@FXML
	private Label Label26;

	@FXML
	private Label Label39;

	@FXML
	private Label Label33;

	@FXML
	private Label Label40;

	@FXML
	private Label Label27;

	@FXML
	private Label Label34;

	@FXML
	private Label Label28;

	@FXML
	private Label Label41;

	@FXML
	private Label Label35;

	@FXML
	private Label Label42;

	@FXML
	private Label mesLabel;

	public monthCalendar(int anyo, int mes) {
		super();
		year.setValue(anyo);
		month.setValue(mes);
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/monthcalendar.fxml"));
			loader.setController(this);
			loader.setRoot(this);
			loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		
		iniBinds();
		labelsini();
		diasini();
		setMonth();
		setDays();
		today();
		
	}
	
	private void today() {
		
		String todaycss = "-fx-font-color: black;"+
		"-fx-font-weight: bold;"+
		"-fx-border-insets: 1px;"+
		"-fx-border-style: dashed;"+
		"-fx-border-radius: 10px;"+
		"-fx-border-color: black;"+
		"-fx-background-color: linear-gradient(to bottom right, white, orange);"+
		"-fx-background-radius: 10px;";
		if (year.get() == LocalDateTime.now().getYear()) {
			if (month.get() == LocalDateTime.now().getMonth().getValue()) {
				int suma = 0;
				LocalDate date = LocalDate.of(year.get(), month.get(), 1);
				switch (date.getDayOfWeek()) {
				case MONDAY:
					
					break;
				case TUESDAY:
					suma=1;
					break;
				case WEDNESDAY:
					suma=2;
					break;
				case THURSDAY:
					suma=3;
					break;
				case FRIDAY:
					suma=4;
					break;
				case SATURDAY:
					suma=5;
					break;
				default: // sunday por default
					suma=6;
					break;
				}
				labels.get((LocalDateTime.now().getDayOfMonth()+suma)).setStyle(todaycss);
			}
		}
	} 

	
	private void iniBinds() {
		mesLabel.textProperty().bind(mesNombre);
		
		Label1.textProperty().bind(label1prop);
		Label2.textProperty().bind(label2prop);
		Label3.textProperty().bind(label3prop);
		Label4.textProperty().bind(label4prop);
		Label5.textProperty().bind(label5prop);
		Label6.textProperty().bind(label6prop);
		Label7.textProperty().bind(label7prop);
		Label8.textProperty().bind(label8prop);
		Label9.textProperty().bind(label9prop);
		Label10.textProperty().bind(label10prop);
		Label11.textProperty().bind(label11prop);
		Label12.textProperty().bind(label12prop);
		Label13.textProperty().bind(label13prop);
		Label14.textProperty().bind(label14prop);
		Label15.textProperty().bind(label15prop);
		Label16.textProperty().bind(label16prop);
		Label17.textProperty().bind(label17prop);
		Label18.textProperty().bind(label18prop);
		Label19.textProperty().bind(label19prop);
		Label20.textProperty().bind(label20prop);
		Label21.textProperty().bind(label21prop);
		Label22.textProperty().bind(label22prop);
		Label23.textProperty().bind(label23prop);
		Label24.textProperty().bind(label24prop);
		Label25.textProperty().bind(label25prop);
		Label26.textProperty().bind(label26prop);
		Label27.textProperty().bind(label27prop);
		Label28.textProperty().bind(label28prop);
		Label29.textProperty().bind(label29prop);
		Label30.textProperty().bind(label30prop);
		Label31.textProperty().bind(label31prop);
		Label32.textProperty().bind(label32prop);
		Label33.textProperty().bind(label33prop);
		Label34.textProperty().bind(label34prop);
		Label35.textProperty().bind(label35prop);
		Label36.textProperty().bind(label36prop);
		Label37.textProperty().bind(label37prop);
		Label38.textProperty().bind(label38prop);
		Label39.textProperty().bind(label39prop);
		Label40.textProperty().bind(label40prop);
		Label41.textProperty().bind(label41prop);
		Label42.textProperty().bind(label42prop);
	}

	private void setDays() {
		LocalDate date = LocalDate.of(year.get(), month.get(), 1);
		int primerdia = -1;
		switch (date.getDayOfWeek()) {
		case MONDAY:
			primerdia = 1;
			label1prop.set("1");
			break;
		case TUESDAY:
			primerdia = 2;
			label1prop.set(" ");
			label2prop.set("1");
			break;
		case WEDNESDAY:
			primerdia = 3;
			label1prop.set(" ");
			label2prop.set(" ");
			label3prop.set("1");
			break;
		case THURSDAY:
			primerdia = 4;
			label1prop.set(" ");
			label2prop.set(" ");
			label3prop.set(" ");
			label4prop.set("1");
			break;
		case FRIDAY:
			primerdia = 5;
			label1prop.set(" ");
			label2prop.set(" ");
			label3prop.set(" ");
			label4prop.set(" ");
			label5prop.set("1");
			break;
		case SATURDAY:
			primerdia = 6;
			label1prop.set(" ");
			label2prop.set(" ");
			label3prop.set(" ");
			label3prop.set(" ");
			label4prop.set(" ");
			label5prop.set(" ");
			label6prop.set("1");
			break;
		default: // sunday por default
			primerdia = 7;
			label1prop.set(" ");
			label2prop.set(" ");
			label3prop.set(" ");
			label4prop.set(" ");
			label5prop.set(" ");
			label6prop.set(" ");
			label7prop.set("1");
			break;
		}
		int nextday = 2;
		int diasmes = date.getMonth().length(Year.of(year.get()).isLeap());

		for (int i = primerdia + 1; i <= dias.size() - 1; i++) {
			if (nextday <= diasmes) {
				dias.get(i).set("" + nextday);
			} else {
				dias.get(i).set(" ");
			}
			nextday++;
		}
	}
	
	private void setMonth() {
		switch (month.get()) {
		case 1:
			setMesNombre("Enero");
			break;
		case 2:
			setMesNombre("Febrero");
			break;
		case 3:
			setMesNombre("Marzo");
			break;
		case 4:
			setMesNombre("Abril");
			break;
		case 5:
			setMesNombre("Mayo");
			break;
		case 6:
			setMesNombre("Junio");
			break;
		case 7:
			setMesNombre("Julio");
			break;
		case 8:
			setMesNombre("Agosto");
			break;
		case 9:
			setMesNombre("Septiembre");
			break;
		case 10:
			setMesNombre("Octubre");
			break;
		case 11:
			setMesNombre("Noviembre");
			break;

		default: // default sale el mes de diciembre
			setMesNombre("Diciembre");
			break;
		}

	}

	private void diasini() {
		dias.add(new SimpleStringProperty());
		dias.add(label1prop);
		dias.add(label2prop);
		dias.add(label3prop);
		dias.add(label4prop);
		dias.add(label5prop);
		dias.add(label6prop);
		dias.add(label7prop);
		dias.add(label8prop);
		dias.add(label9prop);
		dias.add(label10prop);
		dias.add(label11prop);
		dias.add(label12prop);
		dias.add(label13prop);
		dias.add(label14prop);
		dias.add(label15prop);
		dias.add(label16prop);
		dias.add(label17prop);
		dias.add(label18prop);
		dias.add(label19prop);
		dias.add(label20prop);
		dias.add(label21prop);
		dias.add(label22prop);
		dias.add(label23prop);
		dias.add(label24prop);
		dias.add(label25prop);
		dias.add(label26prop);
		dias.add(label27prop);
		dias.add(label28prop);
		dias.add(label29prop);
		dias.add(label30prop);
		dias.add(label31prop);
		dias.add(label32prop);
		dias.add(label33prop);
		dias.add(label34prop);
		dias.add(label35prop);
		dias.add(label36prop);
		dias.add(label37prop);
		dias.add(label38prop);
		dias.add(label39prop);
		dias.add(label40prop);
		dias.add(label41prop);
		dias.add(label42prop);
	}
	private void labelsini() {
		labels.add(new Label());
		labels.add(Label1);
		labels.add(Label2);
		labels.add(Label3);
		labels.add(Label4);
		labels.add(Label5);
		labels.add(Label6);
		labels.add(Label7);
		labels.add(Label8);
		labels.add(Label9);
		labels.add(Label10);
		labels.add(Label11);
		labels.add(Label12);
		labels.add(Label13);
		labels.add(Label14);
		labels.add(Label15);
		labels.add(Label16);
		labels.add(Label17);
		labels.add(Label18);
		labels.add(Label19);
		labels.add(Label20);
		labels.add(Label21);
		labels.add(Label22);
		labels.add(Label23);
		labels.add(Label24);
		labels.add(Label25);
		labels.add(Label26);
		labels.add(Label27);
		labels.add(Label28);
		labels.add(Label29);
		labels.add(Label30);
		labels.add(Label31);
		labels.add(Label32);
		labels.add(Label33);
		labels.add(Label34);
		labels.add(Label35);
		labels.add(Label36);
		labels.add(Label37);
		labels.add(Label38);
		labels.add(Label39);
		labels.add(Label40);
		labels.add(Label41);
		labels.add(Label42);

	}

	public final IntegerProperty monthProperty() {
		return this.month;
	}

	public final int getMonth() {
		return this.monthProperty().get();
	}

	public final void setMonth(final int month) {
		this.monthProperty().set(month);
	}

	public final IntegerProperty yearProperty() {
		return this.year;
	}

	public final int getYear() {
		return this.yearProperty().get();
	}

	public final void setYear(final int year) {
		this.yearProperty().set(year);
	}

	public final StringProperty mesNombreProperty() {
		return this.mesNombre;
	}

	public final String getMesNombre() {
		return this.mesNombreProperty().get();
	}

	public final void setMesNombre(final String mesNombre) {
		this.mesNombreProperty().set(mesNombre);
	}
	public ArrayList<StringProperty> getDias() {
		return dias;
	}
}