class Employe {
    void travailler() {
        System.out.println("L'employé travaille.");
    }
}

class Enseignant extends Employe {
    void travailler() {
        System.out.println("L'enseignant enseigne.");
    }
}

class Directeur extends Employe {
    void travailler() {
        System.out.println("Le directeur gère l'école.");
    }
}

class PersonnelAdministratif extends Employe {
    void travailler() {
        System.out.println("Le personnel administratif effectue des tâches administratives.");
    }
}