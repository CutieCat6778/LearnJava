
import java.util.Scanner;

public class App {
    private static long amountMoney = 0L;
    private static double interestRate = 0.0;
    private static byte years = 0;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in, "utf-8");

        amountMoney = getStartAmountMoney(scanner);
        interestRate = getInterestRate(scanner);
        years = getYears(scanner);
        final double profit = amountMoney * interestRate * (double) years;
        final long afterMoney = amountMoney + (long) profit;
        System.out.print("After " + years + " years, you will get: ");
        System.out.println((long)afterMoney + "$");
        System.out.println("You made " + (long) profit + "$ plus.");
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