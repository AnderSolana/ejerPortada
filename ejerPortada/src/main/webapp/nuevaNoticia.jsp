<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nueva Noticia</title>
</head>
<body>

	<h1>Nueva Noticia</h1>
	
	<form action="guardarnoticia">
		<fieldset>
			<legend>Nueva Noticia</legend>
			<p>
				<label for="id">ID</label>
				<!-- <input name="id" id="id"> -->
				<input type="number" name="id" id="id" value="${noticia.id}" />
			</p>
			<p>
				<label for="titulo">Titulo</label>
				<!-- <input name="titulo" id="titulo"> -->
				<input name="titulo" id="titulo" value="${noticia.titulo}" />
			</p>
			<p>
				<label for="fecha">Fecha</label>
				<!-- <input type="date" name="fecha" id="fecha"> -->
				<input type="date" name="fecha" id="fecha" value="${noticia.fecha}">
			</p>
			<p>
				<label for="autor">Autor</label>
				<!-- <input name="autor" id="autor"> -->
				<input name="autor" id="autor" value="${noticia.autor}">
			</p>
			<p>
				<label for="texto">Texto</label>
				<!-- <textarea name="texto" id="texto"></textarea> -->
				<textarea name="texto" id="texto">${noticia.texto}</textarea>
			</p>
			<p>
			<button>Guardar cambios</button>
			</p>
		</fieldset>
	</form>

</body>
</html>