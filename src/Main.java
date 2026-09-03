import javax.swing.*;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
//int score = 50;
//String result;

//if (score >= 60){
//    result = "합격";
//}
//else {
//    result = "불합격";
//}

//        String name = "김자바";
//        int months = 6;
//        double rating = 4.567;
//        boolean available = true;
//        System.out.printf("이름: %s%n", name);
//        System.out.printf("개월: %d%n", months);
//        System.out.printf("평점: %.2f%n", rating);
//        System.out.printf("가능: %b%n", available);
//    }
//}

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("이름: ");
//        String name = scanner.nextLine();
//        System.out.println("반갑습니다, " + name);
//        scanner.close();
//    }
//}

        //  System.out.print("한 줄 소개: ");
        //  String raw = scanner.nextLine();
        //  String introduction = raw.trim();
        //  if (introduction.isBlank()) {
        //  System.out.println("소개를 입력해 주세요.");
        //  }else {
        //  System.out.println(introduction);
        //  }
//
//        public class DeveloperProfile {
//        public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        }
//        }
//        System.out.print("이름: ");
//        String name = scanner.nextLine().trim();
//        System.out.print("희망 직무: ");
//        String role = scanner.nextLine().trim();
//        System.out.print("GitHub 주소: ");
//        String githubUrl = scanner.nextLine().trim();
//        System.out.print("Java 학습 개월 수: ");
//        String monthsText = scanner.nextLine().trim();
//        int studyMonths = Integer.parseInt(monthsText);
//        System.out.print("프로젝트 수: ");
//        int projectCount = Integer.parseInt(
//                scanner.nextLine().trim());
//        System.out.print("즉시 취업 가능(true/false): ");
//        boolean available = Boolean.parseBoolean(
//                scanner.nextLine().trim());
//        System.out.println("\n개발자 프로필");
//        System.out.printf("이름: %s%n", name);
//        System.out.printf("희망 직무: %s%n", role);
//        System.out.printf("GitHub: %s%n", githubUrl);
//        System.out.printf("학습 기간: %d개월%n", studyMonths);
//        System.out.printf("프로젝트: %d개%n", projectCount);
//        System.out.printf("즉시 가능: %b%n", available);
//        System.out.printf("자기소개: %s%n", introduction);}
//}
//}
//        int temperature = 12;
//        int belowZero = -temperature;
//        System.out.println(temperature);
//        System.out.println(belowZero);
//        System.out.println(-belowZero);
//    }
//}
   /*   int count = 3;
        int a = ++count;
        int b = count++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(count);
    }
}*/
    /*    int total = 5;
        int people = 2;
        int a = total / people;
        double b = total / people;
        double c = (double) total / people;
        System.out.println(c);
    }
}*/
        /*int total = 5;
        int people = 2;
        double late
                = (double) (total / people);
        double early
                = (double) total / people;
        System.out.println(late);
        System.out.println(early);
    }
}*/
        /*int number = -7;
        System.out.println(number / 3);
        System.out.println(number % 3);
        boolean even = number % 2 == 0;
        boolean odd = number % 2 != 0;
        System.out.println(even);
        System.out.println(odd);
    }
}*/
        /*byte x = 10;
        byte y = 20;
        int result = x + y;
        byte wrong = x + y;
        byte narrowed = (byte) (x + y);
        System.out.println(result);
        System.out.println(narrowed);
    }
}*/
        /*int max = Integer.MAX_VALUE;
        int overflow = max + 1;
        System.out.println(max);
        System.out.println(overflow);
    }
}*/
        /*int a = 7;
        int b = 3;
        int result = a + b;
        System.out.println(result);
    }
}*/
        /*int a = 7;
        int b = 3;
        int result = a - b;
        System.out.println(result);
        }
}*/
      /*int a = 7;
        int b = 3;
        int result = a * b;
        System.out.println(result);
    }
}*/
   /*   int a = 7;
        int b = 3;
        int result = a / b;
        System.out.println(result);
    }
}*/
      /*int a = 7;
        int b = 3;
        int result = a % b;
        System.out.println(result);
    }
}*/
        /*int min = Integer.MIN_VALUE;
        int underflow = min - 1;
        System.out.println(min);
        System.out.println(underflow);
    }
}*/
       /* double sum = 0.0;
        sum += 0.1;
        sum += 0.1;
        sum += 0.1;
        sum += 0.1;
        sum += 0.1;
        sum += 0.1;
        sum += 0.1;
        sum += 0.1;
        sum += 0.1;
        sum += 0.1;
        System.out.println(sum);
    }
}*/
   /*     long priceWon = 3_500;
        long count = 4;
        long discountRate = 10;

        long subtotalWon = priceWon * count;
        long discountWon = subtotalWon * discountRate / 100;
        long paymentWon = subtotalWon - discountWon;

        System.out.println(paymentWon);
    }
}*/
        /*double normal = 10.0 / 2.0;
        double infinity = 10.0 / 0.0;
        double nan = 0.0 / 0.0;
        System.out.println(normal); // 5.0
        System.out.println(infinity); // Infinity
        System.out.println(nan); // NaN
    }
}*/
       /* double result = 10.0 / 0.0;
        boolean infinite
                = Double.isInfinite(result);
        boolean nan
                = Double.isNaN(result);
        boolean invalid = infinite || nan;
        System.out.println(infinite); // true
        System.out.println(nan); // false
        System.out.println(invalid); // true
    }
}*/
       /* String a = "Java";
        String b = "Java";
        String c = new String("Java");
        System.out.println(a == b); // true 가능
        System.out.println(a == c); // false
        System.out.println(a.equals(c)); // true
    }
}*/
       /* double nan = 0.0 / 0.0;
        System.out.println(nan == nan); // false
        System.out.println(nan != nan); // true
        boolean check = Double.isNaN(nan);
        System.out.println(check); // true
    }
}*/
       /* int age = 27;

        boolean atLeast19 = age >= 19;
        boolean atMost34 = age <= 34;
        boolean inRange = atLeast19 && atMost34;

        System.out.println(inRange);
    }
}*/
       /* int divisor = 0;
        boolean safe
                = divisor != 0
                && 10 / divisor > 1;
        System.out.println(safe); // false
    }
}*/
        /*int first = 7; // ...0111
        int second = 8; // ...1000
        int firstLastBit = first & 1;
        int secondLastBit = second & 1;
        System.out.println(firstLastBit); // 1
        System.out.println(secondLastBit); // 0
    }
}*/
       /* int value = 3;
        int one = value << 1;
        int two = value << 2;
        System.out.println(one); // 6
        System.out.println(two); // 12
        System.out.println(value >> 1); // 1
        System.out.println(value >>> 1); // 1
    }
}*/
 /*       int total = 0;
        total += 3_500;
        total += 2_000;
        total -= 500;
        System.out.println(total);
    }
}*/
       /* int score = 65;
        String result
                = score >= 60
                ? "합격"
                : "재시험";
        System.out.println(result); // 합격
    }
}*/
 /*       int price = 3_000;
        int delivery = 500;
        int count = 2;
        int first = price + delivery * count;
        int second = (price + delivery) * count;
        System.out.println(first); // 4000
        System.out.println(second); // 7000
    }

  */
    }
}