<%@page import="javax.servlet.jsp.jstl.core.Config"%>
<%@page import="com.sun.xml.internal.bind.CycleRecoverable.Context"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@page session="true"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script
	src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
<script
	src="https://cdn.datatables.net/1.10.16/js/dataTables.bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.10.16/css/dataTables.bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<script type="text/javascript">

$(document).ready(function() { 
    $('#example').DataTable();
});

</script>
<%@ page import="java.security.Principal"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dashboard</title>
<style>
	.tableDiv{
		margin: 30px;
	}
</style>
</head>
<body>

	<c:catch var="catchtheException">
		<center>
			<h1>Welcome To DashBoard</h1>
		</center>

		<div style="margin-left: 77%;">
			<a href="addInvoice">
				<button type="button" class="btn btn-primary">Add Invoice</button>
			</a>
		</div>

		<div class="tableDiv">
			<table id="example" class="table table-striped table-bordered"
				style="width: 100%">
				<thead>
					<tr>
						<th>S.No</th>
						<th>invoiceNO</th>
						<th>invTotal</th>
						<th>billType</th>
						<th>billDate</th>
					</tr>
				</thead>
				<tbody>
					<c:set var="count" value="0" scope="page" />

					<c:forEach items="${list}" var="invoice">
						<tr>
							<td><c:set var="count" value="${count + 1}" scope="page" />
								<c:out value="${count}" /></td>
							<td>${invoice.invoiceNO}</td>
							<td>${invoice.invTotal}</td>
							<td>${invoice.billType}</td>
							<td><fmt:formatDate type="date" value="${invoice.billDate}" />
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</c:catch>

	<c:if test="${catchtheException != null}">
		<p>
			The type of exception is : ${catchtheException} <br /> There is an
			exception: ${catchtheException.message}
		</p>
	</c:if>

</body>
</html>