public class VerificacaoHistorico extends Verificacao {
    @Override
    public boolean verificar(Cliente cliente) {
        System.out.println("Verificando histórico de crédito...");
        if (cliente.possuiRestricao) {
            System.out.println("Cliente possui restrição no SPC/SERASA.");
            return false;
        }
        return proxima == null || proxima.verificar(cliente);
    }
}
