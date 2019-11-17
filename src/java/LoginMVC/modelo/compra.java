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
public class compra {
    String idcompra;
    String idcliente;
    String idproducto;
    String descproducto;
    String cantidad;
    String fecha;

    public compra() {
    }

    public compra(String idcompra, String idcliente, String idproducto, String descproducto, String cantidad, String fecha) {
        this.idcompra = idcompra;
        this.idcliente = idcliente;
        this.idproducto = idproducto;
        this.descproducto = descproducto;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public String getIdcompra() {
        return idcompra;
    }

    public String getIdcliente() {
        return idcliente;
    }

    public String getIdproducto() {
        return idproducto;
    }

    public String getDescproducto() {
        return descproducto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setIdcompra(String idcompra) {
        this.idcompra = idcompra;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public void setDescproducto(String descproducto) {
        this.descproducto = descproducto;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
