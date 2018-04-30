<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
/* Tabs*/
section {
    padding: 60px 0;
}

section .section-title {
    text-align: center;
    color:aqua;
    margin-bottom: 50px;
    text-transform: uppercase;
}
#tabs{
	background:gray;
    color:black;
}
#tabs h6.section-title{
    color: #eee;
}

#tabs .nav-tabs .nav-item.show .nav-link, .nav-tabs .nav-link.active {
    color:black;
    background-color: transparent;
    border-color: transparent transparent black;
    border-bottom: 4px solid !important;
    font-size: 20px;
    font-weight: bold;
}
#tabs .nav-tabs .nav-link {
    border: 1px solid transparent;
    border-top-left-radius: .25rem;
    border-top-right-radius: .25rem;
    color:black;
    font-size: 20px;
}
</style>


<!-- Tabs -->
<jsp:include page="header.jsp"></jsp:include>
<div class="container">
<section id="tabs">
<h6 class="section-title h1">ADMIN</h6>
<h6 style="color: red;">${msg}</h6>
<ul class="nav nav-tabs">
  <li class="active"><a data-toggle="tab" href="#home" style="color: black;">Category</a></li>
  <li><a data-toggle="tab" href="#menu1" style="color: black;">Suppliers</a></li>
  <li><a data-toggle="tab" href="#menu2" style="color: black;">Products</a></li>
</ul>
<form action="cat" method="post" >
<div class="tab-content">
  <div id="home" class="tab-pane fade in active">
     <div class="col-md-6">
            <form action="cat" method="post">
          
            <div class="form-group">
            <label for="username"><span class="req">* </span> category name: </label>
                    <input required type="text" name="name" id="phone" class="form-control phone" maxlength="28"  placeholder="category name"/> 
            </div>

            <div class="form-group"> 	 
                <label for="id"><span class="req">* </span> id: </label>
                    <input class="form-control" type="text" name="id" id = "txt"  required /> 
                        <div id="errFirst"></div>    
            </div>
			<div class="form-group"> 	 
                <label for="password"><span class="req">* </span> description: </label>
                    <input class="form-control" type="text" name="description" id = "txt"  required /> 
                        <div id="errFirst"></div>    
            </div>
            <div class="form-group">
                <input class="btn btn-success" type="submit" name="submit_reg" value="createcategory">
            </div>
            
        
            </form>
            </div>
            <div class="container">
            <table class="table">
<thead>
<tr>
<th>Category Name</th>
<th>Id</th>
<th>Description</th>
<th>action</th>
</tr>
</thead>
<tbody>
<c:forEach var="c" items="${categories}" >
      <tr>
        <td>${c.id}</td>
        <td>${c.name}</td>
        <td>${c.description}</td>
        	<td><a href="editC?id=${c.id}">
          		<span class="glyphicon glyphicon-edit"></span>
       			 </a>
       			 <a href="deleteC?id=${c.id}" >
        	  	 <span class="glyphicon glyphicon-trash"></span>
        		 </a>
       		</td> 
      </tr>
     </c:forEach>
     </tbody>
     
     </table>

  </div>
  </div>
  <div id="menu1" class="tab-pane fade">
       <div class="col-md-6">
                <form action="sup" method="post">
          
            <div class="form-group">
            <label for="username"><span class="req">* </span> supplier name: </label>
                    <input required type="text" name="name" id="phone" class="form-control phone" maxlength="28"  placeholder="supplier name"/> 
            </div>

            <div class="form-group"> 	 
                <label for="id"><span class="req">* </span> id: </label>
                    <input class="form-control" type="text" name="id" id = "txt"  required /> 
                        <div id="errFirst"></div>    
            </div>
			<div class="form-group"> 	 
                <label for="address"><span class="req">* </span> Address: </label>
                    <input class="form-control" type="text" name="address" id = "txt"  required /> 
                        <div id="errFirst"></div>    
            </div>
            <div class="form-group">
                <input class="btn btn-success" type="submit" name="submit_reg" value="create supplier">
            </div>
        
            </form><!-- ends register form -->

</div>


<table class="table">
<thead>
<tr>
<th>Supplier Name</th>
<th>Id</th>
<th>Address</th>
<th>action</th>
</tr>
</thead>
<tbody>
<c:forEach var="c" items="${suppliers}" >
      <tr>
        <td>${c.id}</td>
        <td>${c.name}</td>
        <td>${c.address}</td>
        	<td><a href="editS?id=${c.id}">
          		<span class="glyphicon glyphicon-edit"></span>
       			 </a>
       			 <a href="deleteS?id=${c.id}" >
        	  	 <span class="glyphicon glyphicon-trash"></span>
        		 </a>
       		</td> 
      </tr>
     </c:forEach>
    </tbody>
  </table>
  
  </div>
  <div id="menu2" class="tab-pane fade">
       <div class="col-md-6">
    
						<form action="pro" method="post" enctype="multipart/form-data">
          
            <div class="form-group">
            <label for="username"><span class="req">* </span> product name: </label>
                    <input required type="text" name="name" id="phone" class="form-control phone" maxlength="28"  placeholder="product name"/> 
            </div>

            <div class="form-group"> 	 
                <label for="id"><span class="req">* </span> id: </label>
                    <input class="form-control" type="text" name="id" id = "txt"  required /> 
                        <div id="errFirst"></div>    
            </div>
			<div class="form-group"> 	 
                <label for="description"><span class="req">* </span> description: </label>
                    <input class="form-control" type="text" name="description" id = "txt"  required /> 
                        <div id="errFirst"></div>    
            </div>
            <div class="form-group"> 	 
                <label for="categoryid"><span class="req">* </span> CategoryID: </label>
                <select name="categoryID">
                <c:forEach var="c" items="${categories}" >
                   <option value="${c.id }">${c.name }</option>
                </c:forEach>
                </select>
                     
            </div>
            <div class="form-group"> 	 
                <label for="supplierid"><span class="req">* </span> SupplierID: </label>
                <select name="supplierID">
                <c:forEach var="s" items="${suppliers}" >
                   <option value="${s.id }">${s.name }</option>
                </c:forEach>
                </select>
                   
            </div>
            <div class="form-group"> 	 
                <label for="price"><span class="req">* </span> price: </label>
                    <input class="form-control" type="text" name="price" id = "txt"  required /> 
                        <div id="errFirst"></div>    
            </div>
            <div class="form-group"> 	 
                <label for="stock"><span class="req">* </span> stock: </label>
                    <input class="form-control" type="number" name="stock" id = "txt"  required /> 
                        <div id="errFirst"></div>    
            </div>
             <div class="form-group"> 	 
                <label for="pic"><span class="req">* </span> Select product image: </label>
                 <input  type="file" name="pic" id ="pic"  required /> 
                    
                   
            </div>
            <div class="form-group">
                <input class="btn btn-success" type="submit" name="submit_reg" value="createproduct">
            </div>
        
            </form><!-- ends register form --></div>
            <table class="table">
<thead>
<tr>
<th>Id</th>
<th></th>
<th>Product Name</th>
<th>Description</th>
<th>Category</th>
<th>Supplier</th>
<th>Price</th>
<th>Stock</th>
<th>action</th>
</tr>
</thead>
<tbody>
<c:forEach var="c" items="${products}" >
      <tr>
        <td>${c.id}</td>
        <td><img src="${pageContext.request.contextPath}/resources/images/pid${c.id}.jpg" style="width: 100px;height: 100px;border-color: black;border-radius: 20px"></td>
        <td>${c.name}</td>
        <td>${c.description}</td>
        <td>${c.categoryID.name}</td>
        <td>${c.supplierID.name}</td> 
        <td>${c.price}</td>
        <td>${c.stock}</td>
        	<td><a href="editP?id=${c.id}">
          		<span class="glyphicon glyphicon-edit"></span>
       			 </a>
       			 <a href="deleteP?id=${c.id}" >
        	  	 <span class="glyphicon glyphicon-trash"></span>
        		 </a>
       		</td> 
      </tr>
     </c:forEach>
    </tbody>
  </table>
	  <jsp:include page="footer.jsp"></jsp:include> 		
  </div>
</div>
</section>
</div>
