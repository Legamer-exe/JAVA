abstract class Animal {
    String nom;
    Animal(String nom) {
        this.nom = nom;
    }
    abstract void seDeplacer();
}

class Mammifere extends Animal {
    Mammifere(String nom) {
        super(nom);
    }
    void seDeplacer() {
        System.out.println(nom + this.marcher());
    }
    String marcher() {
        return "marche sur ses pattes.";
    }
}

class Oiseau extends Animal {
    Oiseau(String nom) {
        super(nom);
    }
    void voler() {
        System.out.println(nom + " bat des ailes et vole.");
    }
}

class Reptile extends Animal {
    Reptile(String nom) {
        super(nom);
    }
    void ramper() {
        System.out.println(nom + " rampe.");
    }
}