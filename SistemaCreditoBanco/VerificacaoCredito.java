public class VerificacaoCredito extends Verificacao {
    @Override
    public boolean verificar(Cliente cliente) {
        System.out.println("Verificando disponibilidade de crédito...");
        boolean disponivel = true;
        if (!disponivel) {
            System.out.println("Crédito indisponível.");
            return false;
        }
        return proxima == null || proxima.verificar(cliente);
    }
}
