public class HistoryValidation extends Middleware {
    @Override
    public boolean Check(User client) {
        System.out.println("Verificando histórico de crédito...");
        if (client.possuiRestricao) {
            System.out.println("Cliente possui restrição no SPC/SERASA.");
            return false;
        }
        return next == null || next.Check(client);
    }
}
