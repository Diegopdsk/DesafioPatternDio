
package com.diego.desafio2.dio.Db;

import com.diego.desafio2.dio.Entidades.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *Utilizando um Singleton para Simulação de Banco de dados estatico com ArrayList
 * onde só faremos a operação de consulta e atualização de valor de Credito
 * @author Diego
 */
public class BancoDeDados {
    private static BancoDeDados instancia;
    
    List<Cliente> clientes = new ArrayList<>();

    private BancoDeDados() {
        
        clientes.add(new Cliente("Diego","02236524510",0.0,250));
        clientes.add(new Cliente("Camila","01025546980",null,100));
        clientes.add(new Cliente("Vanessa","1584026530",null,500));
        clientes.add(new Cliente("Tiago","8095263201",null,120));
        clientes.add(new Cliente("Felipe","5040607090",null,800));
          
    }
    
    public static BancoDeDados getInstancia(){
        if(instancia == null){
            instancia = new BancoDeDados();
        }
        return instancia;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    
    
}
