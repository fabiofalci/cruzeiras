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

<a href="https://github.com/fabiofalci/cruzeiras"><img style="position: absolute; top: 0; right: 0; border: 0;" src="https://s3.amazonaws.com/github/ribbons/forkme_right_green_007200.png" alt="Fork me on GitHub"></a>
<div id="main" class="container-fluid">
	<div class="row-fluid">

		<div class="span2">
			<ul class="nav nav-list">
				<li class="nav-header">Publish</li>
				<li><a href="#/publish-picture">Picture</a></li>
				<li class="nav-header">Friends</li>
				<li><a href="#/groups">Groups</a></li>
				<li class="nav-header">Settings</li>
				<li><a href="#">Information</a></li>
				<li><a href="#">Privacy</a></li>
				<li><a href="logout">Logout</a></li>
			</ul>
		</div>

		<div id="content" crclass="span8">
		</div>

	</div>
</div>

<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script src="http://malsup.github.com/jquery.form.js"></script> 
<script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/sammy.js/0.7.4/sammy.min.js"></script>
<script src="<c:url value="/resources/cruzeiras.js" />"></script>
</body>
</html>