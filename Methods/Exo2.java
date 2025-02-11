public class Exo2 {
    private String nom;
    protected int age;
    String adresse;

    public void afficherNom() {
        System.out.println("Nom : " + nom);
    }

    private void changerNom(String nom) {
        this.nom = nom;
    }

    protected void afficherAge() {
        System.out.println("Âge : " + age);
    }

    void afficherAdresse() {
        System.out.println("Adresse : " + adresse);
    }
}

public class Main {
    public static void main(String[] args) {
        Personne personne = new Personne();
        personne.afficherNom();
        personne.afficherAdresse();
    }
}

public class TestVisibilite {
    public static void main(String[] args) {
        Personne personne = new Personne();
        personne.afficherNom();
        personne.afficherAdresse();
    }
}