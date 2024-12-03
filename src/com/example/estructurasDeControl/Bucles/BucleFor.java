package com.example.estructurasDeControl.Bucles;

public class BucleFor {
    public static void main(String[] args) {
        for(int i = 0; i <= 9; i++){ //La variable de iteración empieza en 0 e irá incrementando hasta llegar a 9
            //System.out.println(i);
        }
        String[] diasSemana={"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        for (int i=0; i < diasSemana.length ; i++){
            System.out.println(diasSemana[i]);
        }
    }
}
