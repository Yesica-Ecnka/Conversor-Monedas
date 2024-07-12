package com.aluracursos.conversordemonedas.calcularapi;

import java.util.Scanner;

public class CalcularMoneda {
    private double conversionMoneda;
    private double cantidad_a_convertir;

    public double getConversionMoneda(){
        return  conversionMoneda;
    }
    Scanner lecturaDato = new Scanner(System.in);

    public void calcularDolares(double valorMoneda, String abreviacion){
        cantidad_a_convertir = ingreso_cantidad_a_convertir();
        conversionMoneda = valorMoneda * cantidad_a_convertir;
        System.out.println("El valor de " +  cantidad_a_convertir+ "(USD), corresponde a el valor de " + conversionMoneda+
                "("+abreviacion+")");
    }
    public void calcularMonedas(double valorMoneda, String abreviacion){
        double cantidad_a_convertir = ingreso_cantidad_a_convertir();

        conversionMoneda = cantidad_a_convertir/valorMoneda;
        System.out.println("El valor de " +cantidad_a_convertir+ "("+abreviacion+"), corresponde a el valor de "+
                conversionMoneda+"(USD) \n");
    }

    public double ingreso_cantidad_a_convertir(){
        try {
            System.out.println("Ingrese el valor que desea convertir, por favor: ");
            cantidad_a_convertir = Double.valueOf(lecturaDato.next());
        }catch (NumberFormatException e){
            System.out.println("Surgió un error :( "+ e.getMessage());
        }catch (Exception e){
            System.out.println("Surgió un error :( "+e.getMessage());
        }
        return cantidad_a_convertir;
    }
}
