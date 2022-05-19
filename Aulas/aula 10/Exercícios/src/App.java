public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println();
        System.out.println("Primeira e segunda Questões");
        Retangulo q1 = new Retangulo(2, 3); 
        float area = q1.CalcularArea();
        float peri = q1.calcularPerimetro();
        System.out.println(area);
        System.out.println(peri);

        System.out.println();
        System.out.println("Terceira Questão");
        Soma d = new Soma(3,5);
        float div = d.calcula();
        System.out.println(div);
    }
}
