<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Document</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css"
	integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" />

<!-- jQuery library -->
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>

<!-- Popper JS -->
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="card">
		<h1>getParameterValues 실습</h1>
		<form action="sport" method="post">
			
			<fieldset>
				<div class="card-header">
				<legend>좋아하는 운동 및 성별</legend>
				</div>
				<div class="card-body">
				<ul>
					<li><label for="baseball">야구</label> <input type="checkbox"
						name="sports" value="야구"> <label for="football">축구</label>
						<input type="checkbox" name="sports" value="축구"> <label
						for="basketball">농구</label> <input type="checkbox" name="sports"
						value="농구"></li>
					<li><label for="sex"> 남</label> <input type="radio" name="sex"value="남자" checked> <label for="sex"> 여</label> <input
						type="radio" name="sex" value="여자"></li>
					<div>
						<label>나이</label>
						<input type="number" name="age" required>
					</div>
					<div>
					<button type="submit" class="btn btn-primary">
					<i class="fa-solid fa-right-to-break"></i>전송
					</button>
					</div>
				</ul>
				</div>
			</fieldset>
		</form>
		</div>
	</div>
</body>
</html>
