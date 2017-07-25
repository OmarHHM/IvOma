
$(document).ready(function() {
	
	$('#enviar').submit(function(e) {
		e.preventDefault();
		}).validate({
		debug: false,
		rules: {
		"username": {
		required: true,
		minlength: 6,
		maxlength: 32
		}
		},
		messages: {
		
		"username": {
		required: "Se requiere un nombre.",
		maxlength: "Debe contener máximo 32 caracteres.",
		minlength: "Debe contener mínimo 6 caracteres."
		}
		}
		});

});

function validateRegister(){
	if($('#username').length<6 || $('#username').length<32){
		document.getElementById("nameError").innerHTML ="El nombre debe de ser mayor a 6 caracteres y menor de 32";
		$('#username').val("");
		$('#username').focus();
	}
}