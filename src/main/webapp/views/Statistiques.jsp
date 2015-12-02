<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="springForm"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Synapse Gaming | Statistiques </title>
    <!-- Meta -->
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- CSS -->
    <link rel="shortcut icon" type="image/x-icon" href="<c:url value="/resources/img/favicon.ico" />"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/common.css" />">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/home.css" />">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/header.css" />">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/menu.css" />">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/news.css" />">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/slider.css" />">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/videos.css" />">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/blogs.css" />">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/achievement.css" />">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/recruitment.css" />">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/footer.css" />">
     <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/statistiques.css" />">
     <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/animate.css" />">
    <!-- JS -->
    <script type="text/javascript" src="<c:url value="/resources/js/jquery-2.0.3.js" />"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/menu.js" />"></script>
</head>
<body>
<div id="page-wrapper">
	<div id="header-wrapper">
		<jsp:include page="portal/Header.jsp"/>
	</div>
	<div id="persistent-menu-wrapper">
		<jsp:include page="portal/PersistentMenu.jsp"/>
	</div>
	<div id="menu-wrapper">
		<jsp:include page="portal/Menu.jsp"/>
	</div>
	<div id="news-wrapper">
		<jsp:include page="portal/News.jsp"/>
	</div>
<!-- 	<div id="videos-wrapper"> -->
<%-- 		<jsp:include page="portal/Videos.jsp"/> --%>
<!-- 	</div> -->
		<div id="news-wrapper">
			<!--  <h3>Statistiques</h3>

			<h4>Top 5 des classes les plus jouées</h4>
			<c:forEach items="${ClazzMostPlayed}" var="clazz">
				</br>${ clazz.name } </br>
				<img src="<c:url value="${ clazz.img }" />" title="${ clazz.name }" />
			</c:forEach>

			<h4>Top 5 des races les plus jouées</h4>
			<c:forEach items="${RaceMostPlayed}" var="race">
				</br>${ race.name } 
			</c:forEach>

			<h4>Top 5 des spécialisations</h4>
			<c:forEach items="${SpecializationMostPlayed}" var="specialization">
				</br>${ specialization.name } </br>
				<img src="<c:url value="${ specialization.img }" />"
					title="${ specialization.name }" />
			</c:forEach>

			<h4>Utilisateurs sans Avatar personalisé (Pensez à en mettre un
				:) )</h4>
			<c:forEach items="${UsersWithoutPicture}" var="users_pictures">
				<div>${ users_pictures.nickname }</div>
			</c:forEach>

			<h4>Utilisateurs les plus actifs</h4>
			<c:forEach items="${UsersMostActive}" var="users_mostActive">
				<div>${ users_mostActives.name }</div>
			</c:forEach> -->

<h1 class="bounceInLeft">Les statistiques</h1>

			
				  <div class="box">
				<h3>Top 5 des classes les plus jouées</h3>
				<ul><li>
					<c:forEach items="${ClazzMostPlayed}" var="clazz">
						</br>${ clazz.name } </br></li>
						<li><img src="<c:url value="${ clazz.img }" />"
							title="${ clazz.name }" />
					</c:forEach></li>
				</ul>
				</div>

			<div class="box">

				<h3>Top 5 des races les plus jouées</h3>
				<ul><li>
				
					<c:forEach items="${RaceMostPlayed}" var="race">
						</br></br>${ race.name } </br></br>
					</c:forEach></li>
				</ul>


			</div>

			<div class="box">
					<h3>Top 5 des spécialisations</h3>
					<ul><li>
					<c:forEach items="${SpecializationMostPlayed}" var="specialization">
						</br>${ specialization.name } </br>
						<img src="<c:url value="${ specialization.img }" />"
							title="${ specialization.name }" />
					</c:forEach></li>
				</ul>
				</div>

				<div class="box">
					<h3>Utilisateurs sans Avatar personalisé</h3>

				<ul><li>
					<c:forEach items="${UsersWithoutPicture}"
							var="users_pictures">
							${ users_pictures.nickname }</br>
							</br>
						</c:forEach></li>
				</ul>
				</div>
				
				<div class="box" id="actif">
					<h3>Les 5 uilisateurs les plus actifs</h3>

				<ul><li>
					<c:forEach items="${UsersMostActive}"
							var="users_active">
							</br>
							${ users_active.nickname }</br>
							</br>
						</c:forEach></li>
				</ul>
				</div>


			



			<div id="footer-wrapper">
		<jsp:include page="portal/Footer.jsp"/>
	</div>
</div>
</body>
</html>