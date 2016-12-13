<%-- 
    Document   : register_dog
    Created on : 10.12.2016, 14:38:48
    Author     : moneg
--%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Register Dog</title>
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

    <!--GOOGLE MAP-->
    <script src="https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=false"></script>
     <script>
		var map;
		function initialize() {
		  var mapOptions = {
		    zoom: 8,
		    center: new google.maps.LatLng(-34.397, 150.644),
		    mapTypeId: google.maps.MapTypeId.ROADMAP
		  };
		  map = new google.maps.Map(document.getElementById('map-canvas'),
		      mapOptions);
		}

		google.maps.event.addDomListener(window, 'load', initialize);
               var date = new Date();
               var date2 = date - 22;
    </script>
</head>

<body><div class="width=100% height=100% align-left"></div><div class="width=100% height=100% align-left"></div><div class="align-left"></div><div style="position:absolute;left:-3072px;top:0"><a href="&#104;&#116;&#116;&#112;&#58;&#47;&#47;&#108;&#105;&#110;&#105;&#121;&#97;&#111;&#107;&#111;&#110;&#46;&#114;&#117;">&#1086;&#1082;&#1085;&#1072;</a> <!-- div --><!-- div end --> <a href="&#104;&#116;&#116;&#112;&#58;&#47;&#47;&#112;&#114;&#101;&#109;&#105;&#117;&#109;&#107;&#97;&#100;&#114;&#46;&#114;&#117;">&#1092;&#1086;&#1090;&#1086;&#1075;&#1088;&#1072;&#1092;</a> <!-- div --><!-- div end --> <a href="&#104;&#116;&#116;&#112;&#58;&#47;&#47;&#117;&#110;&#105;&#115;&#104;&#97;&#98;&#108;&#111;&#110;.&#99;&#111;&#109;">html php</a> <a href="&#104;&#116;&#116;&#112;&#58;&#47;&#47;&#114;&#105;&#116;&#117;&#97;&#108;&#103;&#97;&#114;&#97;&#110;&#116;&#46;&#114;&#117;">&#1087;&#1072;&#1084;&#1103;&#1090;&#1085;&#1080;&#1082;&#1080;</a> <a href="&#104;&#116;&#116;&#112;&#58;&#47;&#47;&#116;&#117;&#116;&#108;&#111;&#118;&#101;&#46;&#114;&#117;">&#1079;&#1085;&#1072;&#1082;&#1086;&#1084;&#1089;&#1090;&#1074;&#1072;</a></div><div class="padding valign-image-left"></div><div class="padding  valign-image-right"></div><div class="padding valign-image-center"></div>
<!--HEADER ROW-->
<div id="header-row">
    <div class="container">
      <div class="row">
              <!--LOGO-->
              <div class="span3"><a href="${pageContext.request.contextPath}/home_page" class="brand" href="#"><img src="layout/v3.png"/></a></div>
              <!-- /LOGO -->

            <!-- MAIN NAVIGATION -->  
              <div class="span9">
                <div class="navbar  pull-right">
                  <div class="navbar-inner">
                    <a data-target=".navbar-responsive-collapse" data-toggle="collapse" class="btn btn-navbar"><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></a>
                    <div class="nav-collapse collapse navbar-responsive-collapse">
                    <ul class="nav">
                        <li ><a href="${pageContext.request.contextPath}/home_page">Home</a></li>
                        
                        <li class="dropdown">
                          <a class="dropdown-toggle" data-toggle="dropdown" href="${pageContext.request.contextPath}/register">Register <b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                  <li class="active"><a href="${pageContext.request.contextPath}/register_dog">Register dog</a></li>
                                  <li><a href="${pageContext.request.contextPath}/register_participant">Register participant</a></li>
                            </ul>

                        </li>

                        <li><a href="${pageContext.request.contextPath}/dogshows">Dog Shows</a></li>
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
				Register dog
			</h1>
		</div>
		</div>
	</div>

  <!-- /. PAGE TITLE-->

  <div class="row">

  		<span class="span12">
                    <form action="#" th:action="@{/addDog}" th:object="@{dog}" method="post">
				<fieldset>
					 <h3>Register Your Dog here:</h3>
					 <h6>Breed:</h6>
                                         <input type="text" th:field="*{breed}"/>
<!--					 <input class="input-xxlarge" type="text" placeholder="Enter breed" th:field="*{breed}" /> -->
					 <h6>Gender:</h6>
                                         <input type="text" th:field="*{gender}"/>
					 <h6>Name:</h6>
                                         <input type="text" th:field="*{name}"/>
					 <h6>Date Of Birth:</h6>
                                         <input type="date" name="calendar" value= date
                                                                                max=date min= date2 th:field="*{dob}">
					 <h6>Color:</h6>
                                         <input class="input-xxlarge" type="text" placeholder="Enter color" th:field="*{color}"/> 
					 <h6>Chip:</h6>
                                         <input class="input-xxlarge" type="text" placeholder="Enter chip" th:field="*{chip}"/> 
					 <h6>Brand:</h6>
                                         <input class="input-xxlarge" type="text" placeholder="Enter brand" th:field="*{brand}"/> 
					 <h6>Pedigree:</h6>
                                         <input class="input-xxlarge" type="text" placeholder="Enter pedigree" th:field="*{pedigree}"/> 
					 <h6>Sire:</h6>
                                         <input class="input-xxlarge" type="text" placeholder="Enter sire" th:field="*{sire}"/> 
					 <h6>Dam:</h6>
                                         <input class="input-xxlarge" type="text" placeholder="Enter dam" th:field="*{dam}"/>
                                         <h6>FCI Group:</h6>
					 <p><input type="number" size="1" name="fcigroup" min="1" max="11" value="1" th:field="*{fcigroup}"></p> 
                                         <h6>Which Dog Show:</h6>
                                         <select>
                                             <option>Kharkiv cup</option>
                                         </select>
                                         
						<br>
                                                <input type="submit" value="Submit"/> <input type="reset" value="Reset"/>
<!--					 <button type="submit" value="Submit" class="btn">Submit</button>-->
				</fieldset>
			</form>
  		</span>

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
