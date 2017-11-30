
package banconovo;


public class BancoNovo {

  
    public static void main(String[] args) { 
        Funcionario f1 = new Gerente();
        Gerente gerente = new Gerente();
        
        
        f1.setSalario(1200);
        gerente.setSalario(1200);
        System.out.println(gerente.getBonificacao());
        System.out.println(f1.getBonificacao());
    }
    
}
