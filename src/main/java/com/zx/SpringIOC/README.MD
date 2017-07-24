#### 三种常见注解的用法
前两个注解的作用就是通过反射帮助我们自动注入类的属性，从而可以省略掉get/set/构造方法
可以标注在属性，方法，构造方法上。
###### @Autowired
- 标注在方法上时，也是调用该方法，扫描方法的参数类型，通过IOC容器获得参数调用该方法进行注入，默认是ByType
可以注入接口的实现类，但对于一个接口有多个实现类时，需要用如下形式指定具体的实现类：
@Autowired(required=false) //注入不成功也不会发生异常
@Qualifier("AImpl")
###### @Resource
作用和注入位置同Autowired，但是默认是ByName注入的，required默认为Ture，否则注入失败会爆出异常。
###### @Required
@Required注解用于检查特定的属性是否设置