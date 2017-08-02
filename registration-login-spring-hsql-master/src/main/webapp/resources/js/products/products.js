$(document).ready(function() {

	//$('#id').focus();
//	$('#agregar').attr('disabled',true);
//	$('#modificar').attr('disabled',true);
//	$('#eliminar').attr('disabled',true);
//	
	//$('#id').blur(function(){
//		if($('#id').val()==""|| $('#id').val()=="0"){
//			$('#agregar').attr('disabled',false);
//			$('#modificar').attr('disabled',true);
//			$('#eliminar').attr('disabled',true);
//		}else{
			consultaIdProduct();
//		}
		/*
		 * 
			$('#agregar').attr('disabled',true);
			$('#modificar').attr('disabled',false);
			$('#eliminar').attr('disabled',false);*/
		
	//});
	
	function consultaIdProduct(){		
//			var produc {
//				$('#id').val();
//				$('#description').val();
//				$('#unitPrice').val();
//				$('#discount').val();
//				$('#total').val();
//				$('#existence').val();
//				$('#urlImage').val();
//			}
		    dwrService.getProduct(data,function(data){
		    	alert(data.description);
		    	 $("#id").val(data.id);
		    });
	}
		
});
