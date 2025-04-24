public class IncomeValidation extends Middleware {
    @Override
    public boolean Check(User client) {
        System.out.println("Verificando Renda");
        double parcela = client.valorFinanciamento / 12;
        if (parcela > client.rendaMensal * 0.25) {
            System.out.println("Parcela maior que 25%");
            return false;
        }
        return next == null || next.Check(client);
    }
}
