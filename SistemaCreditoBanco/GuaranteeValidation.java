public class GuaranteeValidation extends Middleware {
    @Override
    public boolean Check(User client) {
        System.out.println("Verificando as Garantias");
        if (!client.possuiGarantia) {
            System.out.println("Cliente não possui garantia.");
            return false;
        }
        return next == null || next.Check(client);
    }
}
