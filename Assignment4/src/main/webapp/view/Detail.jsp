<%@include file="header.jsp"%>
<body>
	
	<header class="masthead"
		style="background-image: url(${thisNews.getThumbnail()})">
		<div class="container position-relative px-4 px-lg-5">
			<div class="row gx-4 gx-lg-5 justify-content-center">
				<div class="col-md-10 col-lg-8 col-xl-7">
					<div class="post-heading">
						<h1>${thisNews.getTitle()}</h1>
						<h2 class="subheading">${thisNews.getShortdescription()}</h2>
						<span class="meta"> Posted by <a href="#!">${thisNews.getAuthor()}</a> ${thisNews.getCreatedAt()}
						</span>
					</div>
				</div>
			</div>
		</div>
	</header>
	<!-- Post Content-->
	<article class="mb-4">
		<div class="container px-4 px-lg-5">
			<div class="row gx-4 gx-lg-5 justify-content-center">
				<div class="col-md-10 col-lg-8 col-xl-7">
					<p>${thisNews.getContent()}</p>
				</div>
			</div>
		</div>
	</article>
	<%@include file="footer.jsp"%>
	<!-- Bootstrap core JS-->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Core theme JS-->
	<script src="js/scripts.js"></script>
</body>
</html>
