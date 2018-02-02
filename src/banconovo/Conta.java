
package banconovo;


public abstract class Conta {
    
    protected double saldo;
    
    
    
    
   
    
    public void depositar(double valor){
            this.saldo += valor;
            
    }
    
    public void sacar(double valor){
       this.saldo -= valor; 
        
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
     public abstract void atualiza(double taxa);
    
  

       
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
