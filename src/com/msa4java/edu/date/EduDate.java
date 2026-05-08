package com.msa4java.edu.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class EduDate {
    public static void main(String[] args) {

        // 현재 시간 획득 API
        LocalDateTime now = LocalDateTime.now();

        // 날짜 직접 지정 API: of & parse
        LocalDateTime targetDate = LocalDateTime.of(2026, 5, 1, 20, 35, 26);
        LocalDateTime parsed = LocalDateTime.parse("2026-05-01T20:35:26.123456789");

        // 날짜 계산하는 API
        LocalDateTime addOneDayByNow = now.plusDays(1);
        System.out.println(now.plusDays(1));  // now + 1day
        System.out.println(now);

        // 상대적인 날짜 변경 API: (TemporalAdjusters 클래스의 메소드들)
        // .with(): 날짜/시간의 특정 값을 "조정해서" 새로운 객체를 만드는 메소드
        LocalDateTime firstDayOfMonth = now.with(TemporalAdjusters.firstDayOfMonth()); // now과 같은달 첫날(1일)인 날짜
        LocalDateTime lastDayOfMonth = now.with(TemporalAdjusters.lastDayOfMonth());   // now과 같은달 마지막날인 날짜
        LocalDateTime nextMonday = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY)); // now의 다음주 월요일인 날짜

        // 날짜 비교 API
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2024, 9, 12);
        System.out.println(d1.isBefore(d2));
        System.out.println(d2.isBefore(d1));
        System.out.println(d1.isEqual(d2));

        // Period 객체: 날짜 비교
        Period p1 = Period.between(d1, d2);  // between(): 두 날짜의 차이를 Period 로 반환
        System.out.println(Math.abs(p1.getYears()));  // 두 날짜의 연도 단위에서 차이
        System.out.println(Math.abs(p1.getMonths())); // 두 날짜의 월 단위에서 차이
        System.out.println(Math.abs(p1.getDays()));   // 두 날짜의 일 단위에서 차이

        // 단위별 차이
        long untilDays = d1.until(d2, ChronoUnit.DAYS);
        System.out.println(Math.abs(untilDays));

        // 데이터 포멧 (DateTimeFormatter): 데이터의 형태를 변경
            // 날짜객체 -> 문자열 포맷
        DateTimeFormatter formet1 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"); // (커스텀한 패턴)으로 포맷터(틀) 생성
        String strNow = now.format(formet1);  // now를, 위에서 만들 포멧터(formet1)의 형식으로 변환
        System.out.println(strNow);

            // 문자열인 날짜 데이터 -> 날짜객체 포맷
        String creatsdAt = "2025-06-20 14:33:20";
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); // (커스텀한 패턴)으로 포맷터(틀) 생성
        LocalDateTime ldt = LocalDateTime.parse(creatsdAt, format2); // creatsdAt를, 위에서 만들 포멧터(formet2)의 형식으로 변환

            // LocalDateTime -> LocalDate 포맷
        LocalDate ldtTold = ldt.toLocalDate();
    }
}
