package dto;

import java.io.Serializable;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : ItemOrdenPedido.java
//  @ Date : 13/05/2014
//  @ Author : 
//
//




public class ItemOrdenPedidoDto implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ItemCotizacionDto item;

	public ItemCotizacionDto getItem() {
		return item;
	}

	public void setItem(ItemCotizacionDto item) {
		this.item = item;
	}
}
