<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Category</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<h3>${successmessage }</h3>
<h3>${failuremessage }</h3>
<div class="container">
	<div class="row">
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
     <jsp:include page="footer.jsp"></jsp:include>
     </body>
     </html>
