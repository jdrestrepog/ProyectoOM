/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function (){
    $("tr #btnDelete").click(function (){
        var idp = $(this).parent().find("#idp").val();
        eliminar(idp);
    });
    function eliminar(idp){
        var url = "Controlador?accion=Delete";
        $.ajax({
            type: POST,
            url: url,
            data: "idp="+idp,
            success: function (data, textStatus, jqXHR) {
                alert("Registro Eliminado");
            }    
        });
    }
});


