package com.Open_Bootcamp;

public class Tema4 {

    public static void main(String[] args) {
         var estacion = "Invierno";

        switch (estacion) {
            case "primavera":
                System.out.println("es primavera");
                break;
            case "otoño":
                System.out.println("es otoño");
                break;
            case "verano":
                System.out.println("es verano");
                break;
            default:
                System.out.println("es invierno");
         }
    }
}