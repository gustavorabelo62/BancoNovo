
package banconovo;

abstract class Funcionario {
    String nome;
    String cpf;
    Double salario;
    
    abstract double getBonificacao();
    
    @Override
    public String toString(){
        return "[titulo="+ nome +", numero ="+ cpf + ", agencia="+ salario+ "]";
    
    }
 

   public String getNome(){
       return nome;
   }

    public void setNome(String nome){
        this.nome = nome; 
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario ){
        this.salario = salario;
    }

    
}
