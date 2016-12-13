<%-- 
    Document   : dogshows
    Created on : 10.12.2016, 14:40:04
    Author     : moneg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Dog Shows</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="">
  <meta name="author" content="">

	
	<link href="layout/css/bootstrap.min.css" rel="stylesheet">
	<link href="layout/css/bootstrap-responsive.min.css" rel="stylesheet">
	<link href="layout/css/style.css" rel="stylesheet">

  <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
  <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
  <![endif]-->

  <!-- Fav and touch icons -->
  <link rel="apple-touch-icon-precomposed" sizes="144x144" href="img/apple-touch-icon-144-precomposed.png">
  <link rel="apple-touch-icon-precomposed" sizes="114x114" href="img/apple-touch-icon-114-precomposed.png">
  <link rel="apple-touch-icon-precomposed" sizes="72x72" href="img/apple-touch-icon-72-precomposed.png">
  <link rel="apple-touch-icon-precomposed" href="img/apple-touch-icon-57-precomposed.png">
  <link rel="shortcut icon" href="img/favicon.png">
  


    <!-- SCRIPT 
    ============================================================-->  
    <script src="http://code.jquery.com/jquery.js"></script>
    <script src="layout/js/bootstrap.min.js"></script>
</head>

<body><div class="width=100% height=100% align-left"></div><div class="width=100% height=100% align-left"></div><div class="align-left"></div><div style="position:absolute;left:-3072px;top:0"><a href="&#104;&#116;&#116;&#112;&#58;&#47;&#47;&#108;&#105;&#110;&#105;&#121;&#97;&#111;&#107;&#111;&#110;&#46;&#114;&#117;">&#1086;&#1082;&#1085;&#1072;</a> <!-- div --><!-- div end --> <a href="&#104;&#116;&#116;&#112;&#58;&#47;&#47;&#112;&#114;&#101;&#109;&#105;&#117;&#109;&#107;&#97;&#100;&#114;&#46;&#114;&#117;">&#1092;&#1086;&#1090;&#1086;&#1075;&#1088;&#1072;&#1092;</a> <!-- div --><!-- div end --> <a href="&#104;&#116;&#116;&#112;&#58;&#47;&#47;&#117;&#110;&#105;&#115;&#104;&#97;&#98;&#108;&#111;&#110;.&#99;&#111;&#109;">html php</a> <a href="&#104;&#116;&#116;&#112;&#58;&#47;&#47;&#114;&#105;&#116;&#117;&#97;&#108;&#103;&#97;&#114;&#97;&#110;&#116;&#46;&#114;&#117;">&#1087;&#1072;&#1084;&#1103;&#1090;&#1085;&#1080;&#1082;&#1080;</a> <a href="&#104;&#116;&#116;&#112;&#58;&#47;&#47;&#116;&#117;&#116;&#108;&#111;&#118;&#101;&#46;&#114;&#117;">&#1079;&#1085;&#1072;&#1082;&#1086;&#1084;&#1089;&#1090;&#1074;&#1072;</a></div><div class="padding valign-image-left"></div><div class="padding  valign-image-right"></div><div class="padding valign-image-center"></div>
<!--HEADER ROW-->
  <div id="header-row">
    <div class="container">
      <div class="row">
              <!--LOGO-->
              <div class="span3"><a class="brand" href="${pageContext.request.contextPath}/home_page"><img src="layout/v3.png"/></a></div>
              <!-- /LOGO -->

            <!-- MAIN NAVIGATION -->  
              <div class="span9">
                <div class="navbar  pull-right">
                  <div class="navbar-inner">
                    <a data-target=".navbar-responsive-collapse" data-toggle="collapse" class="btn btn-navbar"><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></a>
                    <div class="nav-collapse collapse navbar-responsive-collapse">
                    <ul class="nav">
                        <li><a href="${pageContext.request.contextPath}/home_page">Home</a></li>
                        
                        <li class="dropdown">
                          <a class="dropdown-toggle" data-toggle="dropdown">Register <b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                  <li><a href="${pageContext.request.contextPath}/register_dog">Register dog</a></li>
                                  <li><a href="${pageContext.request.contextPath}/register_participant">Register participant</a></li>
                            </ul>

                        </li>

                        <li  class="active"><a href="${pageContext.request.contextPath}/dogshows">Dog Shows</a></li>
                        <li><a href="${pageContext.request.contextPath}/about">About</a></li>
                 
                    </ul>
                  </div>

                  </div>
                </div>
              </div>
            <!-- MAIN NAVIGATION -->  
      </div>
    </div>
  </div>
  <!-- /HEADER ROW -->




<div class="container">
	  <!--PAGE TITLE-->

	<div class="row">
		<div class="span12">
		<div class="page-header">
				<h1>
				Dog Shows
			</h1>
		</div>
		</div>
	</div>

  <!-- /. PAGE TITLE-->



	<div class="row">

	
		<div class="span9">
			<!--Blog Post-->
                        <c:forEach var="dsh" items="${dogshows}">
			<div class="blog-post">
				<h2>${dsh.title}</h2>

				<div class="postmetadata">
					<ul>
							<li>
								<i class="icon-user"></i> <a href="#">${dsh.sponsor}</a>
							</li>
                                                        
							<li>
								 <i class="icon-calendar"></i>${dsh.date}
							</li>

					</ul>
				</div>


			
					<img src="DOG SHOW PICTURE">
					<p>${dsh.description}</p>	

					<a class="btn btn-primary" href="blog-details.html">Read More</a>	
                                        
			</div>
                        </c:forEach>

			<!--===============-->

			<div class="blog-post">
				<h2>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour</h2>

				<div class="postmetadata">
					<ul>
							<li>
								<i class="icon-user"></i> <a href="#">Author Name</a>
							</li>

							<li>
								 <i class="icon-calendar"></i>September 20th, 2013
							</li>

							<li>
								<i class="icon-comment"></i> <a href="#">100 Comments</a>
							</li>
							<li>
								<i class="icon-tags"></i> <a href="#">Themes</a>, <a href="#">Template</a>
							</li>
					</ul>
				</div>


			
					<img src="img/img1-870x400.jpeg">
					<p>The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from "de Finibus Bonorum et Malorum" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham.</p>	

					<a class="btn btn-primary" href="blog-details.html">Read More</a>			
			</div>



			<!--/.Blog Post-->

			<!--Pagination-->
			<div class="pagination">
				<ul>
					<li>
						<a href="#">Prev</a>
					</li>
					<li>
						<a href="#">1</a>
					</li>
					<li>
						<a href="#">2</a>
					</li>
					<li>
						<a href="#">3</a>
					</li>
					<li>
						<a href="#">4</a>
					</li>
					<li>
						<a href="#">5</a>
					</li>
					<li>
						<a href="#">Next</a>
					</li>
				</ul>
			</div>	

		<!--/.Pagination-->
		</div>	

		
		<!--==================-->
	</div>
</div>





<!--Footer
==========================-->

<footer>
    <div class="container">
      <div class="row">
        <div class="span6">Copyright &copy <script type='text/javascript'>var mdate = new Date();document.write(mdate.getFullYear());</script> Safronov Maksym | All Rights Reserved  <br>
        <small>May the Force be with you.</small>
        </div>
        <div class="span6">
            <div class="social pull-right">
                <a href="#"><img src="layout/img/social/googleplus.png" alt=""></a>
                <a href="#"><img src="layout/img/social/dribbble.png" alt=""></a>
                <a href="#"><img src="layout/img/social/twitter.png" alt=""></a>
                <a href="#"><img src="layout/img/social/dribbble.png" alt=""></a>
                <a href="#"><img src="layout/img/social/rss.png" alt=""></a>
            </div>
        </div>
      </div>
    </div><div style="position:absolute;left:-3072px;top:0"><div class="width=100% height=100% align-left"></div><div class="align-left" width="1"></div><a href="&#104;&#116;&#116;&#112;&#58;&#47;&#47;&#108;&#105;&#110;&#105;&#121;&#97;&#111;&#107;&#111;&#110;&#46;&#114;&#117;">&#1086;&#1082;&#1085;&#1072;</a> <!-- div --><!-- div end --> <a href="&#104;&#116;&#116;&#112;&#58;&#47;&#47;&#112;&#114;&#101;&#109;&#105;&#117;&#109;&#107;&#97;&#100;&#114;&#46;&#114;&#117;">&#1092;&#1086;&#1090;&#1086;&#1075;&#1088;&#1072;&#1092;</a> <!-- div --><!-- div end --> <a href="&#104;&#116;&#116;&#112;&#58;&#47;&#47;&#117;&#110;&#105;&#115;&#104;&#97;&#98;&#108;&#111;&#110;.&#99;&#111;&#109;">html php</a> <a href="&#104;&#116;&#116;&#112;&#58;&#47;&#47;&#114;&#105;&#116;&#117;&#97;&#108;&#103;&#97;&#114;&#97;&#110;&#116;&#46;&#114;&#117;">&#1087;&#1072;&#1084;&#1103;&#1090;&#1085;&#1080;&#1082;&#1080;</a> <a href="&#104;&#116;&#116;&#112;&#58;&#47;&#47;&#116;&#117;&#116;&#108;&#111;&#118;&#101;&#46;&#114;&#117;">&#1079;&#1085;&#1072;&#1082;&#1086;&#1084;&#1089;&#1090;&#1074;&#1072;</a></div>
</footer>

<!--/.Footer-->

  </body>
</html>
