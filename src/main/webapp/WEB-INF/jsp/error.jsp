<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<h3>Se ha producido un error</h3>
	<p>Ha ocurrido una excepción. Contacta con el soporte.</p>
	<p>URL: <c:out value="${url}" /></p>
	<p>Detalle: <c:out value="${exception}" /></p>
</div>
<%@ include file="common/footer.jspf"%>
