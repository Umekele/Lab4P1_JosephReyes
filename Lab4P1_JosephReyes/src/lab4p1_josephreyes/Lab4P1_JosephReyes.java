package lab4p1_josephreyes;

import java.util.Scanner;

public class Lab4P1_JosephReyes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu;
        do {
            System.out.println("------------Menu------------");
            System.out.println("1. Inversion especial");
            System.out.println("2. Balanza de cadenas");
            System.out.println("3. Cifrado de mensajes");
            System.out.println("4. Salir");
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Entrando a Inversion especial...");
                    System.out.println("Ingresar una cadena con mas de cuatro caracteres: ");
                    String cadena = scanner.nextLine();
                    if (cadena.length() < 5) {
                        System.out.println("La cadena debe tener mas de cuatro catacteres");
                    } else {
                        String inversion = "";
                        int l = cadena.length() - 1;
                        for (int i = 0; i < cadena.length(); i++) {
                            char caracter = cadena.charAt(i);
                            inversion += caracter;
                            if (caracter == ' ' || i == l) {
                                for (int j = inversion.length() - 1; j >= 0; j--) {
                                    char letra = inversion.charAt(j);
                                    System.out.print(letra);
                                }
                                inversion = " ";
                            }
                        }
                    }
                    break;
                case 2:
                    scanner.nextLine();
                    int peso1 = 0;
                    int peso2 = 0;
                    int peso3 = 0;
                    System.out.println("Entrando a Balanza de cadenas...");
                    System.out.println("Ingresar la cadena 1:");
                    String cadena1 = scanner.nextLine();
                    System.out.println("Ingresar la cadena 2:");
                    String cadena2 = scanner.nextLine();
                    System.out.println("Ingresar la cadena 3:");
                    String cadena3 = scanner.nextLine();
                    for (int i = 0; i < cadena1.length(); i++) {
                        char caracter = cadena1.charAt(i);
                        int ascii = caracter;
                        peso1 = peso1 + ascii;
                    }
                    System.out.println("Peso cadena 1: " + peso1);
                    for (int i = 0; i < cadena2.length(); i++) {
                        char caracter = cadena2.charAt(i);
                        int ascii = caracter;
                        peso2 = peso2 + ascii;
                    }
                    System.out.println("Peso cadena 2: " + peso2);
                    for (int i = 0; i < cadena3.length(); i++) {
                        char caracter = cadena3.charAt(i);
                        int ascii = caracter;
                        peso3 = peso3 + ascii;
                    }
                    System.out.println("Peso cadena 3: " + peso3);
                    if (peso1 > peso2) {
                        if (peso1 > peso3) {
                            System.out.println("La cadena 1 es mas pesada");
                        } else {
                            System.out.println("La cadena 3 es mas pesada");
                        }
                    } else if (peso1 == peso2) {
                        if (peso2 == peso3) {
                            System.out.println("Todas las cadenas pesan lo mismo");
                        }
                    } else if (peso1 == peso3) {
                        if (peso2 == peso3) {
                            System.out.println("Todas las cadenas pesan lo mismo");
                        }
                    } else {
                        if (peso2 > peso3) {
                            System.out.println("La cadena 2 es mas pesada");
                        } else {
                            System.out.println("La cadena 3 es mas pesada");
                        }
                    }
                    break;
                case 3:
                    scanner.nextLine();
                    String mensajecifrado = "";
                    System.out.println("Entrando a Cifrado de mensajes...");
                    System.out.println("Ingresar mensaje para cifrar: ");
                    String mensaje = scanner.nextLine();
                    for (int i = 0; i < mensaje.length(); i++) {
                        char caracter = mensaje.charAt(i);
                        int ascii =0;
                        ascii +=caracter + 2;
                        mensajecifrado += (char)ascii; 
                    }
                    System.out.println("Mensaje cifrado: " +mensajecifrado);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no vaida");
            }
        } while (menu != 4);
    }

}
