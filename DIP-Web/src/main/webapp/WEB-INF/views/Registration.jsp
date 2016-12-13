<%-- 
    Document   : Registration
    Created on : 11.12.2016, 21:15:39
    Author     : moneg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel='stylesheet prefetch' href='http://netdna.bootstrapcdn.com/font-awesome/3.2.0/css/font-awesome.min.css'>
	<link rel="stylesheet" href="layout/reg/css/style.css" media="screen" type="text/css" />
	<link rel="icon" href="http://vladmaxi.net/favicon.ico" type="image/x-icon">
	<link rel="shortcut icon" href="http://vladmaxi.net/favicon.ico" type="image/x-icon">
</head>

<body>


<div class="box">
  <nav id="tabs" class="tabs">
    <a id="tabLogin" class="iconLogin active blueBox" title="Войти"></a>
    <a id="tabRegister" class="iconRegister greenBox" title="Регистрация"></a>
    <a id="tabForgot" class="iconForgot redBox" title="Забыл пароль?"></a>
  </nav>

  <div class="containerWrapper">

    <!-- login container -->
    <div id="containerLogin" class="tabContainer active">
        <c:url value="/j_spring_security_check" var="loginUrl" />
        <form action="${loginUrl}" method="post">
      <h2 class="loginTitle">Авторизация</h2>
      <div class="loginContent">
        <div class="inputWrapper">
          <input type="text" placeholder="Email address" name="j_username"/>
        </div>
        <div class="inputWrapper">
            <input type="password" placeholder="Password" name="j_password"/>
        </div>
      </div>
      <button class="blueBox"><span class="iconLogin" type="submit"></span> Enter</button>
      <div class="clear"></div>
    </form>
    </div>

    <!-- register container -->
    <div id="containerRegister" class="tabContainer">
      <form action="do some action here!">
        <h2 class="loginTitle">Регистрация</h2>
        <div class="registerContent">
          <div class="inputWrapper">
            <input type="text" placeholder="Ваше имя" />
          </div>
          <div class="inputWrapper">
            <input type="password" placeholder="Ваш email"/>
          </div>
        </div>
        <button class="greenBox"><span class="iconRegister"></span> Зарегистрироваться</button>
        <div class="clear"></div>
      </form>
    </div>
    <div class="clear"></div>

    <!-- forgot container -->
    <div id="containerForgot" class="tabContainer">
      <form action="do some action here!">
        <h2 class="loginTitle">Восстановления пароля</h2>
        <div class="loginContent">
          <div class="inputWrapper">
            <input type="text" placeholder="Ваш email" />
          </div>
          <div class="placeholder"></div>
        </div>
        <button class="redBox"><span class="iconForgot"></span> Восстановить</button>
        <div class="clear"></div>
      </form>
    </div>
    <div class="clear"></div>
  </div>
</div>

  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
  <script src="layout/reg/js/index.js"></script>
</body>
</html>
