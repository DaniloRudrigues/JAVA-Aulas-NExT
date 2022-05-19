public class Retangulo extends Quadrilatero {
    private float lado;
    private float altura;

    public Retangulo(float lado, float altura) {
        super();
        this.lado = lado;
        this.altura = altura;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public float CalcularArea(){
        return this.lado * this.altura;
    }
    @Override
    public float calcularPerimetro(){
        return 2*(this.lado+this.altura);
    }
    
}
