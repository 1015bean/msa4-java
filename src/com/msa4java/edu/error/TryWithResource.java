package com.msa4java.edu.error;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {

        // Try With Resource: 일반 try문보다 기독성을 좋게하기 위해 사용
        try(FileWriter file = new FileWriter("text.txt")) {   // try(Resource를 사용하는 처리) {
            file.write("안녕");                                        // -> file.close() 따로 안 적어줘도 됨
        } catch(IOException e) {
            e.printStackTrace();
        }

        // 기존 try-catch문
        FileWriter file = null;                          // try와 finally에서 모두 이용하기 위해, 여기서 변수선언
        try {
            file = new FileWriter("test.txt");   // FileWriter(): 파일을 여는 메소드 로 객체 생성, 열기
            file.write("안녕");                       // write(): 텍스트파일을 작성
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            try {
            file.close();                                  // 파일을 열면 닫아줘야 함
            } catch(Exception e) {                         // file.close() 처리 중에 오류가 생길 때를 대비하여 예외처리해주기
                throw  new RuntimeException(e);
            }
        }
    }
}
