package com.ipartek.formacion.ejerportada.controladores;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.ejerportada.pojos.Noticia;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/index")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//@SuppressWarnings("unchecked")
			//ArrayList<Noticia> noticias = (ArrayList<Noticia>) request.getServletContext().getAttribute("noticias");
			@SuppressWarnings("unchecked")
			HashMap<Long, Noticia> noticias = 
			(HashMap<Long, Noticia>) request.getServletContext().getAttribute("noticias");
			
			if (noticias == null) {
				//noticias = new ArrayList<Noticia>();
				noticias = new HashMap<Long, Noticia>();
				noticias.put(1L, new Noticia(1L, "Noticia 1", "2017-01-23", "Jane Doe", "media/noticia-1.jpg", "Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo."));
				noticias.put(2L, new Noticia(2L, "Noticia 2", "2017-01-22", "John Doe", "media/noticia-2.jpg", "Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo."));
				noticias.put(3L, new Noticia(2L, "Noticia 3", "2017-01-21", "Jane Doe", "media/noticia-3.jpg", "Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo."));
				
				request.getServletContext().setAttribute("noticias", noticias);
			}
			
			request.getRequestDispatcher("index.jsp").forward(request, response);
			
			//request.setAttribute("noticias", noticias);
			
			// Ir a la página indicada y llevarse todos los datos
			//request.getRequestDispatcher("index.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
