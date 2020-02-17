<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script type="text/javascript">
	function save1() {
		alert("save()");
		document.myform.action = "save1";
		document.myform.submit();
	}
	function test1() {
		alert("test()");
		document.myform.action = "test1";
		document.myform.submit();
	}
</script>


</head>
<body>
	<form name="myform" method="post">

		<center>
			<h1>Enter All Details</h1>
			<table border="1" cellpadding="5" align="center" background="" height="5">

				<tr>


					<th><select name="method" size="">
							<option>GET</option>
							<option>POST</option>
							<option>PUT</option>
							<option>DELETE</option>
							<option>PATCH</option>
					</select></th>


					<th><input type="text" name="url"></th>

				</tr>
				<tr>
					<th>Web-ServiceName:</th>
					<th><input type="text" name="name"></th>
				</tr>


				<tr>
					<th>Header Type :</th>

					<th><select name="header">
							<option>h1</option>
							<option>h2</option>
							<option>h3</option>
							<option>h4</option>
							<option>h5</option>
					</select></th>
				</tr>

				<tr>
					<th><input type="button" value="Save" name="save"
						onclick="save1()"></th>

					<th><input type="button" value="Test" name="test"
						onclick="test1()"></th>
				</tr>

			</table>
		</center>
	</form>

</body>
</html>