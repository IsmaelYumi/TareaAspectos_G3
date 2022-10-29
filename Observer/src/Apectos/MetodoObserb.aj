package Apectos;
import  application.ControladorVista1.*;

import org.aspectj.lang.annotation.Pointcut;

import javafx.event.ActionEvent;


public aspect MetodoObserb  {
	pointcut Cambio():execution (ControladorVista1.Cambiar_rojo());
	after()  returning: Cambio(){
		System.out.println("Se cambio la ventana al color:");	
	}
}
