package com.free.project1.main.config;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Functions {

    public static String processCurrency(String num_importe) {
        if (num_importe != null && !num_importe.isEmpty()) {
            double importe = Double.parseDouble(num_importe);
            NumberFormat germany = NumberFormat.getNumberInstance(Locale.GERMANY);
            return germany.format(importe);
        }
        return "";
    }

    public static String processDate(Date date) {
        if (date != null) {
            String pattern = "dd/MM/yyyy";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String format = simpleDateFormat.format(date);
            return format;
        }
        return "";
    }

    public static String dateDifference(Date start, Date end, String type) {
        if (start != null && end != null) {
            long diffInMillies = Math.abs(start.getTime() - end.getTime());
            long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
            switch (type) {
                case "years":
                    return (diff / 365) + "";
                case "months":
                    return (diff / 30) + "";
            }
            return diff + "";
        }
        return "";
    }

}
