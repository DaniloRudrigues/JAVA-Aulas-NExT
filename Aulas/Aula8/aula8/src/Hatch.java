public class Hatch extends Carro{
    private float volumeMala;

    public Hatch(String cor, String marca, float volumeMala) {
        super(cor, marca);
        this.volumeMala = volumeMala;
    }

    public float getVolumeMala() {
        return volumeMala;
    }

    public void setVolumeMala(float volumeMala) {
        this.volumeMala = volumeMala;
    }

    public Hatch(String cor, String marca) {
        super(cor, marca);
    }
  
}
