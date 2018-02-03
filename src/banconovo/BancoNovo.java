
package banconovo;

import java.io.PrintStream;


public class BancoNovo {

  
    public static void main(String[] args) { 
        
        Conta[] contas = new Conta[10];
        
        for (int i=0; i<contas.length; i++){
            Conta conta = new ContaCorrente();
            conta.depositar(i*100.0);
        
        }
        
        PrintStream saida = System.out;
        saida.println("ola mundo");
        
        Funcionario f1 = new Gerente();
        Gerente gerente = new Gerente();
       
        ControleDeBonificacoes c1 = new ControleDeBonificacoes();
        
        Conta cc1 = new ContaCorrente();
        f1.setSalario(1200);
        c1.registra(f1);
        gerente.setSalario(1200);
        System.out.println(gerente.getBonificacao());
        System.out.println(f1.getBonificacao());
        System.out.println("controle "+c1.getTotalDeBonificacoes());
    }
    
}
