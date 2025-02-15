<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>Add new song</title>
			<link rel="stylesheet" type="text/css"href="/css/songs_style.css?version=1.7">
				        <link rel="preconnect" href="https://fonts.googleapis.com">
				<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
				<link rel="preconnect" href="https://fonts.googleapis.com">
				<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
				<link href="https://fonts.googleapis.com/css2?family=Fredoka:wght@300..700&display=swap" rel="stylesheet">
		</head>
		<body>
		<div class="container container-tb">
			<h1> Add new song...</h1>
			<hr>
			<form:form class="left" action="/songs/process/add" method="post" modelAttribute="song">
				<div >
					<label class="txt" for="title" >Title:</label>
					<form:input class="txt-input" path="title" id="title"/>
					<br>
					<form:errors path="title" class="txt danger"/>	
				</div>
				<div>
					<label class="txt" for="artist" >Artist:</label>
					<form:input class="txt-input" path="artist" id="artist"/>
					<br>
					<form:errors path="artist" class="txt danger"/>	
				</div>
				<div>
					<label class="txt" for="album" >Album:</label>
					<form:input class="txt-input" path="album" id="album"/>
					<br>
					<form:errors path="album" class="txt danger"/>	
				</div>
				<div>
					<label class="txt" for="genre" >Genre:</label>
					<form:input class="txt-input" path="genre" id="genre"/>
					<br>
					<form:errors path="genre" class="txt danger"/>	
				</div>
				<div>
					<label class="txt" for="language" >Language:</label>
					<form:input class="txt-input" path="language" id="language"/>
					<br>
					<form:errors path="language" class="txt danger"/>	
				</div>
				<input class="btn" type="submit" value="Save song">
			</form:form>
			<hr>
			<a class="btn btn-mt-none" href="/songs">< Back</a>
		</div>
		
		</body>
	</html>