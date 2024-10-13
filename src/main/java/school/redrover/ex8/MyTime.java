package school.redrover.ex8;

import java.util.Calendar;
import java.util.Date;

public class MyTime {
    long hour;
    long minute;
    long second;

    public MyTime(){
        this(System.currentTimeMillis());
    }

    public MyTime(long hour, long minute, long second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public MyTime(long elapsedTime) {
        setTime(elapsedTime);
    }


    public void setTime(long elapseTime){
        long totalSec = elapseTime / 1000;
        this.second = (int) totalSec % 60;

        long totalMin = totalSec / 60;
        this.minute = (int) totalMin % 60;

        int totalH = (int)(totalMin / 60);
        this.hour = (int) totalH % 24;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    public void displayTime() {
        System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
    }



}
