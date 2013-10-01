package com.company.pets;

/**
 * Created with IntelliJ IDEA.
 * User: urkoalber
 * Date: 30/09/13
 * Time: 10:56
 * To change this template use File | Settings | File Templates.
 */
public class Mascota {
    enum Alimentacion{ carnivoro, herbivoro, omnivoro }
    enum Clase{ pez, anfibio, reptil, ave, mamifero }
    enum Comida{ hamburguesa(0.4f), ensalada(0.02f), pizza(0.3f), pescado(0.1f), carne(0.2f);
        protected float peso;
        private Comida(float peso){ this.peso = peso; }
    }

    protected String nombre;
    protected int edad;
    protected float peso;
    protected Clase clase;
    protected Alimentacion alimentacion;

    public Mascota() {}

    public Mascota(String nombre, int edad, float peso, Alimentacion alimentacion, Clase clase) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.alimentacion = alimentacion;
        this.clase = clase;
    }

    public boolean comer(Comida comida) {
        this.peso += comida.peso;
        return true;
    }

    public boolean pasear(float tiempo) {
        this.peso -= 0.02f * tiempo;
        return true;
    }

    public String saludo() {
        return "Hola, mi nombre es " + this.nombre;
    }
}
