<%@ page language="java" contentType="text/html"%>
<html>
<head>
<title>Home Decor-Navbar</title>
<meta name="viewport" content="width-device-width, initial-scale=1">
<link rel="stylesheet"
		 href="http://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
		<script
		 	src="https://ajax.ggogleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<script
			 src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
		<script 
			src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body>
<p align="center">
<a href="Login">Login</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="Register">Register</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/AboutUs">AboutUs</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="Category">Category</a>&nbsp;&nbsp;&nbsp;&nbsp;

<nav class="navbar" navbar-expand-sm bg-dark navbar-dark>
	<a class="navbar-brand" href="#"><img src="facebook.png"
	width="25" height="25"></a>
	
<button class="navbar-togger" type="buuton" data-toggle="collapse"
data-target="#collapsibleNavbar">
<span class="navbar-toggler-icon"></span>
</button>

<div class="collapse navbar-collapse id="collapsibleNavbar">
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="#">
				<font color:"red"><span class="glyphicon glyphicon-home"></span></font>
				</a></li>
			<li class="nav-item"><a class="nav-link" href="/Login"></a>
			</li>
			<li class="nav-item"><a class="nav-link" href="/Register"></a>
			</li>
			<li class="nav-item"><a class="nav-link" href="/AboutUs"></a>
			</li>
			
		</ul>
	</div>
	</nav>
</body>
</html>