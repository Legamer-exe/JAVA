public class Exo10 {
    public static void main(String[] args) {
        int my42Int = 42;
        double my42Double = 42.0;
        char my42Char = 'a';
        float my42Float = 42.0f;
        boolean my42Boolean = true;
        String my42String = "42";
        long my42Long = 42L;
        short my42Short = 42;
        byte my42Byte = 42;

        System.out.println(((Object)my42Int).getClass().getSimpleName());
        System.out.println(((Object)my42Double).getClass().getSimpleName());
        System.out.println(((Object)my42Char).getClass().getSimpleName());
        System.out.println(((Object)my42Float).getClass().getSimpleName());
        System.out.println(((Object)my42Boolean).getClass().getSimpleName());
        System.out.println(((Object)my42String).getClass().getSimpleName());
        System.out.println(((Object)my42Long).getClass().getSimpleName());
        System.out.println(((Object)my42Short).getClass().getSimpleName());
        System.out.println(((Object)my42Byte).getClass().getSimpleName());
    }
}