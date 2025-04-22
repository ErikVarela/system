public class Medicamento {
    private String id;
    private String nome;
    private double valor;
    

    public String getId(){
        return id;
    } 
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    @Override
    public String toString(){
        return "_______" + "\n" 
                + "ID: " + "\n" 
                + id + "\n"
                + "Nome: " + "\n"
                + nome + "\n"
                + "valor: "+ "\n"
                + valor + "\n"
                + "_______";
    }
}
