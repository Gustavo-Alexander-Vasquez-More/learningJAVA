package com.example.Funciones;

public class FuncionesJava {
    public static void main(String[] args) {
        int num1=1;
        int num2=4;

        //FUNC CON PARÁMETRO SIN RETORNO
        conParametrosSinRetorno("sin retorno");

        //FUNC CON PARÁMETRO CON RETORNO
        System.out.println(conParametros(num1, num2));

        //FUNC CON RETORNO
        System.out.println(conRetorno());

        //FUNC. SIN RETORNO
        sinRetorno();
    }
    //void indica que no retorna nada
    static void sinRetorno(){
        System.out.println("Hola Joseph");
    }
    static int conParametros(int a , int b){
        return a + b;
    }
    static String conRetorno(){
        return "PHP oe, oe, oe !!";
    }
    static void conParametrosSinRetorno(String str){
        System.out.println("Func con parámetro y " + str);
    }
}
