public class CreditValidation extends Middleware {
    @Override
    public boolean Check(User client) {
        System.out.println("Verificando se possui credito");
        boolean disponivel = true;
        if (!disponivel) {
            System.out.println("Crédito indisponível.");
            return false;
        }
        return next == null || next.Check(client);
    }
}
