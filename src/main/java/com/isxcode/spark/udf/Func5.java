package com.isxcode.spark.udf;

import cn.hutool.crypto.SmUtil;
import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.SM2;
import org.apache.spark.sql.api.java.UDF1;

public class Func5 implements UDF1<String, String> {

    @Override
    public String call(String s1) {

        SM2 sm2 = SmUtil.sm2();
        return sm2.encryptBcd(s1, KeyType.PublicKey);
    }
}
