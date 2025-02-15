<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Songs</title>
		<link rel="stylesheet" type="text/css" href="/css/songs_style.css?version=1.7">
				        <link rel="preconnect" href="https://fonts.googleapis.com">
				<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
				<link rel="preconnect" href="https://fonts.googleapis.com">
				<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
				<link href="https://fonts.googleapis.com/css2?family=Fredoka:wght@300..700&display=swap" rel="stylesheet">
	</head>
	<body>
		<div class="container">
			<h1>Songs</h1>
			<hr>
			<div>
				<table>
					<thead>
						<tr>
							<th class="txt">Title</th>
							<th class="txt">Artist</th>
							<th class="txt">Details</th>
						</tr>		
					</thead>
					<tbody>
						<c:forEach var="song" items="${songs}">
							<tr>
								<td class="txt">${song.title}</td>
								<td class="txt">${song.artist}</td>
								<td class="txt"><a class="btn" href="/songs/details/${song.id}">Details ></a></td>
							</tr>
						</c:forEach>
					</tbody>
				
				</table>
				<hr>
				<a class="btn" href="/songs/form/add">Add song ></a>
			</div>
		</div>
	</body>
</html>