package com.ipartek.formacion.ejerportada.pojos;

public class Noticia {
	private Long id; 
	private String titulo, fecha, autor, imagen, texto; 
	
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
