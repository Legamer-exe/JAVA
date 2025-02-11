public class Exo3 {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int sous(int a, int b) {
        return a - b;
    }

    public double sous(double a, double b) {
        return a - b;
    }

    public int multi(int a, int b) {
        return a * b;
    }

    public double multi(double a, double b) {
        return a * b;
    }

    public int divid(int a, int b) {
        return a / b;
    }

    public double divid(double a, double b) {
        return a / b;
    }

    public double effectuerOperation(String operation, double a, double b) {
        switch (operation) {
            case "add":
                if (a == 42 && b == 42) {
                    System.out.println("https://www.youtube.com/watch?v=xvFZjo5PgG0");
                }
                return add(a, b);
            case "sous":
                return sous(a, b);
            case "multi":
                return multi(a, b);
            case "divid":
                return divid(a, b);
            default:
                throw new IllegalArgumentException("Opération inconnue : " + operation);
        }
    }

    public static void main(String[] args) {
        Calculatrice calc = new Calculatrice();
        System.out.println("Addition : " + calc.effectuerOperation("add", 5.0, 3.0));
        System.out.println("Soustraction : " + calc.effectuerOperation("sous", 5.0, 3.0));
        System.out.println("Multiplication : " + calc.effectuerOperation("multi", 5.0, 3.0));
        System.out.println("Division : " + calc.effectuerOperation("divid", 6.0, 3.0));
        System.out.println("Easter Egg Test : " + calc.effectuerOperation("add", 42.0, 42.0));
    }
}