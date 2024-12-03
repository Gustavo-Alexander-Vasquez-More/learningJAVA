package com.example;

public class TiposDeDatos {
    public static void main(String[] args) {
        //1-Numéricos

        // 1.1-Enteros
        byte variable1= 127; //Solo permite almacenar números enteros en el rango de 8 bits (Entre -127 y 127)
        short variable2= 10;
        int variable3= 30;  //Sí permite almacenar números grandes
        long variable4= 50; //Sí permite almacenar números grandes

        //1.2-Decimales

        float variable5= 5.5f; //La "f" es un sufijo que indica que es un float. Float tiene menor capacidad que double.
        double variable6= 6.6d; //La "d" es el sufijo. Al tener mas capacidad es el que se usa más.

        //booleanos

        boolean variable7= false;
        boolean variable8= true;

        //texto

        char variable9= 'a'; //Para indentificar un solo carácter.
        String variable10= "Lorem ipsum Dolor"; //La más usada porque puedes poner los caracteres que quieras.

    }
}
