<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="header.jsp"%>
<body>

	<!-- Page Header-->
	<header class="masthead"
		style="background-image: url('${pageContext.request.contextPath}/template/web/assets/img/home-bg.jpg')">
		<div class="container position-relative px-4 px-lg-5">
			<div class="row gx-4 gx-lg-5 justify-content-center">
				<div class="col-md-10 col-lg-8 col-xl-7">
					<div class="site-heading">
						<h1>News Blog</h1>
						<span class="subheading">A Blog made by Quang Trinh</span>
					</div>
				</div>
			</div>
		</div>
	</header>
	<!-- Main Content-->

	<div class="container px-4 px-lg-5">



		<div class="row gx-4 gx-lg-5 justify-content-center">
			<div class="col-md-10 col-lg-8 col-xl-7">
				<c:forEach items="${list}" var="o">
					<!-- Post preview-->
					<div class="post-preview">

						<a href="./NewsDetail?id=${o.id}">
							<h2 class="post-title">${o.title}</h2>
							</br>
							<h5 ><a href="./EditDetail?id=${o.getId()}" style="color: blue">Edit</a></h5>
							</br>
							<h4 class="post-meta" style="font-style: italic;">${o.shortdescription}</h3>
						</a>
						<p class="post-meta">
							Posted by <a href="#!">${o.author}</a> ${o.createdAt}
						</p>
					</div>
					<!-- Divider-->
					<hr class="my-4" />
				</c:forEach>

				<!-- Pager-->
				<div class="d-flex justify-content-end mb-4">
					<a class="btn btn-primary text-uppercase" href="#!">Older Posts
						â†’</a>
				</div>
			</div>
		</div>
	</div>
	<%@include file="footer.jsp"%>
</body>
</html>
