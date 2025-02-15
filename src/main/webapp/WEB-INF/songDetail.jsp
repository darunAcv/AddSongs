<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>${song.title}</title>
			<link rel="stylesheet" type="text/css" href="/css/songs_style.css?version=1.7">
				        <link rel="preconnect" href="https://fonts.googleapis.com">
				<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
				<link rel="preconnect" href="https://fonts.googleapis.com">
				<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
				<link href="https://fonts.googleapis.com/css2?family=Fredoka:wght@300..700&display=swap" rel="stylesheet">
		</head>
		<body>
			<div class="container">
				<h1>${song.title} - ${song.artist}</h1>
				<p class="txt" >Album: ${song.album}</p>
				<p class="txt" >Genre: ${song.genre}</p>
				<p class="txt" >Language: ${song.language}</p>
				<p class="txt" >Artist: ${song.artist}</p>
				<hr>
				<p class="txt" ><a class="btn btn-mt-none" href="/songs">< Back</a></p>
			</div>
		</body>
</html>