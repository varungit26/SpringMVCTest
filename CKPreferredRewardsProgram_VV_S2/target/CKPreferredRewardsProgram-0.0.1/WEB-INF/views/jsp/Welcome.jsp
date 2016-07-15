<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Calvin Klein - Preferred Program</title>

<link
	href="${pageContext.request.contextPath}/resources/styles/global.css"
	media="all" rel="stylesheet" type="text/css" />
<link
	href="${pageContext.request.contextPath}/resources/styles/master.css"
	media="all" rel="stylesheet" type="text/css" />

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/jquery-2.2.0.js"></script>

<script src="${pageContext.request.contextPath}/resources/js/script.js""></script>





</head>
<body>


	<div id="hor">
		<div id="wrap">
			<div class="rel" id="content">
				<div id="homepage"></div>
				<span style="float: right; font-size: 15pt; padding-right: 10px;">
					<a href="${pageContext.request.contextPath}/start">Sign in/Join</a>
				</span> <img style="position: absolute; top: 30px; left: 15px;"
					src="${pageContext.request.contextPath}/resources/images/logo.gif"
					alt=""> <br> <br> <br>
				<div
					style="font-family: Arial, Helvetica; font-size: 8pt; text-align: left; color: #999999; padding-left: 20px;">


					<span> <a href="${pageContext.request.contextPath}/welcome">
							<span id="MenuOptions_lblMenu1">HOME</span>
					</a>&nbsp;&nbsp; <a
						href="http://explore.calvinklein.com/en_US/corporate"
						target="_blank"><span id="MenuOptions_lblMenu2">ABOUT</span></a>
					</span>
				</div>


				<div class="abs" style="top: 100px; left: 15px;">
					<table width="100%">
						<tbody>
							<tr>
								<td class="spltitle"><span id="lblTitle1" class="spltitle">
										SPECIAL OFFER</span></td>

							</tr>

							<tr>
								<td colspan="2"><span id="lblCont1" class="splcontent">receive
										20% off your next in-store purchase when you register for the
										Calvin Klein Preferred Program.</span> <br> <br></td>
							</tr>
							<tr>
								<td class="title"><span id="lblTitle2" class="title">PREFERRED
										PROGRAM</span></td>
								<td align="right" class="title"></td>
							</tr>

							<tr>
								<td class="contents" colspan="2"><br> <span
									id="lblCont2" class="contents">the Calvin Klein
										Preferred Program is designed to reward our best customers for
										their frequent purchases.</span> <br> <span id="lblCont3"
									class="contents">as a Calvin Klein preferred customer,
										you accumulate points with each purchase. <br>
								</span> <br> <span id="lblCont4" class="contents">for every
										$200 spent (taxes not included) you will receive at $20 Calvin
										Klein reward via email.<br> the more you spend, the more
										you earn.
								</span> <br> <span id="lblCont5" class="contents">preferred
										rewards may be used towards your subsequent purchases at
										Calvinklein.com or certain Calvin Klein stores. <br> <br>additional
										benefits: <br>1. exclusive sales email offers <br>2.
										birthday gift <br> 3. plus, complete your profile and
										earn 100 points towards your next preferred reward (for
										example, spend $100 at your local Calvin Klein company store
										today, complete your profile below and you'll receive your $20
										reward! <br>
								</span> <br> <span id="lblCont6" class="contents">certain
										restrictions apply, see full terms and conditions.</span></td>
							</tr>

							<tr>
								<td>&nbsp;</td>
								<td></td>
							</tr>
						</tbody>
					</table>

					<table class="border">
						<tbody>
							<tr>
								<td>
									<table>

										<tbody>
											<tr>
												<td class="contents"><span id="Label2" class="subtitle">existing
														members</span> &nbsp;&nbsp; <a id="lbtnlogin" class="bullets"
													href="${pageContext.request.contextPath}/login"
													style="font-weight: bold; text-decoration: underline;">log
														in</a><br> <br> <span id="lblCont7" class="contents">if
														you are an existing member and have already registered
														online for the Calvin Klein Preferred Program, you can
														login to view your points balance or update member
														enrollment information online. </span> <br> <span
													id="lblCont8" class="contents">login to </span> <b><span
														id="lblCont9" class="contents">add the purchase</span> </b> <span
													id="lblCont10" class="contents">to your account. </span></td>
											</tr>
										</tbody>
									</table>
								</td>
							</tr>
						</tbody>
					</table>
					<br>
					<table class="border">
						<tbody>
							<tr>
								<td>
									<table width="100%">


										<tbody>
											<tr>
												<td><span id="Label1" class="subtitle">get
														started</span> <br> <br></td>
											</tr>
											<tr>
												<td><span id="lblContents4" class="contents">did
														you know that by completing your profile, you'll also earn
														points towards your next reward? registering or completing
														your profile takes just a few minutes. please click below
														to proceed:</span></td>
											</tr>
											<tr align="center">
												<td><a id="btnRegWCard" class="bullets"
													href="${pageContext.request.contextPath}/start"
													style="font-weight: bold; text-decoration: underline;">get
														started</a></td>
											</tr>


										</tbody>
									</table>
								</td>
							</tr>
						</tbody>
					</table>
					<br>
				</div>
			</div>



			<div id="footer">
				<span class="fLeft"> <a
					href="https://www.calvinkleinpreferred.com/TermsConditions.aspx"
					target="blank"><span id="MenuOptions_lblMenu2">TERMS
							&amp; CONDITIONS</span></a>&nbsp;&nbsp;&nbsp;&nbsp; <a
					href="http://explore.calvinklein.com/en_US/privacy" target="_blank">
						<span id="MenuOptions_lblMenu3">PRIVACY POLICY</span>
				</a>&nbsp;&nbsp;&nbsp;&nbsp;

				</span>

			</div>
		</div>
	</div>

</body>
</html>