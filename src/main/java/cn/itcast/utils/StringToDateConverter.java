package cn.itcast.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 字符串转化成日期
 * Created by Administrator on 2020/3/24.
 */
public class StringToDateConverter implements Converter<String,Date>{
    @Override
    public Date convert(String s) {
        if(s==null){
            throw new RuntimeException("请你传入数据");
        }
        DateFormat df =new SimpleDateFormat("yyyy-MM-dd");
        try {
           return df.parse(s);
        } catch (Exception e) {
          throw  new RuntimeException("数据类型转换出现错误");
        }

    }
}
