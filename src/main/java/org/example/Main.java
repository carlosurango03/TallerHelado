package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


    Scanner leerDato = new  Scanner(System.in);

    short precioHeladoSimple = 3500;
    short precioHeladoDoble = 5000;
    short precioHeladoEspecial = 7800;
    short cantidadVendiaTipoHelado =12;
    String heladosTussisabes;
    String pesoPluma;
    String eladioCarrion;
    String badBunny;
    long   totalVentaTipoHelado;
    long totalVentasDia;
    String cedulaCliente;
    String nombreCliente;
    String heladoQueLlevara;



    //pedimos los datos//

    System.out.println("¡Hola, bienvenido a Tussisabes!");

    nombreCliente=leerDato.nextLine();
    System.out.println("Cual es tu nombre?.");

    cedulaCliente=leerDato.nextLine();
    System.out.println("Indique su cedula.");

    heladoQueLlevara=leerDato.nextLine();
    System.out.println("Que helado desea llevar?.");

    System.out.println("La cantidad vendida de helado peso pluma " +cantidadVendiaTipoHelado+ "es de: $"+precioHeladoSimple);

    heladoQueLlevara=leerDato.nextLine();
    System.out.println("La cantidad vendida de helado HeladioCarrion "+cantidadVendiaTipoHelado+ "es de: $"+precioHeladoDoble);
    
    heladoQueLlevara=leerDato.nextLine();
    System.out.println("La cantidad vendida de helado BadBunny " +cantidadVendiaTipoHelado +"es de: $"+precioHeladoEspecial);



    double totalCompra;
    totalVentasDia=precioHeladoSimple+precioHeladoDoble+precioHeladoEspecial*cantidadVendiaTipoHelado;
    System.out.println("el valor total del dia es $"+totalVentasDia);



    //ACA COMIENZA EL SEGUNDO PUNTO//





    }
}
