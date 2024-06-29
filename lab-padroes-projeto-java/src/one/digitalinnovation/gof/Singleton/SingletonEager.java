package one.digitalinnovation.gof.Singleton;

/*
 * Sigleton "apressado",
 * 
 * @author AllanVargens
 */
public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
