package dto;

import java.io.Serializable;



public class ItemCotizacionDto implements Serializable{

	private static final long serialVersionUID = 1L;
	private RodamientoDto rodamiento;
	private int cant;
	
	
	
	public ItemCotizacionDto(RodamientoDto rodamiento, int cant) {
		super();
		this.rodamiento = rodamiento;
		this.cant = cant;
	}
	
	public ItemCotizacionDto(){
		
	}

	public RodamientoDto getRodamiento() {
		return rodamiento;
	}
	
	public void setRodamiento(RodamientoDto rodamiento) {
		this.rodamiento = rodamiento;
	}
	
	public int getCant() {
		return cant;
	}
	
	public void setCant(int cant) {
		this.cant = cant;
	}
	

}