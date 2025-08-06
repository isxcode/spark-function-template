package com.isxcode.spark.udf;

import cn.hutool.core.util.DesensitizedUtil;
import org.apache.spark.sql.api.java.UDF3;

public class Func3 implements UDF3<String, Integer, Integer, String> {

    @Override
    public String call(String s1, Integer front, Integer end) {

        return DesensitizedUtil.idCardNum(s1, front, end);
    }
}
