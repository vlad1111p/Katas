package com.company.kyu4;

public class TimeFormatter {

    public static String formatDuration(int seconds) {
        if(seconds == 0)
            return "now";
        StringBuilder sb = new StringBuilder();

        int[] time = new int[5];

        time[0] = seconds / 31536000;

        time[1] = (seconds % 31536000) / 86400;

        time[2] = (seconds % 86400) / 3600;

        time[3] = (seconds % 3600) / 60;

        time[4] = seconds % 60;

        int[] timeName = new int[]{0, 1, 2, 3, 4};
        String[] timeNameString = new String[]{"year", "day", "hour", "minute", "second"};
        for(int i = 0; i < time.length; i++){
            if(time[i] != 0){
                sb.append(time[i]).append(" ")
                        .append(timeNameString[timeName[i]])
                        .append(time[i] > 1 ? "s" : "")
                        .append(time[2]>0 && time[3]>0 && time[4]==0 && i==time.length-3 ? " and " : "")
                        .append(time[4]>0 && time[3]>0 && i==time.length-2 ? " and " : "")

                        .append((i==0 && time[i] > 0 && time[i+3]>0)||
                                (i==0 && time[i] > 0 && time[i+2]>0)||
                                (i==0 && time[i] > 0 && time[i+4]>0)||
                                (i==1 && time[i] > 0 && time[i+2]>0)||
                                i<3 && i!=0 && time[i] > 0 && time[i+1]>0
                                        && !sb.toString().contains("and")  ? ", " : "");
            }

        }
        return sb.toString();
    }
}
