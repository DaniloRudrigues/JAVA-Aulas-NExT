package src;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente c1 = new Cliente();
        c1.cpf = "01236547896";
        c1.nome = "Danilo Rudrigues";
      
        System.out.println(c1.cpf);
        System.out.println(c1.nome);
        
        Conta ncont = new Conta();
        ncont.alterarSaldo("5.586,12");
        System.out.println(ncont.mostrarSaldo());
        


    }
}
