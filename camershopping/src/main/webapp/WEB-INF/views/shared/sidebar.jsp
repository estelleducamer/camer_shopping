<h1 class="Lead">Shop Name</h1>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="list-group">

	<c:forEach items="${categories}" var="category">
		<a href="${contextRoot}/show/category/${category.id}/products" id="a_${category.name}" class="list-group-item" >${category.name}</a>
	</c:forEach>

</div>