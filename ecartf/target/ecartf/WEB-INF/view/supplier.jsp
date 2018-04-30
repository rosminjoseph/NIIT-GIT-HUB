<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Supplier</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<h3>${successmessage}</h3>
<h3>${failuremessage}</h3>
<div class="container">
	<div class="row">
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
<div class="container">
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