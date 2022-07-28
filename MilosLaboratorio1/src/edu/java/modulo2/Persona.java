package edu.java.modulo2;

import java.util.concurrent.atomic.AtomicInteger;

public class Persona {
	private int id;
	private String nombre;
	private String apellido;
	private int edad;
	private Documento docu;
	
	
	public int asignarEdad() {
		int maximo = 100;
		return (int) ((Math.random()*maximo)+1);
	}
	
	
	
	


	public Persona( String nombre, String apellido, Documento docu) {
		super();
		this.id = asignarId();
		this.nombre = nombre;
		this.apellido = apellido;
		this.docu = docu;
		edad=asignarEdad();
	}






	public Persona() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}	

	public int asignarId () {
		AtomicInteger ID =  new AtomicInteger(1);
		return ID.getAndIncrement();
	}
	
	public void mostrarAtributos() {
		System.out.println("Nombre: " + getNombre() + "apellido: " + getApellido() + "edad: " + getEdad());
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", "+ docu.toString() + "]";
	}

	
	
	
}

