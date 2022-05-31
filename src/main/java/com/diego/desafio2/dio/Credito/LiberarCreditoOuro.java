
package com.diego.desafio2.dio.Credito;

import com.diego.desafio2.dio.Entidades.Cliente;
import java.util.Iterator;
import java.util.List;

/**
 *Classe Filha da Strategy responsavel por checar se o valor disponivel para o cliente 
 * @author Diego
 */
public class LiberarCreditoOuro implements LiberarCredito{

    @Override
    public Double ValorDeCredito(String cpf, List clientes) {
        String cpfCliente = cpf;
        Double valorCredito = 0.0;
        
        Iterator<Cliente> iterator = clientes.iterator();
        
        while(iterator.hasNext()){
            Cliente clientes1 = iterator.next();
            
            if(cpfCliente.equals(clientes1.getCpf())){
                if(clientes1.getScore() >= 500){
                    valorCredito = 3000.0;
                }
            }
        }
        
        return valorCredito;
    }
    
}
