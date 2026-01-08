/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
import java.util.Scanner;
import java.util.Locale;

public class Problema2 {

    public static void main(String[] args) { inicial();
    }

    public static void inicial() {
        String[] viviendas = new String[10];
        double[][] consumos = new double[10][12];
        double[] total = new double[10];

        viviendas = obtenerNombres();
        consumos = obtenerConsumos();
        total = obtenerTotales(consumos);

        for (int i = 0; i < 10; i++) {
            System.out.printf("El consumo de la vivienda: %s es de: %.2f\n", viviendas[i], total[i]);
        }
    }

    public static String[] obtenerNombres() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String[] viviendas = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el nombre de la vivienda " + (i + 1));
            viviendas[i] = entrada.nextLine();
        }
        return viviendas;
    }

    public static double[][] obtenerConsumos() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double[][] consumos = new double[10][12];
        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 12; c++) {
                System.out.printf("Vivienda %d - Mes %d. Ingrese el gasto: ", f + 1, c + 1);
                consumos[f][c] = entrada.nextDouble();
            }
        }
        return consumos;
    }

    public static double[] obtenerTotales(double[][] consumos) {
        double[] totales = new double[10];
        for (int f = 0; f < 10; f++) {
            double valor = 0;
            for (int c = 0; c < 12; c++) {
                valor = valor + consumos[f][c];
            }
            totales[f] = valor;
        }
        return totales;
    }
} 
