package com.esdraz.exercicios.fundamentos;

import java.util.Scanner;

public class Exercicio04_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numOriginal = input.nextInt();

        int numPendenteInversao = numOriginal;
        int numInvertido = 0;

        while (numPendenteInversao > 0) {
            int resto = numPendenteInversao % 10;
            numInvertido = numInvertido * 10 + resto;
            numPendenteInversao /= 10;
        }
        System.out.println("Inverso de " + numOriginal + " é " + numInvertido);

        /*
        int numero = 7631;
        int numeroInvertido = 0;

        while (numero > 0) {
            numeroInvertido *= 10;
            numeroInvertido += (numero % 10);
            numero /= 10;
        }

        System.out.println("Número invertido: " + numeroInvertido);*/
    }
}
