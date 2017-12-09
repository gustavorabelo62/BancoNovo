
package banconovo;

public class Cliete implements Autenticavel {

    @Override
    public boolean autentica(int senha) {
         
        if(senha == senha){
        System.out.println("Acesso Permitido");
        return true;
        }else{
        System.out.println("Acesso negado!!!");
        return false;
        }
        
    }
    
}
