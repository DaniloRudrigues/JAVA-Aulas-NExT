public class Divisao implements OperacaoMatemetica {
    private int a;
    private int b;
    
    public Divisao(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public int calcula(){
        return this.a / this.b;
    }
}
