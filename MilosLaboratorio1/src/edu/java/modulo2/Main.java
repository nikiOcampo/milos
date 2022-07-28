package edu.java.modulo2;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		System.out.println("Ingrese la cantidad de personas a cargar: ");
		Scanner scanner = new Scanner(System.in);
		int cantPersonas = scanner.nextInt();
		Persona persona= new Persona();
		for (int i = 0; i < cantPersonas; i++) {
			System.out.println("Ingrese el nombre de la persona "+ (i+1));
			String nombre = scanner.next();
			System.out.println("Ingrese el apellido de la persona "+ (i+1));
			String apellido = scanner.next();
			System.out.println("Ingrese el tipo de documento de la persona " + (i+1));
			String tipo=scanner.next();
			System.out.println("Ingrese el numero de documento de la persona "+ (i+1));
			int num=scanner.nextInt();
			Documento doc= new Documento(tipo,num);
			persona = new Persona(nombre, apellido, doc);
			System.out.println(persona.toString());
		}
	}

}
