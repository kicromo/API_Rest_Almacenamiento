package com.example.fantasymovies.model;

public class Articulo {
	private String id;
	private String nombre;
	private float tamanyo;
	private float precio;
	private Movie mov;
	
	public Articulo (String id, String nombre, float tamanyo, float precio) {
		this.id	= id;
		this.nombre = nombre;
		this.tamanyo = tamanyo;
		this.precio = precio;
	}
	
	public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    
    public float getSize() {
    	return tamanyo;
    }

    public float precio() {
    	return precio;
    }
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String title) {
        this.nombre = title;
    }

    public void setYear(float tam) {
        this.tamanyo = tam;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

	
}
