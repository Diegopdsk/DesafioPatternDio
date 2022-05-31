
package com.diego.desafio2.dio.Main;

import com.diego.desafio2.dio.Credito.LiberarCredito;
import com.diego.desafio2.dio.Credito.LiberarCreditoBronze;
import com.diego.desafio2.dio.Credito.LiberarCreditoOuro;
import com.diego.desafio2.dio.Credito.LiberarCreditoPrata;
import java.util.List;

/**
 *Classe Facade criada para fazer as operações contidas na Classe Main
 * @author Diego
 */
public class OperacaoDeCredito {
    
        LiberarCredito bronze = new LiberarCreditoBronze();
        LiberarCredito prata = new LiberarCreditoPrata();
        LiberarCredito ouro = new LiberarCreditoOuro();
    
    public Double ResultadoCredito(String cpf, List clientes){
        
        Double vlr = bronze.ValorDeCredito(cpf, clientes);
        Double vlr2 = prata.ValorDeCredito(cpf, clientes);
        Double vlr3 = ouro.ValorDeCredito(cpf, clientes);
        
        if(vlr >vlr2 && vlr >vlr3){
            return vlr;
        }else if(vlr2 > vlr3){
            return vlr2;
        }else{
           return vlr3; 
        }
       
    }
}
