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
public class producto {
    String idproducto;
    String marca;
    String nombre;
    String referencia;
    String descripcion;
    String foto1;
    float preciocomp;
    float precioventa;
    String oferta;  //Si No

    public producto(String idproducto, String marca, String nombre, String referencia, String descripcion, String foto1, float preciocomp, float precioventa, String oferta) {
        this.idproducto = idproducto;
        this.marca = marca;
        this.nombre = nombre;
        this.referencia = referencia;
        this.descripcion = descripcion;
        this.foto1 = foto1;
        this.preciocomp = preciocomp;
        this.precioventa = precioventa;
        this.oferta = oferta;
    }

    public producto() {
     
    }

    public String getIdproducto() {
        return idproducto;
    }

    public String getMarca() {
        return marca;
    }

    public String getNombre() {
        return nombre;
    }

    public String getReferencia() {
        return referencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFoto1() {
        return foto1;
    }

    public float getPreciocomp() {
        return preciocomp;
    }

    public float getPrecioventa() {
        return precioventa;
    }

    public String getOferta() {
        return oferta;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFoto1(String foto1) {
        this.foto1 = foto1;
    }

    public void setPreciocomp(float preciocomp) {
        this.preciocomp = preciocomp;
    }

    public void setPrecioventa(float precioventa) {
        this.precioventa = precioventa;
    }

    public void setOferta(String oferta) {
        this.oferta = oferta;
    }
    
}
