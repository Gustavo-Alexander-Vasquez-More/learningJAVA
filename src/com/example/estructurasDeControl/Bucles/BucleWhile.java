package com.example.estructurasDeControl.Bucles;

public class BucleWhile { //La diferencia con los otros bucles es que este se ejecuta indeterminadas de veces

    public static void main(String[] args) {
        int contador = 1;

        while (contador <= 25){
            if (contador == 25){
                System.out.println("El contador a llegado a su final con el numero "+ contador);
                break;
            }

            System.out.println("Hola mundo");
            System.out.println(contador);
            contador ++;

        }
    }
}
