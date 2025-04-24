public class VerificacaoGarantia extends Verificacao {
    @Override
    public boolean verificar(Cliente cliente) {
        System.out.println("Verificando garantias...");
        if (!cliente.possuiGarantia) {
            System.out.println("Cliente não possui garantia.");
            return false;
        }
        return proxima == null || proxima.verificar(cliente);
    }
}
