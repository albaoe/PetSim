package com.company.pets;

/**
 * Created with IntelliJ IDEA.
 * User: urkoalber
 * Date: 30/09/13
 * Time: 11:31
 * To change this template use File | Settings | File Templates.
 */
public class Topo extends Mascota {

    public Topo(String nombre, int edad, float peso) {
        super();
        this.alimentacion = Mascota.Alimentacion.omnivoro;
        this.clase = Mascota.Clase.mamifero;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public String programar(String entrada) {

        return "Eztoy codificando ezto: " + entrada;
    }

    public String saludo() {
        String saludo = super.saludo();
        saludo += " y soy un topo.";
        return saludo;
    }
}
