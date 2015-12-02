<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/include/common_css.jsp" /> 
<html>
<head>
<style type="text/css">
</style>
</head>
<body>
<div id="divMessage">
<c:if test="${not empty msg}">
	${msg}
</c:if>
</div>
</body>
</html>
	

