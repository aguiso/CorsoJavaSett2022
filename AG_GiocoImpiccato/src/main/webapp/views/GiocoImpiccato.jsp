<!DOCTYPE html>
<html lang="en">

<head>

<title>Gioco dell'Impiccato</title>
<link rel="stylesheet" href="static/css/GiocoImpiccato.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.6.1.min.js"
	integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ="
	crossorigin="anonymous"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css"
	integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<script>
	$(document).ready(function() {
		$("table.GiocoImpiccato").hide();
	});
</script>
</head>


<body>

	<h1>Gioco dell'Impiccato</h1>

	<hr class="border border-primary border-3 opacity-75">

	<div class="container">
		<div class="row">
			<div class="col-3"></div>
			<div class="col-6">
				<div class="input-group">
					<span class="input-group-text">Parola:</span> <input type="text"
						aria-label="Prima lettera" class="form-control"> <input
						type="text" aria-label="Seconda lettera" class="form-control">
					<input type="text" aria-label="Terza lettera" class="form-control">
					<input type="text" aria-label="Quarta lettera" class="form-control">
					<input type="text" aria-label="Quinta lettera" class="form-control">
					<input type="text" aria-label="Sesta lettera" class="form-control">
				</div>
			</div>
			<div class="col-3"></div>
		</div>
	</div>

	<div class="container">
		<div class="row">
			<div class="col-5"></div>
			<div class="col-2">
				<div class="input-group">
					<span class="input-group-text">Lettera:</span> <input type="text"
						aria-label="Prima lettera" class="form-control">
					<button type="button" class="btn btn-success">Scelta</button>
				</div>
			</div>
			<div class="col-5"></div>
		</div>
	</div>
	</div>

	<div class="container text-center">
		<div class="row">
			<div class="col-2"></div>
			<div class="col-8">
				<table class="GiocoImpiccato" style="width: 100%">
					<tr>
						<td><input type="text" aria-label="C1" class="form-control"></td>
						<td><input type="text" aria-label="C2" class="form-control"></td>
						<td><input type="text" aria-label="C3" class="form-control"></td>
					</tr>
					<tr>
						<td><input type="text" aria-label="C4" class="form-control"></td>
						<td><input type="text" aria-label="C5" class="form-control"></td>
						<td><input type="text" aria-label="C6" class="form-control"></td>
					</tr>
					<tr>
						<td><input type="text" aria-label="C7" class="form-control"></td>
						<td><input type="text" aria-label="C8" class="form-control"></td>
						<td><input type="text" aria-label="C9" class="form-control"></td>
					</tr>
				</table>
			</div>
			<div class="col-2"></div>
		</div>
	</div>

	<h3>Hai Vinto!! <i class="fa-solid fa-trophy"></i></h3>


	<h3>Hai Perso!! <i class="fa-solid fa-xmark"></i></h3>
	



	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
		crossorigin="anonymous"></script>
</body>