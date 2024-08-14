# spark-function-template
spark自定义函数模版

### 产品介绍
  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; [**至轻云**](https://zhiqingyun.isxcode.com)是一款超轻量级、企业级大数据平台，具备一键部署、开箱即用的特点。无需安装额外的大数据组件，即可快速实现企业级的离线ETL、实时计算和作业定时调度等功能，帮助企业高效处理海量数据，挖掘更多商业价值。

### 构建命令

```bash
git clone https://github.com/isxcode/spark-function-template
cd spark-function-template
./gradlew clean build
cp ./build/libs/func1.jar ~/Downloads
```

### 函数信息

> 该函数需要配合hutool依赖 </br>
> 下载链接：https://repo1.maven.org/maven2/cn/hutool/hutool-all/5.8.27/hutool-all-5.8.27.jar </br>
> 上传到资源中心

- 名称：to_chinese_date
- 类型：UDF
- 类名：com.isxcode.star.udf.Func
- 返回类型：string
- 输入类型：date
- 功能：将时间格式转成中文
- 测试sql： select to_chinese_date(now())

#### 函数列表

- Func : 将时间格式转成中文 : select 
- Func1 : 对称加密,select func1("zhangsan","secret")
- Func2 : 对接解密,select func2("sflsfuahsdfjlqewr==","secret")
- Func3 : 身份证脱敏,select func3("310240199909102395",1,3)
- Func4 : 手机号码脱敏,select func4("13187961213")
> Func5需要额外下载依赖：https://repo1.maven.org/maven2/org/bouncycastle/bcprov-jdk18on/1.78.1/bcprov-jdk18on-1.78.1.jar
- Func5 : 国密随机加密,select func5("zhangsan")