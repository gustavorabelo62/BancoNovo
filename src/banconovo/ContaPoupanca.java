
package banconovo;

public class ContaPoupanca extends Conta {

  

    @Override
    public void atualiza(double taxa) {
        this.saldo+= this.saldo*3;
    }
    
}
