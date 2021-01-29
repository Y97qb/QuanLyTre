<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Thêm Theo Dõi Vắng</title>
<link rel="stylesheet" href="<c:url value="/static/css/bootstrap.min.css"/>" />
<link rel="stylesheet" href="<c:url value='/static/css/style.css'/>">
<script src="<c:url value="/static/js/jquery.min.js"/>"></script>
<script src="<c:url value="/static/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/static/js/main.js" />"></script>
</head>
<body>
	<div class="container-fluid">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
							<h3>Thêm Theo Dõi Vắng</h3>
					<c:url value="/them-theodoi" var="url"/>
					<form:form action="${url}" modelAttribute="theodoi">
						<table class="table table-bordered text-center">
							<tr>
								<td style="width: 200px;">Mã Trẻ</td>
								<td>
									<form:select path="maTre" cssClass="form-control">
										<c:forEach var="tre" items="${listTre}">
											<form:option value="${tre.maTre}">${tre.maTre}</form:option>
										</c:forEach>
									</form:select>
								</td>
							</tr>
							<tr>
								<td style="width: 200px;">Ngày Học</td>
								<td>
									<form:input path="ngayHoc" cssClass="form-control form-control-sm"/>
								</td>
							</tr>
							<tr>
								<td style="width: 200px;">Thời Gian Nghỉ</td>
								<td>
									<form:select path="thoiGianNghi" cssClass="form-control">
										<form:option value="0.5">Một buổi</form:option>
										<form:option value="1.0">Cả ngày</form:option>
									</form:select>
								</td>
							</tr>
							<tr>
								<td style="width: 200px;">Lý Do</td>
								<td>
									<form:input path="lyDo" cssClass="form-control form-control-sm"/>
								</td>
							</tr>
							<tr>
								<td colspan="2">
									<a onclick=" history.go(-1)"><input value="Trở Về" type="button" class="col-2 form-control btn btn-success"style="float: right;margin-left: 10px"></a>
									<input value="Thêm Theo Dõi" name="CapNhat" onclick="return xacNhanAn()" type="submit" style="float: right;" class="col-2 form-control btn btn-primary">
								</td>
							</tr>
 						</table>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>