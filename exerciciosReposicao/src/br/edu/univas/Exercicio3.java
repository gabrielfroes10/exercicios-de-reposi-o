package br.edu.univas;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        String[] palavras = frase.split(" ");
        String fraseComVogaisEmMaiusculo = "";
        for (int i = 0; i < palavras.length; i++) {
            String palavra = palavras[i];
            String palavraComVogaisEmMaiusculo = "";
            for (int j = 0; j < palavra.length(); j++) {
                char letra = palavra.charAt(j);
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    palavraComVogaisEmMaiusculo += Character.toUpperCase(letra);
                } else {
                    palavraComVogaisEmMaiusculo += letra;
                }
            }
            fraseComVogaisEmMaiusculo += palavraComVogaisEmMaiusculo + " ";
        }

        System.out.println("Frase com vogais em maiúsculo: " + fraseComVogaisEmMaiusculo);
    }

}
