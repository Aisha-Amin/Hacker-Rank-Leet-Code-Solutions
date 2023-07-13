package HackerRank.Easy;

public class TimeConversion {
    /* Given a time in 12 -hour AM/PM format, convert it to military (24-hour) time.

    Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
         - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

    Complete the timeConversion function in the editor below.
    It should return a new string representing the input time in 24 hour format.
    timeConversion has the following parameter(s):

    string s: a time in 24 hour format
    Example : 07:05:45PM
    output: 19:05:45

     */

    public static void main(String[] args) {
        String s = "2:05:00PM";

        String[] time = s.split(":");
        int hours = Integer.valueOf(time[0]);
        int min = Integer.valueOf(time[1]);
        int second = Integer.valueOf(time[2].substring(0,2));
        String ap = time[2].substring(2,time[2].length());
        if(ap.equals("AM") && hours == 12) {
            hours = 00;
        }
        if(ap.equals("PM") && hours != 12)
            hours +=12;

        String formattedHour = String.format("%02d", hours);
        String formattedMins = String.format("%02d", min);
        String formattedSeconds = String.format("%02d", second);

        System.out.println(formattedHour+":"+formattedMins+":"+formattedSeconds);


        /* Second Solution using Simple Date Format */


//        DateFormat inputFormat = new SimpleDateFormat("hh:mm:ssaa");
//        DateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
//        Date date = null;
//        try{
//            date = inputFormat.parse(s);
//        }catch(ParseException e){
//            e.printStackTrace();
//        }
//        if(date != null){
//            String outputDate = outputFormat.format(date);
//            System.out.println(outputDate);
//        }
    }
}
