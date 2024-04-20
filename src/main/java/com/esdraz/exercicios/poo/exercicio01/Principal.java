package com.esdraz.exercicios.poo.exercicio01;

public class Principal {
    public static void main(String[] args) {

        Cachorro dog1 = new Cachorro();
        Cachorro dog2 = new Cachorro();

        dog1.nome = "Oliver";
        dog1.raca = "Border Collie";
        dog1.sexo = "Macho";
        dog1.idade = 3;

        dog2.nome = "Bob";
        dog2.raca = "Buldog";
        dog2.sexo = "Macho";
        dog2.idade = 6;

        System.out.printf("""
                        Ficha Cachorros:
                        1: Nome: %s, Raça: %s, Sexo: %s, Idade: %d
                        2: Nome: %s, Raça: %s, Sexo: %s, Idade: %d""",
                dog1.nome, dog1.raca, dog1.sexo, dog1.idade,
                dog2.nome, dog2.raca, dog2.sexo, dog2.idade);
    }
}
