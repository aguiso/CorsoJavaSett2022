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
			<!-- /.sidebar -->
		</aside>

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<div class="container-fluid">
					<div class="row mb-2">
						<div class="col-sm-6">
							<h1>Autosalone - Aggiungi Auto</h1>
						</div>
						<div class="col-sm-6">
							<ol class="breadcrumb float-sm-right">
								<li class="breadcrumb-item"><a href="#">Home</a></li>
								<li class="breadcrumb-item active">Add Auto</li>
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
						<div class="col"></div>
						<div class="col">
							<form action="add" id="auto" method="Post">
								<div class="form-row">
									<div class="form-group col-md-6">
										<label for="id">ID</label> <input type="number"
											class="form-control" id="id" placeholder="ID Auto" value="" name="id">
									</div>
									<div class="form-group col-md-6">
										<label for="targa">Targa</label> <input type="text"
											class="form-control" id="targa" placeholder="Targa" value="" name="targa">
									</div>
								</div>
								<div class="form-group">
									<label for="costruttore">Costruttore</label> <select
										id="costruttore" class="form-control" value="" name="costruttore">
										<option selected>Costruttore</option>
										<option>Ferrari</option>
										<option>Bugatti</option>
										<option>Lamborghini</option>
										<option>Porsche</option>
										<option>Maserati</option>
									</select>
								</div>
								<div class="form-group">
									<label for="modello">Modello</label> <input type="text"
										class="form-control" id="modello" placeholder="Modello" value="" name="modello">
								</div>
								<div class="form-row">
										<div class="form-group col-md-6">
										<label for="alimentazione">Alimentazione</label> <select id="alimentazione"
											class="form-control" value="" name="alimentazione">
											<option selected>Alimentazione</option>
											<option>Benzina</option>
											<option>Elettrico</option>
											<option>Diesel</option>
											<option>Ibrido</option>
										</select>
									</div>
									<div class="form-group col-md-6">
										<label for="annoCostruzione">Anno Costruzione</label> <input
											type="number" class="form-control" id="annoCostruzione"
											placeholder="Anno Costruzione" value="" name="annoCostruzione">
									</div>
								</div>
								<div class="form-row">
									<div class="form-group col-md-6">
										<label for="costo">Costo</label> <input type="number"
											class="form-control" id="costo" placeholder="Costo" value="" name="costo">
									</div>
									<div class="form-group col-md-6">
										<label for="colore">Colore</label> <select id="colore"
											class="form-control" value="" name="colore">
											<option selected>Colore</option>
											<option>Nero</option>
											<option>Bianco</option>
											<option>Rosso</option>
											<option>Blu</option>
											<option>Giallo</option>
										</select>
									</div>
								</div>
									
								<button style="text-align: center" type="submit" class="btn btn-primary">Add Auto</button>
							</form>
						</div>
						<div class="col"></div>
					</div>
				</div>
				
		</section>
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
		<div></div>
		<!-- ./wrapper -->

		<!-- jQuery -->
		<script src="static/js/plugins/jquery/jquery.min.js"
			type="text/javascript"></script>
		<script
			src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.5/jquery.validate.min.js"
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

		<!-- Validazione FE (riportare il plugin jQuery)-->
		<script type="text/javascript">
			$("#addAutoForm")
					.validate(
							{
								rules : {
									targa : {
										required : true,
										minlength : 7,
										maxlength : 7
									},
									prezzo : {
										required : true,
										maxlength : 10
									}
								},
								messages : {
									targa : {
										required : 'Errore! Campo obbligatorio',
										minlength : 'Errore! La targa deve essere di 7 caratteri',
										maxlength : 'Errore! La targa deve essere di 7 caratteri'
									},
									prezzo : {
										required : 'Errore! Campo obbligatorio'
									}
								}
							});
		</script>
	</div>
</body>
</html>
