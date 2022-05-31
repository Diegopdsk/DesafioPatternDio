
package com.diego.desafio2.dio.Main;


import com.diego.desafio2.dio.Db.BancoDeDados;
import com.diego.desafio2.dio.Entidades.Cliente;
import java.util.Iterator;
import javax.swing.JOptionPane;


/**
 *Classe para testar implementação de Consulta de Credito!
 * @author Diego
 */
public class Main {
    
    
            
    public static void main(String[] args) {
        BancoDeDados clientes = BancoDeDados.getInstancia();
        OperacaoDeCredito operacao = new OperacaoDeCredito();
        String [] cpf ={"","","","",""};
        
        for (int i = 0; i < clientes.getClientes().size(); i++) {
            cpf[i] = clientes.getClientes().get(i).getCpf();
        }
        Object cpfSelecionada = JOptionPane.showInputDialog(null,
             "Escolha para qual CPF deseja Atendimento", "Credcard",
             JOptionPane.INFORMATION_MESSAGE, null,
             cpf, cpf[0]);
        
        Cliente cliente = new Cliente();
               
        System.out.println("______________________________________");
        
        Double vlr = operacao.ResultadoCredito(cpfSelecionada.toString(), clientes.getClientes());
        
        String res = String.format("%.2f", vlr);
        
      
        JOptionPane.showMessageDialog(null,"Seu credito solicitado é: R$ "+res);
        
        
       
    }
    
}
