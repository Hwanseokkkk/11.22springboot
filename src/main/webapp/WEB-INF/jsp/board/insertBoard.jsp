<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>새글등록</title>
</head>
<body>
	<div id="wrapper">
		<div id="title">
			<h3>새글 등록하기</h3>
		</div>
		<div id="content" class="insertBoardForm">
			<hr>
			<form action="/board/insertBoardProc" method="post">
				<table>
				<colgroup>
					<col width="30%">
					<col width="70%">
				</colgroup>
					<tr>
						<td>제목</td>
						<td class="alignLeft"><input type="text" name="title" /></td>
					</tr>
					<tr>
						<td>작성자</td>
						<td class="alignLeft"><input type="text" name="writer" size="10" /></td>
					</tr>
					<tr>
						<td>내용</td>
						<td class="alignLeft"><textarea name="content" cols="40" rows="10"></textarea></td>
					</tr>
					<tr>
						<td colspan="2" class="alignCenter">
						<input type="submit" value=" 새글 등록 " />
						<input type="button" onclick="event.preventDefault(); location.href='/board/listBoard';" value=" 목록 " />
						</td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<hr>
</body>
</html>
