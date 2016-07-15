/**
 * 
 */

function validateEmail() {
	var email = document.getElementById("email")
	var confirmmail = document.getElementById("txtConfirmEmail")
	if ((email.value != confirmmail.value) || (confirmmail.value == "")) {
		confirmmail.style.backgroundColor = "red";
	} else {
		confirmmail.style.backgroundColor = "";
	}
}



// $(document).ready(function() {
// $("#lblTitle1").click(function() {
// $("#lblTitle2").hide();
// alert("testing");
// });
//
// });
//
// $(document).ready(function() {
// $("#lblCont1").click(function() {
// $("#lblTitle2").show();
// $("#lblTitle2").slideUp(1000).slideDown(1000);
// });
//
// });



$(document).ready(function() {
	$("#ddlLocations").prop("disabled", true);

	$("#ddlStates").change(function() {
		var storeId = $("#ddlStates").val();
		$.ajax({
			type : "GET",
			url : "storesInfo",
			data : ({
				state : storeId
			}),
			/*contentType : "application/json; charset=utf-8",
			dataType : "json",*/
			success : function(msg) {
				var response = jQuery.parseJSON(msg);
				$("#ddlLocations").prop("disabled", false);
				$('#ddlLocations').find('option').remove();
				$.each(response, function(key, value) {
					$("#ddlLocations").append(
							"<option value='" + key + "'>"
									+ value + "</option>");
				});
			},
			error : function() {
				alert("Failed to load store locations.");
			}
		});
	});

});


