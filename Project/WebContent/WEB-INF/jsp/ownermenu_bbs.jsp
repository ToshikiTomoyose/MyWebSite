<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>THEBBS 管理者【掲示板】</title>
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
                                        <li class="fh5co-active"><a href="Ownermenu_user">管理者</a></li>
                                        <form class="navbar-form navbar-left" role="search">
                                            <div class="form-group">
                                                <div class="form-group">
                                                    <input type="text" class="form-control" placeholder="検索">
                                                </div>
                                            </div>
                                        </form>
                                        <li><a href="Bbsguide_medium">掲示板一覧</a></li>
                                        <!-- ログインしてない場合は隠す -->
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
				<h2 class="fh5co-heading animate-box" data-animate-effect="fadeInLeft"><big>管理者機能【掲示板】</big></h2>
                <div class="dropdown">
                            <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown" aria-expanded="false">
                                【掲示板】
                                <span class="caret"></span>
                            </button>
                            <ul class="dropdown-menu" role="menu">
                                <li role="presentation"><a href="Ownermenu_user">【ユーザ】</a></li>
                                <li role="presentation"><a href="Ownermenu_bbs">【掲示板一覧】</a></li>

                            </ul>
                        </div>

                    <form class="navbar-form" role="search">
                                       <div class="form-group">
                                            <div class="form-group"><p>スレッドID検索</p>
                                            <input type="text" class="form-control" placeholder="スレッドID検索">
                                            </div>
                                           <p></p>
                                           <div class="form-group"><p>スレッド名検索</p>
                                            <input type="text" class="form-control" placeholder="スレッド名検索">
                                            </div>

                                        </div>
                    </form>

                <p></p>

				<div class="row row-bottom-padded-md">
					<div class="col-md-3 col-sm-6 col-padding animate-box" data-animate-effect="fadeInLeft">
						<div class="blog-entry">
							<a class="blog-img"><img src="images/img-1.jpg" class="img-responsive" alt="Free HTML5 Bootstrap Template by FreeHTML5.co"></a>
							<div class="desc">
								<h3>Inspirational Website</h3>
								<span><small>by Admin </small> / <small> Web Design </small> / <small> <i class="icon-comment"></i> 14</small></span>
								<p>Design must be functional and functionality must be translated into visual aesthetics</p>
                                    <a class="btn btn-info btn-block" href="bbsmain.html" role="button">詳細</a>
                                    <a class="btn btn-danger btn-block" href="bbsdelete.html" role="button">削除</a>
							</div>
						</div>
					</div>
					<div class="col-md-3 col-sm-6 col-padding animate-box" data-animate-effect="fadeInLeft">
						<div class="blog-entry">
							<a class="blog-img"><img src="images/img-1.jpg" class="img-responsive" alt="Free HTML5 Bootstrap Template by FreeHTML5.co"></a>
							<div class="desc">
								<h3>Inspirational Website</h3>
								<span><small>by Admin </small> / <small> Web Design </small> / <small> <i class="icon-comment"></i> 14</small></span>
								<p>Design must be functional and functionality must be translated into visual aesthetics</p>
                                    <a class="btn btn-info btn-block" href="bbsmain.html" role="button">詳細</a>
                                    <a class="btn btn-danger btn-block" href="bbsdelete.html" role="button">削除</a>
							</div>
						</div>
					</div>
					<div class="col-md-3 col-sm-6 col-padding animate-box" data-animate-effect="fadeInLeft">
						<div class="blog-entry">
							<a class="blog-img"><img src="images/img-1.jpg" class="img-responsive" alt="Free HTML5 Bootstrap Template by FreeHTML5.co"></a>
							<div class="desc">
								<h3>Inspirational Website</h3>
								<span><small>by Admin </small> / <small> Web Design </small> / <small> <i class="icon-comment"></i> 14</small></span>
								<p>Design must be functional and functionality must be translated into visual aesthetics</p>
                                    <a class="btn btn-info btn-block" href="bbsmain.html" role="button">詳細</a>
                                    <a class="btn btn-danger btn-block" href="bbsdelete.html" role="button">削除</a>
							</div>
						</div>
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
<a class="btn btn-success" href="Logout">ログアウト。</a> <br />
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


	<!-- MAIN JS -->
	<script src="js/main.js"></script>

	</body>
</html>
