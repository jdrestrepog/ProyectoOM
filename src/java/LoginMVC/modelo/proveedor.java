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
public class proveedor {
    String idproveedor;
    String nombre;
    String direccion;
    String ciudad;
    String codpostal;
    String provincia;
    String pais;
    String numtel;
    String numfax;
    String correo;

    public proveedor(String idproveedor, String nombre, String direccion, String ciudad, String codpostal, String provincia, String pais, String numtel, String numfax, String correo) {
        this.idproveedor = idproveedor;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.codpostal = codpostal;
        this.provincia = provincia;
        this.pais = pais;
        this.numtel = numtel;
        this.numfax = numfax;
        this.correo = correo;
    }

    public String getIdproveedor() {
        return idproveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getCodpostal() {
        return codpostal;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getPais() {
        return pais;
    }

    public String getNumtel() {
        return numtel;
    }

    public String getNumfax() {
        return numfax;
    }

    public String getCorreo() {
        return correo;
    }

    public void setIdproveedor(String idproveedor) {
        this.idproveedor = idproveedor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setCodpostal(String codpostal) {
        this.codpostal = codpostal;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setNumtel(String numtel) {
        this.numtel = numtel;
    }

    public void setNumfax(String numfax) {
        this.numfax = numfax;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
