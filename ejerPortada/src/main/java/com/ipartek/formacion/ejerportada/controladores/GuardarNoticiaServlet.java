package com.ipartek.formacion.ejerportada.controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.ejerportada.pojos.Noticia;

/**
 * Servlet implementation class GuardarNoticiaServlet
 */
@WebServlet("/guardarnoticia")
public class GuardarNoticiaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Recoger información
		
		String id = request.getParameter("id");
		String titulo = request.getParameter("titulo");
		String fecha = request.getParameter("fecha");
		String autor = request.getParameter("autor");
		String texto = request.getParameter("texto");
		String imagen = "media/noticia-1.jpg";
		
		@SuppressWarnings("unchecked")
		ArrayList<Noticia> noticias = (ArrayList<Noticia>) request.getServletContext().getAttribute("noticias");
		
		// Empaquetarla en un objeto
		Noticia noticia = new Noticia(Long.parseLong(id), titulo, fecha, autor, imagen, texto);
		
		//Realizar la operación
		noticias.add(noticia);
		
		//Redireccionar a la página correspondiente
		request.getRequestDispatcher("/").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
