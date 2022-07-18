package br.com.dio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício calculadora");
        CalculadoraSimples.soma(3, 6);
        CalculadoraSimples.subtracao(9, 1.8);
        CalculadoraSimples.multiplicacao(7, 8);
        CalculadoraSimples.divisao(5, 2.5);

        System.out.println("  ");

        //Horario

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("HH");
        int entrada = Integer.parseInt(dtf5.format(LocalDateTime.now()));
        HoraDoDia.main(entrada);

    }

}


