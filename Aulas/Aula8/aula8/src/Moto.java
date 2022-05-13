public class Moto extends Veiculo{
    private String correia;

    public Moto(String cor, String correia) {
        super(cor);
        this.correia = correia;
    }

    public String getCorreia() {
        return correia;
    }

    public void setCorreia(String correia) {
        this.correia = correia;
    }

    public Moto(String cor) {
        super(cor);
    }

    
}
