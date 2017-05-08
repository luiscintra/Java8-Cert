package java8.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Time {
	
	public static void main(String[] args) {
		
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		
		System.out.println(LocalDate.of(2017, Month.JANUARY, 31));
		System.out.println(LocalDate.of(2017, 3, 31));
		
		System.out.println(LocalTime.of(12, 30));
		System.out.println(LocalTime.of(15, 0, 30));
		System.out.println(LocalTime.of(18, 32, 07, 9997654));
		
		
		LocalDate date = LocalDate.of(2017, 3, 31);
		LocalTime time = LocalTime.of(12, 30);
		
		System.out.println(LocalDateTime.of(2017, 06, 12, 18, 0, 0));
		
		LocalDateTime ldt = LocalDateTime.of(date, time);
		
		System.out.println(ldt);
		
		LocalDate today = LocalDate.now();
		
		LocalDate tomorrow = LocalDate.now().plusDays(1);
		
		if (today.isBefore(tomorrow)) {
			System.out.println("Today comes first");
		}
		
		System.out.println(today.toEpochDay());
		
		LocalDate d1969 = LocalDate.of(1969, 1, 1);
		System.out.println(d1969.toEpochDay());
		
		Period period = Period.ofMonths(11);
		
		System.out.println(today.plus(period));
		
		Period rememberToNeverChainPeriods = Period.of(1, 1, 1);
		
		System.out.println(today.plus(rememberToNeverChainPeriods));
		
		System.out.println(date.getMonth() + " "+ date.getDayOfWeek());
		
		System.out.println(date.format(DateTimeFormatter.ISO_DATE));
		
		System.out.println(date.format(DateTimeFormatter.ISO_DATE));
		
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		
		
		
		System.out.println(ldt.format(f));
		
		
		
	}

}
