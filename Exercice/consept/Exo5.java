class Avion {
    void decoller() {
        System.out.println("L'avion décolle.");
    }
}

class AvionDeChasse extends Avion {
    @Override
    void decoller() {
        System.out.println("L'avion de chasse décolle rapidement.");
    }
}

class AvionDeTransport extends Avion {
    @Override
    void decoller() {
        System.out.println("L'avion de transport décolle lentement.");
    }
}

class PorteAvion {
    Avion[] avions;

    PorteAvion(Avion[] avions) {
        this.avions = avions;
    }

    void faireDecollerTousLesAvions() {
        for (Avion avion : avions) {
            avion.decoller();
        }
    }
}