package date_in_java;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using java.util.date
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss");
		System.out.println("Current Date is: "+sdf.format(d));
		
		//using java.time package
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("Before Formatting: "+ldt);
		DateTimeFormatter formatted_dt = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate = ldt.format(formatted_dt);
	    System.out.println("After formatting: " + formattedDate);
	}

}
