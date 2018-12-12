package com.ipartek.formacion.ejerportada.controladores;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TreeMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.ejerportada.pojos.Noticia;

@WebServlet("/formularionoticia")
public class FormularioNoticiaServlet extends HttpServlet {
	private static final String NOTICIA_JSP = "noticia.jsp";
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String accion = request.getParameter("accion");
		String id = request.getParameter("id");
		
		
		if(accion != null && !"insertar".equals(accion)) {
			@SuppressWarnings("unchecked")
			TreeMap<Long, Noticia> noticias = 
					(TreeMap<Long, Noticia>) request.getServletContext().getAttribute("noticias");
			
			if(noticias == null) {
				response.sendRedirect("noticias");
				return;
			}
			
			Noticia noticia = noticias.get(Long.parseLong(id));
			
			request.setAttribute("noticia", noticia);
		}
		
			request.setAttribute("accion", accion);
		
		request.getRequestDispatcher(NOTICIA_JSP).forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String accion = request.getParameter("accion");
		String id = request.getParameter("id");
		
		String titular = request.getParameter("titulo");
		String fecha = request.getParameter("fecha");
		String autor = request.getParameter("autor");
		String texto = request.getParameter("texto");
 		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm");
		Date fechaDate = null;
		
		try {
			fechaDate = format.parse(fecha);
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		@SuppressWarnings("unchecked")
		TreeMap<Long, Noticia> noticias = 
				(TreeMap<Long, Noticia>) request.getServletContext().getAttribute("noticias");
		
		if(noticias == null) {
			response.sendRedirect("noticias");
			return;
		}
		
		Long idLong;
		if("insertar".equals(accion)) {
			idLong = noticias.lastKey() + 1L;
		} else {
			idLong = Long.parseLong(id);
		}
		
		switch(accion) {
		case "insertar": 
		case "editar": 
			Noticia noticia = new Noticia(idLong, titular, fechaDate, autor, null, texto);
			
			if (noticia.isCorrecto()) {
				request.setAttribute("noticia", noticia);
				request.getRequestDispatcher(NOTICIA_JSP);
			}
			
			noticias.put(noticia.getId(), noticia);
			break;
		case "borrar": noticias.remove(Long.parseLong(id)); break;
		default: throw new ServletException("Opción no definida");
		}
		
		response.sendRedirect("noticias");
	}

}
