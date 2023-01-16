public class Runner {
    public static void main(String[] args) {
        Planet planet = new Planet("Mars", 908973);
        String name = planet.getName();
        int size = planet.getSize();

        System.out.printf("%s is %d", name, size);

        System.out.println(planet.explode());
    }
}