package com.free.project1.main.config;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Functions {

    public static String processCurrency(String num_importe) {
        if (num_importe != null) {
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
}
