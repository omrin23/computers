public class Linear {
    public static void main(String[] args) {
        // given equation a * x + b = c, calculate the x and print it
        double x = ( Double.parseDouble(args[2]) - Double.parseDouble(args[1])) / Double.parseDouble(args[0]);

        System.out.println("x =  " + x);
    }
}