package com.esdraz.exercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        System.out.println("Desafio: calculadora complexa de IMC\n");
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = input.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = input.nextDouble();
        input.nextLine();

        System.out.print("Digite o seu sexo: (M/F): ");
        String sexo = input.nextLine();

        double IMC = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f\n", IMC);

        if (IMC < 19.1 && sexo.equals("F") || IMC < 20.7 && sexo.equals("M")) {
            System.out.println("Abaixo do peso!");
        } else if (IMC <= 25.8 && sexo.equals("F") || IMC <= 26.4 && sexo.equals("M")) {
            System.out.println("No peso ideal!");
        } else if (IMC <= 27.3 && sexo.equals("F") || IMC <= 27.8 && sexo.equals("M")) {
            System.out.println("Um pouco acima do peso!");
        } else if (IMC <= 32.3 && sexo.equals("F") || IMC <= 31.1 && sexo.equals("M")) {
            System.out.println("Acima do peso ideal!");
        } else {
            System.out.println("Obeso!");
        }
        System.out.println();
    }
}
