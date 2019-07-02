package main.java.com.stackroute.pe3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalculateDateofAWeek {
    /*
     * This function computes the first and last date of the week and displays it on the comsole
     */

    public  static String calculateFirstAndLastdateOfTheWeek() {

        String date = "";
        Calendar calender = Calendar.getInstance();
        calender.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
         DateFormat df=new SimpleDateFormat("EEE dd/MM/yyyy");
         date=date+df.format(calender.getTime());
         for(int i=0;i<6;i++)
         {
        calender.add(Calendar.DATE,1);

         }
    return date+df.format(calender.getTime());
}
}
