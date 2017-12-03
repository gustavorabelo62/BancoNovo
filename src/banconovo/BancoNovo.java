
package banconovo;


public class BancoNovo {

  
    public static void main(String[] args) { 
        Funcionario f1 = new Gerente();
        Gerente gerente = new Gerente();
        Funcionario f2 = new Funcionario();
        ControleDeBonificacoes c1 = new ControleDeBonificacoes();
        
        f2.setSalario(2000);
        c1.registra(f2);
        f1.setSalario(1200);
        c1.registra(f1);
        gerente.setSalario(1200);
        System.out.println(gerente.getBonificacao());
        System.out.println(f1.getBonificacao());
        System.out.println("controle "+c1.getTotalDeBonificacoes());
    }
    
}
