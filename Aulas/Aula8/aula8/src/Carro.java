public class Carro extends Veiculo{
    private String marca;

    public Carro(String cor, String marca) {
        super(cor);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Carro(String cor) {
        super(cor);
    }


}
