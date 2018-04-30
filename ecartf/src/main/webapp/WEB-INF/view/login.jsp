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

<h1>${error}</h1>
<div class="container">
	<div class="row">
        <div class="col-md-6">
            <form action="j_spring_security_check" method="post">
          
            <div class="form-group">
            <label for="email">Email address:</label> 
    <input type="email" class="form-control" id="email" name="username">
              </div>

            <div class="form-group"> 
             <label for="pwd">Password:</label>
    <input type="password" class="form-control" id="pwd" name="password">	 
                
            </div>
             
  <div class="checkbox">
    <label><input type="checkbox"> Remember me</label>
  </div>
  <button type="submit" class="btn btn-default">Submit</button>
</form>
 </div>
 </div>
 </div>
 <br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
 <jsp:include page="footer.jsp"></jsp:include>
 
</body>
</html>