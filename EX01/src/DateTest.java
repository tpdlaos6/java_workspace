
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Calendar time=Calendar.getInstance();
		System.out.println(time.get(Calendar.YEAR));
		System.out.println(time.get(Calendar.MONTH)+1); // 0부터 시작해서 +1해야함...;;;
		System.out.println(time.get(Calendar.DAY_OF_MONTH));
		System.out.println(time.get(Calendar.HOUR));
		System.out.println(time.get(Calendar.HOUR_OF_DAY));
		System.out.println(time.get(Calendar.MINUTE));
		System.out.println(time.get(Calendar.SECOND));
		System.out.println(time.get(Calendar.MILLISECOND));
		
		Date now=new Date();
		System.out.println(new SimpleDateFormat("yyyy").format(now));
		System.out.println(new SimpleDateFormat("MM").format(now));
		System.out.println(new SimpleDateFormat("dd").format(now));
		System.out.println(new SimpleDateFormat("hh").format(now));
		System.out.println(new SimpleDateFormat("HH").format(now));
		System.out.println(new SimpleDateFormat("ss").format(now));
		System.out.println(new SimpleDateFormat("SSS").format(now));
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(now));
		
		
	}

}
