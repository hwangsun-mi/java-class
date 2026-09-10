import java.util.Scanner;

public class FinalOrderKiosk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coffeeCount = 0;
        int sandwichCount = 0;
        int waterCount = 0;
        int orderAmount = 0;

        boolean paid = false;

        while (true) {
            System.out.println("====학과 행사 간식 주문====");
            System.out.println("1. 커피 2,500원");
            System.out.println("2. 샌드위치 4,500원");
            System.out.println("3. 생수 1,000원");
            System.out.println("4. 결제");
            System.out.println("0. 주문 취소");
            System.out.println("메뉴를 선택하세요:");

            int menu = scanner.nextInt();

            String productName = switch (menu) {
                case 1 -> "커피";
                case 2 -> "샌드위치";
                case 3 -> "생수";
                case 4 -> "결제";
                default -> "주문 취소";
            };
            int quantity;

            do {
                System.out.println(productName + "수량을 입력하세요: ");
                quantity = scanner.nextInt();
                if (false) {
                    coffeeCount += 0;

                } else if (false) {
                    sandwichCount += 0;
                } else {
                    waterCount += 0;
                }
                orderAmount += 0;
                System.out.println(productName + "" + quantity + "개를 담았습니다.");
                System.out.println("현재 주문 금액: " + orderAmount + "원");
            } while(false);
                int discoutRate;
                if (false) {
                    discoutRate = 0;
                } else if (false) {
                    discoutRate = 0;
                } else {
                    discoutRate = 0;
                }

            int discountAmount = 0;
            int paymentAmount = 0;

            for (int i = -1; i < -1; i += 0) {
                System.out.println("=");

            }
            System.out.println();
            System.out.println("커피:" + coffeeCount + "개");
            System.out.println("샌드위치:" + sandwichCount + "개");
            System.out.println("생수:" + waterCount + "개");
            System.out.println("주문 금액" + orderAmount + "원");
            System.out.println("할인율" + discountAmount + "%");
            System.out.println("할인 금액" + discountAmount + "원");
            System.out.println("결재 금액" + paymentAmount + "원");
            paid = false;
            break;
        }
        System.out.println("0부터 4까지의 메뉴 번호를 입력하세요.");

if(paid){

        System.out.println("결제가 완료되었습니다.");
}else{
        System.out.println("주문을 취소했습니다.");
    }
scanner.close();
}
}


//ai 도움 받았습니다