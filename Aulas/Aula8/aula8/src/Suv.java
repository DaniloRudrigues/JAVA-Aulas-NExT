public class Suv extends Carro{
    private int numLugares;

    public Suv(String cor, String marca, int numLugares) {
        super(cor, marca);
        this.numLugares = numLugares;
    }

    public int getNumLugares() {
        return numLugares;
    }

    public void setNumLugares(int numLugares) {
        this.numLugares = numLugares;
    }


}
