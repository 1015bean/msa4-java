package com.msa4java.edu.erecord;

public class PostDTO {
    // 필드
    private final String title;
    private final String content;

    // 생성자
    public PostDTO(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // getter
    public String getTitle() {
        return title;
    }
    public String getContent() {
        return content;
    }

    // toString 오버라이딩
//    @Override
//    public String toString() {
//        return this.getClass().getName();
//    }
}
