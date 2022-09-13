<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Home</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/template/admin/assets/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/template/admin/font-awesome/4.5.0/css/font-awesome.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/template/admin/assets/css/ace.min.css"
	class="ace-main-stylesheet" id="main-ace-style" />
<script
	src="${pageContext.request.contextPath}/template/admin/assets/js/ace-extra.min.js"></script>
<link rel="stylesheet"
	href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type='text/javascript'
	src='<c:url value="/template/admin/js/jquery-2.2.3.min.js" />'></script>
<script
	src="${pageContext.request.contextPath}/template/admin/assets/js/jquery.2.1.1.min.js"></script>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script
	src="${pageContext.request.contextPath}/template/paging/jquery.twbsPagination.js"></script>

<script src="${pageContext.request.contextPath}/ckeditor/ckeditor.js"></script>
</head>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<div id="navbar" class="navbar navbar-default          ace-save-state">
	<div class="navbar-container ace-save-state" id="navbar-container">
		<div class="navbar-header pull-left">
			<a href="#" class="navbar-brand"> <small> <i
					class="fa fa-leaf"></i> Trang quản trị
			</small>
			</a>
		</div>
		<div
			class="navbar-buttons navbar-header pull-right collapse navbar-collapse"
			role="navigation">
			<ul class="nav ace-nav">
				<li class="light-blue dropdown-modal"><a data-toggle="dropdown"
					href="#" class="dropdown-toggle"> Xin chào,
						${USERMODEL.fullName} </a>
				<li class="light-blue dropdown-modal"><a
					href='<c:url value="/thoat?action=logout"/>'> <i
						class="ace-icon fa fa-power-off"></i> Thoát
				</a></li>
				</li>
			</ul>
		</div>
	</div>
</div>