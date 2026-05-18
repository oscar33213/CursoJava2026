package com.oscar.proyectoJuego;

import java.util.*;

public class ProyectoJuego {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int vidas = 100;
        int vidasMaximas = 100;

        int ataque = 10;

        int vidaEnemigos;
        boolean esCritico;

        double puntuacion = 0;
        int nivel = 1;
        double puntosNecesarios = 100;

        String[] enemigos = {"Babosa", "Gnomo", "Espadachin", "Dragón"};

        System.out.println("Introduce tu nombre: ");
        String nombreJugador = entrada.nextLine();

        System.out.println("Hola " + nombreJugador + ", soy Bahaal, tu guía.");
        System.out.println("¿Estás listo? (S/N)");

        String aceptar = entrada.nextLine();

        if (aceptar.equalsIgnoreCase("N")) {
            System.out.println("Has abandonado la aventura...");
            entrada.close();
            return;
        }

        System.out.println("¡Comienza tu aventura!\n");

        for (int i = 0; i < 10; i++) {

            int enemigoAleatorio = (int) (Math.random() * enemigos.length);
            String enemigo = enemigos[enemigoAleatorio];

            vidaEnemigos = 50 + (int)(Math.random() * 70) + (nivel * 10);

            int ataqueEnemigo;

            switch (enemigo) {

                case "Babosa":
                    ataqueEnemigo = (3 + (int)(Math.random() * 3)) + nivel;
                    break;

                case "Gnomo":
                    ataqueEnemigo = (5 + (int)(Math.random() * 5)) + nivel;
                    break;

                case "Espadachin":
                    ataqueEnemigo = (8 + (int)(Math.random() * 7)) + nivel;
                    break;

                case "Dragón":
                    ataqueEnemigo = (12 + (int)(Math.random() * 13)) + (nivel * 2);
                    break;

                default:
                    ataqueEnemigo = 5 + nivel;
            }

            System.out.println("\n==============================");
            System.out.println("Aparece un " + enemigo);
            System.out.println("Vida: " + vidaEnemigos);

            while (vidaEnemigos > 0 && vidas > 0) {

                esCritico = Math.random() < 0.2;

                int dañoJugador;

                if (esCritico) {
                    dañoJugador = ataque * 2;
                    System.out.println("¡CRÍTICO! Haces " + dañoJugador + " de daño");
                } else {
                    dañoJugador = (int)(ataque * (0.7 + Math.random() * 0.6));
                    System.out.println("Atacas al " + enemigo + " y haces " + dañoJugador + " de daño");
                }

                vidaEnemigos -= dañoJugador;

                System.out.println("Vida enemigo: " + vidaEnemigos);

                if (vidaEnemigos <= 0) {

                    System.out.println("Has derrotado al " + enemigo);

                    puntuacion += 25;

                    while (puntuacion >= puntosNecesarios) {

                        puntuacion -= puntosNecesarios;
                        nivel++;
                        puntosNecesarios *= 1.5;

                        ataque += 2;
                        vidasMaximas += 5;
                        vidas = vidasMaximas;

                        System.out.println("🎉 SUBES A NIVEL " + nivel);
                        System.out.println("⚔ Ataque: " + ataque);
                        System.out.println("❤️ Vida máxima: " + vidasMaximas);
                    }

                    break;
                }

                System.out.println(enemigo + " prepara su ataque...");
                System.out.println(enemigo + " te ataca y hace " + ataqueEnemigo + " de daño");

                vidas -= ataqueEnemigo;

                System.out.println("Tus vidas: " + vidas);

                if (vidas <= 0) {
                    System.out.println("\n💀 Has sido derrotado...");
                    System.out.println("Game Over");
                    entrada.close();
                    return;
                }
            }
        }

        System.out.println("\n🏆 HAS COMPLETADO LOS 10 COMBATES");
        System.out.println("Jugador: " + nombreJugador);
        System.out.println("Nivel final: " + nivel);

        entrada.close();
    }
}