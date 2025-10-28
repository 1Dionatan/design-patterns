package gohorse;

public class Cliente {

    public static void main(String[] args) {
        ServicoUsuario servico = new ServicoUsuario();
        servico.cadastrarUsuario("aluno@faculdade.com", "senha123");
    }

}