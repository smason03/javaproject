import java.time.*;

public class DateTimeExamples {

	public static void main(String[] args){
		testDateTimes();
	}
 
	public static void testDateTimes() {
		LocalDate nowDate = LocalDate.now();
		LocalTime nowTime = LocalTime.now();
		LocalDateTime nowDateTime2 = LocalDateTime.now();
		LocalDateTime nowDateTime = LocalDateTime.of(nowDate, nowTime);
		System.out.println(nowDateTime);
		
		LocalDate ld1 = LocalDate.of(2025, 3, 17);
		System.out.println(ld1.getDayOfWeek());
		
		LocalDate ld3 = ld1.withMonth(5);
		System.out.println(ld3);

		LocalDate ld4 = ld3.plusYears(10);
		System.out.println(ld4);

	}
}