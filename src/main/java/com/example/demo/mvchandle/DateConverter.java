package com.example.demo.mvchandle;

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Configuration
public class DateConverter implements Converter<String, Date> {
    private static List<SimpleDateFormat> dateFormats = new ArrayList<>();

    static {
        dateFormats.add(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"));
        dateFormats.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        dateFormats.add(new SimpleDateFormat("yyyy/MM/dd HH:mm"));
        dateFormats.add(new SimpleDateFormat("yyyy-MM-dd HH:mm"));
        dateFormats.add(new SimpleDateFormat("yyyy/MM/dd HH"));
        dateFormats.add(new SimpleDateFormat("yyyy-MM-dd HH"));
        dateFormats.add(new SimpleDateFormat("yyyy/MM/dd"));
        dateFormats.add(new SimpleDateFormat("yyyy-MM-dd"));
    }

    @Override
    public Date convert(String s) {
        if (StringUtils.isEmpty(s)) return null;
        if (StringUtils.isNumeric(s) && (s.length() == 10 || s.length() == 13)) {
            long lt = new Long(s);
            if (s.length() <= 10) { // 兼容时间戳为秒
                lt = lt * 1000;
            }
            return new Date(lt);
        }
        Date date = null;
        for (SimpleDateFormat dateFormat : dateFormats) {
            if (date != null) break;
            try {
                date = dateFormat.parse(s);
            } catch (ParseException e) {
                continue;
            }
        }
        return date;
    }
}
