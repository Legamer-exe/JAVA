public class Calculatrice {

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
                return add(a, b);
            case "sous":
                return sous(a, b);
            case "multi":
                return multi(a, b);
            case "divid":
                return divid(a, b);
            case "easteregg":
                System.out.println("Vous avez trouvé l'easter egg !");
                return 0;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Calculatrice calc = new Calculatrice();
        System.out.println("Addition : " + calc.effectuerOperation("add", 5.5, 2.2));
        System.out.println("Soustraction : " + calc.effectuerOperation("sous", 10.0, 4.5));
        System.out.println("Multiplication : " + calc.effectuerOperation("multi", 3.3, 3.0));
        System.out.println("Division : " + calc.effectuerOperation("divid", 10.0, 2.0));
        calc.effectuerOperation("easteregg", 0, 0);
    }
}