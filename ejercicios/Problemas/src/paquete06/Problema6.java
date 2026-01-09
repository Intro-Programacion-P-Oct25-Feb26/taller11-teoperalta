/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class Problema6 {
     public static void main(String[] args) {
         int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
         double media;
         double desviacion;
         media = obtenerMedia(informacion);
         desviacion = calcularDesviacion(informacion, media);
         System.out.printf("La media es: %.2f\nLa desviación es: %.2f\n", media,
                 desviacion);
     }
      public static double obtenerMedia(int[] datos) {
         double media;
         double suma = 0;
         for (int i = 0; i<datos.length;i++){
             suma= suma + datos[i];
         }
         media = suma / datos.length;
         return media;
     }
     
     public static double calcularDesviacion(int[] arreglo, double media) {
        double sumaVariaciones = 0;
        for (int i = 0; i < arreglo.length; i++) {
        sumaVariaciones += Math.pow(arreglo[i] - media, 2);
    }
    return Math.sqrt(sumaVariaciones / arreglo.length);
}
}
