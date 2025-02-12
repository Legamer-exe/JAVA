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
        System.out.println(nom + " marche.");
    }
    void marcher() {
        System.out.println(nom + " marche sur ses pattes.");
    }
}

class Oiseau extends Animal {
    Oiseau(String nom) {
        super(nom);
    }
    void seDeplacer() {
        System.out.println(nom + " vole.");
    }
    void voler() {
        System.out.println(nom + " bat des ailes et vole.");
    }
}

class Reptile extends Animal {
    Reptile(String nom) {
        super(nom);
    }
    void seDeplacer() {
        System.out.println(nom + " rampe.");
    }
}