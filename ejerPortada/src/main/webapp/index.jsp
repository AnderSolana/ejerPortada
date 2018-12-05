<%@page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.ipartek.formacion.ejerportada.pojos.Noticia" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- <%
	
	Object oNoticias = request.getAttribute("noticias");
	ArrayList <Noticia> noticias = (ArrayList<Noticia>)oNoticias;
	
%> --%>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<meta name="generator" content="Notepad++">
	<link rel="stylesheet" href="css/estilos.css">
	<title>Práctica Estructura y CSS</title>
</head>

	
<body>
	
    
<header id="cabecera">
    <div id="headerContent">
	<h1 id="logo">
        <a href="index.html">
            <img src="media/logo.jpg" alt="Logo">
        </a>
    </h1>   
    
    <nav>
        <ul id="menuPrincipal">
            <li><a class="linkMenu" href="#">Quiénes somos</a></li>
            <li><a class="linkMenu" href="#">Servicios</a></li>
            <li><a class="linkMenu" href="#">Proyectos</a></li>
            <li><a class="linkMenu" href="#">Blog</a></li>
            <li><a class="linkMenu" href="#">Contacto</a></li>
        </ul>
    </nav>
    </div>
    <ul id="rrss">
        <li>
            <a href="http://www.facebook.com">
                <img src="media/logo-facebook.gif" alt="Facebook">
            </a>
        </li>
        <li>
            <a href="http://www.twitter.com">
                <img src="media/logo-twitter.gif" alt="Twitter">
            </a>
        </li>
    </ul>
</header> 
    
    
    
<aside>
 
    <p><img src="media/banner.jpg" alt="" class="banner"></p>  
    
</aside>
    
    
    
<section>
    
    <h2 class="proyectos">Últimos Proyectos</h2>
    <div id="proyectos">
    <article class="formato-proyectos">
       
        <p><img src="media/proyecto-1.jpg" alt="" class="imgProyectos"></p>
        
        <header>
            <h3>Proyecto 1</h3>
        </header>
        
        <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper.</p>
        
        <p><a href="#" class="more">leer más ></a></p>
        
    </article>
    
   <article class="formato-proyectos">
       
        <p><img src="media/proyecto-2.jpg" alt="" class="imgProyectos"></p>
        
        <header>
            <h3>Proyecto 2</h3>
        </header>
        
        <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper.</p>
        
        <p><a href="#" class="more">leer más ></a></p>
        
    </article>
    
    <article class="formato-proyectos">
       
        <p><img src="media/proyecto-3.jpg" alt="" class="imgProyectos"></p>
        
        <header>
            <h3>Proyecto 3</h3>
        </header>
        
        <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper.</p>
        
        <p><a href="#" class="more">leer más ></a></p>
        
    </article>
    </div>
</section>   
    
    
    
    
<div id="divisionSecciones">    
<section>
     <h2 class="noticias">Últimas noticias</h2>
   
   <%-- <c:forEach items="${noticias}" var="noticia"> --%>
   
   <c:forEach items="${noticias.values()}" var="noticia">
    <article>
        <header>
            <%-- <h3>${noticia.titulo}
            </h3> --%>
            
             <h3>${noticia.titulo} <a href="editarNoticia?id=${noticia.id}">Editar</a></h3>
            
        </header>
       
        <footer>
             Publicado el <time datetime="2017-01-23"> ${noticia.fecha}</time> por <a href="#">  ${noticia.autor}</a> 
        </footer>
    <div class="noticia">
       <p><img src=" ${noticia.imagen}" alt="" class="borderedImg"></p>
        
        <p class="textoNoticia"> ${noticia.texto}</p>
    </div>
        <p><a href="#" class="more">leer más</a></p>
      
    </article>
    </c:forEach>
    <h2><a href="nuevanoticia">Nueva Noticia</a></h2>
  <%--  <% } %> --%>
</section>    
    
	
    
<section class="informacion">
    <h2 class="info">Información útil</h2>
    
    <dl class="definitionList">
        <dt><span id="horario"></span>Horario</dt>
        <dd>Pellentesque habitant morbi tristique senectus et netus et malesuada fames <a href="#">ac turpis egestas</a>.</dd>
        
        <dt><span id="gastos"></span>Gastos de envío</dt>
        <dd>Pellentesque habitant morbi tristique senectus et netus et malesuada fames <a href="#">ac turpis egestas</a>.</dd>
        
        <dt><span id="chat"></span>Chat</dt>
        <dd>Pellentesque habitant morbi tristique senectus et netus et malesuada fames <a href="#">ac eges tas</a>.</dd>
        
        <dt><span id="devoluciones"></span>Devoluciones</dt>
        <dd>Pellentesque habitant morbi tristique senectus et netus et malesuada fames <a href="#">ac turpis egestas</a>.</dd>
        
    </dl>
    
</section>    
</div>    
    
    
    
    
    
<footer id="pie">
    <nav>
        <ul>
            <li><a href="#" class="footerLink">Quiénes somos</a></li>
            <li><a href="#" class="footerLink">Servicios</a></li>
            <li><a href="#" class="footerLink">Proyectos</a></li>
            <li><a href="#" class="footerLink">Blog</a></li>
            <li><a href="#" class="footerLink">Contacto</a></li>
        </ul>
    </nav>
 
    <p  class="footerLink">&copy;Copyright 2018</p>
    
</footer>
    
</body>
</html>