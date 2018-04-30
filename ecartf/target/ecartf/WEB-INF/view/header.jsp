<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="./resources/css/headercss.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="${pageContext.request.contextPath}">Electronic Shop</a>
    </div>
    <ul class="nav navbar-nav">
    <c:if test="${pageContext.request.userPrincipal.name  != 'admin@gmail.com'}">
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Categories<span class="caret"></span></a>
        <ul class="dropdown-menu">
        <c:forEach var="c" items="${categories}">
          <li><a href="${pageContext.request.contextPath}/productlist?id=${c.id }">${c.name}</a></li>
        </c:forEach>
        </ul>
      </li>
      </c:if>
      <c:if test="${pageContext.request.userPrincipal.name  == 'admin@gmail.com'}">
      <li><a href="${pageContext.request.contextPath}/adminP?msg=">ADMIN</a></li>
      
     </c:if>
     <sec:authorize access="!hasRole('USER')">
 		<li>hai</li>
	 </sec:authorize>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <c:choose>
       <c:when test="${pageContext.request.userPrincipal.name != null}">
          <li>Role :<sec:authentication property="principal.authorities"/></li>
          <li><a href="${pageContext.request.contextPath}/user/cart?msg=">MyCart</a></li>
          <li ><a>Welcome : ${pageContext.request.userPrincipal.name}</a></li>
          <li> <a href="${pageContext.request.contextPath}/j_spring_security_logout" > Logout</a></li>
          </c:when>
          <c:otherwise>
         <li><a href="${pageContext.request.contextPath}/register"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="${pageContext.request.contextPath}/login?error"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </c:otherwise>
       </c:choose>
    
    
    </ul>
  </div>
</nav>
</body>
</html>