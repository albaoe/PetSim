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
    enum Comida{ hamburguesa(0.4f), ensalada(0.02f), pizza(0.3f);
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

    public String comer(Comida comida) {
        this.peso += comida.peso;
        String respuesta = "";
        if (comida == Mascota.Comida.ensalada){
            respuesta = "Puaj, menuda basura de " + comida + ", dame comida de verdad. \n";
        } else {
            respuesta = "Me he zampado una " + comida + ". Estaba muy rica, jeje \n";
        }
        return respuesta;
    }

    public String pasear(float tiempo) {
        this.peso -= 0.02f * tiempo;
        String respuesta = "Ohh! Que maravilla. He paseado durante " + tiempo + " horas.\n";
        return respuesta;
    }

    public String saludo() {
        return "Hola, mi nombre es " + this.nombre + ", peso " + this.peso + "kg, tengo " + this.edad + " tacos";
    }
}
