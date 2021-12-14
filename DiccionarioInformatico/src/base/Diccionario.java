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
