package br.com.dio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HoraDoDia{
    public static void main(int entrada) {

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("HH");

        if(entrada < 12){
            System.out.println("Tenha um Bom dia");
        }
        else if(entrada > 12 && entrada < 18){
            System.out.println("Tenha uma Boa tarde");
        }
        else{
            System.out.println("Tenha uma Boa noite");
        }
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(dtf4.format(LocalDateTime.now())+ " No horario de Brasilia");
    }
}


