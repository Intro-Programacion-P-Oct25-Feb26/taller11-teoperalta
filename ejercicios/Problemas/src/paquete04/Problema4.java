/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        String cedula;
        int opcion;
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su cédula");
        cedula = entrada.nextLine();
        System.out.println("Ingrese lo que desea calcular: 1= Planilla de luz,"
                + "2= Predio");
        opcion = entrada.nextInt();
        if (opcion==1){
            calcularValorLuz(nombre,cedula);
        }else{
            if (opcion==2){
                calcularPredio(nombre,cedula);
            }else{
                System.out.println("Valor no válido");
            }
        }
    }
    public static void calcularValorLuz(String a, String b){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double valorKilowatio;
        double kilowatiosMes;
        double valor;
        String mensaje;
        System.out.println("Ingrese el valor del Kilowatio");
        valorKilowatio = entrada.nextDouble();
        System.out.println("Ingrese el número de Kilowatios del mes");
        kilowatiosMes = entrada.nextDouble();
        valor = valorKilowatio * kilowatiosMes;
        mensaje = String.format("Cliente %s con cédula %s debe cancelar el "
                + "valor de $%.2f\n", a, b, valor);
        System.out.printf(mensaje);
    }
      public static void calcularPredio(String a, String b){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double valorInmueble;
        double valor;
        String mensaje;
        System.out.println("Ingrese el valor del Inmueble");
        valorInmueble = entrada.nextDouble();
        valor = valorInmueble * 0.02;
        mensaje = String.format("Cliente %s con cédula %s tiene un bien inmueble"
                + "valorado en $%.2f y tiene que pagar predio de $%.2f\n", a, b,
                valorInmueble, valor);
        System.out.printf(mensaje);
    }
}
