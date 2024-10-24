package com.isxcode.star.udf;

import cn.hutool.core.util.DesensitizedUtil;
import org.apache.spark.sql.api.java.UDF1;

public class Func4 implements UDF1<String, String> {

    @Override
    public String call(String s1) {

        return DesensitizedUtil.mobilePhone(s1);
    }
}
