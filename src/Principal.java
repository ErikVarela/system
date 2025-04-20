import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Gerente funcionario1;
        funcionario1 = new Gerente();

        funcionario1.setNome        ("Joao");
        funcionario1.setMatricula   ("12345");
        funcionario1.setSalario     (5000f);         
            
        Caixa funcionario2;
        funcionario2 = new Caixa();
           
        funcionario2.setNome        ("Maria");
        funcionario2.setMatricula   ("456789");
        funcionario2.setSalario     (1000f);

        Medicamento medicamento1;
        medicamento1 = new Medicamento(); 

        System.out.print(funcionario1);
        System.out.print(funcionario2);
        
        //Interface do usuario
        
        Scanner scanner = new Scanner(System.in);
            
        System.out.print("\nOla, seja bem-vindo ao nosso sistema :-D"
            + "\n_________________"
            + "\nMe informe seu seu cargo: "
            + "\nDigite 1 para gerente"
            + "\nDigite 2 para caixa");
            
    int cargo = scanner.nextInt();
                        
        //Gerente
        
    if (cargo == 1){
        System.out.print("\nAqui sao suas permissoes como gerente:"
            + "\n_________________"
            + "\nDigite 1 para adicionar quantidade de medicamentos ao inventario"
            + "\nDigite 2 para adicionar determinado medicamento ao inventario"
            + "\nDigite 3 para excluir o medicamento do inventario"
            + "\nDigite 4 para verificar a quantidade de determinado medicamento"
            + "\nDigite 5 para verificar a descricao de um medicamento");
            
    int funcao = scanner.nextInt();
                        
        if (funcao == 1){
            System.out.println("Digite o ID do medicamento");
        }
        else if (funcao == 2){
            System.out.println("Digite o novo ID do medicamento, nome, valor, laboratorio");
        }
        else if (funcao == 3){
            System.out.println("Digite o ID do medicamento que deseja excluir");
        }
        else if (funcao == 4){
            System.out.println("Digite o ID do medicamento que deseja consultar");
        }
        else if (funcao == 5){
            System.out.println("Digite o ID do medicamento");
        }
        else{
            System.out.println("Codigo invalido");
        }
        
    }else if(cargo == 2){
            System.out.print("\nAqui sao suas permissoes como caixa\n"
                + "_________________\n"
                + "Digite 1 para verificar a descricao de um medicamento\n"
                + "Digite 2 para registrar uma venda\n");
                
        int funcao = scanner.nextInt(); //Caixa

        if (funcao == 1){
            System.out.println("Digite o ID do medicamento");
        }
        else if (funcao == 2){
            System.out.println("Registrando venda...");
        }
    }else {System.out.println("Comando invalido");
        }
    
        scanner.close();
               
    }
}
