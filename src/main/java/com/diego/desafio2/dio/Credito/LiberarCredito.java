
package com.diego.desafio2.dio.Credito;

import java.util.List;

/**
 *Esta classe é uma Strategy onde será responsavel informar a suas classes filhas
 *que precisa implementar como será liberado credito para os clientes. 
 * @author Diego
 */
public interface LiberarCredito {
    
    public Double ValorDeCredito(String cpf,List clientes);
}
