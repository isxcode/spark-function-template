package com.isxcode.star.udf;

import cn.hutool.crypto.SecureUtil;
import org.apache.spark.sql.api.java.UDF2;

import java.util.Arrays;

public class Func1 implements UDF2<String, String, String> {

    @Override
    public String call(String s1, String s2) {

        return SecureUtil.aes(Arrays.copyOf(s2.getBytes(), 1 << 5)).encryptBase64(s1);
    }
}
