package com.example.algorithm.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main5 {    //(오류뜸)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        char[] arrStr = str.nextToken().toCharArray();
        int le = 0, ri = arrStr.length - 1;
        char temp ;

        for(le = 0 ; le < arrStr.length; le++){
//            System.out.println("le = " + le + "/ ri = " + ri
//                    + "/arr[le] = " + arrStr[le]+ " /ri = " + arrStr[ri]);
            if(le >= ri) break;
            if(Character.isAlphabetic(arrStr[le])
             && Character.isAlphabetic(arrStr[ri])){
                temp = arrStr[le];
                arrStr[le] = arrStr[ri];
                arrStr[ri] = temp;
            }
            ri--;
        }

        for (char c : arrStr){
            System.out.print(c);
        }
    }
}
//kqQdj#@kd#g%$#kdj&&gk@kd$dQGk 입력
//kGQdd#@kk#g%$#jdk&&gd@kj$dQqk 정답


//[문제]
//영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고, 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
//
//[입력]
//첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
//a#b!GE*T@S
//
//[출력]
//첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
//S#T!EG*b@a

//class Main {
//    public String solution(String str){
//        String answer;
//        char[] s=str.toCharArray();
//        int lt=0, rt=str.length()-1;
//        while(lt<rt){
//            if(!Character.isAlphabetic(s[lt])) lt++;
//            else if(!Character.isAlphabetic(s[rt])) rt--;
//            else{
//                char tmp=s[lt];
//                s[lt]=s[rt];
//                s[rt]=tmp;
//                lt++;
//                rt--;
//            }
//        }
//        answer=String.valueOf(s);
//        return answer;
//    }
//
//    public static void main(String[] args){
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//        String str=kb.next();
//        System.out.println(T.solution(str));
//    }
//}