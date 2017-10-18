<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>게시물 수정</title>
</head>
<body>

	<div style="padding: 30px,">
		<form method="post" action="/counselors">
			<table>
				<tr>
					<div class="form-group">
						<td><label>제목</label></td>
						<td><input type="text" name="title" class="form-control" value='${counselorVO.title}'></td>
					</div>
				</tr>
				<tr>
					<div class="form-group">
						<td><label>작성자</label></td>
						<td><input type="text" name="register" class="form-control" value='${counselorVO.register}'></td>
					</div>
				</tr>
				<tr>
					<div class="form-group">
						<td><label>비밀번호</label></td>
						<td><input type="password" name="password"
							class="form-control"' value='${counselorVO.password}'></td>
					</div>
				</tr>
				<tr>
					<div class="form-group">
						<td><label>연락처</label></td>
						<td><input type="text" name="contact" class="form-control" value='${counselorVO.contract}'></td>
					</div>
				</tr>
				<tr>
					<div class="form-group">
						<td><label>e-Mail</label></td>
						<td><input type="text" name="email" class="form-control" value='${counselorVO.email}'></td>
					</div>
				</tr>
				<tr>
					<div class="form-group">
						<td><label>이미지 첨부</label></td>
						<td><input type="text" name="imagePath" class="form-control" value='${counselorVO.imagePath}'></td>
					</div>
				</tr>
				<tr>
					<div class="form-group">
						<td><label>내용</label></td>
						<td><textarea name="content" class="form-control" rows="10" value='${counselorVO.content}'></textarea></td>
					</div>
				</tr>
				
				<tr>
					<td colspan="2" align="center"><button type="submit"
							class="btn btn-default" >수정</button></td>
				</tr>
				
			</table>
		</form>

	</div>

</body>
</html>