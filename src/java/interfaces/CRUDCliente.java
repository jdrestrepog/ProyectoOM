/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import LoginMVC.modelo.cliente;
import java.util.List;

/**
 *
 * @author juan
 */
public interface CRUDCliente {
    public List listar();
    public cliente list(int idcliente);
    public boolean add(cliente c);
    public boolean edit(cliente c);
    public boolean eliminar(int idcliente);
}
