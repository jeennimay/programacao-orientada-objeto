package aula05;

public class Principal {
    public static void main(String[] args){
        Cliente cliente = new Cliente(2, "Jennifer");
        System.out.println(cliente.getNome());
        System.out.println(cliente.getDivida());
        cliente.aumentaDvida(500);
        System.out.println(cliente.getDivida());
        cliente.setNome("Yana");
        System.out.println(cliente.getNome());

    }
}
