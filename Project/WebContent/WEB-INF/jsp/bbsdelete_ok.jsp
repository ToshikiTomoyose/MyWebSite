<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="beans.Userbean" %>
<%Userbean u =(Userbean)session.getAttribute("ub"); %>

<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>THEBBS スレッド削除完了</title>
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
    <style>
        div.submit{
        margin: 20px 20px;
        }
    </style>

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
	<div id="fh5co-page">
                <a href="#" class="js-fh5co-nav-toggle fh5co-nav-toggle"><i></i></a>
                    <aside id="fh5co-aside" role="complementary" class="border js-fullheight">

                            <h1 id="fh5co-logo"><a href="index.html">TheBBS</a></h1>

                            <nav id="fh5co-main-menu" role="navigation">
                                <ul>
                                    <ul>
                                        <li><a href="login.html">ログイン</a></li>
                                        <!-- ログイン済み（一般ユーザ） -->
                                        <li><a href="userguide_up.html">おなまえ</a></li>
                                        <!--　管理者の場合 -->
                                        <li><a href="ownermenu_user.html">管理者</a></li>
                                         <!-- 新規登録リンクはログインしたら消える -->
                                        <li><a href="usercreate.html">アカウント新規登録</a></li>
                                        <form class="navbar-form navbar-left" role="search">
                                            <div class="form-group">
                                                <div class="form-group">
                                                    <input type="text" class="form-control" placeholder="検索">
                                                </div>
                                            </div>
                                        </form>

                                        <li><a href="bbsguide_medium.html">掲示板一覧</a></li>
                                        <li><a href="#logout">ログアウト</a></li>
                                    </ul>
                                </ul>
                            </nav>

                                <div class="fh5co-footer">
                            <!--    <ul>
                                        <li><a href="#"><i class="icon-facebook2"></i></a></li>
                                        <li><a href="#"><i class="icon-twitter2"></i></a></li>
                                        <li><a href="#"><i class="icon-instagram"></i></a></li>
                                        <li><a href="#">LINE</a></li>
                                    </ul> -->

                                    <p><small>Designed <span>&copy; 2016 Blend Free HTML5. All Rights Reserved.<span>Designed by <a href="http://freehtml5.co/" target="_blank">FreeHTML5.co</a> </span> <span>Demo Images: <a href="https://unsplash.com/" target="_blank">Unsplash</a></span> <span>Free html5 templates Made by <a href="http://freehtml5.co/" target="_blank">freehtml5.co</a></span></span></small></p>
                                </div>
                    </aside>
            </div>

            <div id="fh5co-main">

                <div class="fh5co-narrow-content">
                    <div class="row">
                        <div>
                            <h1>スレッド削除完了。</h1>
                            <a href="index.html" class="btn btn-primary btn-block" >TOPへもどる</a>
                        </div>
                    </div>


            </div>
    </div>


        <div id="contents">
                <div id="modal">
                    <div id="logout">
                        <a href="#" class="close_overlay">×</a>
                        <div class="modal_window">
                            <h2>Logout</h2>
                            <p>ログアウトしますか？</p>
                            <p>よろしければ<br />
                            <a class="btn btn-success" href="logout.html">削除。</a> <br />
                            <p>そうでなければこのウィンドウを閉じる際は、ウィンドウ外をクリックするか、<br />
                            ×をクリック。</p>
                            <a href="#">【×】CLOSE</a>
                        </div><!--/.modal_window-->
                    </div><!--/#open01-->
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
	<!-- Google Map -->
	<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCefOgb1ZWqYtj7raVSmN4PL2WkTrc-KyA&sensor=false"></script>
	<script src="js/google_map.js"></script>


	<!-- MAIN JS -->
	<script src="js/main.js"></script>

	</body>
</html>

