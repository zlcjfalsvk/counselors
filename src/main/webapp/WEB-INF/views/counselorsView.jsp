<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div style="padding: 30px,">

			<table>
				<tr>
					<div class="form-group">
						<td><label>����</label></td>
						<td><span>${counselorVO.title}</span></td>
					</div>
				</tr>
				<tr>
					<div class="form-group">
						<td><label>�ۼ���</label></td>
						<td>${counselorVO.register}</td>
					</div>
				</tr>
				<tr>
					<div class="form-group">
						<td><label>����ó</label></td>
						<td>${counselorVO.contract}</td>
					</div>
				</tr>
				<tr>
					<div class="form-group">
						<td><label>e-Mail</label></td>
						<td>${counselorVO.email}</td>
					</div>
				</tr>
				<tr>
					<div class="form-group">
						<td><label>�̹��� ÷��</label></td>
						<td>${counselorVO.imagePath}</td>
					</div>
				</tr>
				<tr>
					<div class="form-group">
						<td><label>����</label></td>
						<td>${counselorVO.content}</td>
					</div>
				</tr>
				<tr>
					<td align="center"><input type="button" value="����"
						onclick='location.href="/counselors/${counselorVO.bno}"'></td>
						
					<td align="center">
					<form:form action="/counselors/${counselorVO.bno}" method="DELETE">
							<input type="submit" value="����">
						</form:form></td>

				</tr>
			</table>
		

	</div>
</body>
</html>