package com.ipartek.formacion.ejerportada.controladores;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.ejerportada.pojos.Noticia;

/**
 * Servlet implementation class NoticiasServlet
 */
@WebServlet("/noticias")
public class NoticiasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HashMap<Long, Noticia> noticias = (HashMap<Long, Noticia>) request.getServletContext().getAttribute("noticias");
		
		request.getRequestDispatcher("noticias.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
