package kr.ac.daegu.ysy;
import com.sun.javaws.IconUtil;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    // public static void main(String[] args) {
        /*
	    System.out.println("My name is Gil Dong.");
        System.out.println("I am 13 years old.");
        */



        /*
        float yd = 91.44f;
        float in = 2.54f;
        float yardToCm = 2.1f * yd;
        float inchToCm = 10.5f * in;


        //String strYardTOCm = String.format("%1f",yardToCm);
        //String strInchTOCm = String.format("%1f",inchToCm);

        System.out.println("2.1yd :" + (Math.round(yardToCm*10)/10.0) + "Cm");
        System.out.println("10.5in :" +(Math.round(inchToCm*10)/10.0) + "Cm");
        */



        /*
        String str = "abcde"; // 변수의 타입 (변수 = 값, 객체, 자료구조 담는 그릇) 기본형 =값, 참조형 =객체
        String jjj = str.toUpperCase();
        String yyy = str.substring(0, 3);
        System.out.println(jjj);
        System.out.println(yyy);
        */



        /*
        String str = "abcde@ddd.co.kr";
        String[] yyyy = str.split("\\.");   //regex > 정규식을 넣어라
        System.out.println(yyyy[0]);
        System.out.println(yyyy[1]);
        System.out.println(yyyy[2]);
        */

        /*
        //입력받기 예제5
        //
        Scanner sc = new Scanner(System.in));
        Scanner sc2 = new Scanner(System.in);
        System.out.println("두 개의 문자열을 입력하세요");
        String str =sc.nextLine()+sc2.nextLine();
        //String str2 =sc2.nextLine();



        System.out.println("입력받은값 : " + str.length());
        //System.out.println("입력받은값 : " + str2.length());
        */

        /*
        //문자열을 입력받고 정수를 입력 받아서 문자열의 맨 뒤부터 정수만큼 출력하는 프로그램을 작성하시오.
        // 만약 입력받은 정수가 문자열의 길이보다 크다면 맨 뒤부터 맨 처음까지 모두 출력한다.
        //(문자열 길이는 최대 100자 이하이다. )
        int num = 0;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        num = sc.nextInt()-1;

        System.out.println(str.substring(num));

         */




    /*
          public static void main(String[] args) {
            //문자열의 길이 제한
            final int STR_LENGTH_LIMIT =5;




            // 입력받기 20자를 30자로 고쳐줘
            Scanner sc = new Scanner(System.in);
            System.out.println("첫번째 문자열 을 입력하세요");
            String str = sc.nextLine();

            checkStrLength(str, STR_LENGTH_LIMIT);   // 이 메소드의 역할 :



            System.out.println("두번째 문자열 을 입력하세요");
            String str2 = sc.nextLine();



            System.out.println("입력받은 값(첫번째): " + str);
            System.out.println("입력받은 값(두번째): " + str2);
            int sum = str.length() + str2.length();
            System.out.println("=============");
            System.out.println("길이: " + sum);



    }

    private static void checkStrLength(String str, int STR_LENGTH_LIMIT) {    //String str 의 뜻 : 파라미터=인자
        if(str.length() > STR_LENGTH_LIMIT) {
            11System.out.println("문자열1의 길이는 "+STR_LENGTH_LIMIT+"자 미만 이어야 합니다.");
            System.exit(0);
    }
    }
    */
    /*
    //for문
    public static void main(String[] args){

        for(int i=0; i <= 10; i++){
            System.out.print(i);


        }
        System.out.println("\n---------");
    String[] strs = {"1","2","3","4","5"};


        for(String s : strs) {      //foreach문
            System.out.println(s);
        }

    }

     */
    public static void main(String[] args){
        JungolPractice jp = new JungolPractice(); // instance : 메모리에 객체를 적재하여 실행하도록 함
        jp.practice5();
    }






}
