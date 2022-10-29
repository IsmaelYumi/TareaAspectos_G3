package Apectos;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

public aspect MetodoObserb  {
	
	pointcut Cambio(): execution (protected BackgroundFill *(..));
	after() returning(BackgroundFill e): Cambio(){
		if( e.getFill().equals(Color.RED)) {
		System.out.println("Se cambio la ventana al color: Rojo");
		}
		if( e.getFill().equals(Color.BLUE)) {
				System.out.println("Se cambio la ventana al color: Azul ");	
			}
		if(e.getFill().equals(Color.GREEN)) {
			System.out.println("Se cambio la ventana al color: Verde ");	
		}
			
			
	}
}
