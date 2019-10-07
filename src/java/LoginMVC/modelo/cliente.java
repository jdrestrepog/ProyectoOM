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
public class cliente {

    String idcliente;
    String tipodoc;
    String numerodoc;
    String primernombre;
    String segundonombre;
    String primerapellido;
    String segundoapellido;
    String correo;
    String telefono;
    String nomempresa;
    String direccion;
    String codpostal;
    String ciudad;
    String departamento;
    String pais;
    String pass;
    String foto;
    float  descuento;
    String tipocliente;

    public cliente() {
    }

    public cliente(String idcliente, String tipodoc, String numerodoc, String primernombre, String segundonombre, String primerapellido, String segundoapellido, String correo, String telefono, String nomempresa, String direccion, String codpostal, String ciudad, String departamento, String pais, String pass, String foto, float descuento, String tipocliente) {
        this.idcliente = idcliente;
        this.tipodoc = tipodoc;
        this.numerodoc = numerodoc;
        this.primernombre = primernombre;
        this.segundonombre = segundonombre;
        this.primerapellido = primerapellido;
        this.segundoapellido = segundoapellido;
        this.correo = correo;
        this.telefono = telefono;
        this.nomempresa = nomempresa;
        this.direccion = direccion;
        this.codpostal = codpostal;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.pais = pais;
        this.pass = pass;
        this.foto = foto;
        this.descuento = descuento;
        this.tipocliente = tipocliente;
    }

    public String getIdcliente() {
        return idcliente;
    }

    public String getTipodoc() {
        return tipodoc;
    }

    public String getNumerodoc() {
        return numerodoc;
    }

    public String getPrimernombre() {
        return primernombre;
    }

    public String getSegundonombre() {
        return segundonombre;
    }

    public String getPrimerapellido() {
        return primerapellido;
    }

    public String getSegundoapellido() {
        return segundoapellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNomempresa() {
        return nomempresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCodpostal() {
        return codpostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getPais() {
        return pais;
    }

    public String getPass() {
        return pass;
    }

    public String getFoto() {
        return foto;
    }

    public float getDescuento() {
        return descuento;
    }

    public String getTipocliente() {
        return tipocliente;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public void setNumerodoc(String numerodoc) {
        this.numerodoc = numerodoc;
    }

    public void setPrimernombre(String primernombre) {
        this.primernombre = primernombre;
    }

    public void setSegundonombre(String segundonombre) {
        this.segundonombre = segundonombre;
    }

    public void setPrimerapellido(String primerapellido) {
        this.primerapellido = primerapellido;
    }

    public void setSegundoapellido(String segundoapellido) {
        this.segundoapellido = segundoapellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setNomempresa(String nomempresa) {
        this.nomempresa = nomempresa;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCodpostal(String codpostal) {
        this.codpostal = codpostal;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public void setTipocliente(String tipocliente) {
        this.tipocliente = tipocliente;
    }
    
    
    
    
}
