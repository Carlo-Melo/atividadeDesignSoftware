import java.util.Scanner;

 class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Usuario.GerenciadorUsuarios gerenciador = new Usuario.GerenciadorUsuarios();
        int i = 0;
        while(i != 1105){
            System.out.println("\n\nDigite o numero da atividade a ser executada:");
            System.out.println("-----Usuario-----");
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Atualizar Usuário");
            System.out.println("3. Remover Usuário");
            System.out.println("4. Listar Usuários");
            System.out.println("\n-----Livros-----");
            System.out.println("5. Cadastrar Livro");
            System.out.println("6. Atualizar Livro");
            System.out.println("7. Remover Livro");
            System.out.println("8. Listar Livros");
            String escolha = input.nextLine();
            switch (escolha) {
                case "1":
                    System.out.println("\nDigite os dados a seguir: ");
                    System.out.println("CPF:");
                    String cpf = input.nextLine();
                    System.out.println("Nome:");
                    String nome = input.nextLine();
                    System.out.println("Endereco:");
                    String endereco = input.nextLine();
                    System.out.println("Telefone:");
                    String telefone = input.nextLine();
                    Usuario novoUsuario = new Usuario(cpf,nome,endereco,telefone);
                    gerenciador.cadastrarUsuario(novoUsuario);
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    gerenciador.listarUsuarios();
                    System.out.println("ENTER para prosseguir");
                    String prosseguir = input.nextLine();
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    break;
                case "8":
                    break;
                default:
                    System.out.println("\n\nCaractere inválido");
                    break;
            }
        }
    }
}
