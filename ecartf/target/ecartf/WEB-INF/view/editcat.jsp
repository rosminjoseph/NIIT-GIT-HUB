<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
            <form action="Upcat" method="post">
            <div class="form-group"> 	 
                <label for="id"><span class="req">* </span> id: </label>
                    <input class="form-control" type="text" name="id" id = "txt"  value="${Category.id}" /> 
                        <div id="errFirst"></div>    
            </div>
          
            <div class="form-group">
            <label for="username"><span class="req">* </span> category name: </label>
                    <input required type="text" name="name" id="phone" class="form-control phone" maxlength="28" value="${Category.name}" placeholder="category name" /> 
            </div>

            
			<div class="form-group"> 	 
                <label for="password"><span class="req">* </span> description: </label>
                    <input class="form-control" type="text" name="description" id = "txt"  value="${Category.description}"  required /> 
                        <div id="errFirst"></div>    
            </div>
            <div class="form-group">
                <input class="btn btn-success" type="submit" name="submit_reg" value="updatecategory">
            </div>
            </form>
            </div>
            <br/>
            <br/>
            <br/>
            <br/>
            <br/>
            <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>