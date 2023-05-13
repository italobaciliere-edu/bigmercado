package br.com.bigmercado.bigmercado.utilitarios;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilitarios {

    private final Scanner sc = new Scanner(System.in);

    private void limpezaDoBuffer(){
        if(sc.hasNextLine()) sc.nextLine();
    }

    public String getStringInput(){
        // TODO - resolver o buffer
        String value = null;
        do{
            try {
                value = sc.nextLine();
            }catch (InputMismatchException e){
                System.out.println("*** VALOR INVÁLIDO, INSIRA NOVAMENTE! ***");
            }
            limpezaDoBuffer();
        }while(value.isEmpty());
        return value;
    }

    public int getIntInput(){
        int value;
        do{
            try {
                value = sc.nextInt();
            }catch (InputMismatchException e){
                value = 0;
                System.out.println("*** VALOR INVÁLIDO, INSIRA NOVAMENTE! ***");
            }
            limpezaDoBuffer();
        }while(value == 0);
        return value;
    }

    public String formatadorDeData(ZonedDateTime date){
        return DateTimeFormatter.ofPattern("dd/MM/uuuu").format(date);
    }
}
