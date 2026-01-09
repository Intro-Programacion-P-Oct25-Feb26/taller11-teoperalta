/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {
     public static void main(String[] args) {
         String []datos;
    datos = obtenerCadenas ();
    valores(datos);
}
    public static String []obtenerCadenas (){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int n;
            System.out.println("INGRESE LA CANTIDAD DE ELEMENTOS");
            n = entrada.nextInt();
            entrada.nextLine();
            String[] arreglo= new String [n];
            for (int i =0; i<arreglo.length;i++){   
                System.out.println("Ingrese el elemento");
                String elemento = "";
                elemento = entrada.nextLine();
                arreglo[i] = elemento;
            }
            return arreglo;
    }  
    public static void valores (String [] a){
        for (int i = 0; i<a.length;i++){
            if ((a[i].length()==4)||(a[i].length()==5)){
                System.out.printf("%s\n",a[i]);
            }
        }
    }
}
