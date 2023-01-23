public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 1_000;
        int cost = 20;
        int miles = service.calculate(cost, price);
        System.out.println("Начисленные мили");
        System.out.println(miles);
    }
}