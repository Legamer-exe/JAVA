public class Exo9 {
    public static void main(String[] args) {
        int rand = (int)(Math.random() * 42) + 1;
        boolean isEqual42 = (rand == 42);

        System.out.println("Le nombre aléatoire est : " + rand);
        System.out.println("Est-ce égal à 42 ? " + isEqual42);
    }
}