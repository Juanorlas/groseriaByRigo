package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int intentosFallidos = 0;

        // Declarar las credenciales de inicio de sesión
        String usuarioCorrecto = "usuario";
        String contrasenaCorrecta = "contraseña";
        String correoCorrecto = "correo@example.com";

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Bucle while para permitir un máximo de 3 intentos
        while (intentosFallidos < 3) {
            // Solicitar al usuario que ingrese su nombre de usuario
            System.out.print("Ingrese su nombre de usuario: ");
            String usuario = sc.nextLine();

            // Solicitar al usuario que ingrese su contraseña
            System.out.print("Ingrese su contraseña: ");
            String contrasena = sc.nextLine();

            // Solicitar al usuario que ingrese su correo
            System.out.print("Ingrese su correo electrónico: ");
            String correo = sc.nextLine();

            // Comprobar si el nombre de usuario, la contraseña y el correo son correctos
            if (usuario.equals(usuarioCorrecto) && contrasena.equals(contrasenaCorrecta) && correo.equals(correoCorrecto)) {
                // Si son correctos, mostrar el menú principal
                mostrarMenuPrincipal(sc);
                // Salir del bucle while
                break;
            } else {
                // Si son incorrectos, incrementar el contador de intentos fallidos
                intentosFallidos++;
                // Mostrar un mensaje de error
                System.out.println("Nombre de usuario, contraseña o correo incorrecto. Por favor, intente de nuevo.");
            }
        }

        // Si se superan los 3 intentos fallidos, mostrar un mensaje y cerrar el programa
        if (intentosFallidos == 3) {
            System.out.println("Ha excedido el número máximo de intentos fallidos. Cerrando el programa.");
        }
    }


    public static void mostrarMenuPrincipal(Scanner scanner) {


        int[] cantidades = new int[6];
        int opcionCantidades;
        int opcion;
        int[] precios = {28000, 35000, 150000, 80000, 20000, 18500};
        double total = 0.0;
        int opcionModificar;
        int opcionCantidadesDos;


        double propina5 = 0.5;
        double propina10 = 0.1;


        double costoTotalConPropina = 0.0;
        do {
            System.out.println("1.ingresar orden");
            System.out.println("2.total");
            System.out.println("3.modificar orden");
            System.out.println("4.salir ");
            System.out.println("ingrese la opcion");
            opcion = scanner.nextInt();
            if (opcion == 1) {
                while (true) {
                    System.out.println("Listado de platos:");
                    System.out.println("1. Entrada de cangrejo de Urrao ($28000)");
                    System.out.println("2. Escalopes a la Rigo ($35000");
                    System.out.println("3. Filete Tour de Francia ($150,000)");
                    System.out.println("4. Corvina de Rigo ($80,000)");
                    System.out.println("5. Coctel Michelle ($20,000)");
                    System.out.println("6. Jugos de Urrao ($18,500)");
                    System.out.println("7.salir");
                    System.out.println("digite una opcion valida ");
                    int opcionMenuSecundario = scanner.nextInt();
                    if (opcionMenuSecundario == 1) {
                        System.out.println("cuantas cantidades quiere de Entrada de cangrejo de Urrao");
                        opcionCantidades = scanner.nextInt();
                        cantidades[0] = cantidades[0] + opcionCantidades;
                    } else if (opcionMenuSecundario == 2) {
                        System.out.println("cuantas cantidades quiere de Escalopes a la Rigo");
                        opcionCantidades = scanner.nextInt();
                        cantidades[1] = cantidades[1] + opcionCantidades;
                    } else if (opcionMenuSecundario == 3) {
                        System.out.println("cuantas cantidades quiere de Filete Tour de Francia");
                        opcionCantidades = scanner.nextInt();
                        cantidades[2] = cantidades[2] + opcionCantidades;
                    } else if (opcionMenuSecundario == 4) {
                        System.out.println("cuantas cantidades quiere de Corvina de Rigo");
                        opcionCantidades = scanner.nextInt();
                        cantidades[3] = cantidades[3] + opcionCantidades;
                    } else if (opcionMenuSecundario == 5) {
                        System.out.println("cuantas cantidades quiere de Coctel Michelle");
                        opcionCantidades = scanner.nextInt();
                        cantidades[4] = cantidades[4] + opcionCantidades;
                    } else if (opcionMenuSecundario == 6) {
                        System.out.println("cuantas cantidades quiere de Jugos de Urrao");
                        opcionCantidades = scanner.nextInt();
                        cantidades[5] = cantidades[5] + opcionCantidades;
                    } else if (opcionMenuSecundario == 7) {
                        System.out.println("volviendo al menu anterior");
                        break;

                    } else {
                        System.out.println("opcion incorrecta");
                    }
                }

            } else if (opcion == 2) {

                System.out.println("calculando total sin propina");
                total = (cantidades[0] * precios[0]) + (cantidades[1] * precios[1]) + (cantidades[2] * precios[2]) +
                        (cantidades[3] * precios[3] + (cantidades[4] * precios[4]) + (cantidades[5] * precios[5]));
                System.out.print("El total sin propina es: "+total);
                System.out.print("Desea incluir la propina de 5% o del 10%: ");
                double propina = scanner.nextInt();
                if (propina == 5){
                    propina = total * propina5;
                } else if (propina == 10) {
                    propina = total * propina10;

                }else {
                    System.out.println("El usuario no deja la propina");
                    propina = 0 ;
                }
                costoTotalConPropina = total + propina;
                System.out.println("el total con propina es:" +costoTotalConPropina);

            } else if (opcion == 3) {
                System.out.println("1. Entrada de cangrejo de Urrao ($28000)");
                System.out.println("2. Escalopes a la Rigo ($35000");
                System.out.println("3. Filete Tour de Francia ($150,000)");
                System.out.println("4. Corvina de Rigo ($80,000)");
                System.out.println("5. Coctel Michelle ($20,000)");
                System.out.println("6. Jugos de Urrao ($18,500)");
                System.out.println("digite el plato que quiere modificar la cantidad: ");
                opcionModificar = scanner.nextInt();
                if (opcionModificar == 1) {
                    System.out.println("cuantos platos quiere del plato 1");
                    opcionCantidadesDos = scanner.nextInt();
                    cantidades[0] = opcionCantidadesDos;
                } else if (opcionModificar == 2) {
                    System.out.println("cuantos platos quiere del plato 2");
                    opcionCantidadesDos = scanner.nextInt();
                    cantidades[1] = opcionCantidadesDos;
                } else if (opcionModificar == 3) {
                    System.out.println("cuantos platos quiere del plato 3");
                    opcionCantidadesDos = scanner.nextInt();
                    cantidades[2] = opcionCantidadesDos;
                } else if (opcionModificar == 4) {
                    System.out.println("cuantos platos quiere del plato 4");
                    opcionCantidadesDos = scanner.nextInt();
                    cantidades[3] = opcionCantidadesDos;
                } else if (opcionModificar == 5) {
                    System.out.println("cuantos platos quiere del plato 5");
                    opcionCantidadesDos = scanner.nextInt();
                    cantidades[4] = opcionCantidadesDos;
                } else if (opcionModificar == 6) {
                    System.out.println("cuantos platos quiere del plato 6");
                    opcionCantidadesDos = scanner.nextInt();
                    cantidades[5] = opcionCantidadesDos;
                } else {
                    System.out.println("opcion incorrecta");
                }


            } else if (opcion == 4) {
                System.out.println("hasta luego");
            } else {
                System.out.println("opcion incorrecta");
            }

        } while (opcion != 4);



    }
}