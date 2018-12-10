package com.ipartek.formacion.ejerportada.pojos;

import java.util.Date;

public class Noticia {
	private Long id; 
	private String titulo, fecha,  autor, imagen, texto;
	Date fecha2; 
	
	public Noticia(Long id, String titulo, String fecha, String autor, String imagen, String texto) {
		setId(id);
		setTitulo(titulo);
		setFecha(fecha);
		setAutor(autor);
		setImagen(imagen);
		setTexto(texto);
	}
	
	

	public Noticia() {
		
	}


	public Noticia(Long id, String titulo, Date fecha, String autor, String imagen, String texto) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.fecha2 = fecha;
		this.autor = autor;
		this.imagen = imagen;
		this.texto = texto;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public Date getFecha2() {
		return fecha2;
	}



	public void setFecha2(Date fecha2) {
		this.fecha2 = fecha2;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public String getImagen() {
		return imagen;
	}



	public void setImagen(String imagen) {
		this.imagen = imagen;
	}



	public String getTexto() {
		return texto;
	}



	public void setTexto(String texto) {
		this.texto = texto;
	}



	@Override
	public String toString() {
		return "Noticia [id=" + id + ", titulo=" + titulo + ", fecha=" + fecha + ", autor=" + autor + ", imagen="
				+ imagen + ", texto=" + texto + "]";
	}

}
