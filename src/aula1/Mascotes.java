package aula1;

public class Mascotes {
    public static void main (String[] args){
        /*
        Para representar cada uma das características do animal de estimação, crie uma variável e
        atribua a ela o valor correspondente no Replit. Não se esqueça de dar o tipo certo ao que queremos que contenha.
        Para cada animal listado na tabela a seguir, teremos que exibir as informações correspondentes.
        As informações serão exibidas como o seguinte exemplo:

            “Shesheu 2 anos”
            “Shesheu come um quilo e meio e faz au au”
        */

        //cachorro
        String nomeCachorro = "Shesheu";
        int idadeCachorro = 2;
        double comidaCachorro = 1.5;
        String somCachorro = "au au";


        System.out.println( nomeCachorro + "tem " + idadeCachorro + "anos");
        System.out.println( nomeCachorro + "come " + comidaCachorro + "kg e faz:" + somCachorro);

        //Peixe
        String nomePeixe = "Nemo";
        int idadePeixe = 1;
        double comidaPeixe = 140;
        String somPeixe = "glub glub";


        System.out.println( nomePeixe + "tem " + idadePeixe + "anos");
        System.out.println( nomePeixe + "come " + comidaPeixe + "gramas e faz:" + somPeixe);


        //Gato
        String nomeGato = "Snow";
        int idadeGato = 3;
        double comidaGato = 0.5;
        String somGato = "miau miau";


        System.out.println( nomeGato + "tem " + idadeGato + "anos");
        System.out.println( nomeGato + "come " + comidaGato + "kg e faz:" + somGato);

    }
}
