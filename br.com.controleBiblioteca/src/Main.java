import java.util.Scanner;

 class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i = 0;
        while(i != 1105){
            System.out.println("\n\nDigite o numero da atividade a ser executada:\n\n");
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Atualizar Usuário");
            System.out.println("3. Remover Usuário");
            System.out.println("4. Listar Usuários");
            String escolha = input.nextLine();
            switch (escolha) {
                case "1":
                    int cpf = input.nextInt();
                    String nome = input.nextLine();
                    String endereco = input.nextLine();
                    String telefone = input.nextLine();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    break;
                default:
                    System.out.println("\n\nNúmero inválido");
                    break;
            }
        }
    }
}