public class Caminhonete extends Carro{
    private boolean cabineExtendida;

    public Caminhonete(String cor, String marca, boolean cabineExtendida) {
        super(cor, marca);
        this.cabineExtendida = cabineExtendida;
    }

    public boolean isCabineExtendida() {
        return cabineExtendida;
    }

    public void setCabineExtendida(boolean cabineExtendida) {
        this.cabineExtendida = cabineExtendida;
    }

    
}
