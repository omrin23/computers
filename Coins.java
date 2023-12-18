public class Coins {
    public static void main(String[] args) {
        // Get the amount of coins and print the number of quaters and cents it represents
        int quarters = Integer.parseInt(args[0]) / 25;
        int cents = Integer.parseInt(args[0]) % 25;

        System.out.println("Use " + quarters + " quarters and " + cents + " cents");
    }
}