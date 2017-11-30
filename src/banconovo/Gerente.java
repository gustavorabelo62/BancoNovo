
package banconovo;


public class Gerente extends Funcionario {
    
    protected int senha;
    protected int numeroDeFuncionariosGerenciado;
    
    public int getSenha(){
        return senha;
    }
    //com o uso do super ele vao procura o getbonificacao e quando acha vai executar com a muaça logo mesmo que mude não sera preciso fazer alteraçoes 
    
    @Override
    public double getBonificacao(){
        return super.getBonificacao() + 1000;
    }
    public void setSenha(int senha){
        this.senha = senha;
    }
    
    public int setNumeroDeFuncionariosGerenciado(){
        return numeroDeFuncionariosGerenciado;
    }
    
    public void getNumeroDeFuncionariosGerenciado(int numeroDeFuncionariosGerenciado){
        this.numeroDeFuncionariosGerenciado = numeroDeFuncionariosGerenciado;
    } 
    
    public boolean autentica(int senha){
        if (this.senha == senha){
        System.out.println("Acesso Permitido");
        return true;
        }else{
        System.out.println("Acesso negado!!!");
        return false;
        }
        
    }
    
}
