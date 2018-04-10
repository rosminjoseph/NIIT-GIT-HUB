<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 
<title>welcome</title>

</head>
<body>
${successmessage}
${failuremessage} 

<jsp:include page="header.jsp"></jsp:include>
<h1>welcome</h1>

<a href="Category"> Create Category</a>
<a href="supplier"> Create Supplier</a>
<a href="product"> Create Product</a>
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
        <img src="resources/images/demo.jpg" alt="Los Angeles" style="width:100%;">
      </div>

      <div class="item">
        <img src="resources/images/2.jpg" alt="Chicago" style="width:100%;">
      </div>
    
      <div class="item">
        <img src="resources/images/3.jpg" alt="New york" style="width:100%;">
      </div>
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

<div class="container bootstrap snippet">
    <div class="row">
       
        <div class="col-md-9">
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
                            <img src="https://lorempixel.com/300/200/technics/1/" alt="" class="img-responsive">
                        </a>
                    </div>
                    <div class="store-item-info clearfix">
                        <span class="store-item-price themed-color-dark pull-right">$ 109</span>
                        <a href="#"><strong>Product one</strong></a><br>
                        <small><i class="fa fa-shopping-cart text-muted"></i>
                        <a href="#" class="text-muted">Add to cart</a></small>
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
                            <img src="https://lorempixel.com/300/200/technics/3/" alt="" class="img-responsive">
                        </a>
                    </div>
                    <div class="store-item-info clearfix">
                        <span class="store-item-price themed-color-dark pull-right">$ 109</span>
                        <a href="#"><strong>Product two</strong></a><br>
                        <small><i class="fa fa-shopping-cart text-muted"></i>
                        <a href="#" class="text-muted">Add to cart</a></small>
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
                            <img src="https://lorempixel.com/300/200/technics/9/" alt="" class="img-responsive">
                        </a>
                    </div>
                    <div class="store-item-info clearfix">
                        <span class="store-item-price themed-color-dark pull-right">$ 109</span>
                        <a href="#"><strong>Product</strong></a><br>
                        <small><i class="fa fa-shopping-cart text-muted"></i>
                        <a href="#" class="text-muted">Add to cart</a></small>
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
                            <img src="https://lorempixel.com/300/200/technics/7/" alt="" class="img-responsive">
                        </a>
                    </div>
                    <div class="store-item-info clearfix">
                        <span class="store-item-price themed-color-dark pull-right">$ 109</span>
                        <a href="#"><strong>Sunglasses</strong></a><br>
                        <small><i class="fa fa-shopping-cart text-muted"></i>
                        <a href="#" class="text-muted">Add to cart</a></small>
                    </div>
                </div>
            </div>            
	    </div>
	</div>
</div>


</br>
</br>




<jsp:include page="footer.jsp"></jsp:include>
                  
 
                      
</body>
</html>