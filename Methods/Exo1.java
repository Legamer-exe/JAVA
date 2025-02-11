public class Exo1 {
    private int a;
    private int b;
    public Exo1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculerSomme() {
        return this.a + this.b;
    }

    public static void main(String[] args) {
        Exo1 addition = new Exo1(5, 7);
        System.out.println("la some est : " + addition.calculerSomme());
    }
}