<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
<script src="${pageContext.request.contextPath}/resources/js/script.js""></script>

<style type="text/css">
#graybackground-div {
	position: absolute;
	top: 0px;
	left: 0px;
	overflow: hidden;
	width: 100%;
	height: 100%;
	background-color: #D3D3D3;
	opacity: 0.5;
	filter: alpha(opacity = 50);
	z-index: 10;
	display: none;
}

#message-div {
	position: absolute;
	top: 60%;
	left: 40%;
	margin-left: -100px;
	margin-top: -150px;
	background-color: white;
	filter: progid:DXImageTransform.Microsoft.Gradient(                   
		                     
GradientType=0, StartColorStr='white', EndColorStr='white');
	width: 500px;
	height: 150px;
	border: 2px solid white;
	font-family: Arial, Helvetica;
	text-align: center;
	color: #000000;
	font-size: 20px;
	display: none;
}

#message-div div {
	padding: 70px;
}
</style>

</head>
<body>

	<div id="graybackground-div"></div>
	<div id="message-div">
		<div>
			<b>processing data, please wait...</b>
		</div>
	</div>

	<div id="hor">
		<div id="wrap">
			<form name="form1" method="post"
				action="${pageContext.request.contextPath}/newuser_reg" id="form1">
				<div class="rel" id="content">

					<br>
					<div class="abs" style="top: 15px; left: 15px; right: -2%">

						<img
							src="${pageContext.request.contextPath}/resources/images/logo.gif">
						<br> <span
							style="float: right; font-size: 15pt; padding-right: 30px;">
							<a href="start">Sign in/Join</a>
						</span> <br> <br>

						<div
							style="font-family: Arial, Helvetica; font-size: 8pt; text-align: left; color: #999999; padding-left: 10px;">
							<span> <a
								href="${pageContext.request.contextPath}/welcome"> <span
									id="MenuOptions_lblMenu1">HOME</span></a>&nbsp;&nbsp; <a
								href="http://explore.calvinklein.com/en_US/corporate"
								target="_blank"><span id="MenuOptions_lblMenu2">ABOUT</span></a>
							</span>
						</div>

						<br> <br>

						<table width="100%">
							<div style="color: #FF0000;">${errorMessage}</div>
							<tbody>
								<tr>
									<td><span id="lblCont2" class="title">SIGN UP FOR
											THE PREFERRED PROGRAM</span></td>
								</tr>


								<tr>
									<td>&nbsp;</td>
								</tr>

								<tr>
									<td class="contents"><span id="lblCont4">please
											complete the following registration form to become a
											preferred program member.</span></td>
								</tr>


								<tr>
									<td>&nbsp;</td>
								</tr>
								<tr>
									<td></td>
								</tr>
							</tbody>
						</table>

						<table class="border" cellpadding="10px" width="80%">

							<tbody>
								<tr align="center">
									<td>
										<div id="mainContentHolderDiv" class="mainContentHolderDiv"
											style="height: 50em; width: 100%;">
											<table class="tblMain" cellpadding="3px">
												<tbody>

													<tr>
														<td align="left"><span id="lblCont6"
															style="font-weight: bold;">* indicates mandatory
																fields</span></td>
													</tr>
													<tr>
														<td align="left">&nbsp;</td>
													</tr>



													<tr>
														<td>&nbsp;</td>
													</tr>

													<tr>
														<td style="width: 262px" align="right"><span
															id="lblPickStore" class="contents">select your
																home store</span></td>
														<td colspan="2" align="left">


															<div id="UpdatePanel1">

																<select name="country.id" id="ddlStorecountries"
																	tabindex="1" class="textbox" style="width: 120px;">
																	<!-- <option selected="selected" value="0">select
																		country</option> -->
																	<option value="1" selected="selected">united states</option>
																	<!-- <option value="2" selected="selected">canada</option> -->

																</select>&nbsp;* &nbsp; <select name="state.id" id="ddlStates"
																	tabindex="2" class="textbox">
																	<!-- <option selected="selected" value="0">select
																		state / province</option> -->
																	<option value="1" selected="selected">Texas</option>
																	<option value="2" selected="selected">Ohio</option>
																</select>&nbsp;* <br>

															</div>
														</td>
													</tr>

													<tr>
														<td></td>
														<td colspan="2" align="left">
															<div id="UpdatePanel3">

																<select name="store.storeID" id="ddlLocations"
																	tabindex="3" class="textbox" style="width: 440px;">

																	<%-- <c:forEach items="${storesList}" var="store">
																		<option value="${store.key}">${store.value}</option>
																	</c:forEach> --%>

																</select>&nbsp;

															</div>
														</td>
													</tr>

													<tr>
														<td colspan="3" align="left"><span id="lblCont9">(your
																home store selection should be the store that you shop
																the most frequently. proper home store selection ensures
																you receive special promotions for the location nearest
																you. )</span></td>
													</tr>

													<tr>
														<td colspan="3" class="contents" align="left"><b>
																<span id="lblPassCreate">Username and Password
																	for your preferred account</span>
														</b></td>
													</tr>
													<tr>
														<td style="width: 262px" align="right"><span
															id="lblPassword" class="contents">Username</span></td>
														<td align="left"><input name="userName"
															maxlength="15" id="userName" tabindex="4" class="textbox"
															type="text" required> *&nbsp;</td>
														<td align="left"></td>

													</tr>


													<tr>
														<td style="width: 262px" align="right"><span
															id="lblPassword" class="contents">password</span></td>
														<td align="left"><input name="password"
															maxlength="10" id="password" tabindex="4" class="textbox"
															type="password" required> *&nbsp; <img
															src="${pageContext.request.contextPath}/resources/images/QuestionIcon.jpg">

														</td>
														<td align="left"><input name="hdnPassword"
															id="hdnPassword" type="hidden"></td>
													</tr>

													<tr>
														<td style="width: 262px"></td>
														<td colspan="2" align="left"><span id="lblCont13">password
																should be between 8-10 characters</span></td>
													</tr>


													<tr>
														<td colspan="3">&nbsp;</td>
													</tr>

												</tbody>
												<!-------->
												<tbody>

													<tr>
														<td align="left">&nbsp;</td>
													</tr>

													<tr>
														<td>&nbsp;</td>
													</tr>


													<tr>
														<td class="contents" align="right"><span id="lblFnm"
															class="contents">first name</span></td>
														<td style="height: 26px" align="left"><input
															name="firstName" maxlength="200" id="txtFnm" tabindex="9"
															class="textbox" type="text" required> *</td>
														<td style="height: 26px" align="left"></td>
													</tr>

													<tr>
														<td class="contents" align="right"><span id="lblLnm"
															class="contents">last name</span></td>
														<td align="left"><input name="lastName"
															maxlength="200" id="lastName" tabindex="10"
															class="textbox" type="text" required> *</td>
														<td align="left"></td>
													</tr>

													<tr>
														<td class="contents" align="right"><span
															id="lblCont10">country/state:</span></td>
														<td colspan="2" align="left">
															<div id="UpdatePanel2">

																<select name="country.id" id="ddlCountry" tabindex="11"
																	class="textbox" style="width: 200px;">
																	<!-- <option selected="selected" value="0">select
																		country</option> -->
																	<option selected="selected" value="1">united
																		states</option>


																</select> &nbsp; <select name="state.id" id="ddlStatesProv"
																	tabindex="12" class="textbox" style="width: 220px;">
																	<!-- <option selected="selected" value="0">select
																		state/province</option> -->
																	<option selected="selected" value="1">Texas</option>
																</select> &nbsp;*

															</div>
														</td>
														<td align="left"></td>
													</tr>

													<tr>
														<td colspan="2">
															<div id="updPnlAddr1">

																<table id="Table1" style="width: 100%;" border="0"
																	cellpadding="0" cellspacing="3">
																	<tbody>
																		<tr id="rowAddr1">
																			<td id="TableCell1" class="tableCellRightAligned"
																				style="width: 362px;"><span id="lblAddress1"
																				class="contents">address 1</span></td>
																			<td id="TableCell2" class="tableCellLeftAligned"><input
																				name="address1" maxlength="255" id="address1"
																				tabindex="13" class="textbox" type="text" required>&nbsp;*
																			</td>
																		</tr>
																	</tbody>
																</table>

															</div>
														</td>
														<td align="left"></td>
													</tr>

													<tr>
														<td colspan="3">
															<div id="updPnlAddr2">

																<table id="Table2" style="width: 100%;" border="0"
																	cellpadding="0" cellspacing="3">
																	<tbody>
																		<tr id="rowAddr2">
																			<td id="TableCell3" class="tableCellRightAligned"
																				style="width: 362px;"><span id="lblAddress2"
																				class="contents">address 2</span></td>
																			<td id="TableCell4" class="tableCellLeftAligned"><input
																				name="address2" maxlength="255" id="address2"
																				tabindex="14" class="textbox" type="text" required></td>
																		</tr>
																	</tbody>
																</table>

															</div>
														</td>
													</tr>

													<tr>
														<td colspan="2">
															<div id="updPnlCity">

																<table id="Table3" style="width: 100%;" border="0"
																	cellpadding="0" cellspacing="3">
																	<tbody>
																		<tr id="rowCity">
																			<td id="TableCell5" class="tableCellRightAligned"
																				style="width: 362px"><span id="lblCity"
																				class="contents">city</span></td>
																			<td id="TableCell6" class="tableCellLeftAligned"><input
																				name="city" maxlength="200" id="city" tabindex="15"
																				class="textbox" type="text" required>&nbsp;*
																			</td>
																		</tr>
																	</tbody>
																</table>

															</div>
														</td>

														<td align="left"></td>
													</tr>

													<tr>
														<td colspan="2">
															<div id="updPnlZip">

																<table id="Table4" style="width: 100%;" border="0"
																	cellpadding="0" cellspacing="3">
																	<tbody>
																		<tr id="rowZip">
																			<td id="TableCell7" class="tableCellRightAligned"
																				style="width: 362px"><span id="lblZip"
																				class="contents">zip</span></td>
																			<td id="TableCell8" class="tableCellLeftAligned"><input
																				name="zip" maxlength="7" id="zip" tabindex="16"
																				class="textbox" type="text" required>&nbsp;*
																			</td>
																		</tr>
																	</tbody>
																</table>

															</div>
														</td>
														<td align="left"></td>
													</tr>

													<tr>
														<td style="width: 362px" align="right"><span
															id="lblEmail" class="contents">email</span></td>
														<td align="left">
															<div id="UpdatePanel10">

																<input name="email" maxlength="255" id="email"
																	tabindex="17" class="textbox" type="email" required>&nbsp;

															</div>

														</td>
														<td align="left"></td>

													</tr>

													<tr>
														<td>&nbsp;</td>
														<td colspan="2" align="left"><span
															id="lblEmailmsgDisp">(your email address is your
																user name for login purposes)</span></td>
													</tr>
													<tr>
														<td class="contents" align="right"><span
															id="lblConfirmEmail" class="contents">confirm
																email</span></td>
														<td align="left"><input name="txtConfirmEmail"
															maxlength="255" id="txtConfirmEmail" tabindex="18"
															class="textbox" type="email" onchange="validateEmail()"
															required> *</td>
														<td align="left"></td>
													</tr>

													<tr>
														<td colspan="3">
															<div id="updPnlPhone">

																<table id="Table5" style="width: 100%;" border="0"
																	cellpadding="0" cellspacing="3">
																	<tbody>
																		<tr id="rowPhone">
																			<td id="TableCell9" class="tableCellRightAligned"
																				style="width: 362px"><span id="lblPhone"
																				class="contents">phone</span></td>
																			<td id="TableCell10" class="tableCellLeftAligned"><input
																				name="phone" maxlength="100" id="phone"
																				tabindex="19" class="textbox" type="tel"
																				pattern="^\d{10}$" required>&nbsp;*</td>
																			<td id="TableCell11"></td>
																		</tr>
																	</tbody>
																</table>

															</div>
														</td>

													</tr>

													<tr>
														<td>&nbsp;</td>
														<td colspan="2" align="left">
															<div id="updPnlPhoneMsg">

																<table id="Table6"
																	style="width: 100%; border-collapse: collapse;"
																	border="0" cellpadding="0" cellspacing="0">
																	<tbody>
																		<tr id="rowPhoneMsg">
																			<td id="TableCell12"><span id="lblPhoneMsg">(we
																					only use phone number to look up your account in
																					stores if you don't have your preferred card.)</span></td>
																		</tr>
																	</tbody>
																</table>

															</div>
														</td>
													</tr>

												</tbody>

												<!-------->

												<tbody>

													<tr>
														<td align="left">&nbsp;</td>
													</tr>

													<tr>
														<td>&nbsp;</td>
													</tr>

													<tr>
														<td align="right"><span id="gender" class="contents">gender</span></td>
														<td colspan="2" align="left"><span class="radio"><input
																id="rbtnGM" name="gender" value="male"
																"check"tabindex="22" type="radio" checked><label
																for="rbtnGM">male</label></span> <span class="radio"><input
																id="rbtnGF" name="gender" value="female" tabindex="23"
																type="radio"><label for="rbtnGF">female</label></span></td>
													</tr>

													<tr>
														<td align="right"><span id="lblMS" class="contents">marital
																status</span></td>
														<td colspan="2" align="left"><span class="radio"><input
																id="rbtnSingle" name="maritalStatus" value="single"
																tabindex="24" type="radio" checked><label
																for="rbtnSingle">single</label></span> <span class="radio"><input
																id="maritalStatus" name="maritalStatus" value="married"
																tabindex="25" type="radio"><label
																for="rbtnMarried">married</label></span></td>
													</tr>

													<tr>
														<td align="right"><span id="lblBirthDate"
															class="contents">birth date</span></td>
														<td colspan="2" align="left"><select
															name="birthMonth" id="birthMonth" tabindex="18"
															class="textbox">
																<option selected="selected" value="0">select
																	month</option>
																<option value="january" selected="selected">january</option>
																<option value="february">february</option>
																<option value="march">march</option>
																<option value="april">april</option>
																<option value="may">may</option>
																<option value="june">june</option>
																<option value="july">july</option>
																<option value="august">august</option>
																<option value="september">september</option>
																<option value="october">october</option>
																<option value="november">november</option>
																<option value="december">december</option>

														</select> &nbsp;<select name="birthDay" id="birthDay" tabindex="19"
															class="textbox">
																<option selected="selected" value="0">select
																	day</option>
																<option value="01" selected="selected">01</option>
																<option value="02">02</option>
																<option value="03">03</option>
																<option value="04">04</option>
																<option value="05">05</option>
																<option value="06">06</option>
																<option value="07">07</option>
																<option value="08">08</option>
																<option value="09">09</option>
																<option value="10">10</option>
																<option value="11">11</option>
																<option value="12">12</option>
																<option value="13">13</option>
																<option value="14">14</option>
																<option value="15">15</option>
																<option value="16">16</option>
																<option value="17">17</option>
																<option value="18">18</option>
																<option value="19">19</option>
																<option value="20">20</option>
																<option value="21">21</option>
																<option value="22">22</option>
																<option value="23">23</option>
																<option value="24">24</option>
																<option value="25">25</option>
																<option value="26">26</option>
																<option value="27">27</option>
																<option value="28">28</option>
																<option value="29">29</option>
																<option value="30">30</option>
																<option value="31">31</option>

														</select>&nbsp;</td>
													</tr>

													<tr>
														<td align="right"><span id="income_id"
															class="contents">household income</span></td>
														<td colspan="2" align="left"><span class="radio">
																<input id="rbtnIncome1" name="income.id"
																value="rbtnIncome1" tabindex="26" type="radio" checked><label
																for="rbtnIncome1">$25,000-$40,000 </label>
														</span> <span class="radio"> <input id="rbtnIncome2"
																name="income.id" value="rbtnIncome2" tabindex="27"
																type="radio"><label for="rbtnIncome2">$40,001-$55,000</label></span>
															<span class="radio"> <input id="rbtnIncome3"
																name="income.id" value="rbtnIncome3" tabindex="28"
																type="radio"><label for="rbtnIncome3">$55,001-$70,000</label></span>
															<span class="radio"> <input id="rbtnIncome4"
																name="income.id" value="rbtnIncome4" tabindex="29"
																type="radio"><label for="rbtnIncome4">$70,001-$85,000</label></span><br>
															<span class="radio"><input id="rbtnIncome5"
																name="income.id" value="rbtnIncome5" tabindex="30"
																type="radio"><label for="rbtnIncome5">$85,001-$100,000</label></span>
															<span class="radio"> <input id="rbtnIncome6"
																name="income.id" value="rbtnIncome6" tabindex="31"
																type="radio"><label for="rbtnIncome6">$100,001+</label></span></td>
													</tr>

													<tr>
														<td colspan="3">&nbsp;</td>
													</tr>

													<tr>
														<td colspan="2">&nbsp;</td>
													</tr>
													<tr>
														<td colspan="3" class="contents" align="left"><span
															id="lblCont15" style="font-weight: bold;">in
																addition to receiving your earned rewards via email, you
																will also receive sale and discount emails valid at
																calvinklein.com and certain Calvin Klein stores. you may
																edit your mailing preferences below:</span></td>
													</tr>

													<tr>
														<td colspan="2">&nbsp;</td>
													</tr>

													<tr>
														<td align="right"><span id="lblEmailPref"
															class="contents">email preferences</span></td>
														<td align="left"><span class="radio"><input
																id="chkCK" name="subscriptionEmail" checked="checked"
																tabindex="32" type="checkbox"><label for="chkCK">calvinklein.com</label></span>
															&nbsp; <span class="radio"><input id="chkCKS"
																name="subscriptionStore" checked="checked" tabindex="33"
																type="checkbox"><label for="chkCKS">Calvin
																	Klein stores</label></span> &nbsp; <span class="radio"><input
																id="chkRewards" name="subscriptionRewards"
																checked="checked" tabindex="34" type="checkbox"><label
																for="chkRewards">earned rewards</label></span> <br></td>
														<td align="left">&nbsp;</td>
													</tr>


													<tr>
														<td colspan="3" class="contents"><b><u>by
																	joining our preferred program, and providing personal
																	data, you are certifying you are at least 18 years of
																	age. <br> do not provide any information if you're
																	under the age of 18.
															</u></b></td>
													</tr>

													<tr>
														<td colspan="3">&nbsp;</td>
													</tr>

													<tr align="center">
														<td colspan="3"><input type="submit" value="Join"></input>
															<!--<a
															onclick="ClientSideClick(this);this.disabled=true; document.getElementById('lbtnPrev3').disabled=true;"
															id="btnUpdate" tabindex="36" class="bullets"
															usesubmitbehavior="False"
															href="javascript:__doPostBack('btnUpdate','')"
															style="font-weight: bold;">update profile</a>--></td>
													</tr>

												</tbody>
											</table>
										</div>
									</td>
								</tr>

							</tbody>

						</table>

					</div>
				</div>

			</form>
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