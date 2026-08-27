import java.util.Scanner;

public class DeveloperProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름: ");
        String name = scanner.nextLine().trim();
        System.out.print("희망 직무: ");
        String role = scanner.nextLine().trim();
        System.out.print("GitHub 주소: ");
        String githubUrl = scanner.nextLine().trim();
    }
}