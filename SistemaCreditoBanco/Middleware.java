public abstract class Middleware {
    protected Middleware next;

    public Middleware setNext(Middleware next) {
        this.next = next;
        return next;
    }

    public abstract boolean Check(User client);
}
