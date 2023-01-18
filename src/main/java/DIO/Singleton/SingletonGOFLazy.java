package DIO.Singleton;

/**
 * Conceitos iniciais de modelo de projeto utilizando Singleton
 */


public class SingletonGOFLazy {


    private static SingletonGOFLazy instancia;

    private SingletonGOFLazy (){
        super();
    }

    public static SingletonGOFLazy getInstancia() {

        if (instancia==null){
            instancia = new SingletonGOFLazy();
        }
        return instancia;
    }
}
