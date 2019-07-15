# 大话设计模式——代理模式

## 是什么

23种设计模式的一种。所谓代理模式是指客户端并不直接调用实际的对象，而是通过调用代理，来间接的调用实际的对象。
为什么要采用这种间接的形式来调用对象呢？一般是因为客户端不想直接访问实际的对象，或者访问实际的对象存在困难，因此通过一个代理对象来完成间接的访问。

## 适用场景

- 远程代理 ：为位于两个不同地址空间对象的访问提供了一种实现机制，可以将一些消耗资源较多的对象和操作移至性能更好的计算机上，提高系统的整体运行效率。
- 虚拟代理：通过一个消耗资源较少的对象来代表一个消耗资源较多的对象，可以在一定程度上节省系统的运行开销。
- 缓冲代理：为某一个操作的结果提供临时的缓存存储空间，以便在后续使用中能够共享这些结果，优化系统性能，缩短执行时间。
- 保护代理：可以控制对一个对象的访问权限，为不同用户提供不同级别的使用权限。
- 智能引用：要为一个对象的访问（引用）提供一些额外的操作时可以使用

## 怎么实现

### UML图

![img](https://images2017.cnblogs.com/blog/1071931/201801/1071931-20180108134122472-1822105846.png)

### 具体实现

- #### 代理模式实现:[设计模式之代理模式](https://github.com/JerryDtj/designPattern/tree/master/proxyPattern)

- #### 静态代理: 就是代理模式.

- #### 动态代理:

  ##### 	来由:

  ​		当增加一个和之前委托类毫无关心的新委托类时,都要新增委托类和委托类的代理类,即使2个代理类完全相同.

  ##### 	是什么:

  ​		动态代理本质上仍然是代理，情况与上面介绍的完全一样，只是代理与被代理人的关系是动态确定的.

  ##### 	实现:

  ​		分为2种jdk 和 cglib,Jdk的动态代理实现方法是依赖于**接口**的,cglib是使用java字节码操作框架ASM实现动态创建一个委托类的子类.在子类上动态扩展代码.

  - java:

    - 代码 [动态代理](https://github.com/JerryDtj/designPattern/tree/master/review/src/main/java/proxy/dynamicproxy/java)

    - 原理 :

      - 在proxy类中会调用proxyClassCache.get(loader, interfaces); 尝试获取本地引用缓存,当缓存中没有的时候,通过Factory自动生成代理类加载进入jvm中.

      - **缓存cacheMap的classloader的弱引用作为key，value是map**

        **而map是以class[]的用引用做key，value是值为动态生成的代理类class<?> 的弱引用CacheValue。**

    - 引用链:

      1. proxy.newProxyInstance()
      2. proxy.getProxyClass0(ClassLoader loader,   Class<?>... interfaces)
      3. proxyClassCache.get(loader, interfaces);// 本地弱引用缓存
      4. subKeyFactory.apply(key, parameter) 
      5. Factory valueFactory.apply(key, parameter) //**此处生成了字节码类$Proxy0,1,2,3，动态加载**
      6. ProxyGenerator.generateProxyClass(proxyName, interfaces, accessFlags)
      7. -Dsun.misc.ProxyGenerator.saveGeneratedFiles=true 时才会把代理类写入本地
      8. generateClassFile() //动态生成了接口的实现类 

  - cglib

    - 代码
    - 原理

参考文章:[*设计模式---代理模式*](https://www.cnblogs.com/daniels/p/8242592.html)、*[秒懂Java代理与动态代理模式](https://blog.csdn.net/ShuSheng0007/article/details/80864854)*、[JDK8动态代理示例与原码解析](https://blog.csdn.net/fenglllle/article/details/82587919)

## 和装饰器模式的区别

- 代理模式，注重对对象某一功能的流程把控和辅助。它可以控制对象做某些事，**重心是为了借用对象的功能完成某一流程，而非对象功能如何。**
- 装饰模式，注重对对象功能的扩展，**它不关心外界如何调用，只注重对对象功能的加强，装饰后还是对象本身。**
- **对于代理类，如何调用对象的某一功能是思考重点，而不需要兼顾对象的所有功能；**
- **对于装饰类，如何扩展对象的某一功能是思考重点，同时也需要兼顾对象的其它功能，因为再怎么装饰，本质也是对象本身，要担负起对象应有的职责。**

参考文章:*[代理模式和装饰器模式的区别](https://www.jianshu.com/p/c06a686dae39)*