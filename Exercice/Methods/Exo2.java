public class Exo2 {
    private String nom;
    protected int age;
    String adresse;

    public Personne(String nom, int age, String adresse) {
        this.nom = nom;
        this.age = age;
        this.adresse = adresse;
    }

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

    public static void main(String[] args) {
        Personne personne = new Personne("Dupont", 30, "123 Rue Exemple");
        personne.afficherNom();
        personne.afficherAdresse();
    }
}

public class TestPersonne {
    public static void main(String[] args) {
        Personne personne = new Personne("Martin", 25, "456 Rue Test");
        personne.afficherNom(); // Accessible car publique
        // personne.changerNom("Nouveau Nom"); // Non accessible car privée
        personne.afficherAge(); // Accessible car protégée (dans le même package)
        personne.afficherAdresse(); // Accessible car package-private (dans le même package)
    }
}