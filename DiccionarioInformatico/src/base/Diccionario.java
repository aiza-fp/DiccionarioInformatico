package base;

import java.util.Scanner;

public class Diccionario {
	
	private static Scanner teclado = new Scanner(System.in);
	
	public Diccionario() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String palabra = new String();
		System.out.print ("Introduce palabra: "); 
		palabra = teclado.next();
		
		if(palabra != null && palabra.equalsIgnoreCase("bit")) {
			System.out.println("Mínima unidad de información que representa un 0 ó un 1.");
    }else if (palabra != null && palabra.equalsIgnoreCase("raton")) {
			System.out.println("El ratón o mouse (en inglés pronunciado /maʊs/) es un dispositivo apuntador utilizado para facilitar el manejo de un entorno gráfico en una computadora");
		}else  if(palabra != null && palabra.equalsIgnoreCase("CPU")){
			System.out.println("Unidad central de procesamiento: Lleva a cabo la union completa del las caracteristicas del equipo.");
    }else if(palabra !=null && palabra.equals("lan")) {
			  System.out.println("Una LAN, abreviatura para Local"
					+ " Area Network (Red de Area Local), es una red que "
					+ "cubre un �rea geogr�fica peque�a, como hogares, oficinas y grupos de edificios.");
		}else if(palabra != null && palabra.equalsIgnoreCase("informatica")){
			  System.out.println("Conjunto de conocimientos técnicos que se ocupan del tratamiento automático de la información por medio de computadoras");
		}
    else if(palabra != null && palabra.equalsIgnoreCase("ordenador")) {
				System.out.println("es una máquina que almacena y automatiza la información a través de programas informáticos diseñados específicamente para esta tarea.");
		}
		else if(palabra != null && palabra.equalsIgnoreCase("algoritmo")) {
				System.out.println("Un algoritmo informático es un conjunto de instrucciones definidas, ordenadas y acotadas para resolver un problema o realizar una tarea..");
		}
		else {
			System.out.println("Palabra no encontrada");
		
		}
}
}
