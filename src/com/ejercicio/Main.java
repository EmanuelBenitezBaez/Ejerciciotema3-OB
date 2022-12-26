package com.ejercicio;



/*
* En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
Tened en cuenta que los textos pueden venir de un array de tipo String.
* Por ejemplo:
String[] nombres = {"", "", "", ""}
*/


public class Main {
    public static void main(String[] args) {


                String [] nombres = {"Alejandro", "Fernando", "Cinthia", "Gustavo"};
                String [] nombres2 = {"Renata","Danna","Gloria","Andrea"};
                String textoConcat="";
                String texto2Concat="";


                for (String nombre:nombres) {

                    textoConcat=textoConcat.concat(nombre+" ");
                }
                for (String nombre:nombres2) {
                    texto2Concat=texto2Concat.concat(nombre+" ");
                }



                System.out.println("Los concatenados: "+textoConcat + " " + texto2Concat);


            }

        }


