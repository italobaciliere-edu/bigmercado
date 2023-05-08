package br.com.bigmercado.bigmercado.utilitarios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilitarios {

    private final Scanner sc = new Scanner(System.in);

    private void limpezaDoBuffer(){
        if(sc.hasNextLine()) sc.nextLine();
    }

    public String getStringInput(){
        return "a";
    }

    public int getIntInput(){

        Scanner scanner = new Scanner(System.in);
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
}
