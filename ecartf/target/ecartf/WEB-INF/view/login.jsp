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
            <form action="log" method="post">
          
            <div class="form-group">
            <label for="username"><span class="req">* </span> username: </label>
                    <input required type="text" name="username" id="phone" class="form-control phone" maxlength="28"  placeholder="not used for marketing"/> 
            </div>

            <div class="form-group"> 	 
                <label for="password"><span class="req">* </span> password: </label>
                    <input class="form-control" type="text" name="password" id = "txt"  required /> 
                        <div id="errFirst"></div>    
            </div>

            <div class="form-group">
                <input class="btn btn-success" type="submit" name="submit_reg" value="login">
            </div>
        
            </form><!-- ends register form -->


</div>
</body>
</html>