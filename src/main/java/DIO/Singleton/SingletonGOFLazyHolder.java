package DIO.Singleton;

import static DIO.Singleton.SingletonGOFLazyHolder.InstanceHolder.instancia;

/**
 * Conceitos iniciais de modelo de projeto utilizando Singleton
 */


public class SingletonGOFLazyHolder {


    protected static class InstanceHolder {
    public static SingletonGOFLazyHolder instancia = new SingletonGOFLazyHolder();
    }
    private SingletonGOFLazyHolder(){
        super();
    }

    public static SingletonGOFLazyHolder getInstancia() {

        if (instancia==null){
            instancia = new SingletonGOFLazyHolder();
        }
        return instancia;
    }
}
