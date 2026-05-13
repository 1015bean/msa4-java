package com.msa4java.edu.erecord;

public class RecordMain {
    public static void main(String[] args) {
        PostDTO postDTO = new PostDTO("제목1", "내용1");
        PostRecord postRecord = new PostRecord("제목2", "내용2");

        // 레코드 getter() 사용시 주의
        postDTO.getTitle();
        postRecord.title();  // 생성되는 getter메소드의 이름이 조금 다름

        // 레코드의 toString()
        System.out.println(postDTO.toString());     // PostDT클래스에서 toString 메소드 오버라이딩 안함: 디폴드 메소드 사용되어 주소값을 출력
        System.out.println(postRecord.toString());
    }
}
