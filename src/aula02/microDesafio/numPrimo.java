package aula02.microDesafio;
import java.util.Scanner;

import static java.lang.System.*;

public class numPrimo {
    /*
    Exercício 1
Faça uma função que, dado um número, indique se é um número primo ou não.
Um número primo é aquele que só pode ser dividido por 1 e ele mesmo.
Por exemplo: 25 não é primo, pois 25 é divisível por 1, 5 e 25. 17 é primo porque só pode ser dividido por 1 e por 17.
Para usar esta função que iremos criar  em um programa, podemos  permitir a entrada de apenas um número
para verificar se o número é primo ou não.
Para resolvê-lo, use a função obtida no exercício desenvolvido na aula assíncrona,
Boolean e Divisível (int n, int divisor).
*/
/*
    Exercício 2
Escreva uma função que receba três números e retorne o máximo dos três números.
int maximoEntreTresNumeros(int umNumeroA, int umNumeroB, int umNumeroC)
Em seguida, faça um programa que permita a entrada de 3 valores, use a função e exiba o resultado.
*/

       public static void main(String[] args) {
            Scanner entrada = new Scanner(in);
            out.println("Digite o número");
            int number = entrada.nextInt();
            out.println(primeNumber(number));
       }
       public static boolean primeNumber(int number) {
            int divisor = 0;
            for (int i = divisor; i > 0; i++){
                if (number % i == 0)
                    divisor++;
            }
            if (divisor > 2) {
                return false;
                //System.out.println("O número " + number + " não é primo! ");
            }else{
                return true;
                //System.out.println("O número " + number + " é primo! ");
            }
       }
    }


/*
public class Main {
    //GRUPO 2
    public static boolean ePrimo(int number) {
        for(int i = 2; i <= number/2; i++) {
            if(number%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int maximo(int number1, int number2, int number3) {
        if (number1 > number2 && number1 > number3) {
            return number1;
        }else if (number2 > number1 && number2 > number3) {
            return number2;
        }else {
            return number3;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Verifique se um número é primo!");
        System.out.println("Digite um número:");
        int number = scanner.nextInt();
        if(ePrimo(number)) {
            System.out.println("é primo!");
        }else {
            System.out.println("Não é primo!");
        }
        System.out.println("Digite três números e iremos dizer qual é o maior!");
        System.out.println("Número 1:");
        int n1 = scanner.nextInt();
        System.out.println("Número 2:");
        int n2 = scanner.nextInt();
        System.out.println("Número 3:");
        int n3 = scanner.nextInt();
        System.out.println(maximo(n1,n2,n3));
    }
}
 */

