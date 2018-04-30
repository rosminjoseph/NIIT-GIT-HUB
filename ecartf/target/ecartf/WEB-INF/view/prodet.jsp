<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<style>
.gallery-wrap .img-big-wrap img {
    height: 450px;
    width: auto;
    display: inline-block;
    cursor: zoom-in;
}


.gallery-wrap .img-small-wrap .item-gallery {
    width: 60px;
    height: 60px;
    border: 1px solid #ddd;
    margin: 7px 2px;
    display: inline-block;
    overflow: hidden;
}

.gallery-wrap .img-small-wrap {
    text-align: center;
}
.gallery-wrap .img-small-wrap img {
    max-width: 100%;
    max-height: 100%;
    object-fit: cover;
    border-radius: 4px;
    cursor: zoom-in;
}
</style>
<jsp:include page="header.jsp"></jsp:include>
</br>
</br>
</br>

<div class="container">
	
	
<div class="card">
	<div class="row">
		<aside class="col-sm-5 border-right">
<article class="gallery-wrap"> 
<div class="img-big-wrap">
  <div> <a href="#"><img src="${pageContext.request.contextPath}/resources/images/pid${product.id}.jpg" style="height: 550px; width: 500px"></a></div>
</div> <!-- slider-product.// -->

</article> <!-- gallery-wrap .end// -->
		</aside>
		
		<aside class="col-sm-7">
<article class="card-body-lg">
<dl class="item-property">
  <dt>Product Name</dt>
  <dd><p>${product.name} </p></dd>
</dl>

<dl class="item-property">
  <dt>Product ID</dt>
  <dd><p>${product.id}</p></dd>
</dl>
<dl class="param param-feature">
  <dt>Price</dt>
  <dd>${product.price}</dd>
</dl>  <!-- item-property-hor .// -->
<dl class="param param-feature">
  <dt>Category Name</dt>
  <dd>${product.categoryID.name}</dd>
</dl>  <!-- item-property-hor .// -->
<dl class="param param-feature">
  <dt>Stock</dt>
  <dd>${product.stock}</dd>
</dl>  <!-- item-property-hor .// -->
<c:choose>
 <c:when test="${pageContext.request.userPrincipal.name != null}">
	<a href="${pageContext.request.contextPath}/user/cart/addcart?pid=${product.id}" class="btn btn-lg btn-primary text-uppercase"> Add Cart </a>
</c:when>
<c:otherwise>
  <a href="${pageContext.request.contextPath}/login?error=" class="btn btn-lg btn-primary text-uppercase"> LOGIN FIRST</a>

</c:otherwise>
</c:choose>
</article> <!-- card-body.// -->
		</aside> <!-- col.// -->
	</div> <!-- row.// -->
</div> <!-- card.// -->


</div>
<!--container.//-->


<br><br><br>



        <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>