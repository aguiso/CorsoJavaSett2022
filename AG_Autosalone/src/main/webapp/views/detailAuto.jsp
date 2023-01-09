<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Autosalone</title>

<!-- Google Font: Source Sans Pro -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&amp;display=fallback">
<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="static/css/adminlte.min.css">
<!-- MDB -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.1.0/mdb.min.css"
	rel="stylesheet" />
<!-- CSS locale -->
<link rel="stylesheet" href="static/css/autosalone.css">
</head>
<body class="hold-transition sidebar-mini">
	<!-- Site wrapper -->
	<div class="wrapper">
		<!-- Navbar -->
		<nav
			class="main-header navbar navbar-expand navbar-white navbar-light">
			<!-- Left navbar links -->
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" data-widget="pushmenu"
					href="#" role="button"><i class="fas fa-bars"></i></a></li>
				<li class="nav-item d-none d-sm-inline-block"><a href="home"
					class="nav-link">Home</a></li>
			</ul>

			<!-- Right navbar links -->
			<ul class="navbar-nav ml-auto">

			</ul>
		</nav>
		<!-- /.navbar -->

		<!-- Main Sidebar Container -->
		<aside class="main-sidebar sidebar-dark-primary elevation-4">
			<!-- Brand Logo -->
			<a class="brand-link"> <span class="brand-text font-weight-light">neotech</span>
			</a>

			<!-- Sidebar -->
			<div class="sidebar">

				<!-- Sidebar Menu -->
				<nav class="mt-2">
					<ul class="nav nav-pills nav-sidebar flex-column"
						data-widget="treeview" role="menu" data-accordion="false">
						<!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
						<li class="nav-item"><a href="#" class="nav-link"> <i
								class="nav-icon fas fa-tachometer-alt"></i>
								<p>
									Autosalone <i class="right fas fa-angle-left"></i>
								</p>
						</a>
							<ul class="nav nav-treeview">
								<li class="nav-item"><a href="home" class="nav-link"> <i
										class="far fa-solid fa-house"></i>
										<p>Home</p>
								</a></li>
								<li class="nav-item"><a href="listAuto" class="nav-link">
										<i class="far fa-solid fa-list"></i>
										<p>Lista Automobili</p>
								</a></li>
								<li class="nav-item"><a href="addAuto" class="nav-link">
										<i class="far fa-solid fa-plus"></i>
										<p>Aggiungi Automobile</p>
								</a></li>

								<li class="nav-item"><a href="searchAuto" class="nav-link">
										<i class="far fa-solid fa-magnifying-glass"></i>
										<p>Cerca Automobile</p>
								</a></li>

							</ul></li>
					</ul>
				</nav>
				<!-- /.sidebar-menu -->
			</div>
		</aside>

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<div class="container-fluid">
					<div class="row mb-2">
						<div class="col-sm-6">
							<h1>Autosalone - Dettaglio Auto</h1>
						</div>
						<div class="col-sm-6">
							<ol class="breadcrumb float-sm-right">
								<li class="breadcrumb-item"><a href="#">Home</a></li>
								<li class="breadcrumb-item active">Detail Auto</li>
							</ol>
						</div>
					</div>
				</div>
				<!-- /.container-fluid -->
			</section>

			<!-- Main content -->

			<section class="content">
				<div class="container">
					<div class="row">
						<div class="col-md-6">
							<div class="form-group">
								<label>ID</label> <input id="id" class="form-control" name="id"
									type="text" value="${auto.id}">
							</div>
							<div class="form-group">
								<label>TARGA</label> <input id="targa" class="form-control"
									name="targa" type="text" value="${auto.targa}">
							</div>
							<div class="form-group">
								<label>ALIMENTAZIONE</label> <input id="alimentazione"
									class="form-control" name="alimentazione" type="text"
									value="${auto.alimentazione}">
							</div>
							<div class="form-group">
								<label>COSTO</label> <input id="costo" class="form-control"
									name="costo" type="text" value="${auto.costo}">
							</div>
						</div>

						<div class="col-md-6">
							<div class="form-group">
								<label>Costruttore</label> <input id="costruttore"
									class="form-control" name="costruttore" type="text"
									value="${auto.costruttore}">
							</div>
							<div class="form-group">
								<label>Anno Costruzione</label> <input id="annoCostruzione"
									class="form-control" name="annoCostruzione" type="text"
									value="${auto.annoCostruzione}">
							</div>
							<div class="form-group">
								<label>Modello</label> <input id="modello" class="form-control"
									name="modello" type="text" value="${auto.modello}">
							</div>
							<div class="form-group">
								<label>Colore</label> <input id="colore" class="form-control"
									name="colore" type="text" value="${auto.colore}">
							</div>
						</div>
					</div>
				</div>

				<h4><strong>ACCESSORI</strong></h4>
				<div class="container">
					<div class="row">
						<div class="col-md-4">
							<table
								class="table table-bordered table-hover dataTable dtr-inline">
								<thead>
									<td>Id</td>
									<td>Classe</td>
									<td>Tipologia</td>
									<td>Descrizione</td>
									<td>Costo</td>
								</thead>
								<tbody>
									<c:forEach var="accessori" items="${listaccessori}">
										<tr>
											<td>${accessori.id}</td>
											<td>${accessori.classe}</td>
											<td>${accessori.tipologia}</td>
											<td>${accessori.descrizione}</td>
											<td>${accessori.costo}</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
						<div class="col-md-4"></div>
						<div class="col-md-4"></div>
					</div>
				</div>
			</section>
			<!-- /.content -->
		</div>
		<!-- /.content-wrapper -->

		<footer class="main-footer">
			<div class="float-right d-none d-sm-block">
				<a href="www.neotech.srl">www.neotech.srl</a>
			</div>
		</footer>

		<!-- Control Sidebar -->
		<aside class="control-sidebar control-sidebar-dark">
			<!-- Control sidebar content goes here -->
		</aside>
		<!-- /.control-sidebar -->
	</div>
	<!-- ./wrapper -->

	<!-- jQuery -->
	<script src="static/js/plugins/jquery/jquery.min.js"
		type="text/javascript"></script>
	<!-- Bootstrap 4 -->
	<script src="static/js/plugins/bootstrap/js/bootstrap.bundle.min.js"
		type="text/javascript"></script>
	<!-- AdminLTE App -->
	<script src="static/js/adminlte.min.js" type="text/javascript"></script>
	<!-- Demo Template -->
	<script src="static/js/fireAjax.js" type="text/javascript"></script>
	<script src="static/js/demoTemplate.js" type="text/javascript"></script>
	<!-- MDB -->
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.1.0/mdb.min.js"></script>
</body>
</html>
