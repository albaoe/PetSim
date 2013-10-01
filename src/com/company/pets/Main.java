package com.company.pets;

public class Main {

    public static void main(String[] args) {
	// write your code here
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
