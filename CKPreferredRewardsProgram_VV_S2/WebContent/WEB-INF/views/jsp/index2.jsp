<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Test Project!</title>

    

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
 <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.23/angular.min.js"></script>
	  <script src="js/app.js"></script>
  </head>
  <body>

    <div class="container-fluid" ng-app ="searchApp" ng-controller = "mainController">
	<div class="row">
		<div class="col-md-12">
			<nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
					 
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						 <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
					</button> <a class="navbar-brand" href="#">Home</a>
				</div>
				
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active">
							<a href="#">Data Services</a>
						</li>
						<li>
							<a href="#">Data Platform</a>
						</li>
						<li class="active">
							<a href="#">Data Virtualization</a>
						</li>
						<li class="active">
							<a href="#">Search &amp; Integration</a>
						</li>
						<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									<a href="#">Action</a>
								</li>
								<li>
									<a href="#">Another action</a>
								</li>
								<li>
									<a href="#">Something else here</a>
								</li>
								<li class="divider">
								</li>
								<li>
									<a href="#">Separated link</a>
								</li>
								<li class="divider">
								</li>
								<li>
									<a href="#">One more separated link</a>
								</li>
							</ul>
						</li>
					</ul>
					<form class="navbar-form navbar-left" role="search">
						<div class="form-group">
							<input type="text" class="form-control">
						</div> 
						<button type="submit" class="btn btn-default">
							Submit
						</button>
					</form>
					<ul class="nav navbar-nav navbar-right">
						<li>
							<a href="#">Link</a>
						</li>
						<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									<a href="#">Action</a>
								</li>
								<li>
									<a href="#">Another action</a>
								</li>
								<li>
									<a href="#">Something else here</a>
								</li>
								<li class="divider">
								</li>
								<li>
									<a href="#">Separated link</a>
								</li>
							</ul>
						</li>
					</ul>
				</div>
				
			</nav>
			<table class="table table-bordered table-hover">
				<thead>
					<tr>
						<th>
							Object<br><br>
							<input type="text" class="form-control" placeholder="Search" ng-model="searchData">
						</th>
						<th>
							Platform<br><br>
							<input type="text" class="form-control"placeholder="Search" ng-model="searchPlatform">
						</th>
						<th>
							Functions<br><br>
							<input type="text" class="form-control"placeholder="Search" ng-model="searchFunctions">
						</th>
						<th>
							Sub Category<br><br>
							<input type="text" class="form-control"placeholder="Search" ng-model="searchSubCategory">
						</th>
					</tr>
				</thead>
				<tbody>
					<tr ng-repeat="value in data | filter:searchData| filter:searchPlatform| filter:searchFunctions| filter:searchSubCategory">
						<td>
							{{ value.name }}
						</td>
						<td>
							{{ value.Platform }}
						</td>
						<td>
							{{ value.Functions }}
						</td>
						<td>
							{{ value.SubCategory }}
						</td>
					</tr>
					
				</tbody>
			</table>
		</div>
	</div>
</div>

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
  </body>
</html>