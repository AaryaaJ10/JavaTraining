public class Main {
    public static void main(String[] args) {
        Nicolas nicolas = new Nicolas();
        Sol sol = new Sol();
        nicolas.health = 1000;
        sol.health = 1500;

        nicolas.attack();
        sol.attack();

        System.out.println(nicolas.health);
        System.out.println(sol.health);
    }
}