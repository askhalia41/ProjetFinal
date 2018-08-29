<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>

<%@ page session="false"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>

<html>
<head>
<title>Accueil utilisateurs</title>
<link type="text/css" rel="stylesheet" href="${contextPath}/resources/css/style.css" />
</head>

<body>

	<c:if test="${loggedUser.id == 0}">
		<f:form method="POST" action="loginAction" modelAttribute="loggedUser">
			<table class="login">
				<tr bgcolor="#A6A5C2">
					<th colspan="2">Authentification:</th>
				</tr>
				<tr bgcolor="#A6A5C2">
					<td align="center">Nom d'utilisateur :<span class="requis">*</span></td>
					<td align="center"><f:input path="login" size="20" /></td>
				</tr>
				<tr bgcolor="#A6A5C2">
					<td align="center">Mot de passe :<span class="requis">*</span></td>
					<td align="center"><f:password path="password" size="20" /></td>
				</tr>
				<tr bgcolor="#A6A5C2">
					<td colspan="2" align="center"><input type="submit"
						value="Connexion" /><input type="reset" value="Annuler" /></td>
				</tr>
			</table>
		</f:form>
	</c:if>

	<c:if test="${loggedUser.id != 0}">
		<div>Vous êtes ${loggedUser.login} <a href="disconnect?idLoggedUser=${loggedUser.id}" style="">Se déconnecter</a></div>
	</c:if>

	<div><c:out value="${message}" /></div>

</body>
</html>
