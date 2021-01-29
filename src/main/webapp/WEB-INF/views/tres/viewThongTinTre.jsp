<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Thông Tin Trẻ</title>
<link rel="stylesheet" href="<c:url value="/static/css/bootstrap.min.css"/>" />
<link rel="stylesheet" href="<c:url value='/static/css/style.css'/>">
<script src="<c:url value="/static/js/jquery.min.js"/>"></script>
<script src="<c:url value="/static/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/static/js/main.js" />"></script>
</head>
<body>
	<div class="container-fluid">
	<marquee>
			<h3>Thông Tin Trẻ</h3>
	</marquee>	
		
	<div class="row clearfix">
		<form class="row" action="search-tre" style="margin-left: 79%;margin-bottom: 10px">
			<div>
				<input type="text" class="form-control" placeholder="Search"style="float:right; margin-left: 15px; width: 200px; margin-right: 10px;" name="key">
			</div>
			<div class="input-group-btn">
				<button value="loc" class="btn-secondary btn  btn-sm-4 " type="submit">Lọc</button>
			</div>
		</form>
    	<div class="col-md-12 table-responsive">
			<table  id="add-row" class="table table-bordered table-hover table-sortable">
				<thead>
					<tr style="background: #FFDEAD;" >
						<th class="text-center">Họ tên</th>
						<th class="text-center">Tên Lớp</th>
						<th class="text-center">Tuổi</th>
						<th class="text-center">Giáo Viên1</th>
						<th class="text-center">Giáo Viên2</th>
						<th class="text-center">Năm Học</th>
						<th class="text-center">Thời Gian Nghỉ</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="tre" items="${viewTre}">
	    				<tr>
	    					<td style="display:none">${tre.maTre}</td>
							<td>${tre.hoTen}</td>
							<td>${tre.tenLop}</td>
							<td>${tre.ngaySinh}</td>
							<td>${tre.tenGV1}</td>
							<td>${tre.tenGV2}</td>
							<td>${tre.namHoc}</td>
							<td>
								<c:if test="${tre.thoiGianNghi == '0.5'}">
									<p>Một buổi</p>
								</c:if>
								<c:if test="${tre.thoiGianNghi == '1.0'}">
									<p>Cả ngày</p>
								</c:if>
							</td>
							<td>
								<a href="<c:url value='/view-formThongTin/${tre.maTre}/${tre.ngayHoc}'/>"><button style="width: 80px" class='btn btn-success'>Edit <i class="fas fa-edit"></i></button></a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<a href="<c:url value='/form-theodoi'/>"><button class="col-2 form-control btn btn-primary"style="float: right;">Thêm Theo Dõi Vắng</button></a>
		</div>
	</div>
</div>
</body>
</html>