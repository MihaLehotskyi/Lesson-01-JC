package ua.lviv.lgs;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;


public class ConvertDate {
	public static void main(String[] args) {
		Date d = new Date(2021,6,9,10,12,30);
		DateToLocalDate(d);
		DateToLocalTime(d);
		DateToLocalDateTime(d);
	}
	public static void DateToLocalDate(Date d){
		System.out.println(d.getYear()+"-"+d.getMonth()+"-"+d.getDay());
	}
	public static void DateToLocalTime(Date d){
		System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
	}
	public static void DateToLocalDateTime(Date d){
		System.out.println(d.getYear()+"-"+d.getMonth()+"-"+d.getDay()+"T"+d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
	}
}
