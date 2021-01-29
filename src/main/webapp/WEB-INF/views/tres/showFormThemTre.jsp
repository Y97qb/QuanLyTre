<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Thêm Trẻ</title>
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
							<h3 style="text-align: center;">Thêm Trẻ</h3>
							<p style="color: red">${soLuongTre}</p><br/>
					<c:url value="/them-tre" var="url"/>
					<form:form action="${url}" method="POST" modelAttribute="tre">
						<table class="table table-bordered text-center">
							<tr>
								<td style="width: 200px;">Mã trẻ<span style="color: red"> (*)</span></td>
								<td>
									<form:input required="required" id="maTre"  path="maTre" cssClass="form-control form-control-sm"/>
									<p id="trungMa" style="color: red">${trungMa}</p>
								</td>
							</tr>
							<tr>
								<td style="width: 200px;">Mã Lớp<span style="color: red"> (*)</span></td>
								<td>
									<form:select path="maLop" id="txtReqFieldsML" class="form-control">
										<form:option value="">---Chọn mã lớp---</form:option>
										<c:forEach  var="lop" items="${listLop}">
											<form:option value="${lop.maLop}">${lop.maLop}</form:option>
										</c:forEach>
									</form:select>
									<span style="color: red" id="txtReqFieldML"></span>
								</td>
							</tr>
							<tr>
								<td style="width: 200px;">Họ Tên<span style="color: red"> (*)</span></td>
								<td>
									<form:input path="hoTen" id="txtReqFields" cssClass="form-control form-control-sm "/>
									<span style="color: red" id="txtReqField"></span>
								</td>
							</tr>
							<tr>
								<td style="width: 200px;">Ngày Sinh<span style="color: red"> (*)</span></td>
								<td>
									<form:input path="ngaySinh" id="txtReqFieldsNS" cssClass="form-control form-control-sm"/>
									<span style="color: red" id="txtReqFieldNS"></span>
								</td>
							</tr>
							<tr>
								<td style="width: 200px;">Họ Tên PH<span style="color: red"> (*)</span></td>
								<td>
									<form:input required="required" path="hoTenPH" cssClass="form-control form-control-sm"/>
								</td>
							</tr>
							<tr>
								<td style="width: 200px;">Số Điện Thoại PH<span style="color: red"> (*)</span></td>
								<td>
									<form:input required="required" path="soDienThoaiPH" cssClass="form-control form-control-sm"/>
								</td>
							</tr>
							<tr>
								<td style="width: 200px;">Ngày Vào Học<span style="color: red"> (*)</span></td>
								<td>
									<form:input id="txtReqFieldNH" required="required" path="ngayVaoHoc" cssClass="form-control form-control-sm"/>
									<span style="color: red" id="messReqFieldNH"></span>
								</td>
							</tr>
							<tr>
								<td style="width: 200px;">Giới Tính<span style="color: red"> (*)</span></td>
								<td>
									<form:select  path="gioiTinh" cssClass="form-control form-control-sm">
										<form:option value="1">Nam</form:option>
										<form:option value="0">Nữ</form:option>
									</form:select>
								</td>
							</tr>
							<tr>
								<td style="width: 200px;">Trạng Thái<span style="color: red"> (*)</span></td>
								<td>
									<form:input required="required" path="trangThai" cssClass="form-control form-control-sm"/>
								</td>
							</tr>
							
							<tr>
								<td colspan="2">
									<a onclick=" history.go(-1)"><input value="Trở Về" type="button" class="col-2 form-control btn btn-success"style="float: right;margin-left: 10px"></a>
									<input value="Thêm Trẻ" onclick="return checkReqFields();" type="submit" style="float: right;" class="col-2 form-control btn btn-primary">
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