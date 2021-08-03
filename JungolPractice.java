package kr.ac.daegu.ysy;
import java.text.DecimalFormat;
import java.util.Scanner;
public class JungolPractice {
    // 출력: 자가진단 1
    // http://jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=140&sca=10
    public void practice1() {
        System.out.println("My name is Hong Gil Dong.");
        System.out.println("I am 13 years old.");
        //javascript 같은 경우
        // console.log('hihi');
        char ch = 'a';
    }

    /*
     * 1야드(yd)는 91.44cm이고 1인치(in)는 2.54cm이다.
     * 2.1야드와 10.5인치를 각각 cm로 변환하여
     * 다음 형식에 맞추어 소수 첫째자리까지 출력하시오.
     * */
    public void practice2() {
        float yd = 91.44f; // 실수는 float
        float in = 2.54f;
        float yardToCm = 2.1f * yd;
        float inchToCm = 10.5f * in;
        String strYardToCm = String.format("%.1f", yardToCm);
        String strInchToCm = String.format("%.1f", inchToCm);
        System.out.println("2.1야드toCm : " + strYardToCm);
        System.out.println("10.5인치toCm : " + strInchToCm);
    }

    // 1 두 개의 문자열을 입력받아서
    // 2 두 문자열의 길이의 합을 출력하는 프로그램을 작성하시오.
    // 3 각 문자열의 길이는 30자 미만이다.
    public void practice3() {
        // 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 문자열 을 입력하세요");
        String str = sc.nextLine();
        if (str.length() > 30) {
            System.out.println("문자열1의 길이는 20자 미만 이어야 합니다.");
            return;
        }
        System.out.println("두번째 문자열 을 입력하세요");
        String str2 = sc.nextLine();
        if (str2.length() > 30) {
            System.out.println("문자열2의 길이는 20자 미만 이어야 합니다.");
            return;
        }
        System.out.println("입력받은 값(첫번째): " + str);
        System.out.println("입력받은 값(두번째): " + str2);
        int sum = str.length() + str2.length();
        System.out.println("=============");
        System.out.println("길이: " + sum);
    }

    // 5개의 정수를 입력받아 모두 붙여서 문자열로 저장한 후 세 자씩 나누어서 출력하는 프로그램을 작성하시오.
    public void practice4() {
        System.out.println("practice4");
    }

    public void practice5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 문자열 을 입력하세요");
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();
        String str4 = sc.nextLine();
        String str5 = sc.nextLine();
        String sum = str + str2 + str3+ str4 + str5;
        int[] A = new int[sum.length()]; // sum 문자열 길이만큼 배열 준비.
        for(int i=0;i<sum.length();i++) {
            A[i] = sum.charAt(i) - '0'; // i=0 일때, '1' - '0' = 1 이됨.
        }
        for (int i = 0; i < sum.length(); i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println();
            }
            System.out.print(sum.charAt(i));
        }









    }
}
