/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginMVC.modelo;

/**
 *
 * @author juan
 */
public class inventario {
    String idproducto;
    String idproveedor;
    String cantidad;

    public inventario() {
    }

    public inventario(String idproducto, String idproveedor, String cantidad) {
        this.idproducto = idproducto;
        this.idproveedor = idproveedor;
        this.cantidad = cantidad;
    }

    public String getIdproducto() {
        return idproducto;
    }

    public String getIdproveedor() {
        return idproveedor;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public void setIdproveedor(String idproveedor) {
        this.idproveedor = idproveedor;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
