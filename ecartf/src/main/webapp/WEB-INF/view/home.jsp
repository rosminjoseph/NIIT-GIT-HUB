<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 
<title>welcome</title>

</head>
<body>
<jsp:include page="header.jsp"></jsp:include>


<div class="container">
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
        <img src="resources/images/pid${products[0].id}.jpg" alt="Los Angeles" style="width:70%;height: 400px;">
      </div>

       <c:forEach var="c" items="${products}">
      <div class="item">
        <img src="resources/images/pid${c.id}.jpg" alt="Chicago" style="width:70%;height: 400px;">
      </div>
    </c:forEach>
      
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" da ta-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
<br/>
<div class="container bootstrap snippet">
    <div class="row">
       
       <!--  <div class="col-md-9"> -->
            <div class="col-md-6 col-sm-6">
                <div class="store-item">
                    <div class="store-item-rating text-warning">
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star-half-o"></i>
                    </div>
                    <div class="store-item-image">
                        <a href="#">
                            <img src="resources/images/pid${products[0].id}.jpg" alt="" class="img-responsive">
                        </a>
                    </div>
                     <div class="store-item-info clearfix">
                        <span class="store-item-price themed-color-dark pull-right">$ ${products[0].price}</span>
                        <h3><a href="#"><strong>${products[0].name}</strong></a></h3>
                        <h4><i>${products[0].description}</i></h4>
                        <small><i class="fa fa-shopping-cart text-muted"></i>
                        <a href="prodet?id=${products[0].id}" class="text-muted">View More...</a></small>
                    </div>
                </div>
            </div> 
            <div class="col-md-6 col-sm-6">
                <div class="store-item">
                    <div class="store-item-rating text-warning">
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star-half-o"></i>
                    </div>
                    <div class="store-item-image">
                        <a href="#">
                            <img src="resources/images/pid${products[1].id}.jpg" alt="" class="img-responsive">
                        </a>
                    </div>
                    <div class="store-item-info clearfix">
                        <span class="store-item-price themed-color-dark pull-right">$ ${products[1].price}</span>
                        <h3><a href="#"><strong>${products[1].name}</strong></a></h3>
                        <h4><i>${products[1].description}</i></h4>
                        <small><i class="fa fa-shopping-cart text-muted"></i>
                        <a href="prodet?id=${products[1].id}" class="text-muted">View More...</a></small>
                    </div>
                </div>
            </div>  
            
            </div>            
	    </div>
	</div>
<!-- </div> -->


</br>
</br>
<br/>
<br/>



<jsp:include page="footer.jsp"></jsp:include>
                  
 
                      
</body>
</html>