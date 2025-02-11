public class Addition {
    private int a;
    private int b;

    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculerSomme() {
        return this.a + this.b;
    }

    public static void main(String[] args) {
        Addition addition = new Addition(5, 7);
        System.out.println("La somme est : " + addition.calculerSomme());
    }
}
