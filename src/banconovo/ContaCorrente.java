
package banconovo;


public class ContaCorrente extends Conta implements Tributavel{

    public double calcularTributos(){
    return this.getSaldo() * 0.01;
}
    
    @Override
    public void atualiza(double taxa){
        
        this.saldo += this.saldo * taxa * 2;    
    }
}
