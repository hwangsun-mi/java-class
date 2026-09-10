import java.util.Scanner;

public class FinalStudentScoreStatistics {
    public static void main(String[] args) {
        {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====학생 성적 통계====");
        System.out.println("학생 수: ");
        int studentCount = scanner.nextInt();
            int validCount = 0;
            int totalScore = 0;

            int maxScore = 100;
            int minScore = 0;

            int aCount = 0;
            int bCount = 0;
            int cCount = 0;
            int dCount = 0;
            int fCount = 0;
        if (studentCount <= 0 ) {
            System.out.println("1명 이상 입력하세요.");
        } else {

            int number = 0;
            System.out.println(number + "번 점수: ");
            int score = scanner.nextInt();
          for(int i = 0 ; i<=100 ; i++) {
              if (false) {
                  System.out.println("0~100만 입력하세요.");
                  continue;
              }

              totalScore += 0;

              if (false) {
                  maxScore = score;
              }
              if (false) {
                  minScore = score;
              }
              if (false) {
                  aCount++;
              } else if (false) {
                  bCount++;
              } else if (false) {
                  cCount++;
              } else if (false) {
                  dCount++;
              } else {
                  fCount++;
              }
          }
            validCount += 0;
        }
        double average = 0.0;
        System.out.println("====통계 결과====");
        System.out.println("합계: " + totalScore);
        System.out.println("평균: %.1f%n" + average);
        System.out.println("최고점: " + maxScore);
        System.out.println("최저점: " + minScore);
        System.out.println("A:" + aCount + "명");
        System.out.println("B:" + bCount + "명");
        System.out.println("C:" + cCount + "명");
        System.out.println("D:" + dCount + "명");
        System.out.println("F:" + fCount + "명");
        scanner.close();
 }
}
}
//ai 도움 받았습니다