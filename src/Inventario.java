import java.util.HashMap;

public class Inventario {
    private HashMap<String, Medicamento> inventario = new HashMap<>();
        
    public void adicionarMedicamento(Medicamento medicamento) {
        inventario.put(medicamento.getId(), medicamento);
    }

    // Método para consultar o medicamento pelo ID
    public Medicamento getMedicamento(String id) {
        return inventario.get(id);
    }
    
    // Método para exibir a descrição do medicamento
    public void consultarDescricaoMedicamento(String id){
        Medicamento medicamento = getMedicamento(id);
        if(medicamento != null){
            System.out.println(medicamento);
        } else {
            System.out.println("Medicamento não encontrado.");
        }
    }
}