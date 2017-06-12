package util;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.huytcm.vqtx.util.StringUtil;

public class UTStringUtils {

	@Test
	public void tc01_DateToString() {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(0);
		cal.set(2017, 5, 9, 10, 00, 11); // month add 1
		Date date = cal.getTime();
		String stringDate = StringUtil.getStringDate(date);
		
		assertEquals("20170609-10:00:11", stringDate);
	}
	
	@Test
	public void tc01_StringToDate() {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(0);
		cal.set(2017, 5, 9, 10, 00, 11); // month add 1
		String stringDate = "20170609-10:00:11";
		Date date = null;
		
		try {
			date = StringUtil.getDateFromString(stringDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(cal.getTime(), date);
	}

}
