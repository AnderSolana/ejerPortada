<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
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
	
	<style>
	.error {color:red;}
	</style>
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