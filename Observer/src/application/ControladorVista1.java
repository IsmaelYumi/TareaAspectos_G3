package application;
import java.net.URL;
import java.util.Observable;
import java.util.Observer;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
public class ControladorVista1  implements Initializable {
	@FXML
	private static Button bt_rojo;
	@FXML
	public static Button bt_azul;
	@FXML
	public static Button bt_verde;
	private String color_pantalla;
	
	
	@FXML
	
	public void Cambiar_Rojo( ActionEvent e) {
	Pane contenedor= (Pane) bt_rojo.getScene().getRoot();	
	BackgroundFill bgfill=new BackgroundFill(Color.RED,new CornerRadii(0),new Insets(0));
	Background bgr=new Background(bgfill);
	contenedor.setBackground(bgr);
	this.color_pantalla="rojo";
	}
	@FXML
	public  void Cambiar_Azul( ActionEvent e) {
	Pane contenedor= (Pane) bt_rojo.getScene().getRoot();	
	BackgroundFill bgfill=new BackgroundFill(Color.BLUE,new CornerRadii(0),new Insets(0));
	Background bga=new Background(bgfill);
	this.color_pantalla="Azul";
	
	}
	@FXML
	public  void Cambiar_Verde( ActionEvent e) {
	Pane contenedor= (Pane) bt_rojo.getScene().getRoot();	
	BackgroundFill bgfill=new BackgroundFill(Color.GREEN,new CornerRadii(0),new Insets(0));
	Background bgv=new Background(bgfill);
	contenedor.setBackground(bgv);
	this.color_pantalla="Verde";
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	public void Notificacion(String o) {
		this.color_pantalla=o;
		

}
}


