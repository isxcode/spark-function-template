package com.isxcode.star.udf;

import org.apache.spark.sql.api.java.UDF2;

public class Func implements UDF2<Integer, Integer, Integer> {

    @Override
    public Integer call(Integer s1, Integer s2) {

        return s1 + s2;
    }
}
