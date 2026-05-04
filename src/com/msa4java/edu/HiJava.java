// System.out.print 메소드로 출력 처리

package com.msa4java.edu;


public class HiJava {
    public static void main(String[] args) {
        // println: 글 출력(개행o)
        // print: 글 출력(개행x)
        System.out.println(1);
        System.out.print(2);
        System.out.println(2);

        // "안녕 자바 : 54"를 출력
        String str = "자바";
        int num = 54;
        System.out.printf("안녕 %s : %d", str, num);
    }
}
