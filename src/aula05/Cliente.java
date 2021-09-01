package aula05;

public class Cliente {
    private int numeroCliente;
    private String nomeCliente;
    private double divida;

    public Cliente(int numeroCliente, String nome){
        this.numeroCliente = numeroCliente;
        this.nomeCliente = nomeCliente;
        this.divida = 0;
    }

    public int getNumeroCliente(){
        return numeroCliente;
    }

    public int setNumeroCliente(int numeroCliente){
        return this.numeroCliente = numeroCliente;
    }

    public String getNome(){
        return this.nomeCliente;
    }

    public void setNome(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }


    public double getDivida(){
        return divida;
    }

    public void setDivida(double divida){
        this.divida = divida;
    }


    public String aumentaDvida(double valor){
        this.divida = divida + valor;
        return "Sua divida aumentou: " + this.divida;
    }

    public String pagarDivida(){
        this.divida = 0;
        return "Você pagou sua dívida";
    }
}
