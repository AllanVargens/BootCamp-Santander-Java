package one.digitalinnovation.gof.Singleton;

/**
 * Sigleton "pregioçoso",
 * 
 * @author AllanVargens
 */

public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy() {
        // Privado para evitar instancias fora da classe
        super();
    }

    public static SingletonLazy getInstance() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
