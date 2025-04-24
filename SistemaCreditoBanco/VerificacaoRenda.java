public class VerificacaoRenda extends Verificacao {
    @Override
    public boolean verificar(Cliente cliente) {
        System.out.println("Verificando compatibilidade da renda...");
        double parcela = cliente.valorFinanciamento / 12;
        if (parcela > cliente.rendaMensal * 0.25) {
            System.out.println("Parcela superior a 25% da renda.");
            return false;
        }
        return proxima == null || proxima.verificar(cliente);
    }
}
