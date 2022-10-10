import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int luckyNumber = new Random().nextInt(10) + 1;
        System.out.println("Your lucky number " + luckyNumber);

    }
}