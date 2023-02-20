package model;

public class Tienda {
	private String nombreTienda;
	private String direccion;
	private DiaSemana diaCierre;// este atributo sólo debería aceptar un tipo concreto de string entre 7 posibles (L,m,x,j,v,s,d) Para ello se utiliza la enumeración
	                         //y así se puede aplicar el tipo de (datos) que pueden ser introducidos en dicho atributo
	public Tienda(String nombreTienda, String direccion, DiaSemana diaCierre) {
		super();
		this.nombreTienda = nombreTienda;
		this.direccion = direccion;
		this.diaCierre = diaCierre;
	}
	public String getNombreTienda() {
		return nombreTienda;
	}
	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public DiaSemana getDiaCierre() {
		return diaCierre;
	}
	public void setDiaCierre(DiaSemana diaCierre) {
		this.diaCierre = diaCierre;
	}
}
