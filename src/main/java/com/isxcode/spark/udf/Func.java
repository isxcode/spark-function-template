package com.isxcode.spark.udf;

import cn.hutool.core.date.DateUtil;
import org.apache.spark.sql.api.java.UDF1;

import java.util.Date;

public class Func implements UDF1<Date, String> {

    @Override
    public String call(Date s1) {

        return DateUtil.formatChineseDate(s1, true, true);
    }
}
