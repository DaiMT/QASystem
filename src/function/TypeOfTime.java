package function;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TypeOfTime {

	
	/**
	 * get SerialTrade date from the type of 2013-05-16
	 * @param dateString
	 * @return
	 */
	private static int getSerialDate(String dateString) throws Exception{
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		StringBuffer sbu = new StringBuffer();
		sbu.append(dateString.substring(0,4));
		sbu.append("-");
		sbu.append(dateString.substring(4,6));
		sbu.append("-");
		sbu.append(dateString.substring(6));
		Date date = sdf.parse(sbu.toString());
		Date date0 = sdf.parse("0000-01-01");
		long time = date.getTime()-date0.getTime();
		int serialDate = (int)(time/(60*60*24*1000));
		return serialDate;
	}
	
	
	/**
	 * change the form of stopDates to the type of "20150102"
	 * @param stopday
	 * @return
	 */
	private static String changeDateForm(String stopday) {
		// TODO Auto-generated method stub
		StringBuffer sbu = new StringBuffer();
		if(stopday.contains("-")){
			String[] array = stopday.split("-");
			sbu.append(array[0]);
			sbu.append(array[1]);
			sbu.append(array[2]);
		}else{
			String[] array = stopday.split("/");
			sbu.append(array[0]);
			sbu.append(array[1]);
			sbu.append(array[2]);
		}
		return sbu.toString();
	}
	
	
	/**
	 * get SerialTime
	 * @param date
	 * @param string
	 * @return
	 */
	private static double getSerialTime(String dateString, String time) throws Exception{
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date date0 = sdf.parse("00000101 00:00:00");
		Date date;
		StringBuffer sbu = new StringBuffer();
		if(time.contains(":")){
			sbu.append(dateString+" "+time);
			date = sdf.parse(sbu.toString());
		}else{
			sbu.append(dateString+" ");
			if(time.length()<6){
				sbu.append(time.substring(0, 1));
				sbu.append(":");
				sbu.append(time.substring(1,3));
				sbu.append(":");
				sbu.append(time.substring(3));
			}else{
				sbu.append(time.substring(0, 2));
				sbu.append(":");
				sbu.append(time.substring(2,4));
				sbu.append(":");
				sbu.append(time.substring(4));
			}
			date = sdf.parse(sbu.toString());
		}
		
		double serialTime = (date.getTime()-date0.getTime())/(1000*60*60*24*1.0);
		return serialTime;
	}
	
	
}
