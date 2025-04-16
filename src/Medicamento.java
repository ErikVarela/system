public class Medicamento {
    private String nome;
    private String laboratorio;
    private Double valor;

     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    @Override
    public String toString(){
        return "\nNome: " + nome + "\nLaboratorio: " + laboratorio + "\nValor: R$" + valor;
    }
}
