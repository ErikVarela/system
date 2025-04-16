public abstract class Funcionario {
    private String nome;
    private String matricula;
    private Float  salario;
    
    public void getNome(){
          
      }  
    
    public void setNome(String nome){
          this.nome = nome;
      }
    
    public void getMatricula(){
          
      }  
    
    public void setMatricula(String matricula){
          this.matricula = matricula;
      }
    
    public void getSalario(){
          
      }  
    
    public void setSalario(Float salario){
          this.salario = salario;
      }
    
    @Override
    public String toString(){
        return "\nNome: " + nome + "\nMatricula: " + matricula + "\nSalario: R$" + salario;
    }
}
    