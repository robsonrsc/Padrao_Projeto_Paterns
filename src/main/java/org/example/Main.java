package org.example;

import DIO.Singleton.SingletonGOFLazy;
import Strategy.*;

public class Main {
    public static void main(String[] args) {

        //Singleton
        SingletonGOFLazy lazy = SingletonGOFLazy.getInstancia();

        System.out.println(lazy);
        lazy = SingletonGOFLazy.getInstancia();
        System.out.println(lazy);

        //Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();


    }


}