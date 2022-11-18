package base;

import java.util.Scanner;

public class Diccionario {

	private static Scanner teclado = new Scanner(System.in);

	public Diccionario() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String palabra = new String();



		System.out.print("Introduce palabra: ");
		palabra = teclado.next();

		if (palabra != null && palabra.equalsIgnoreCase("bit")) {
			System.out.println("M�nima unidad de informaci�n que representa un 0 � un 1.");
		} 
		

		else if (palabra != null && palabra.equalsIgnoreCase("radiacion")) {
			
			System.out.println("emision o trasmicion de energia dañina para los animales y personas");
		}


		if(palabra != null && palabra.equalsIgnoreCase("bit")) {

			System.out.println("M�nima unidad de informaci�n que representa un 0 � un 1.");
		}else if (palabra != null && palabra.equalsIgnoreCase("gigabyte")) { //Iker Musatadi
			System.out.println("Es una unidad de almacenamiento de informaci�n cuyo s�mbolo es el GB");
		}else {

			System.out.println("M�nima unidad de informaci�n que representa un 0 � un 1.");
		}
		else if(palabra != null && palabra.equalsIgnoreCase("backbone")) {
			System.out.println("Una troncal (en ingl�s backbone), red troncal o troncal de internet, es una de las principales conexiones de internet.");
    }else if (palabra != null && palabra.equalsIgnoreCase("raton")) {
			System.out.println("El ratón o mouse (en inglés pronunciado /maʊs/) es un dispositivo apuntador utilizado para facilitar el manejo de un entorno gráfico en una computadora");
		} else if (palabra != null && palabra.equalsIgnoreCase("manzana")) {
			System.out.println("Fruta de color verde que sale del manzano.");
		}	else if(palabra != null && palabra.equalsIgnoreCase("moneda")) {
			System.out.println("Pieza de metal, generalmente redonda y con un relieve en cada cara, a la que se le asigna un valor econ�mico determinado y se emplea como medio legal de pago.");
		} else if (palabra != null && palabra.equalsIgnoreCase("Videojuego")) {
			System.out.println("Un videojuego es un juego electr�nico en el que una o m�s personas interact�an por medio de un controlador, con un dispositivo que muestra im�genes de v�deo.");
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
		}else if(palabra != null && palabra.equalsIgnoreCase("palabra")) {
			System.out.println("Significado:");
			System.out.println("Unidad l�xica constituida por un sonido o conjunto de sonidos articulados que tienen un significado fijo y una categor�a gramatical.");
		}else if(palabra != null && palabra.equalsIgnoreCase("Bug")) {
			System.out.println("Significado:");
			System.out.println(" Un defecto en el software como podría ser un proceso, una definición de datos o un paso de parámetros incorrectos en un programa.");
		}else if(palabra != null && palabra.equalsIgnoreCase("bucle")){
			System.out.println("Significado:");
			System.out.println("Es una secuencia de instrucciones de código que se ejecuta repetidas veces.");
		}else if (palabra != null && palabra.equalsIgnoreCase("GPU")) {
			System.out.println("Una unidad de procesamiento gráfico es un coprocesador dedicado al procesamiento de gráficos u operaciones, para aligerar la carga de trabajo del procesador/CPU central en aplicaciones como los videojuegos o aplicaciones 3D interactivas");
		}else if (palabra != null && palabra.equalsIgnoreCase("RAM")) {
			System.out.println("La memoria de acceso aleatorio (Random Access Memory, RAM) es una memoria de almacenamiento a corto plazo. El sistema operativo de ordenadores u otros dispositivos utiliza la memoria RAM para almacenar de forma temporal todos los programas y sus procesos de ejecución");
		}

		else {
			System.out.println("Palabra no encontrada");
	
		}
		
		

  }
}

// request de Josu
// hniowvhiov