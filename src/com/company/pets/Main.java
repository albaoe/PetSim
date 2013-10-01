package com.company.pets;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        System.out.println("****************************");
        System.out.println("*   Bienvenido a Pet Sim   *");
        System.out.println("*     Escoja una opcion    *");
        System.out.println("****************************");
        System.out.println("\n");
        System.out.println("1) Crear mascota");
        System.out.println("2) Jugar con mascota ya creada");
        System.out.println("0) Salir");
        Scanner teclado = new Scanner(System.in);
        int read = teclado.nextInt();
        switch(read){
            case 1:
                System.out.println("**************************************************");
                System.out.println("*   Bienvenido al menu de creacion de mascotas   *");
                System.out.println("*               Escoja una opcion                *");
                System.out.println("**************************************************");
                System.out.println("\n");
                System.out.println("1) Crear topo");
                System.out.println("0) Salir");
                break;
            case 2:
                break;
            case 0:
                break;
        }
        Topo topo1 = new Topo("Freud", 2, 5.6f);
        System.out.println(topo1.saludo());
        System.out.println(topo1.programar("class Tutu() {}"));
        System.out.println("Mi peso es: " + topo1.peso + " kg.");
        String respuesta = "";
        Mascota.Comida comida = Mascota.Comida.hamburguesa;
        if (topo1.comer(comida)){
            respuesta = "Me he zampado una " + comida + ".";
        }
        System.out.println(respuesta);
        System.out.println("Mi peso ahora es: " + topo1.peso + " kg.");
        float tiempoPaseo = 2.5f;
        if (topo1.pasear(tiempoPaseo)){
            respuesta = "He paseado durante " + tiempoPaseo + " horas.";
        }
        System.out.println(respuesta);
        System.out.println("Mi peso ahora es: " + topo1.peso + " kg.");

    }
}
