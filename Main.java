package bosch;
import java.util.Random;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int alunos = random.nextInt(18);
        ArrayList<String> listaDeAlunos = new ArrayList<>();
        listaDeAlunos.add("Caio");
        listaDeAlunos.add("Esther");
        listaDeAlunos.add("D.castan");
        listaDeAlunos.add("D.jacober");
        listaDeAlunos.add("nicolle");
        listaDeAlunos.add("Angelo");
        listaDeAlunos.add("Henrique");
        listaDeAlunos.add("Fiuza");
        listaDeAlunos.add("Radaeli");
        listaDeAlunos.add("Vieira");
        listaDeAlunos.add("Kadu");
        listaDeAlunos.add("Felipe");
        listaDeAlunos.add("Allana");
        listaDeAlunos.add("Duda");
        listaDeAlunos.add("Lucas");
        listaDeAlunos.add("julia");
        listaDeAlunos.add("Bona");
        listaDeAlunos.add("Laura");

        if (listaDeAlunos.size() %2 == 0 ){
            System.out.println("par");
            for (int i = 0; i < 9; i++) {
                int al = random.nextInt(listaDeAlunos.size());
                listaDeAlunos.remove(al);
            }
            System.out.println(listaDeAlunos);

        }

//        for (int i = 0; i < 9; i++) {
//            int al = random.nextInt(listaDeAlunos.size());
//            listaDeAlunos.remove(al);
//        }
//        System.out.println(listaDeAlunos);









        }
    }

