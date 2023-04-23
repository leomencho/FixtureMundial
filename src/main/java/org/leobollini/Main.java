package org.leobollini;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("soy Leo, haciendo el TP final");

        Set<Fixture> tf = new HashSet<>();

        tf.add(new Fixture(1,"Argentina",1, "Arabia", 2));
        tf.add(new Fixture(2, "Polonia", 0, "Mexico", 0));

        System.out.println(tf);

        Set<Fixture> apo = new HashSet<>();
        apo.add(new Fixture(1, "Argentina", 2, "Arabia", 3));
        apo.add(new Fixture(2,"Polonia", 0, "Mexico", 0));

        System.out.println("El apostador dijo: "+ apo);

        Set<Apostador> res = new HashSet<>();
        Set<Apostador> aposte = new HashSet<>();

        for (Fixture resu: tf){
            if (resu.getGolesLocal() > resu.getGolesVisitante())
                res.add(new Apostador(resu.getId(),true,false,false));

            else if (resu.getGolesLocal() < resu.getGolesVisitante())
                res.add(new Apostador(resu.getId(),false,false,true));
            else
                res.add(new Apostador(resu.getId(),false,true,false));
        }

        System.out.println(res);

        for (Fixture resu: apo){
            if (resu.getGolesLocal() > resu.getGolesVisitante())
                aposte.add(new Apostador(resu.getId(),true,false,false));

            else if (resu.getGolesLocal() < resu.getGolesVisitante())
                aposte.add(new Apostador(resu.getId(),false,false,true));
            else
                aposte.add(new Apostador(resu.getId(),false,true,false));
        }

        System.out.println(aposte);

        Jugador Leo= new Jugador();

        for( Apostador resultado: res){
            for (Apostador adivino: aposte){
                if (resultado.getId() == adivino.getId()){
                    if(resultado.getLocal()&&adivino.getLocal() || resultado.getEmpate()&& adivino.getEmpate() || resultado.getVisitante()&& adivino.getVisitante())
                        Leo.setPuntos(1) ;
                }
            }
        }
        System.out.println("El jugador saco "+ Leo.getPuntos()+" puntos ");
        }


    }
