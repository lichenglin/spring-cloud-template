本项目提供一个标准MAVEN工程,以spring-cloud为核心</br>
包含一个spring-cloud的 server 项目</br>
以及一个client端的JAR包</br>
如果你正在使用spring-cloud构建项目,那么不妨以此为模板</br>

包含以下功能:</br>
1.Server端包含一个请求地址 "/getUser"</br>
2.一个Client JAR包,以Feign为基础,其他项目引用该JAR包,即可方便的调用服务器端代码</br>
3.包含一个swagger api页面 请访问http://127.0.0.1:8000/swagger-ui.html</br>
4.包含一个单元测试,方便对Controller层代码进行单元测试</br>

需要注意:</br>
1.本例不包含必要的spring-cloud配置文件,只提供一个模板,具体的配置文件还要使用者根据项目情况修改</br>
2.原则上,微服务不应该将客户端代码暴露,但实际工程中此举的确可以大大加速研发效率</br>
3.运行方式:运行SERVER端的Application即可</br>
