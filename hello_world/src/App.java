
import java.util.Scanner;

public class App {
    private static long amountMoney = 0L;
    private static double interestRate = 0.0, afterMoney = 0;
    private static byte years = 0;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in, "utf-8");

        amountMoney = getStartAmountMoney(scanner);
        interestRate = getInterestRate(scanner);
        years = getYears(scanner);
        afterMoney = amountMoney + amountMoney * interestRate * (double) years;
        System.out.print("After " + years + " years, you will get: ");
        System.out.println((long)afterMoney + "$");
        scanner.close();
    }

    private static long getStartAmountMoney(Scanner scanner) throws Exception {
        System.out.println("What is the your start money?");
        long amountMoney = scanner.nextLong();
        return amountMoney;
    }

    private static double getInterestRate(Scanner scanner) throws Exception {
        System.out.println("What is the interest rate?");
        double rate = scanner.nextDouble();
        return rate;
    }

    private static byte getYears(Scanner scanner) throws Exception {
        System.out.println("After how many years?");
        byte amountMoney = scanner.nextByte();
        return amountMoney;
    }
}