<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>��ö��</title>

</head>

<body>
	<div id="wrap" class="ver_fff">

		<header id="header" class=""> </header>

		<div id="container" class="visual_container">
			<div id="contents">
				<section class="nowon">
				<div class="h2_title">
					<p class="menu_copy">Charlie</p>
				</div>
				<div id="contents" class="mt80">


					<div class="list_area area_1180">
						<div class="fl_r mb15">
							<a href="/counselors" class="btn47 blue" style="width: 160px;"><span>�۾���</span></a>
						</div>

						<table class="list_table3" cellpadding="0" cellspacing="0">
							<colgroup>
								<col style="width: 120px;" />
								<col style="width: 120px;" />
								<col style="width: 186px;" />
								<col style="width: 186px;" />
							</colgroup>
							<tbody>
								<tr>
									<th>�� ��ȣ</th>
									<th>����</th>
									<th>�ۼ���</th>
									<th>��¥</th>
								</tr>

								<c:forEach var="counselors" items="${list}">
									<tr>
										<td>${counselors.bno}</td>
										<!-- ���� Ŭ���� �� �̵� -->
										<td><a href="/counselors/${counselors.bno}">${counselors.title}</a></td>
										<td>${counselors.register}</td>
										<td><fmt:formatDate value="${counselors.registeredTime}"
												pattern="MM / dd" /></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>



						<!-- 
						<div class="pagination">
							<div class="paging" id="page1" page1="1" count1="1"
								path1="&bs=&sf=all&ss=">
								<a href="#none" class="page_first"><span class="hide">ó��</span></a>
								<a href="#none" class="page_prev"><span class="hide">����</span></a>
								<span class="page"> <a href="#none" class="on"><span>1</span></a>
								</span> <a href="#none" class="page_next"><span class="hide">����</span></a>
								<a href="#none" class="page_last"><span class="hide">��</span></a>
							</div>
						</div>
						 -->



					</div>
				</div>
				</section>
			</div>
		</div>
	</div>



</body>
</html>