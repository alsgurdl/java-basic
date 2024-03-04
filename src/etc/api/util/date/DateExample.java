package etc.api.util.date;

import oop.static_.util.Utility;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import static oop.static_.util.Utility.makeLine;

public class DateExample {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        makeLine();

        //현재 날짜 정보 얻기 (연,월,일)
        LocalDate now = LocalDate.now();
        System.out.println(now);

        //현재 시간 정보 얻기
        LocalTime nowtime = LocalTime.now();
        System.out.println(nowtime);

        //현재 날짜와 시간 정보 얻기
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDateTime begin = localDateTime.of(2022,7,1,9,0,0);
        System.out.println(begin);

        //연월일 따로 추출
        int year = localDateTime.getYear();
        System.out.println(year);
        //문자 형태의 월 리턴  (Month는 열거형 타입 중하나)
        Month month = localDateTime.getMonth();
        System.out.println(month);
        int monthV = localDateTime.getMonthValue();
        System.out.println(monthV);
        
        //일 추출
        int dayval = localDateTime.getDayOfMonth();
        System.out.println(dayval);
        //요일 (열거형 타입 리턴
        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
        System.out.println(dayOfWeek);

        makeLine();

        //지금으로 부터 3일뒤
        LocalDateTime d2 = localDateTime.plusDays(3);
        System.out.println(d2);

        //지금으로 부터 1년 2개월 7일뒤
        LocalDateTime d3 = localDateTime
                .plusYears(1)
                .plusMonths(2)
                .plusDays(7);
        System.out.println(d3  );

        //지금으로부터 9개월 23일 전
        LocalDateTime d4 = localDateTime.minusMonths(9).minusDays(23);
        System.out.println(d4);

        //사이 날짜
        LocalDate b = LocalDate.of(2020,12,30);
        LocalDate f = LocalDate.of(2022,9,14);
        long between = ChronoUnit.MONTHS.between(b, f);
        System.out.println(between);
        makeLine();

        //날짜의 포멧 변경
        System.out.println(localDateTime);

        //datetimeformatter 객체 생성 원하는 날짜 형태를 서식문자로 표현

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초");
//준비한 datetimeformatter 객체를 formet
        System.out.println(localDateTime.format(dtf));

    }
}
