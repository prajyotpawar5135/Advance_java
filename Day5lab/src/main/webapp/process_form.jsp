<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="pojos.Course" import="pojos.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	String FirstName = request.getParameter("fn");
	String LastName = request.getParameter("ln");
	int score = Integer.parseInt(request.getParameter("score"));
	Course course = Course.valueOf(request.getParameter("course").toUpperCase());

	//wrap all these details under student object
	Student students = new Student(FirstName, LastName, score, course);

	if (score > course.getMinScore()) {
		students.setAdmitted(true);
	}
	//server pull:forward

	request.setAttribute("student_info", students);
	//RD
	RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
	rd.forward(request, response);
	System.out.println("execution contol came back");
	%>


</body>
</html>