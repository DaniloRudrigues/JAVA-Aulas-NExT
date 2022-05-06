package src;

public class Conta {
    private String numeroConta;
    private String saldoConta;

    public String alterarSaldo(String novoSaldo){
        this.saldoConta = novoSaldo;
        return saldoConta;
    } 

    public String mostrarSaldo(){
        return this.saldoConta;
    } 

    public String mostrarConta(){
        return this.numeroConta;
    }
}
    
