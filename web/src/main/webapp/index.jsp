<html>
<head>
    <title></title>
    <script>
        function submitForm() {
            document.forms["userData"].method = "POST";
            document.forms["userData"].action = "welcome.html";
            document.forms["userData"].submit();
        }
    </script>
</head>
<body>
<br>
<div style="text-align:center">
    <form id="userData">
        Nome <input type="text" name="firstName" /><br>
        Cognome <input type="text" name="lastName" /><br>
        <input type="button" onclick="javascript:submitForm();" value="invia" name="invia" label="invia" />
    </form>
</div>
</body>
</html>
