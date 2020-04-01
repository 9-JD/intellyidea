package com.company;

import java.util.Scanner;

public class codificado {

    public static void main(String[] args) {
        Scanner tc =new Scanner (System.in);
        int b=0;

        String descodificado="aeist";

        String codificado="43157";

        String pa="";
        System.out.println("inserte la frase");
        String palabras=tc.nextLine();


        System.out.println("procesando tarea");


        for (int i=0; i<palabras.length(); ++i ){
            char a =palabras.charAt(i);


            if (Character.isLetter(a)){

                ++b;


            }
        }


        if (b==palabras.length()){

            System.out.println("convirtiendo");

            for (int i =0; i<palabras.length(); ++i){

                char t = palabras.charAt(i);


                int pos =descodificado.indexOf(t);

                if (pos>=0){

                    pa+=codificado.charAt(pos);



                }else {

                    pa+=t;

                }







            }

            System.out.println(pa);

        }else {

           for (int i=0; i<palabras.length(); i++) {

               char a =palabras.charAt(i);

               int pos=codificado.indexOf(a);

               if (pos>=0){

                   pa+=descodificado.charAt(pos);


               }

pa+=a;




           }




            System.out.println(pa);


        }






















    }


}