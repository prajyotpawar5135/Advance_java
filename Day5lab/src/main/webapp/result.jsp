<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="pojos.Course" import="pojos.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<h3>hello,${param.fn} ${requestScope.student_info.lastName}</h3>


	<%
	Student s = (Student) request.getAttribute("student_info");
	if (s.isAdmitted()) {
	%>
	<h5 style="color: green;">congratulations,you are admitted in:
		${requestScope.student_info.selectedCourse}</h5>
	<%
	}

	else {
	%>

	<h5 style="color: red;">sorry!!,you are not admitted in
		${requestScope.student_info.selectedCourse}</h5>
	<%
	}
	%>
</body>
</html>