package com.huytcm.vqtx.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringUtil {
	
	private static final String dateFormatPattern = "yyyyMMdd-hh:mm:ss";
	
	public static String getStringDate(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(dateFormatPattern);
		String stringDate = dateFormat.format(date);
		return stringDate;
	}
	
	public static Date getDateFromString(String stringDate) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat(dateFormatPattern);
		Date date = dateFormat.parse(stringDate);
		return date;
	}
}
