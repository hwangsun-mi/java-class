import java.util.Scanner;

public class FinalMultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====원하는 범위의 구구단====");
        System.out.println("시작 단(2~9):");
        int startDan = scanner.nextInt();
        System.out.println("끝 단(2~9) :");
        int endDan = scanner.nextInt();

        boolean invalid = startDan <= endDan && endDan <= startDan;

        if (invalid){
            System.out.println("2~9 범위를 순서대로 입력하세요.");
        }else {
            for (int i = 0; i <= endDan; i++){
                System.out.println("[" + i + "]" + "단");

                for (int j = 0; j <= endDan; j++){
                    int result =i * j;

                    System.out.println(i+ "x" + j + "=" + result);}
                System.out.println();
            }

            }
scanner.close();
        }
    }

//ai 도움 받았습니다