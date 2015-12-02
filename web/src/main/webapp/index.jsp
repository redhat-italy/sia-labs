<html>
<head>
<title>Spring MVC Tutorial Series by Crunchify.com</title>
<style type="text/css">
body {
	background-image: url('http://crunchify.com/bg.png');
}
</style>
<script>
function submitForm() {
	alert("ciao");
	document.forms["userData"].method = "POST";
	document.forms["userData"].action = "welcome.html";
	document.forms["userData"].submit();
}
</script>
</head>
<body>
	<br>
	<div style="text-align:center">
		<h2>
			Hey You..!! This is your 1st Spring MCV Tutorial..<br> <br>
		</h2>
		<h3>
			<a href="welcome.html">Click here to See Welcome Message... </a>(to
			check Spring MVC Controller... @RequestMapping("/welcome"))
		</h3>
		<form id="userData">
			nome <input type="text" name="firstName" /><br>
			cognome <input type="text" name="lastName" /><br>
			<input type="button" onclick="javascript:submitForm();" value="invia" name="invia" label="invia" />
		</form>
	</div>
</body>
</html>