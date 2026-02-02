package week2;

public class Time {

    private int hour;
    private int min;
    private int sec;

    public Time(int h, int m, int s) {
        setTime(h,m, s);
    }

    public void setTime(int h, int m, int s) {
        if (h >= 0 && h <=23) hour = h;
        else hour = 0;

        if (m >= 0 && m<= 59) min =m;
        else min = 0;

        if (s >=0 && s<= 59) sec =s;
        else sec = 0;
    }

    public String toUniversal() {
        StringBuilder sb = new StringBuilder();

        if (hour < 10) sb.append("0");
        sb.append(hour);
        sb.append(":");

        if (min < 10) sb.append("0");
        sb.append(min);
        sb.append(":");

        if (sec < 10) sb.append("0");
        sb.append(sec);

        return sb.toString();
    }

    public String toStandard() {
        StringBuilder sb = new StringBuilder();

        String ampm;
        if (hour < 12) ampm = "AM";
        else ampm ="PM";

        int displayHour =hour;

        if (displayHour == 0) displayHour = 12;
        else if (displayHour > 12) displayHour = displayHour - 12;

        if (displayHour <10) sb.append("0");
        sb.append(displayHour);
        sb.append(":");

        if (min < 10) sb.append("0");
        sb.append(min);
        sb.append(":");

        if (sec < 10) sb.append("0");
        sb.append(sec);

        sb.append(" ");
        sb.append(ampm);

        return sb.toString();
    }

    public void add(Time other) {
        sec = sec + other.sec;
        if (sec >= 60) {
            sec =sec -60;
            min =min +1;
        }

        min = min + other.min;
        if (min >= 60) {
            min =min - 60;
            hour =hour + 1;
        }

        hour =hour + other.hour;
        if (hour >=24) {
            hour =hour - 24;
        }
    }

    public static void main(String[] args) {
        Time t = new Time(23,5,6);
        System.out.println(t.toUniversal()); 
        System.out.println(t.toStandard());  

        Time t2 = new Time(4,24, 33);
        t.add(t2);

        System.out.println(t.toUniversal()); 
        System.out.println(t.toStandard());  
    }
}

