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
    String aniolanzamiento;
    String familiaolf;
    String notasalida;
    String notacorazon;
    String notafondo;
    String categoria;
    String tipo;
    String mililitros;
    String onzas;
    String uso;
    String foto1;
    String foto2;
    float preciocomp;
    float precioventa;
    float descuento;
    float preciodesc;
    String oferta;  //Si No

    public producto(String idproducto, String marca, String nombre, String referencia, String descripcion, String aniolanzamiento, String familiaolf, String notasalida, String notacorazon, String notafondo, String categoria, String tipo, String mililitros, String onzas, String uso, String foto1, String foto2, float preciocomp, float precioventa, float descuento, float preciodesc, String oferta) {
        this.idproducto = idproducto;
        this.marca = marca;
        this.nombre = nombre;
        this.referencia = referencia;
        this.descripcion = descripcion;
        this.aniolanzamiento = aniolanzamiento;
        this.familiaolf = familiaolf;
        this.notasalida = notasalida;
        this.notacorazon = notacorazon;
        this.notafondo = notafondo;
        this.categoria = categoria;
        this.tipo = tipo;
        this.mililitros = mililitros;
        this.onzas = onzas;
        this.uso = uso;
        this.foto1 = foto1;
        this.foto2 = foto2;
        this.preciocomp = preciocomp;
        this.precioventa = precioventa;
        this.descuento = descuento;
        this.preciodesc = preciodesc;
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

    public String getAniolanzamiento() {
        return aniolanzamiento;
    }

    public String getFamiliaolf() {
        return familiaolf;
    }

    public String getNotasalida() {
        return notasalida;
    }

    public String getNotacorazon() {
        return notacorazon;
    }

    public String getNotafondo() {
        return notafondo;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMililitros() {
        return mililitros;
    }

    public String getOnzas() {
        return onzas;
    }

    public String getUso() {
        return uso;
    }

    public String getFoto1() {
        return foto1;
    }

    public String getFoto2() {
        return foto2;
    }

    public float getPreciocomp() {
        return preciocomp;
    }

    public float getPrecioventa() {
        return precioventa;
    }

    public float getDescuento() {
        return descuento;
    }

    public float getPreciodesc() {
        return preciodesc;
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

    public void setAniolanzamiento(String aniolanzamiento) {
        this.aniolanzamiento = aniolanzamiento;
    }

    public void setFamiliaolf(String familiaolf) {
        this.familiaolf = familiaolf;
    }

    public void setNotasalida(String notasalida) {
        this.notasalida = notasalida;
    }

    public void setNotacorazon(String notacorazon) {
        this.notacorazon = notacorazon;
    }

    public void setNotafondo(String notafondo) {
        this.notafondo = notafondo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMililitros(String mililitros) {
        this.mililitros = mililitros;
    }

    public void setOnzas(String onzas) {
        this.onzas = onzas;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public void setFoto1(String foto1) {
        this.foto1 = foto1;
    }

    public void setFoto2(String foto2) {
        this.foto2 = foto2;
    }

    public void setPreciocomp(float preciocomp) {
        this.preciocomp = preciocomp;
    }

    public void setPrecioventa(float precioventa) {
        this.precioventa = precioventa;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public void setPreciodesc(float preciodesc) {
        this.preciodesc = preciodesc;
    }

    public void setOferta(String oferta) {
        this.oferta = oferta;
    }
    
}
