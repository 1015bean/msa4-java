package com.msa4java.edu.enumeration;

// Week라는 이넘(클래스)
public enum Week {
    // private Week MONDAY = new Week("월요일");
    MONDAY("월요일")
    ,TUESDAY("화요일")
    ,WEDNESDAY("수요일")
    ,THURSDAY("목요일")
    ,FRIDAY("금요일")
    ,SATURDAY("토요일")
    ,SUNDAY("일요일");

    // 필드
    private final String krDay;

    // 메소드
    private Week(String day) {
        this.krDay = day;
    }

    // 메소드
    public String getKrDay() {
        return this.krDay;
    }
}

