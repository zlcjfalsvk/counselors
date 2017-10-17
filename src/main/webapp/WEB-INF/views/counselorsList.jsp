<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>최철민</title>

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
							<a href="/counselors" class="btn47 blue" style="width: 160px;"><span>글쓰기</span></a>
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
									<th>글 번호</th>
									<th>제목</th>
									<th>작성자</th>
									<th>날짜</th>
								</tr>

								<c:forEach var="counselors" items="${list}">
									<tr>
										<td>${counselors.bno}</td>
										<!-- 제목 클릭시 상세 이동 -->
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
								<a href="#none" class="page_first"><span class="hide">처음</span></a>
								<a href="#none" class="page_prev"><span class="hide">이전</span></a>
								<span class="page"> <a href="#none" class="on"><span>1</span></a>
								</span> <a href="#none" class="page_next"><span class="hide">다음</span></a>
								<a href="#none" class="page_last"><span class="hide">끝</span></a>
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