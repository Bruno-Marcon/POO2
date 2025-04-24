public class MainVerificacao{
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", 5000, 12000, false, true);

        Verificacao inicio = new VerificacaoCredito();
        inicio.setProxima(new VerificacaoRenda())
              .setProxima(new VerificacaoHistorico())
              .setProxima(new VerificacaoGarantia());

        System.out.println("Iniciando processo de liberação de crédito...\n");

        boolean aprovado = inicio.verificar(cliente);

        if (aprovado) {
            System.out.println("\nCrédito aprovado!");
        } else {
            System.out.println("\nCrédito negado.");
        }
    }
}
