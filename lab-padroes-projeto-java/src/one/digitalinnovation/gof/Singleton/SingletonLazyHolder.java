package one.digitalinnovation.gof.Singleton;

/*
 * Sigleton "lazyHolder",
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>,
 * @author AllanVargens
 */
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instance;
    }
}
