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

            Medicamentos medicamentos1;
            medicamentos1 = new Medicamento();
            
                          
             
            System.out.print(funcionario1);
            System.out.print(funcionario2);
        }

    }
