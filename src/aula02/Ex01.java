package aula02;

  import java.util.Scanner;

public class Ex01 {

    /*
    public = todo mundo pode acessar (acesso liberado)
    static = executa igual para todas
    void = não retorna valor no método.
     */

        public static String dataNasc(String dia, String mes, String ano){
            String data = dia + "/" + mes + "/" + ano;

            //o que vai ser retornado
            return data;
        }

        // main + (ctrl + space) + enter
        public static void main(String[] args) {

            //System.in - Receber do usuário
            Scanner entrada = new Scanner(System.in);

            // sout + tab ou enter
            System.out.println("Digite seu nome: ");
            String nome = entrada.nextLine();
            System.out.println("Digite seu sobrenome: ");
            String sobrenome = entrada.nextLine();

            System.out.println("Digite sua data de aniversário: DD/MM/YYYY");
            String dia = entrada.nextLine();
            String mes = entrada.nextLine();
            String ano = entrada.nextLine();

            char inicialN = nome.charAt(0);
            char inicialS = sobrenome.charAt(0);

        /*
        nome.substring(0, 1);
        sobrenome.substring(0, 1);
        */

            System.out.println("Seu nome é: " + nome + "\n Suas iniciais: " + inicialN + " " + inicialS + "\n Data de nascimento: " + dataNasc(dia, mes, ano) );

        }


}
