<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>


<div id="formCat" >
<f:form modelAttribute="categorie" action="savecat" method="POST" enctype="multipart/form-data"> 
<table>
	<tr>
		<td>ID Catégorie</td>
		<td><f:input path="idCategorie"/> </td>
		<td><f:errors path="idCategorie" cssClass="errors"/> </td>
	</tr>
	<tr>
		<td>Nom Catégorie</td>
		<td><f:input path="nomCategorie"/> </td>
		<td><f:errors path="nomCategorie" cssClass="errors"/> </td>
	</tr>
	<tr>
		<td>Description</td>
		<td><f:textarea path="description"/> </td>
		<td><f:errors path="description" cssClass="errors"/> </td>
	</tr>
	<tr>
		<td>Photo</td>
		<td><input type="file" name="file" /> </td>
	</tr>
	<tr>
		<td><input type="submit" value="Save" /> </td>
	</tr>
</table>
</f:form>
</div>
<div id="listCat">
<table>
   	<tr>
		<th>ID</th><th>NOM Catégorie</th><th>Description</th><th>Photo</th>
	</tr>
	<c:forEach items="${categories}" var="cat" >
	<tr>
	<td>${cat.idCategorie}</td>
	<td>${cat.nomCategorie}</td>
	<td>${cat.description}</td>
	<td><img src="photoCat?idCat=${cat.idCategorie}"></td>
	</tr>
	</c:forEach>
</table>
</div>
