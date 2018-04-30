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
<jsp:include page="header.jsp"></jsp:include>
<div class="container">
	<div class="row">
        <div class="col-md-6">
            <form action="Uppro" method="post" enctype="multipart/form-data">
            <div class="form-group">
            <label for="username"><span class="req">* </span> product name: </label>
                    <input required type="text" name="name" id="phone" class="form-control phone" maxlength="28" value=${Product.name}  placeholder="product name"/> 
            </div>

            <div class="form-group"> 	 
                <label for="id"><span class="req">* </span> id: </label>
                    <input class="form-control" type="text" name="id" id = "txt" value=${Product.id}  /> 
                        <div id="errFirst"></div>    
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               </div>
			<div class="form-group"> 	 
                <label for="description"><span class="req">* </span> description: </label>
                    <input class="form-control" type="text" name="description" id = "txt" value=${Product.description}  /> 
                        <div id="errFirst"></div>    
            </div>
            <div class="form-group"> 	 
                <label for="categoryid"><span class="req">* </span> CategoryID: </label>
                <select name="categoryID" >
                <c:forEach var="c" items="${categories}" >
                   <option value="${c.id }">${c.name }</option>
                </c:forEach>
                </select>
                     
            </div>
            <div class="form-group"> 	 
                <label for="supplierid"><span class="req">* </span> SupplierID: </label>
                <select name="supplierID"  >
                <c:forEach var="s" items="${suppliers}" >
                   <option value="${s.id }">${s.name }</option>
                </c:forEach>
                </select>
                   
            </div>
            <div class="form-group"> 	 
                <label for="price"><span class="req">* </span> price: </label>
                    <input class="form-control" type="text" name="price" id = "txt"  value=${Product.price}required /> 
                        <div id="errFirst"></div>    
            </div>
            <div class="form-group"> 	 
                <label for="stock"><span class="req">* </span> stock: </label>
                    <input class="form-control" type="text" name="stock" id = "txt" value=${Product.stock}  required /> 
                        <div id="errFirst"></div>    
            </div>
            
            <div class="form-group"> 	
            <img src="${pageContext.request.contextPath}/resources/images/pid${Product.id}.jpg" style="width: 100px;height: 100px;border-color: black;border-radius: 20px"> 
                <label for="pic"><span class="req">* </span> Select product image: </label>
                 <input class="form-control" type="file" name="pic" id = "pic"   /> 
                    
                   
            </div>
            <div class="form-group">
                <input class="btn btn-success" type="submit" name="submit_reg" value="updateproduct">
            </div>
        
            </form><!-- ends register form -->


</div>
<br/>
<br/>
<br/>
<br/>

  <jsp:include page="footer.jsp"></jsp:include>        
</body>
</html> 