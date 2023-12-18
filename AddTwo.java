public class AddTwo {
    public static void main(String[] args) {
        // Prints the sum of the two numbers
        int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
        System.out.println(args[0] + " + " + args[1] + " = " + sum);
    }
}