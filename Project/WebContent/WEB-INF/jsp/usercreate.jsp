<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>THEBBSアカウント新規作成</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Free HTML5 Website Template by FreeHTML5.co" />
	<meta name="keywords" content="free html5, free template, free bootstrap, free website template, html5, css3, mobile first, responsive" />
	<meta name="author" content="FreeHTML5.co" />

  	<!--
	//////////////////////////////////////////////////////

	FREE HTML5 TEMPLATE
	DESIGNED & DEVELOPED by FreeHTML5.co

	Website: 		http://freehtml5.co/
	Email: 			info@freehtml5.co
	Twitter: 		http://twitter.com/fh5co
	Facebook: 		https://www.facebook.com/fh5co

	//////////////////////////////////////////////////////
	-->

  	<!-- Facebook and Twitter integration -->
	<meta property="og:title" content=""/>
	<meta property="og:image" content=""/>
	<meta property="og:url" content=""/>
	<meta property="og:site_name" content=""/>
	<meta property="og:description" content=""/>
	<meta name="twitter:title" content="" />
	<meta name="twitter:image" content="" />
	<meta name="twitter:url" content="" />
	<meta name="twitter:card" content="" />

	<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
	<link rel="shortcut icon" href="favicon.ico">

	<link href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700" rel="stylesheet">

	<!-- Animate.css -->
	<link rel="stylesheet" href="css/animate.css">
	<!-- Icomoon Icon Fonts-->
	<link rel="stylesheet" href="css/icomoon.css">
	<!-- Bootstrap  -->
	<link rel="stylesheet" href="css/bootstrap.css">
	<!-- Flexslider  -->
	<link rel="stylesheet" href="css/flexslider.css">
	<!-- Theme style  -->
	<link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/logout.css">

	<!-- Modernizr JS -->
	<script src="js/modernizr-2.6.2.min.js"></script>
	<!-- FOR IE9 below -->
	<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->

	</head>
	<body>
	<div id="fh5co-page">
            <a href="#" class="js-fh5co-nav-toggle fh5co-nav-toggle"><i></i></a>
                <aside id="fh5co-aside" role="complementary" class="border js-fullheight">

                    <h1 id="fh5co-logo"><a href="Index">TheBBS</a></h1>
                    <nav id="fh5co-main-menu" role="navigation">
                        <ul>
                            <ul>
                                <li><a href="Login">ログイン</a></li>
                                <li class="fh5co-active"><a href="Usercreate">アカウント新規登録</a></li>
                                <form class="navbar-form navbar-left" role="Serch">
                                       <div class="form-group">
                                            <div class="form-group">
                                            <input type="text" class="form-control" placeholder="検索">
                                            </div>
                                        </div>
                                </form>
                                    <li><a href="Bbsguide_medium">掲示板一覧</a></li>
                            </ul>
                        </ul>
                    </nav>

                        <div class="fh5co-footer">

                            <p><small>Designed <span>&copy; 2016 Blend Free HTML5. All Rights Reserved.<span>Designed by <a href="http://freehtml5.co/" target="_blank">FreeHTML5.co</a> </span> <span>Demo Images: <a href="https://unsplash.com/" target="_blank">Unsplash</a></span> <span>Free html5 templates Made by <a href="http://freehtml5.co/" target="_blank">freehtml5.co</a></span></span></small></p>
                    </div>
                </aside>

		<div id="fh5co-main">
            <div class="fh5co-narrow-content">
            <form class="form-horizontal" action = "Usercreate" method="post">
                <h2 class="animate-box" data-animate-effect="fadeInLeft"><strong>アカウント新規作成</strong></h2>
                <div class="row row-bottom-padded-md">
                     <div class="col-lg-8">
                        <div class="well bs-component">

                            <fieldset>
                              <div class="form-group">
                              <p class="text-danger">${errMsg}</p>
                              <p class="text-danger">${errmsg}</p>
                                <label for="inputLoginID" class="col-lg-2 control-label">ログインID</label>
                                <div class="col-lg-10">
									<input type="hidden" id ="userid" name="cid">
                                  <input type="text" class="form-control" id="logid" name="clogid" placeholder="ID入力して下さい">
                                </div>
                              </div>
                            <div class="form-group">
                                <label for="inputname" class="col-lg-2 control-label">ユーザ名</label>
                                <div class="col-lg-10">
                                    <input type="text" class="form-control" id="input" name="cusername" placeholder="ユーザ名を記入してね">
                                </div>
                            </div>
                              <div class="form-group">
                                <label for="inputPassword" class="col-lg-2 control-label">パスワード</label>
                                <div class="col-lg-10">
                                  <input type="password" class="form-control" id="inputPassword" name="cpassword" placeholder="Password">
                                </div>
                              </div>
                                 <div class="form-group">
                                    <label for="inputPassword" class="col-lg-2 control-label">パスワード（確認）</label>
                                    <div class="col-lg-10">
                                      <input type="password" class="form-control" id="inputPassword" name="conpass" placeholder="Password（確認）">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="inputname" class="col-lg-2 control-label">生年月日</label>
                                    <div class="col-lg-10">
                                        <input type="date" class="form-control" id="date" name="cbirthdate" placeholder="生年月日を入力して下さい">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <input type="hidden" id ="updatedate" name="cupdatedate">
                                </div>
                                <div class="form-group">
                                    <label for="textArea" class="col-lg-2 control-label">ひとこと<br>（任意）</label>
                                    <div class="col-lg-10">
                                      <input type="text" class="form-control" id="textArea" name="ctweet">
                                      <span class="help-block">公序良俗に反しなければなんでも書いていいよ。</span>
                                    </div>
                                </div>
                               <div class="form-group">
                                  <label for="textArea" class="col-lg-2 control-label">プロフィール画像<br>（任意）</label>
                                <div class="col-lg-10">
                                  <input type="file" value="image(oops.jpg)" id ="profile_picture" name="cprofpic">
                                </div>
                              </div>
                            </fieldset>

                        </div>
                      </div>

                            <div class="col-md-4 animate-box" data-animate-effect="fadeInLeft">
                                <h1 class="fh5co-heading-colored">準備できたら</h1>

                                <div class="row">
                                   <div class="col-md-6 col-md-offset-3 col-md-pull-3 animate-box" data-animate-effect="fadeInLeft">

                                     	<p><button type="submit" class="btn btn-primary">確定。</button></p>

                                    </div>
                                </div>
                           </div>

                </div>
			</form>
                 </div>
             </div>
        </div>
	<!-- jQuery -->
	<script src="js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script src="js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Waypoints -->
	<script src="js/jquery.waypoints.min.js"></script>
	<!-- Flexslider -->
	<script src="js/jquery.flexslider-min.js"></script>


	<!-- MAIN JS -->
	<script src="js/main.js"></script>

	</body>
</html>

