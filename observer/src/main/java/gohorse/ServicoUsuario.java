package gohorse;

public class ServicoUsuario {

    private final ServicoEmail emailService = new ServicoEmail();

    private final ServicoLog logService = new ServicoLog();

    private final ServicoMetricas metricasService = new ServicoMetricas();

    public void cadastrarUsuario(String email, String senha) {
        System.out.println("Salvando usuário " + email + " no banco de dados...");

        try {
            emailService.enviarEmailBoasVindas(email);
        } catch (Exception e) {
            System.out.println("Falha ao enviar e-mail.");
        }

        try {
            logService.registrarAuditoria("CADASTRO", email);
        } catch (Exception e) {
            System.out.println("Falha ao registrar log.");
        }

        try {
            metricasService.incrementarNovosUsuarios();
        } catch (Exception e) {
            System.out.println("Falha ao atualizar métricas.");
        }

        System.out.println("Usuário " + email + " cadastrado com sucesso.");
    }
}