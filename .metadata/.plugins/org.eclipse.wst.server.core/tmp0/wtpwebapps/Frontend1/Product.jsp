
<%@include file="Header.jsp" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<form:form action="InsertProduct" modelAttribute="product" method="post">
<table>

	<tr>
	<td>Product Name</td>
	<td><form:input path="productName"/></td>
	</tr>
	
	<tr>
	<td>Price</td>
	<td><form:input path="price"/></td>
	</tr>
	
	<tr>
	<td>Stock</td>
	<td><form:input path="stock"/></td>
	</tr>
	
	<tr>
		<td>Category</td>
		<td>
		<form:select path="categoryId">
		<form:option value="O" label="--Select List--"/>
		<form:options items="${categoryList} }"/>
		</form:select>
		</td>
	</tr>
	
	<tr>
		<td>Supplier</td>
		<td><form:input path="SupplierId"/></td>
	</tr>
	
	<tr>
		<td>Product Description</td>
		<td><form:input path="productDesc"/></td>
	</tr>
	
	<tr>
		<td colspan="2">
			<input type="submit" value="Insert"/>
	</tr>
	
</table>
</form:form>

<table >
<tr>
	<td>Product ID</td>
	<td>Product Name</td>
	<td>Category</td>
	<td>Price</td>
	<td>Supplier</td>
	<td>Operation</td>
</tr>

<c:forEach items="${productlist}" var="product">
<tr>
	<td>${product.productId}</td>
	<td>${product.productName}</td>
	<td>${product.categoryId}</td>
	<td>${product.price}</td>
	<td>${product.supplierId}</td> 
</tr>
	<td>
		<a class="btn btn-success"href="<c:url value="/editProduct/${category.categoryId}"/>">Edit</a>
		<a class="btn btn-danger"href="<c:url value="/deleteProduct/${category.categoryId}"/>">Delete</a>
	</td>

</c:forEach>

</table>
