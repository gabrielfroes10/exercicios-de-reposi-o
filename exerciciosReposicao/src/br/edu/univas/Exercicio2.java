package br.edu.univas;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma data no formato dd/mm/yyyy: ");
        String data = sc.nextLine();


        if (!data.matches("\\d{2}/\\d{2}/\\d{4}")) {
            System.out.println("Data inválida. O formato deve ser dd/mm/yyyy");
            return;
        }


        String[] partes = data.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);


        if (dia < 1 || dia > 31 || mes < 1 || mes > 12) {
            System.out.println("Data inválida");
            return;
        }


        String[] meses = {"", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        String[] dias = {"", "Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Onze", "Doze", "Treze", "Quatorze", "Quinze", "Dezesseis", "Dezessete", "Dezoito", "Dezenove", "Vinte", "Vinte e um", "Vinte e dois", "Vinte e três", "Vinte e quatro", "Vinte e cinco", "Vinte e seis", "Vinte e sete", "Vinte e oito", "Vinte e nove", "Trinta", "Trinta e um" };


        System.out.printf("%s de %s de %d\n", dias[dia], meses[mes], ano);

    }
}
