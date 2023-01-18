package DIO.Singleton;

/**
 * Conceitos iniciais de modelo de projeto utilizando Singleton
 */


public class SingletonGOFEager {


    private static SingletonGOFEager instancia = new SingletonGOFEager();

    private SingletonGOFEager(){
        super();
    }

    public static SingletonGOFEager getInstancia() {

        if (instancia==null){
            instancia = new SingletonGOFEager();
        }
        return instancia;
    }
}
