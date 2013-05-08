<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Cruzeiras</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">

	<link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.1/css/bootstrap-combined.min.css" rel="stylesheet" media="screen">

	<style type="text/css">
      body {
        padding-top: 40px;
        padding-bottom: 40px;
        background-color: #f5f5f5;
      }
    </style>
</head>
<body>
<div class="container">

	<div class="row">
		<div class="span3">
			<p class="text-left">
				Spring application on top of Netty.io
			</p>
			<p>
				<a href="http://github.com/fabiofalci/cruzeiras"><img alt="github" src="<c:url value="/resources/blacktocat-32.png" />"></a>
			</p>
		</div>

		<div class="span7">
			<form class="form-horizontal" method="post" action="/home">
				<div class="control-group">
				  <label class="control-label" for="inputEmail">Email</label>
				  <div class="controls">
				    <input type="text" id="inputEmail" name="email" placeholder="Email">
				  </div>
				</div>
				<div class="control-group">
				  <label class="control-label" for="inputPassword">Password</label>
				  <div class="controls">
				    <input type="password" id="inputPassword" name="password" placeholder="Password">
				  </div>
				</div>
				<div class="control-group">
				  <div class="controls">
				    <button type="submit" class="btn">Sign in</button>
				  </div>
			   </div>
			</form>
		</div>	
	</div>

</div>

</body>
</html>