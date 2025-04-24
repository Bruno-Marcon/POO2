public class Cliente {
    String nome;
    double rendaMensal;
    double valorFinanciamento;
    boolean possuiRestricao;
    boolean possuiGarantia;

    public Cliente(String nome, double rendaMensal, double valorFinanciamento, boolean possuiRestricao, boolean possuiGarantia) {
        this.nome = nome;
        this.rendaMensal = rendaMensal;
        this.valorFinanciamento = valorFinanciamento;
        this.possuiRestricao = possuiRestricao;
        this.possuiGarantia = possuiGarantia;
    }
}
