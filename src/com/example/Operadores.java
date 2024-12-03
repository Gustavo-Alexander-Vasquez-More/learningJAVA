package com.example;

public class Operadores {
    public static void main(String[] args) {
        //Operadores aritméticos
        int numero1= 10;
        int numero2= 20;
        int resultado_suma= numero1 + numero2;
        int resultado_resta=numero2 - numero1;
        System.out.println("Resultado de la suma:"+" "+ resultado_suma);
        System.out.println("Resultado de la resta:"+" "+ resultado_resta);
        //Operadores de comparación
        int numero3= 15;
        int numero4= 4;
        System.out.println(numero3 > numero4); // Esto arrojará un booleano
        //Operadores lógicos ( && / || )
        int numero5=2;
        System.out.println(numero3 > numero4 && numero4 > numero5);
    }
}
