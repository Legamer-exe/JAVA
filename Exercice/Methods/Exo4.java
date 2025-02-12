public class Compteur {
    private static int compteur = 0;

    public void incrementer(int valeur) {
        compteur += valeur;
    }

    public static void afficherCompteur() {
        System.out.println("Valeur actuelle du compteur : " + compteur);
    }

    public static void main(String[] args) {
        Compteur compteur1 = new Compteur();
        compteur1.incrementer(5);
        Compteur.afficherCompteur();

        Compteur compteur2 = new Compteur();
        compteur2.incrementer(10);
        Compteur.afficherCompteur();
    }
}