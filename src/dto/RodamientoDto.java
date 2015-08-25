package dto;

import java.io.Serializable;



public class RodamientoDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String tipo;
	private String codigo;
	private int stock;
	private int medida;
	private String nombre;
	private String pais;
	private String caracteristicas;
	private int serie;
	private String origen;
	private float monto;
	private ProveedorDto proveedor;
	private String descripcion; 	
	
	
	public RodamientoDto(String tipo, String codigo, int stock, int medida,
			String nombre, String pais, String caracteristicas, int serie,
			String origen, float monto, ProveedorDto proveedor) {
		super();
		this.tipo = tipo;
		this.codigo = codigo;
		this.stock = stock;
		this.medida = medida;
		this.nombre = nombre;
		this.pais = pais;
		this.caracteristicas = caracteristicas;
		this.serie = serie;
		this.origen = origen;
		this.monto = monto;
		this.proveedor = proveedor;
	}
	
	public RodamientoDto(){
		
	}

	public float getMonto() {
		return monto;
	}
	
	public void setMonto(float monto) {
		this.monto = monto;
	}
	
	public String getOrigen() {
		return origen;
	}
	
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public int getMedida() {
		return medida;
	}
	
	public void setMedida(int medida) {
		this.medida = medida;
	}
	
	public String getCaracteristicas() {
		return caracteristicas;
	}
	
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
	public int getSerie() {
		return serie;
	}
	
	public void setSerie(int serie) {
		this.serie = serie;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public ProveedorDto getProveedor() {
		return proveedor;
	}
	
	public void setProveedor(ProveedorDto proveedor) {
		this.proveedor = proveedor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
