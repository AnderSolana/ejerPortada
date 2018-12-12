package com.ipartek.formacion.ejerportada.pojos;

import java.util.Date;

public class Noticia {
	private Long id;
	private String titulo, fecha, autor, imagen, texto;
	Date fecha2;

	private boolean hayErrores = false;

	private String errorId, errorTitulo, errorFecha, errorAutor, errorImagen, errorTexto;

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
		if (id == null || id <= 0) {
			// throw new PojoException("No se admiten valores de id <= 0");
			setErrorId("El id debe valer más que 0");
			return;
		}

		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (titulo == null || titulo.trim().length() == 0) {
			setErrorTitulo("No se admiten titulares vacíos");
		}

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
		if (fecha2 == null) {
			this.fecha2 = new Date();
		} else if (fecha2.after(new Date())) {
			setErrorFecha("No se admiten fechas futuras");
		}

		this.fecha2 = fecha2;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if (autor == null || autor.trim().length() == 0) {
			this.autor = "Anónimo";
		}

		this.autor = autor;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		if (imagen == null || imagen.trim().length() == 0) {
			imagen = "media/noticia-1.jpg";
		}
		
		this.imagen = imagen;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		//Expresión regular original \w+\.\w+.\w+
		if (texto.matches("\\w+\\.\\w+.\\w+")) {
			setErrorTexto("No se cumplen los requisitos del texto");
		}
		this.texto = texto;
	}

	public String getErrorId() {
		return errorId;
	}

	public void setErrorId(String errorId) {
		this.errorId = errorId;
	}

	public String getErrorTitulo() {
		return errorTitulo;
	}

	public void setErrorTitulo(String errorTitulo) {
		this.errorTitulo = errorTitulo;
	}

	public String getErrorFecha() {
		return errorFecha;
	}

	public void setErrorFecha(String errorFecha) {
		this.errorFecha = errorFecha;
	}

	public String getErrorAutor() {
		return errorAutor;
	}

	public void setErrorAutor(String errorAutor) {
		this.errorAutor = errorAutor;
	}

	public String getErrorImagen() {
		return errorImagen;
	}

	public void setErrorImagen(String errorImagen) {
		this.errorImagen = errorImagen;
	}

	public String getErrorTexto() {
		return errorTexto;
	}

	public void setErrorTexto(String errorTexto) {
		this.errorTexto = errorTexto;
	}

	public boolean isCorrecto() {
		return !hayErrores;
	}


	@Override
	public String toString() {
		return "Noticia [id=" + id + ", titulo=" + titulo + ", fecha=" + fecha + ", autor=" + autor + ", imagen="
				+ imagen + ", texto=" + texto + "]";
	}

}
