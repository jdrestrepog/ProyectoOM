/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import LoginMVC.modelo.Consultas;
import LoginMVC.modelo.cliente;
import interfaces.CRUDCliente;
import java.util.List;

/**
 *
 * @author juan
 */
public class clienteDAO implements CRUDCliente{

    @Override
    public List listar() {
        Consultas c = new Consultas();
        List<cliente>list = c.listarcliente();
        
        return list;
    }

    @Override
    public cliente list(int idcliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(cliente c) {
        Consultas con = new Consultas();
       return con.agregarCliente(c);
    }

    @Override
    public boolean edit(cliente c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(int idcliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
