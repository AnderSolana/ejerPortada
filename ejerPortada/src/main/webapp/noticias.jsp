<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="includes/cabecera.jsp"%>

<section>
	<h2 class="noticias">Últimas noticias</h2>

	<c:forEach items="${noticias.values()}" var="noticia">
		<article>
			<header>


				<h3>${noticia.titulo}</h3>

			</header>

			<footer>
				Publicado el
				<time datetime="2017-01-23"> ${noticia.fecha}</time>
				por <a href="#"> ${noticia.autor}</a>
			</footer>
			<div class="noticia">
				<p>
					<img src=" ${noticia.imagen}" alt="" class="borderedImg">
				</p>

				<p class="textoNoticia">${noticia.texto}</p>
			</div>
			<p>
				<a href="#" class="more">leer más</a> <a
					href="formularionoticia?accion=editar&id=${noticia.id }">Editar</a>
				<a href="formularionoticia?accion=borrar&id=${noticia.id }">Borrar</a>
			</p>

		</article>
	</c:forEach>

	<p>
		<a href="formularionoticia?accion=insertar">Añadir</a>
	</p>

</section>

<%@ include file="includes/pie.jsp"%>