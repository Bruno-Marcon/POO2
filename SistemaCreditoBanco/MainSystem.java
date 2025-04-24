public class MainSystem{
    public static void main(String[] args) {
        User client = new User("João", 5000, 12000, false, true);

        Middleware inicio = new CreditValidation();
        inicio.setNext(new IncomeValidation())
              .setNext(new HistoryValidation())
              .setNext(new GuaranteeValidation());

        System.out.println("Iniciando Validações\n");

        boolean aprovado = inicio.Check(client);

        if (aprovado) {
            System.out.println("\nCrédito aprovado!");
        } else {
            System.out.println("\nCrédito negado.");
        }
    }
}
