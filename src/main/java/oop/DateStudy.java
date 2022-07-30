package oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import com.alibaba.fastjson.JSONArray;

public class DateStudy {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());
        long time = date.getTime();
        System.out.println(time);
        boolean after = date.after(new Date(1659079272991l));
        System.out.println(after);

        int i = date.compareTo(new Date(1659079272991l));
        System.out.println(i);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        System.out.println("当前时间为: " +simpleDateFormat.format(new Date()));


        System.out.printf("全部日期和时间信息为: %tc",date);
        System.out.printf("%tF%n",date);
        System.out.printf("%tD%n",date);
        System.out.printf("%tr%n",date);
        System.out.printf("%tT%n",date);
        System.out.printf("%tR%n",date);

        System.out.printf("%1$s %2$tB %2$td,%2$tY","Due date",date);
    }



}
