package gohorse;

class ServicoLog {
    public void registrarAuditoria(String acao, String email) {
        System.out.println("LOG: Registrando auditoria. Ação: " + acao + ", Usuário: " + email);
    }
}