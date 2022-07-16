Spring5-demo1
1. bean1.xml中,配置了IOC反转控制,注入JavaBean的方式,TestSpring5与bean1.xml相互结合
,JavaBean[Order、Book、User]
,配置类时可以通过空参构造器与<bean id="user" class="com.futurebytedance.spring5.User">结合
,配置属性时可以通过set注入
```aidl
<bean id="book" class="com.futurebytedance.spring5.Book">
   <!--使用property完成属性注入
       name:类里面属性名称
       value:向属性注入的值-->
   <property name="bname" value="易筋经"></property>
   <property name="bauthor" value="达摩老祖"></property>
        <property name="address">
            <value><![CDATA[<<南京>>]]></value>
        </property>
    </bean>
```
或者构造器注入
```aidl
<bean id="orders" class="com.futurebytedance.spring5.Orders">
        <constructor-arg name="oname" value="电脑"></constructor-arg>
        <constructor-arg name="address" value="China"></constructor-arg>
        <!--通过角标形式注入-->
        <!--        <constructor-arg index="0" value="电脑"></constructor-arg>-->
    </bean>
```
或者p名称空间注入
```aidl
xmlns:p="http://www.springframework.org/schema/p"

<bean id="book" class="com.futurebytedance.spring5.Book" p:bname="九阳神功" p:bauthor="无名氏">
    </bean>
```
字面量注入,null值
```aidl
<property name="address">
    <null/>
</property>
```
属性值包含特殊符号
```aidl
<property name="address">
    <value><![CDATA[<<南京>>]]></value>
</property>
```
,外部Bean注入bean2.xml,案例演示dao包+service包
,内部Bean注入bean3.xml,案例演示bean.Dept+bean.Emp,bean4.xml对Dept赋值时必须在Emp中生成getDept方法,同时演示了级联赋值


spring5-demo2
Course+Stu+bean1.xml封装了集合的注入方式
,bean2.xml封装了通用集合的注入方式
,bean3.xml封装了FactoryBean的注入方式
,scope有单例(默认)、多例、session(一次会话)、request(一次请求)
```aidl
<bean id="book" class="com.futurebytedance.spring5.collectiontype.Book" scope="singleton">
    <property name="list" ref="bookList">
    </property>
</bean>
```
,bean4.xml配置了生命周期(7步)
```aidl
<bean id="orders" class="com.futurebytedance.spring5.bean.Orders" init-method="initMethod"
      destroy-method="destroyMethod">
    <property name="oname" value="手机"></property>
</bean>

<!--配置后置处理器-->
<bean id="myBeanPost" class="com.futurebytedance.spring5.bean.MyBeanPost"></bean>
```

spring5-demo3
注解,bean1.xml+UserService实现Bean管理注解方式(创建对象)

spring5-demo4
AOP,JDKProxy.java延迟了使用JDK自带的动态代理方式
aopanno下的三个文件+bean1.xml演示了使用半注解形式进行动态代理
aopxml下的文件+bean2.xml演示了使用xml配置的方式进行动态代理
config包下的类可以使用完全注解开发进行动态代理

spring5-demo5
项目下完成了(批量)增、删、改以及查询操作