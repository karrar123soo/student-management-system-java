package jddc;

import java.time.LocalDate;
import java.time.LocalTime;

public class s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate t=LocalDate.now();
		System.out.println(t);
		System.out.println(t.getDayOfMonth());
		System.out.println(t.getDayOfYear());
		System.out.println(t.getDayOfWeek());
		System.out.println(t.getYear());
		System.out.println(t.getMonthValue());
		System.out.println(t.plusDays(2));
		System.out.println(t.plusWeeks(2));
		System.out.println(t.plusYears(2));
		
		System.out.println(t.minusDays(2));
		System.out.println(t.minusYears(2));
		System.out.println(t.minusYears(2));
	
		LocalTime to=LocalTime.now();
		System.out.println(to);
		System.out.println(to.getMinute());
		System.out.println(to.getHour());
		System.out.println(to.getNano());
		
		System.out.println(to.getSecond());
		System.out.println(to.plusHours(2));
		System.out.println(to.plusMinutes(2));
		System.out.println(to.plusNanos(2));
		
		LocalTime dt=LocalTime.now();
		System.out.println(dt);
		System.out.println(dt.getHour());
		System.out.println(dt.getSecond());
		System.out.println(dt.getNano());
		System.out.println(dt.getClass());
		System.out.println(dt.plusMinutes(2));
		System.out.println(dt.plusNanos(2));
		System.out.println(dt.minusHours(2));
		
		
		
		

	}

}
