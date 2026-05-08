// 예외처리(Exception Handling)
    // 예외(Exception): 소스코드에 의해서 수습될 수 있는 다소 미약한 오류
    // Try-Catch문
        // - try: 예외가 발생할 가능성이 있는 처리를 작성
        // - catch: 발생한 예외의 처리를 작성
        // - finally: 예외 발생 여부와 상관없이 가장 마지막에 항상 실행되는 처리 작성

package com.msa4java.edu.error;

public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            System.out.println("트라이 시작");

            double result = 10 / 0;

            System.out.println("트라이 끝");
        }catch(ArithmeticException e) {        // 어떤 종류의 예외를 잡을지 지정: ArithmeticException = 수학 계산 관련 예외
            System.out.println("ArithmeticException 에러");
            System.out.println(e.getMessage());  // e.getMessage(): 예외객체 안의 메시지 출력
        }catch(Exception e){
            // (다형성을 이용하여)Exception 객체로, 위에서 캐치하지 못한 오류들을 잡아냄
            System.out.println("캐치 들어옴");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("파이널리");
        }
    }
}
