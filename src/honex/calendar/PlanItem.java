package honex.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PlanItem {
	public Date  planDate;
	public String detail;
	public String peoples ="";
	
	
	public static Date getDatefromstring(String strDate) { 
		Date date = null ; 
		try {
			date = new SimpleDateFormat("yyyy-MM-dd").parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
		
	}
	
	public PlanItem(String date, String detail) {
		try {
			planDate = new SimpleDateFormat("yyyy-MM-dd").parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.planDate = getDatefromstring(date);
		this.detail = detail; // 나를 부른놈의 변수값을 초기화
	}
	
	public Date getDate() {
		return planDate;
	}
	
	public void addPeople(String name) { 
		peoples += name + ",";	
	}
	

}
