package DIO.Singleton.SubSistema;

public class Base1 {


    private Base1() {
        super();
    }

    public static void gravarCliente (String nome, String Cep, String estado, String cidade ) {

        System.out.println("Cliente Salvo no sistema");

    }
}
