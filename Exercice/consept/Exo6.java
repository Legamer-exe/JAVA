class Fusee {
    String nom;
    double poids;

    Fusee(String nom, double poids) {
        this.nom = nom;
        this.poids = poids;
    }

    void lancer() {
        System.out.println("La fusée " + nom + " est en phase de lancement.");
    }
}

class Ariane6 extends Fusee {
    Ariane6(double poids) {
        super("Ariane 6", poids);
    }

    void lancer() {
        super.lancer();
        System.out.println("La fusée " + nom + " commence son lancement avec une poussée spécifique.");
        System.out.println("Les étages de la fusée " + nom + " se séparent après le lancement.");
    }
}

public class Ariane6Lancement {
    public static void main(String[] args) {
        Ariane6 ariane6 = new Ariane6(500000.0);
        System.out.println("Fusée " + ariane6.nom + " créée, Poids : " + ariane6.poids + " kg.");
        ariane6.lancer();
    }
}