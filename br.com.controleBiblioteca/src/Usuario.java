import java.util.ArrayList;

public class Usuario {

    private String cpf;
    private String nome;
    private String endereco;
    private String telefone;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }



    public Usuario(String cpf, String endereco, String telefone, String nome) {
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.nome = nome;
    }

    public void exibirUsuario(){
        System.out.println("CPF: "+ cpf);
        System.out.println("Nome: "+ nome);
        System.out.println("Telefone: "+ telefone);
        System.out.println("Endereço: "+ endereco);

    }

    public static class GerenciadorUsuarios {

        private ArrayList<Usuario> usuarios;

        public GerenciadorUsuarios(){
            this.usuarios = new ArrayList<>();
        }

        public void cadastrarUsuario(Usuario usuario){
            usuarios.add(usuario);
            System.out.println("Usuario Cadastrado com sucesso.");
        }

        public void atulizarUsuario(String cpf, String nome, String endereco, String telefone) {
            for(Usuario usuario : usuarios) {
                if(usuario.getCpf() == cpf){
                    usuario.setNome(nome);
                    usuario.setEndereco(endereco);
                    usuario.setTelefone(telefone);
                    System.out.println("usuario com o CPF " + cpf + " atulizado.");
                    return;
                }
            }
            System.out.println("Usuario com CPF " + cpf + " nao encontrado");
        }

        public void removerUsuario(String cpf){
            for (Usuario usuario : usuarios){
                if(usuario.getCpf()==cpf){
                    usuarios.remove(usuario);
                    System.out.println("Usuario com cpf " + cpf + "removido.");
                    return;
                }
            }
            System.out.println("Usuario com cpf " + cpf + " nao encontrado");
        }

        public void listarUsuarios() {
            if (usuarios.isEmpty()){
                System.out.println("Nenhum usuario cadastrado");
            } else {
                for (Usuario usuario : usuarios){
                    usuario.exibirUsuario();
                    System.out.println("--------------------");
                }
            }
        }
    }
}

