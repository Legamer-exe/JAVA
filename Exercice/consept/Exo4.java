abstract class Forme {
    abstract double calculerSurface();
}

class Cercle extends Forme {
    double rayon;
    Cercle(double rayon) {
        this.rayon = rayon;
    }
    double calculerSurface() {
        return Math.PI * rayon * rayon;
    }
}

class Rectangle extends Forme {
    double largeur, hauteur;
    Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    double calculerSurface() {
        return largeur * hauteur;
    }
}