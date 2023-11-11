package examen1p1_josephreyes;

import java.util.Random;
import java.util.Scanner;

public class Examen1P1_JosephReyes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int continuar;
        do {
            System.out.println("------ Menu: ------");
            System.out.println("1. Fight or Flight ");
            System.out.println("2.   Tri Fuerza");
            System.out.println("0.     Salir");
            continuar = scanner.nextInt();
            switch (continuar) {
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                case 1:
                    System.out.println("Entrando a Fight of Flight...");
                    int opcion;
                    int balas = 25;
                    int vida = 25;
                    int distancia = random.nextInt(15) + 15;
                    int precisionExtra = 0;
                    int derrota = 0;
                    String respuesta = "";
                    System.out.println("Ingresar maestria del jugador");
                    System.out.println("1. Principiante  (  0% de Precision extra  )");
                    System.out.println("2.  Intermedio   (  5% de Precision extra  )");
                    System.out.println("3.   Experto     ( 15% de Precision extra  )");
                    opcion = scanner.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("Entrando en modo Principiante...");
                            precisionExtra = 0;
                            break;
                        case 2:
                            System.out.println("Entrando en modo Intermedio...");
                            precisionExtra = 5;
                            break;
                        case 3:
                            System.out.println("Entrando en modo Experto...");
                            precisionExtra = 15;
                            break;
                        default:
                            System.out.println("Opcion no valida");
                    }
                    System.out.println("El zombie se encuentra a " + distancia + " metros");
                    scanner.nextLine();
                    do {
                        System.out.println("El jugador cuenta con " + balas + " balas!");
                        balas = balas - 1;
                        int precision = random.nextInt(100) - precisionExtra;
                        if (precision > 65) {
                            System.out.println("El jugador ha fallado el tiro!");
                            System.out.println("Vida restante del zombie: " + vida);
                            int movimiento = random.nextInt(2) + 3;
                            distancia = distancia - movimiento;
                            if (distancia > 1) {
                                System.out.println("El zombie se encuentra a " + distancia + " metros!");
                            } else {
                                System.out.println("El zombie se encuentra a 0 metros!");
                                System.out.println("El jugador pierde, el zombie lo ha alcanzado!");
                                derrota = 1;
                            }
                        } else {
                            int dano = random.nextInt(6) + 1;
                            vida = vida - dano;
                            System.out.println("El jugador ha infligido " + dano + " de dano!");
                            System.out.println("Vida restante del zombie: " + vida);
                            System.out.println("El zombie se encuentra a " + distancia + " metros!");
                            if (balas < 1) {
                                System.out.println("El jugador pierde, se ha quedado sin balas!");
                                derrota = 1;
                            } else if (vida < 1) {
                                System.out.println("Vida restante del zombie: 0 ");
                                System.out.println("El jugador gana, el zombie ha muerto!");
                                derrota = 1;
                            }
                        }
                        if (derrota == 1) {
                            respuesta = "n";
                        } else {
                            System.out.println("Listo para la siguiente ronda? [S/N]");
                            respuesta = scanner.nextLine();
                        }
                    } while ("s".equals(respuesta) || "S".equals(respuesta));
                    break;

                case 2:
                    System.out.println("Entrando a Tri Fuerza...");
                    int n;
                    int verificaciones = 0;
                    do {
                        System.out.println("Ingresar un numero:");
                        System.out.println("Tiene que ser mayor a 20");
                        System.out.println("Tiene que ser par");
                        System.out.println("Su mitad tiene que ser impar");
                        n = scanner.nextInt();
                        if (n > 20) {
                            if (n % 2 == 0) {
                                if ((n / 2) % 2 != 1) {
                                    verificaciones = 1;
                                } else {
                                    System.out.println("La mitad del numero no es impar");
                                }
                            } else {
                                System.out.println("El numero tiene que ser par");
                            }
                        } else {
                            System.out.println("El numero tiene que ser mayor a 20");
                        }
                    } while (verificaciones != 1);
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            System.out.print(" ");
                        }

                        for (int k = 0; k < 2 * i + 1; k++) {
                            System.out.print("*");
                        }

                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (continuar != 0);
    }
}
