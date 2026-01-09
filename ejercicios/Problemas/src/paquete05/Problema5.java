/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

/**
 *
 * @author reroes
 */
public class Problema5 {
     public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] informacion2 = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int [][] valorFinal;
        String mensaje = "";
        valorFinal = sumaArreglos(informacion, informacion2);
        for (int f = 0; f<informacion.length;f++){
            mensaje = String.format("%s\n",mensaje);
             for (int c = 0; c<informacion.length;c++){
                 mensaje = String.format("%s%d\t", mensaje, valorFinal[f][c]);
             }
        }
         System.out.printf(mensaje);
     }
     public static int [][]sumaArreglos (int [][]arreglo1, int [][]arreglo2){
        int[][] totales = new int[3][3];
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                int valor = 0;
                valor = arreglo1[f][c] + arreglo2[f][c];
                totales[f][c] = valor;
            }
     
        }
        return totales;
     }
}
