package br.edu.univas;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String entrada;

        do{
            System.out.println("Digite uma palavra com até 40 caracteres: ");
            entrada = leitura.nextLine();
        }while (entrada.length() > 40 || entrada.trim().isEmpty());

        int numUnderlines = 40 - entrada.length();

        String resultado = "_".repeat(numUnderlines) + entrada;

        System.out.println("Resultado: " + resultado);

        leitura.close();
    }
}
