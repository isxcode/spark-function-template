# spark-function-template

> spark自定义函数模版

### 产品介绍

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; [**至轻云**](https://zhiqingyun.isxcode.com)是一款超轻量级、企业级大数据计算产品，围绕Spark生态打造的数据计算平台。一键部署，开箱即用。可快速实现Spark计算、大数据离线ETL、实时计算、作业定时调度等功能。

### 构建命令

```bash
git clone https://github.com/isxcode/spark-function-template
cd spark-function-template
./gradlew clean build
cp ./build/libs/spark-custom-func.jar ~/Downloads
```

### 新建函数

- 名称：to_chinese_date
- 类型：UDF
- 类名：com.isxcode.star.udf.Func
- 输入类型：date
- 返回类型：string
- 备注：将时间格式转成中文
- 测试sql： select to_chinese_date(now())

#### 函数列表

| 函数名   | 类名                         | 演示 SQL                                  | 说明               | 备注                                                                                                                                                                                                                                              |
|----------|------------------------------|-------------------------------------------|--------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `func`   | `com.isxcode.star.udf.Func`   | `SELECT func(now())`                      | 将时间格式转成中文 | 需要额外下载依赖：[hutool-all-5.8.27.jar](https://repo1.maven.org/maven2/cn/hutool/hutool-all/5.8.27/hutool-all-5.8.27.jar)                                                                                                                              |
| `func1`  | `com.isxcode.star.udf.Func1`  | `SELECT func1('zhangsan', 'secret')`      | 对称加密           | 需要额外下载依赖：[hutool-all-5.8.27.jar](https://repo1.maven.org/maven2/cn/hutool/hutool-all/5.8.27/hutool-all-5.8.27.jar)                                                                                                                              |
| `func2`  | `com.isxcode.star.udf.Func2`  | `SELECT func2('sflsfuahsdfjlqewr==', 'secret')` | 对称解密           | 需要额外下载依赖：[hutool-all-5.8.27.jar](https://repo1.maven.org/maven2/cn/hutool/hutool-all/5.8.27/hutool-all-5.8.27.jar)                                                                                                                              |
| `func3`  | `com.isxcode.star.udf.Func3`  | `SELECT func3('310240199909102395', 1, 3)`| 身份证脱敏         | 需要额外下载依赖：[hutool-all-5.8.27.jar](https://repo1.maven.org/maven2/cn/hutool/hutool-all/5.8.27/hutool-all-5.8.27.jar)                                                                                                                              |
| `func4`  | `com.isxcode.star.udf.Func4`  | `SELECT func4('13187961213')`             | 手机号码脱敏       | 需要额外下载依赖：[hutool-all-5.8.27.jar](https://repo1.maven.org/maven2/cn/hutool/hutool-all/5.8.27/hutool-all-5.8.27.jar)                                                                                                                              |
| `func5`  | `com.isxcode.star.udf.Func5`  | `SELECT func5('zhangsan')`                | 国密随机加密       | 需要额外下载依赖：[hutool-all-5.8.27.jar](https://repo1.maven.org/maven2/cn/hutool/hutool-all/5.8.27/hutool-all-5.8.27.jar)、[bcprov-jdk18on-1.78.1.jar](https://repo1.maven.org/maven2/org/bouncycastle/bcprov-jdk18on/1.78.1/bcprov-jdk18on-1.78.1.jar) |
