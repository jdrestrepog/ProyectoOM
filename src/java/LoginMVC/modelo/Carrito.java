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
public class Carrito {
    int    item;
    String idproducto;
    String nombre;
    float  preciocompra;
    int    cantidad;
    float  subtotal;

    public Carrito() {
    }

    public Carrito(int item, String idproducto, String nombre, float preciocompra, int cantidad, float subtotal) {
        this.item = item;
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.preciocompra = preciocompra;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public int getItem() {
        return item;
    }

    public String getIdproducto() {
        return idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPreciocompra() {
        return preciocompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPreciocompra(float preciocompra) {
        this.preciocompra = preciocompra;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }
    
    
    
}
