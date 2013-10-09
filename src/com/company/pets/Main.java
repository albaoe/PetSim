package com.company.pets;


import java.util.Scanner;

public class Main {


    public static void MenuPrincipal(){

        int read = -1;
        Scanner teclado = new Scanner(System.in);

        while(read!=0){
            System.out.println("   Bienvenido a Pet Sim   ");
            System.out.println("     Escoja una opcion    ");
            System.out.println("--------------------------");
            System.out.println("1) Crear mascota\n");
            System.out.println("0) Salir\n");

            //////////////////////FALTA////////////////////////

            try{
                read = teclado.nextInt();

                switch(read){
                    case 1:
                        MenuCreacion();
                        break;
                }
            }catch(Exception e){
                System.out.println("Introduce un numero.\n");
            }
        }
    }


    public static void MenuCreacion(){

        int read = -1;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escoja una opcion         ");
        System.out.println("---------------------------");
        System.out.println("1) Crear topo");
        System.out.println("");
        System.out.println("0) Menu principal\n");

        try{
            read = teclado.nextInt();

            switch (read){
                case 1:
                    Topo topillo = MenuCrearTopo();
                    System.out.println(topillo.saludo());
                    UsarMascota(topillo);
                    break;

            }
        }catch(Exception e){
            System.out.println("Introduce un numero.\n");
        }

    }


    public static Topo MenuCrearTopo(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el nombre de tu mascota:");
        String nombre = teclado.next();

        System.out.println("Introduce el peso de tu mascota:");
        //////////////////////FALTA////////////////////////
        float peso = teclado.nextFloat();

        System.out.println("Introduce la edad de tu mascota:");
        //////////////////////FALTA////////////////////////
        int edad = teclado.nextInt();

        return new Topo(nombre,edad,peso);
    }


    public static Mascota.Comida SeleccionarComida(){

        String read = null;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escoja una comida        ");
        System.out.println("-------------------------");
        System.out.println("1) Ensalada");
        System.out.println("2) Pizza");
        System.out.println("3) Hamburguesa");
        System.out.println("\n");

        read = teclado.next();
        Mascota.Comida comida = null;
        try{
        switch(Integer.parseInt(read)){
            case 1:
                comida = Mascota.Comida.ensalada;
                break;
            case 2:
                comida = Mascota.Comida.pizza;
                break;
            case 3:
                comida = Mascota.Comida.hamburguesa;
                break;
            default:
                System.out.println("No te inventes opciones. Te vas a comer una pizza, por topo.\n ");
                comida = Mascota.Comida.pizza;
                break;
        }
        }catch(NumberFormatException e){
            System.out.println("Se requiere un número. Te vas a comer una pizza, por topo.\n ");
            return Mascota.Comida.pizza;
        }

        return comida;
    }


    public static void UsarMascota(Topo mascota){
        int read = -1;

        Scanner teclado = new Scanner(System.in);

        while(read!=0){
            System.out.println("Escoja una opcion para "+mascota.nombre);
            System.out.println("----------------------------------------");
            System.out.println("1) Alimentar");
            System.out.println("2) Pasear");
            System.out.println("3) Saludar");
            System.out.println("4) Programar");
            System.out.println("");
            System.out.println("0) Salir\n");

            try{
                read = teclado.nextInt();

                switch(read){
                    case 1:
                        Mascota.Comida comida = SeleccionarComida();
                        String respuesta = mascota.comer(comida);
                        System.out.println(mascota.saludo());
                        System.out.println(respuesta);
                        System.out.println(mascota.saludo());
                        break;
                    case 2:
                        System.out.println(mascota.saludo());
                        System.out.println(mascota.pasear(2.4f));
                        System.out.println(mascota.saludo());
                        break;
                    case 3:
                        System.out.println(mascota.saludo());
                        break;
                    case 4:
                        System.out.println(mascota.programar("class Tutu() {}\n"));
                        break;
                    default:
                        System.out.println("No he hecho nada, torpe :(\n");
                        break;

                }
            }catch(Exception e){
                System.out.println("Introduce un numero.\n");
            }
        }
    }


    public static void main(String[] args) {
	// write your code here
        MenuPrincipal();
    }
}
