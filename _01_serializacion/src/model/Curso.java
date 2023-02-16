package model;

import java.io.Serializable;
//implantamos la clase Serializable para poder guardar el objeto de esta misma clase en el fichero


public class Curso implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private int duracion;
	private int precio;
	private transient int tipo=50;/*atributo con valor fijo y cuando se serialice, no tiene sentido que se guarde porque 
	siempre valdrá lo mismo. Añadimos transient para evitar que el atributo sea serializado*/
	
	public Curso() {
		System.out.println("***Se ejecuta constructor sin parámetros***");
	}
	
	public Curso(String nombre, int duracion, int precio) {
		super();
		this.nombre = nombre;
		this.duracion = duracion;
		this.precio = precio;
		System.out.println("***Se ejecuta constructor con parámetros***");
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}

}
