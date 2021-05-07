package lab3p2_felixvelasquez;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_FelixVelasquez {

    static Scanner lea = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Franquicia> lista = new ArrayList();
        ArrayList<Articulos> lista2 = new ArrayList();
        ArrayList<Empleados> lista3 = new ArrayList();
        int opcion = 0;
        boolean Login = false;

        while (opcion != 4) {
            System.out.printf("%s\n", "* * * * * * * * * * MENU * * * * * * * * * *");
            System.out.printf("%s\n", " 1. Franquicias ");
            System.out.printf("%s\n", " 2. Articulos generales ");
            System.out.printf("%s\n", " 3. Informacion de empleados ");

            System.out.printf("%s\n", " 4 Salir ");
            System.out.printf("%s\n", " Que ejercicio quiere ejecutar: ");
            opcion = lea.nextInt();
            System.out.println();
            switch (opcion) {
                case 1: {
                    int opcion2 = 0;
                    while (opcion2 != 5) {
                        System.out.printf("%s\n", " 1. Crear franquicia ");
                        System.out.printf("%s\n", " 2. lista Franquicia ");
                        System.out.printf("%s\n", " 3. Modificar franquicia ");
                        System.out.printf("%s\n", " 4. Eliminar franquicia ");
                        System.out.printf("%s\n", " 5. Salir ");
                        opcion2 = lea.nextInt();
                        switch (opcion2) {
                            case 1: {
                                System.out.println("Ingrese nombre de la tienda");
                                String nombre = lea.next();
                                System.out.println("Ingrese ubicacion ");
                                String ubicacion = lea.next();
                                System.out.println("Ingrese cantidad maxima de empleados ");
                                int cantidadm = lea.nextInt();
                                System.out.println("Ingrese cantidad de caja de pagos");
                                int cantidadp = lea.nextInt();
                                System.out.println("Productos mas vendido");
                                String vendidos = lea.next();
                                System.out.println("Ingrese cantidad maxima de articulos que pueden haber en la tienda : ");
                                int cantidadA = lea.nextInt();
                                lista.add(new Franquicia(nombre, ubicacion, cantidadm, cantidadp, vendidos, cantidadA));
                                System.out.println("Franquicia creada  con exito");

                                break;

                            }
                            case 2: {
                                System.out.println("Listas de franquicias");
                                for (int i = 0; i < lista.size(); i++) {
                                    System.out.println("Nombre: " + lista.get(i).nombre);
                                    System.out.println("Ubicacion: " + lista.get(i).ubicacion);
                                    System.out.println("Cantidad maxima de empelados " + lista.get(i).cantidadm);
                                    System.out.println("Cantidad de cajas de pagos " + lista.get(i).cantidadp);
                                    System.out.println("Porducto mas vendido" + lista.get(i).vendidos);
                                    System.out.println();
                                }
                                break;
                            }
                            case 3: {
                                boolean existente = false;
                                String buscar;
                                System.out.println("Ingrese el nombre de la franquisia");
                                buscar = lea.next();
                                for (int i = 0; i < lista.size(); i++) {
                                    if (lista.get(i).nombre.equals(buscar)) {
                                        System.out.println("Ingrese ubicacion ");
                                        String ubicacion = lea.next();
                                        System.out.println("Ingrese cantidad maxima de empleados ");
                                        int cantidadm = lea.nextInt();
                                        System.out.println("Ingrese cantidad de caja de pagos");
                                        int cantidadp = lea.nextInt();
                                        System.out.println("Productos mas vendido");
                                        String vendidos = lea.next();
                                        System.out.println("Ingrese cantidad maxima de articulos que pueden haber en la tienda : ");
                                        int cantidadA = lea.nextInt();

                                        lista.get(i).nombre = buscar;
                                        lista.get(i).ubicacion = ubicacion;
                                        lista.get(i).cantidadm = cantidadm;
                                        lista.get(i).cantidadp = cantidadp;
                                        lista.get(i).vendidos = vendidos;
                                        lista.get(i).cantidadA = cantidadA;

                                        existente = true;
                                        System.out.println("La franquisia se actualizo");
                                    } else {
                                    }
                                }
                                if (existente == false) {
                                    System.out.println("La Franquisia no existe");
                                }

                                break;
                            }
                            case 4: {
                                int posicionEliminar = -1;
                                posicionEliminar = -1;
                                System.out.println("Ingrese el nombre para eliminar:");
                                String buscar = lea.next();
                                for (int i = 0; i < lista.size(); i++) {
                                    if (lista.get(i).nombre.equals(buscar)) {
                                        posicionEliminar = i;
                                    }
                                }
                                if (posicionEliminar >= 0) {
                                    lista.remove(posicionEliminar);
                                    System.out.println("La franquisia se elimino");
                                } else {
                                    System.out.println("La franquisia que buscado no existe");
                                }
                                break;
                            }

                        }
                    }

                    break;
                }
                case 2: {
                    int opcion2 = 0;
                    while (opcion2 != 4) {
                        System.out.printf("%s\n", " 1. Televisores ");
                        System.out.printf("%s\n", " 2. Consolas ");
                        System.out.printf("%s\n", " 3. Equipos de sonido ");
                        System.out.printf("%s\n", " 4. Teatros en casa ");
                        System.out.printf("%s\n", " 5. Salir ");
                        opcion2 = lea.nextInt();
                        switch (opcion2) {
                            case 1: {
                                int opcion3 = 0;
                                while (opcion3 != 5) {
                                    System.out.printf("%s\n", " 1. Crear televisor ");
                                    System.out.printf("%s\n", " 2. lista televisor ");
                                    System.out.printf("%s\n", " 3. Modificar televisor ");
                                    System.out.printf("%s\n", " 4. Eliminar televisor ");
                                    System.out.printf("%s\n", " 5. Salir ");
                                    opcion3 = lea.nextInt();
                                    switch (opcion3) {
                                        case 1: {
                                            System.out.println("Ingrese nombre ");
                                            String nombre = lea.next();
                                            System.out.println("Ingrese numero de serie ");
                                            String serie = lea.next();
                                            System.out.println("Ingrese precio del televisor ");
                                            int precio1 = lea.nextInt();
                                            System.out.println("Color del televisor");
                                            String color = lea.next();
                                            System.out.println("La garatia de los televisores es de 2 anos");

                                            System.out.println("Ingrese tamano de pantalla (pulgadas)");
                                            String pulgadas = lea.next();
                                            System.out.println("Es Smart 1)[si] 0)[no]: ");
                                            boolean tipo = lea.nextInt() == 0 ? false : true;
                                            System.out.println("Ingrese tipo de marca");
                                            String marca = lea.next();
                                            System.out.println("Cantidad de conexiones y de grosor");
                                            String cantidadn = lea.next();
                                            lista2.add(new Articulos(nombre, serie, color, precio1, pulgadas, tipo, marca, cantidadn));
                                            System.out.println("Televisor creado  con exito");

                                            break;
                                        }
                                        case 2: {
                                            System.out.println("Listas de televisores");
                                            for (int i = 0; i < lista2.size(); i++) {
                                                System.out.println("Nombre: " + lista2.get(i).nombre);
                                                System.out.println("Numero de serie: " + lista2.get(i).serie);
                                                System.out.println("Precio " + lista2.get(i).precio1);
                                                System.out.println("Color " + lista2.get(i).color);
                                                System.out.println("Pulgasdas" + lista2.get(i).pulgadas);
                                                System.out.println("Es Smart " + lista2.get(i).tipo);
                                                System.out.println("Tipo de marca " + lista2.get(i).marca);
                                                System.out.println("Cantidad de conexiones" + lista2.get(i).cantidadn);
                                                System.out.println();

                                            }
                                            break;
                                        }
                                        case 3: {
                                            boolean existente = false;
                                            String buscar;
                                            System.out.println("Ingrese el numero de serie del televisor:");
                                            buscar = lea.next();
                                            for (int i = 0; i < lista2.size(); i++) {
                                                if (lista2.get(i).serie.equals(buscar)) {
                                                    System.out.println("Ingrese el nombre");
                                                    String nombre = lea.next();
                                                    System.out.println("Ingrese precio del televisor ");
                                                    int precio1 = lea.nextInt();
                                                    System.out.println("Color del televisor");
                                                    String color = lea.next();
                                                    System.out.println("La garatia de los televisores es de 2 anos");

                                                    System.out.println("Ingrese tamano de pantalla (pulgadas)");
                                                    String pulgadas = lea.next();
                                                    System.out.println("Es Smart 1)[si] 0)[no]: ");
                                                    boolean tipo = lea.nextInt() == 0 ? false : true;
                                                    System.out.println("Ingrese tipo de marca");
                                                    String marca = lea.next();
                                                    System.out.println("Cantidad de conexiones y de grosor");
                                                    String cantidadn = lea.next();

                                                    lista2.get(i).serie = buscar;
                                                    lista2.get(i).nombre = nombre;
                                                    lista2.get(i).precio1 = precio1;
                                                    lista2.get(i).color = color;
                                                    lista2.get(i).pulgadas = pulgadas;
                                                    lista2.get(i).tipo = tipo;
                                                    lista2.get(i).marca = marca;
                                                    lista2.get(i).cantidadn = cantidadn;

                                                }
                                            }
                                        }
                                        case 4: {
                                            int posicionEliminar = -1;
                                            posicionEliminar = -1;
                                            System.out.println("Ingrese el numero de serie para eliminar:");
                                            String buscar = lea.next();
                                            for (int i = 0; i < lista.size(); i++) {
                                                if (lista2.get(i).serie.equals(buscar)) {
                                                    posicionEliminar = i;
                                                }
                                            }
                                            if (posicionEliminar >= 0) {
                                                lista.remove(posicionEliminar);
                                                System.out.println("el televisor se elimino");
                                            } else {
                                                System.out.println("el televisor que buscado no existe");
                                            }
                                            break;
                                        }
                                        
                                    }// switch
                                    
                                }// while 
                                break;
                            }//
                            case 2: {
                                int opcion3 = 0;
                                while (opcion3 != 5) {
                                    System.out.printf("%s\n", " 1. Crear cosola ");
                                    System.out.printf("%s\n", " 2. lista consola ");
                                    System.out.printf("%s\n", " 3. Modificar cosola ");
                                    System.out.printf("%s\n", " 4. Eliminar cosola ");
                                    System.out.printf("%s\n", " 5. Salir ");
                                    opcion3 = lea.nextInt();
                                    switch (opcion3) {
                                        case 1: {
                                            System.out.println("Ingrese nombre ");
                                            String nombre2 = lea.next();
                                            System.out.println("Ingrese numero de serie ");
                                            String serie2 = lea.next();
                                            System.out.println("Ingrese precio de la consola ");
                                            int precio2 = lea.nextInt();
                                            System.out.println("Color de la consola");
                                            String color2 = lea.next();
                                            System.out.println("La garatia de las consolas es de 1 anos");

                                            System.out.println("Cantidad de almacenamiento en (Gb)");
                                            String gb = lea.next();

                                            System.out.println("Cantidad de controles");
                                            String controles = lea.next();
                                            System.out.println("Numero de acceserio");
                                            String numero = lea.next();
                                            lista2.add(new Articulos(nombre2, serie2, color2, precio2, gb, controles, numero));
                                            System.out.println("Consola creado  con exito");

                                            break;
                                        }
                                        case 2: {
                                            System.out.println("Listas de consolas");
                                            for (int i = 0; i < lista2.size(); i++) {
                                                System.out.println("Nombre: " + lista2.get(i).nombre2);
                                                System.out.println("Numero de serie: " + lista2.get(i).serie2);
                                                System.out.println("Precio " + lista2.get(i).precio2);
                                                System.out.println("Color " + lista2.get(i).color2);
                                                System.out.println("Almacenamiento " + lista2.get(i).gb);
                                                System.out.println("Cantidad de controles " + lista2.get(i).controles);
                                                System.out.println("numero de ascesorio " + lista2.get(i).numero);

                                                System.out.println();

                                            }
                                            break;
                                        }
                                        case 3: {
                                            boolean existente = false;
                                            String buscar;
                                            System.out.println("Ingrese el numero de serie de la consola:");
                                            buscar = lea.next();
                                            for (int i = 0; i < lista2.size(); i++) {
                                                if (lista2.get(i).serie2.equals(buscar)) {
                                                    System.out.println("Ingrese el nombre");
                                                    String nombre = lea.next();
                                                    System.out.println("Ingrese precio de la consola ");
                                                    int precio1 = lea.nextInt();
                                                    System.out.println("Color de la consola");
                                                    String color = lea.next();
                                                    System.out.println("La garatia d e la consola es de 1 anos");

                                                    System.out.println("Cantidad de almacenamiento en (Gb)");
                                                    String gb = lea.next();

                                                    System.out.println("Cantidad de controles");
                                                    String controles = lea.next();
                                                    System.out.println("Numero de acceserio");
                                                    String numero = lea.next();

                                                    lista2.get(i).serie2 = buscar;
                                                    lista2.get(i).nombre2 = nombre;
                                                    lista2.get(i).precio2 = precio1;
                                                    lista2.get(i).color2 = color;
                                                    lista2.get(i).gb = gb;
                                                    lista2.get(i).controles = controles;
                                                    lista2.get(i).numero = numero;

                                                }
                                            }
                                        }
                                        case 4: {
                                            int posicionEliminar = -1;
                                            posicionEliminar = -1;
                                            System.out.println("Ingrese el numero de serie para eliminar:");
                                            String buscar = lea.next();
                                            for (int i = 0; i < lista.size(); i++) {
                                                if (lista2.get(i).serie2.equals(buscar)) {
                                                    posicionEliminar = i;
                                                }
                                            }
                                            if (posicionEliminar >= 0) {
                                                lista.remove(posicionEliminar);
                                                System.out.println("La consola se elimino");
                                            } else {
                                                System.out.println("La consola que buscado no existe");
                                            }
                                            break;
                                        }

                                    }// switch
                                }// while 
                                break;

                            }// fin case 2
                            case 3: {
                                int opcion3 = 0;
                                while (opcion3 != 5) {
                                    System.out.printf("%s\n", " 1. Crear equipos de sonido ");
                                    System.out.printf("%s\n", " 2. lista equipos de sonido ");
                                    System.out.printf("%s\n", " 3. Modificar equipos de sonido ");
                                    System.out.printf("%s\n", " 4. Eliminar equipos de sonido ");
                                    System.out.printf("%s\n", " 5. Salir ");
                                    opcion3 = lea.nextInt();
                                    switch (opcion3) {
                                        case 1: {
                                            System.out.println("Ingrese nombre ");
                                            String nombre3 = lea.next();
                                            System.out.println("Ingrese numero de serie ");
                                            String serie3 = lea.next();
                                            System.out.println("Ingrese precio del equipo de sonido");
                                            int precio3 = lea.nextInt();
                                            System.out.println("Color del euqipo de sonido");
                                            String color3 = lea.next();
                                            System.out.println("La garatia de las consolas es de 4 anos");
                                            System.out.println("Cantidad de alta voces ");
                                            String alta = lea.next();
                                            System.out.println("Potencia maxima");
                                            String potencia = lea.next();
                                            System.out.println("Cantidad de puertyos auxiliares");
                                            String aux = lea.next();
                                            System.out.println("cantidad máxima de discos soportados");
                                            String maxi = lea.next();
                                            System.out.println("Cantidad de puertos USB");
                                            String usb = lea.next();
                                            lista2.add(new Articulos(nombre3, serie3, color3, precio3, alta, potencia, aux, maxi, usb));
                                            System.out.println("Equipo creado  con exito");

                                            break;
                                        }
                                        case 2: {
                                            System.out.println("Listas de equipos");
                                            for (int i = 0; i < lista2.size(); i++) {
                                                System.out.println("Nombre: " + lista2.get(i).nombre3);
                                                System.out.println("Numero de serie: " + lista2.get(i).serie3);
                                                System.out.println("Precio " + lista2.get(i).precio3);
                                                System.out.println("Color " + lista2.get(i).color3);
                                                System.out.println("Alta voces " + lista2.get(i).alta);
                                                System.out.println("Potencia maxima " + lista2.get(i).potencia);
                                                System.out.println("Cantidad de puesrtos auxiliares" + lista2.get(i).aux);
                                                System.out.println("Cantidad maxima de disco soportados" + lista2.get(i).maxi);
                                                System.out.println("Cantidad de puesrtos USB" + lista2.get(i).usb);
                                                System.out.println();

                                            }
                                            break;
                                        }
                                        case 3: {
                                            boolean existente = false;
                                            String buscar;
                                            System.out.println("Ingrese el numero de serie de la consola:");
                                            buscar = lea.next();
                                            for (int i = 0; i < lista2.size(); i++) {
                                                if (lista2.get(i).serie3.equals(buscar)) {
                                                    System.out.println("Ingrese nombre ");
                                                    String nombre3 = lea.next();

                                                    System.out.println("Ingrese precio del equipo de sonido");
                                                    int precio3 = lea.nextInt();
                                                    System.out.println("Color del euqipo de sonido");
                                                    String color3 = lea.next();
                                                    System.out.println("La garatia de las consolas es de 4 anos");
                                                    System.out.println("Cantidad de alta voces ");
                                                    String alta = lea.next();
                                                    System.out.println("Potencia maxima");
                                                    String potencia = lea.next();
                                                    System.out.println("Cantidad de puertyos auxiliares");
                                                    String aux = lea.next();
                                                    System.out.println("cantidad máxima de discos soportados");
                                                    String maxi = lea.next();
                                                    System.out.println("Cantidad de puertos USB");
                                                    String usb = lea.next();

                                                    lista2.get(i).serie3 = buscar;
                                                    lista2.get(i).nombre3 = nombre3;
                                                    lista2.get(i).precio3 = precio3;
                                                    lista2.get(i).color3 = color3;
                                                    lista2.get(i).alta = alta;
                                                    lista2.get(i).potencia = potencia;
                                                    lista2.get(i).aux = aux;
                                                    lista2.get(i).maxi = maxi;
                                                    lista2.get(i).usb = usb;

                                                }
                                            }
                                        }
                                        case 4: {
                                            int posicionEliminar = -1;
                                            posicionEliminar = -1;
                                            System.out.println("Ingrese el numero de serie para eliminar:");
                                            String buscar = lea.next();
                                            for (int i = 0; i < lista.size(); i++) {
                                                if (lista2.get(i).serie3.equals(buscar)) {
                                                    posicionEliminar = i;
                                                }
                                            }
                                            if (posicionEliminar >= 0) {
                                                lista.remove(posicionEliminar);
                                                System.out.println("El equipo se elimino");
                                            } else {
                                                System.out.println("El equipo que buscado no existe");
                                            }
                                            break;
                                        }

                                    }// switch
                                }// while 

                                break;
                            }// fin del case 3
                            case 4: {
                                int opcion3 = 0;
                                while (opcion3 != 5) {
                                    System.out.printf("%s\n", " 1. Crear teatros en casa ");
                                    System.out.printf("%s\n", " 2. lista teatros en casa ");
                                    System.out.printf("%s\n", " 3. Modificar teatros en casa ");
                                    System.out.printf("%s\n", " 4. Eliminar teatros en casa ");
                                    System.out.printf("%s\n", " 5. Salir ");
                                    opcion3 = lea.nextInt();
                                    switch (opcion3) {
                                        case 1: {
                                            System.out.println("Ingrese nombre ");
                                            String nombre4 = lea.next();
                                            System.out.println("Ingrese numero de serie ");
                                            String serie4 = lea.next();
                                            System.out.println("Ingrese precio");
                                            int precio4 = lea.nextInt();
                                            System.out.println("Color del euqipo de sonido");
                                            String color4 = lea.next();
                                            System.out.println("La garatia de las consolas es de 10 anos");

                                            System.out.println("Cantidad de altavoces ");
                                            String alta2 = lea.next();
                                            System.out.println("Potencia maxima");
                                            String potencia2 = lea.next();
                                            System.out.println("Cantidad de disco tipo Blu-Ray");
                                            String disco = lea.next();
                                            System.out.println("Informacion de limpieza");
                                            String limpieza = lea.next();
                                            System.out.println("Lector de disco");
                                            String lector = lea.next();
                                            lista2.add(new Articulos(nombre4, serie4, color4, precio4, alta2, potencia2, disco, limpieza, lector));
                                            System.out.println("Equipo creado  con exito");

                                            break;
                                        }
                                        case 2: {
                                            System.out.println("Listas de equipos");
                                            for (int i = 0; i < lista2.size(); i++) {
                                                System.out.println("Nombre: " + lista2.get(i).nombre3);
                                                System.out.println("Numero de serie: " + lista2.get(i).serie3);
                                                System.out.println("Precio " + lista2.get(i).precio3);
                                                System.out.println("Color " + lista2.get(i).color3);
                                                System.out.println("Alta voces " + lista2.get(i).alta);
                                                System.out.println("Potencia maxima " + lista2.get(i).potencia);
                                                System.out.println("Cantidad de puesrtos auxiliares" + lista2.get(i).aux);
                                                System.out.println("Cantidad maxima de disco soportados" + lista2.get(i).maxi);
                                                System.out.println("Cantidad de puesrtos USB" + lista2.get(i).usb);
                                                System.out.println();

                                            }
                                            break;
                                        }
                                        case 3: {
                                            boolean existente = false;
                                            String buscar;
                                            System.out.println("Ingrese el numero de serie :");
                                            buscar = lea.next();
                                            for (int i = 0; i < lista2.size(); i++) {
                                                if (lista2.get(i).serie4.equals(buscar)) {
                                                    System.out.println("Ingrese nombre ");
                                                    String nombre3 = lea.next();

                                                    System.out.println("Ingrese precio ");
                                                    int precio3 = lea.nextInt();
                                                    System.out.println("Color del euqipo de sonido");
                                                    String color3 = lea.next();
                                                    System.out.println("La garatia de las consolas es de 4 anos");
                                                    System.out.println("Cantidad de alta voces ");
                                                    String alta = lea.next();
                                                    System.out.println("Potencia maxima");
                                                    String potencia = lea.next();
                                                    System.out.println("Cantidad de puertyos auxiliares");
                                                    String aux = lea.next();
                                                    System.out.println("cantidad máxima de discos soportados");
                                                    String maxi = lea.next();
                                                    System.out.println("Cantidad de puertos USB");
                                                    String usb = lea.next();

                                                    lista2.get(i).serie4 = buscar;
                                                    lista2.get(i).nombre4 = nombre3;
                                                    lista2.get(i).precio4 = precio3;
                                                    lista2.get(i).color4 = color3;
                                                    lista2.get(i).alta2 = alta;
                                                    lista2.get(i).potencia2 = potencia;
                                                    lista2.get(i).disco = aux;
                                                    lista2.get(i).limpieza = maxi;
                                                    lista2.get(i).lector = usb;

                                                }
                                            }
                                        }
                                        case 4: {
                                            int posicionEliminar = -1;
                                            posicionEliminar = -1;
                                            System.out.println("Ingrese el numero de serie para eliminar:");
                                            String buscar = lea.next();
                                            for (int i = 0; i < lista.size(); i++) {
                                                if (lista2.get(i).serie4.equals(buscar)) {
                                                    posicionEliminar = i;
                                                }
                                            }
                                            if (posicionEliminar >= 0) {
                                                lista.remove(posicionEliminar);
                                                System.out.println("El equipo se elimino");
                                            } else {
                                                System.out.println("El equipo que buscado no existe");
                                            }
                                            break;
                                        }
                                        default:
                                            System.out.printf("%s\n", "Saliendo...");

                                    }// switch
                                }// while 

                                break;
                            }// fin del case 4
                            default:
                                System.out.printf("%s\n", "Saliendo...");

                        }

                    }

                    break;

                }
                case 3: {
                    int opcion2 = 0;
                    while (opcion2 != 3) {
                        System.out.printf("%s\n", " 1. Supervisor ");
                        System.out.printf("%s\n", " 2. Login ");
                        System.out.printf("%s\n", " 3. Salir ");
                        opcion2 = lea.nextInt();
                        switch (opcion2) {
                            case 1: {
                                int opcion3 = 0;

                                while (opcion3 != 3) {

                                    System.out.printf("%s\n", " 1. Crear supervisor ");
                                    System.out.printf("%s\n", " 2. Lista supervisor ");
                                    System.out.printf("%s\n", " 3. Salir");
                                    opcion3 = lea.nextInt();

                                    switch (opcion2) {

                                        case 1: {
                                            System.out.println("Ingrese nombre ");
                                            String nombre2 = lea.next();
                                            System.out.println("Ingrese apellido ");
                                            String apellido2 = lea.next();
                                            System.out.println("Cree contrasena ");
                                            String contra = lea.next();
                                            System.out.println("Ingrese salario");
                                            int salario2 = lea.nextInt();
                                            System.out.println("Nacionalidad");
                                            String nacionalidad2 = lea.next();

                                            System.out.println("Cantidad de cajeros que supervisa ");
                                            String caje = lea.next();
                                            System.out.println("Saliro promedio de los empleados que supervisa");
                                            String superv = lea.next();
                                            System.out.println("Meta y promedio de cada cajero que supervisa");
                                            String meta2 = lea.next();

                                            lista3.add(new Empleados(nombre2, apellido2, contra, salario2, nacionalidad2, caje, superv, meta2));
                                            System.out.println("Supervisor creado  con exito");
                                            break;

                                        }// fin case 1
                                        case 2: {
                                            System.out.println("Listas de supervisores");
                                            for (int i = 0; i < lista3.size(); i++) {
                                                System.out.println("Nombre: " + lista3.get(i).nombre2);
                                                System.out.println("Apellido: " + lista3.get(i).apelldio2);
                                                System.out.println("Contrasena" + lista3.get(i).contra);
                                                System.out.println("Salario " + lista3.get(i).salario2);
                                                System.out.println("Cajeros que supervisa" + lista3.get(i).caje);
                                                System.out.println("Salario promedio de sus enpelados " + lista3.get(i).superv);
                                                System.out.println("Meata y promedio " + lista3.get(i).meta2);

                                                System.out.println();

                                            }

                                            break;
                                        }
                                        default:
                                            System.out.printf("%s\n", "Saliendo...");

                                    }

                                }

                            }// fin del case 1

                            case 2: {
                                System.out.println(">>>>>>>Inicio de sesión<<<<<<<<");
                                while (Login != true) {
                                    System.out.println("Ingrese el nombre del supervisor: ");
                                    String User = lea.next();
                                    System.out.println("Ingrese la contraseña del supervisor: ");
                                    String Password = lea.next();

                                    if (User.equalsIgnoreCase("admin") && Password.equals("1234")) {
                                        System.out.println("Usted ha iniciado sesión correctamente");
                                        Login = true;
                                    } else {
                                        System.out.println("Nombre de usuario o contraseña incorrectos");
                                    }
                                }
                                int OpcionR = 0;
                                System.out.println("•1. Crear cajero ");
                                System.out.println("•2. Modificar cajero");
                                System.out.println("•3. listar cajero");
                                System.out.println("•4. Eliminar cajero");
                                System.out.println("///////////////////////////////");
                                System.out.println("•5. Crear Asesor finacioer ");
                                System.out.println("•6. Modificar asesor finaciero");
                                System.out.println("•7. listar asesor finaciero");
                                System.out.println("•8. Eliminar asesor finaciero");
                                System.out.println("•9. Salir del programa");
                                System.out.print("Ingrese la opcion deseada: ");
                                OpcionR = lea.nextInt();
                                switch (OpcionR) {
                                    case 1: {
                                        System.out.println("Ingrese nombre ");
                                        String nombre = lea.next();
                                        System.out.println("Ingrese apellido ");
                                        String apellido = lea.next();
                                        System.out.println("Ingrese salario");
                                        int salario = lea.nextInt();
                                        System.out.println("Nacionalidad");
                                        String nacionalidad = lea.next();
                                        System.out.println("Cantidad de anos elabroales en diunsa ");
                                        String anos = lea.next();
                                        System.out.println("Horario de trabajao");
                                        String horat = lea.next();
                                        System.out.println("Hora de almuerzo");
                                        String horaA = lea.next();
                                        System.out.println("Meta a vender por cada mes");
                                        String meta = lea.next();
                                        System.out.println("Cantidad de empleados atendidos");
                                        String cantidadem = lea.next();
                                        lista3.add(new Empleados(nombre, apellido, salario, nacionalidad, anos, horat, horaA, meta, cantidadem));
                                        System.out.println("cajero creado  con exito");

                                        break;
                                    }// fin case 1
                                    case 2: {
                                          boolean existente = false;
                                            String buscar;
                                        System.out.println("Ingrese nombre del cajero :");
                                        buscar = lea.next();
                                        for (int i = 0; i < lista2.size(); i++) {
                                            if (lista3.get(i).nombre.equals(buscar)) {
                                                System.out.println("Ingrese apellido ");
                                                String apellido = lea.next();
                                                System.out.println("Ingrese salario");
                                                int salario = lea.nextInt();
                                                System.out.println("Nacionalidad");
                                                String nacionalidad = lea.next();
                                                System.out.println("Cantidad de anos elabroales en diunsa ");
                                                String anos = lea.next();
                                                System.out.println("Horario de trabajao");
                                                String horat = lea.next();
                                                System.out.println("Hora de almuerzo");
                                                String horaA = lea.next();
                                                System.out.println("Meta a vender por cada mes");
                                                String meta = lea.next();
                                                System.out.println("Cantidad de empleados atendidos");
                                                String cantidadem = lea.next();

                                                    
                                                    lista3.get(i).nombre = buscar;
                                                    lista3.get(i).apelldio = apellido;
                                                    lista3.get(i).salario = salario;
                                                    lista3.get(i).nacionalidad = nacionalidad;
                                                    lista3.get(i).anos = anos;
                                                    lista3.get(i).horat = horat;
                                                    lista3.get(i).horaA = horaA;
                                                    lista3.get(i).meta = meta;
                                                    lista3.get(i).cantidadem = cantidadem;

                                                }
                                            }
                                        
                                        
                                     
                                        break;
                                    }
                                    case 3:{
                                          System.out.println("Listas de cajeros");
                                        for (int i = 0; i < lista3.size(); i++) {
                                            System.out.println("Nombre: " + lista3.get(i).nombre);
                                            System.out.println("Apellido: " + lista3.get(i).apelldio);
                                            System.out.println("Salario: " + lista3.get(i).salario);
                                            System.out.println("Nacionalidad " + lista3.get(i).nacionalidad);
                                            System.out.println("Cantidad de anos en la empresa" + lista3.get(i).anos);
                                            System.out.println("Horario de trabajo " + lista3.get(i).horat);
                                            System.out.println("Horario de almuerzo " + lista3.get(i).horaA);
                                            System.out.println("Meta a  vender cada mes: " + lista3.get(i).meta);
                                            System.out.println("Cantidad de empelados atendidos: " + lista3.get(i).cantidadem);
                                            System.out.println();
                                        }
                                        
                                        break;
                                    }
                                    case 4:{
                                         int posicionEliminar = -1;
                                            posicionEliminar = -1;
                                            System.out.println("Ingrese el nombre para eliminar:");
                                            String buscar = lea.next();
                                            for (int i = 0; i < lista.size(); i++) {
                                                if (lista3.get(i).nombre.equals(buscar)) {
                                                    posicionEliminar = i;
                                                }
                                            }
                                            if (posicionEliminar >= 0) {
                                                lista.remove(posicionEliminar);
                                                System.out.println("El cajero se elimino");
                                            } else {
                                                System.out.println("El cajero que buscado no existe");
                                            }
                                        
                                        break;
                                    }
                                    case 5:{
                                         System.out.println("Ingrese nombre ");
                                        String nombre3 = lea.next();
                                        System.out.println("Ingrese apellido ");
                                        String apellido3 = lea.next();
                                        System.out.println("Ingrese salario");
                                        int salario3 = lea.nextInt();
                                        System.out.println("Nacionalidad");
                                        String nacionalidad3 = lea.next();
                                        System.out.println("Clientes alos que a atendido");
                                        String atendido = lea.next();
                                        System.out.println("Cantidad de prodcutos que han comprado su clientes");
                                        String produ = lea.next();
                                        System.out.println("Numero total de creditos consedidos");
                                       String total = lea.next();
                                        lista3.add(new Empleados(nombre3, apellido3, salario3, nacionalidad3, atendido, produ, total));
                                        System.out.println("asesor creado  con exito");
                                        
                                        break;
                                    }
                                    case 6 :{
                                         boolean existente = false;
                                            String buscar;
                                        System.out.println("Ingrese nombre del asesor :");
                                        buscar = lea.next();
                                        for (int i = 0; i < lista2.size(); i++) {
                                            if (lista3.get(i).nombre3.equals(buscar)) {
                                                System.out.println("Ingrese apellido ");
                                                String apellido3 = lea.next();
                                                System.out.println("Ingrese salario");
                                                int salario3 = lea.nextInt();
                                                System.out.println("Nacionalidad");
                                                String nacionalidad3 = lea.next();
                                                System.out.println("Clientes alos que a atendido");
                                                String atendido = lea.next();
                                                System.out.println("Cantidad de prodcutos que han comprado su clientes");
                                                String produ = lea.next();
                                                System.out.println("Numero total de creditos consedidos");
                                                String total = lea.next();

                                                lista3.get(i).nombre3 = buscar;
                                                lista3.get(i).apelldio3 = apellido3;
                                                lista3.get(i).salario3 = salario3;
                                                lista3.get(i).nacionalidad3 = nacionalidad3;
                                                lista3.get(i).atendido = atendido;
                                                lista3.get(i).produ = produ;
                                                lista3.get(i).total = total;

                                                break;
                                            }

                                        }

                                        break;
                                    }
                                    case 7: {
                                         System.out.println("Listas de asesores");
                                        for (int i = 0; i < lista3.size(); i++) {
                                            System.out.println("Nombre: " + lista3.get(i).nombre);
                                            System.out.println("Apellido: " + lista3.get(i).apelldio);
                                            System.out.println("Salario: " + lista3.get(i).salario);
                                            System.out.println("Nacionalidad " + lista3.get(i).nacionalidad);
                                            System.out.println("Cantidad de clientes atendidos" + lista3.get(i).anos);
                                            System.out.println("Cantidad de productos que an comprado sus clientes" + lista3.get(i).horat);
                                            System.out.println("Numero total de credito consedido " + lista3.get(i).horaA);
                                           
                                            System.out.println();
                                        

                                    }
                                        break;
                                        
                                    }
                                    case 8:{
                                         int posicionEliminar = -1;
                                            posicionEliminar = -1;
                                            System.out.println("Ingrese el nombre para eliminar:");
                                            String buscar = lea.next();
                                            for (int i = 0; i < lista.size(); i++) {
                                                if (lista3.get(i).nombre3.equals(buscar)) {
                                                    posicionEliminar = i;
                                                }
                                            }
                                            if (posicionEliminar >= 0) {
                                                lista.remove(posicionEliminar);
                                                System.out.println("El asesor se elimino");
                                            } else {
                                                System.out.println("El asesor que buscado no existe");
                                            }
                                        
                                        break;
                                    }
                                    default:
                                        System.out.printf("%s\n", "Saliendo...");
                                }
                            }
                        }
                    }
                    break;
                }

                    }// fin del switch
                }// fin del while 

    }// fin del main 

}// fin de la clase 
