# spring-cloud-template
本项目提供一个标准MAVEN工程,以spring-cloud为核心
包含一个spring-cloud的 server 项目
以及一个client端的JAR包

包含以下功能:
1.Server端包含一个请求地址 "/getUser"
2.一个Client JAR包,以Feign为基础,其他项目引用该JAR包,即可方便的调用服务器端代码
3.包含一个swagger api页面 请访问http://127.0.0.1:8000/swagger-ui.html
4.包含一个单元测试,方便对Controller层代码进行单元测试

需要注意:
1.本例不包含必要的spring-cloud配置文件,只提供一个模板,具体的配置文件还要使用者根据项目情况修改
2.原则上,微服务不应该将客户端代码暴露,但实际工程中此举的确可以大大加速研发效率
3.运行方式:运行SERVER端的Application即可