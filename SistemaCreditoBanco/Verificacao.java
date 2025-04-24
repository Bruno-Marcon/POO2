public abstract class Verificacao {
    protected Verificacao proxima;

    public Verificacao setProxima(Verificacao proxima) {
        this.proxima = proxima;
        return proxima;
    }

    public abstract boolean verificar(Cliente cliente);
}
