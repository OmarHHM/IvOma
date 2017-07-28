$(document).ready(function() {

	$('#id').focus();
	$('#agregar').attr('disabled',true);
	$('#modificar').attr('disabled',true);
	$('#eliminar').attr('disabled',true);
	
	$('#id').blur(function(){
		if($('#id').val()==""|| $('#id').val()=="0"){
			$('#agregar').attr('disabled',false);
			$('#modificar').attr('disabled',true);
			$('#eliminar').attr('disabled',true);
		}else{
			consultaIdProduct($('#id').val());
		}
		/*
		 * 
			$('#agregar').attr('disabled',true);
			$('#modificar').attr('disabled',false);
			$('#eliminar').attr('disabled',false);*/
		
	});
	
	function consultaIdProduct(id){
//		 $.get("/getProduct",
//				 {
//			 		id=id
//				 },
//				 function(data, status){
//				 }
//				 	alert("Data: " + data + "\nStatus: " + status);
//		    });
	}
});
