import java.util.Scanner;

public class ExactPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("priceWon :  ");
        long priceWon = scanner.nextLong();
        System.out.print("count :   ");
        long count = scanner.nextLong();
        System.out.print("discountRate: ");
        long discountRate = scanner.nextLong();
        long subtotalWon = priceWon * count ;
        long discountWon = subtotalWon * discountRate / 100 ;
        long paymentWon = subtotalWon - discountWon;
        System.out.printf("priceWon: %,d원%n", subtotalWon);
        System.out.printf("count: %,d원%n", discountWon);
        System.out.printf("discountRate: %,d원%n", paymentWon);
        scanner.close();
    }
}

