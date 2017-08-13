#### 三种常见注解的用法
前两个注解的作用就是通过反射帮助我们自动注入类的属性，从而可以省略掉get/set/构造方法
可以标注在属性，方法，构造方法上。
##### @Autowired
- 标注在方法上时，也是调用该方法，扫描方法的参数类型，通过IOC容器获得参数调用该方法进行注入，默认是ByType
可以注入接口的实现类，但对于一个接口有多个实现类时，需要用如下形式指定具体的实现类：
@Autowired(required=false) //注入不成功也不会发生异常
@Qualifier("AImpl")
##### @Resource
- 作用和注入位置同Autowired，但是默认是ByName注入的，required默认为Ture，否则注入失败会爆出异常。
- @Resource装配顺序：
  
  ①如果同时指定了name和type，则从Spring上下文中找到唯一匹配的bean进行装配，找不到则抛出异常。
  
  ②如果指定了name，则从上下文中查找名称（id）匹配的bean进行装配，找不到则抛出异常。
  
  ③如果指定了type，则从上下文中找到类似匹配的唯一bean进行装配，找不到或是找到多个，都会抛出异常。
  
  ④如果既没有指定name，又没有指定type，则自动按照byName方式进行装配；如果没有匹配，则回退为一个原始类型进行匹配，如果匹配则自动装配。
  
  @Resource的作用相当于@Autowired，只不过@Autowired按照byType自动注入。
##### @Required
- @Required注解用于检查特定的属性是否设置