


//spring web 启动顺序
/*
* 1:读取web.xml
* 2：创建servletContext。提供IOC宿主环境
* 3：容器初始化contextLoaderListener.contextInitialized()，创建上下文webApplicationContext
* 4:初始化web.xml的servlet，用于匹配处理每个servlet请求
* */


public class SpringWebDemo{


    /*Spring单例对象的初始化大略分为三步
    * 1:createBeanInstance 实例化bean，使用构造方法创建对象，为对象分配内存
    * 	protected BeanWrapper createBeanInstance(String beanName, RootBeanDefinition mbd, @Nullable Object[] args) {
		// Make sure bean class is actually resolved at this point.
		Class<?> beanClass = resolveBeanClass(mbd, beanName);
    *
    * 2：popularBean 进行依赖注入
    *
    *
    * 3：initializeBean 初始化bean
    * protected Object initializeBean(final String beanName, final Object bean, @Nullable RootBeanDefinition mbd) {
		if (System.getSecurityManager() != null) {
			AccessController.doPrivileged((PrivilegedAction<Object>) () -> {
				invokeAwareMethods(beanName, bean);
    *
    * */



    /*【解决单例循环依赖的三级缓存】
    * 1：singletonObjects：完成了初始化的单例对象map，bean name --> bean instance
    *
    *2：earlySingletonObjects：完成实例化未初始化的单例对象map，bean name --> bean instance
    *
    * 3：singletonFactories： 单例对象工厂map，bean name --> ObjectFactory，单例对象实例化完成之后会加入singletonFactories
    *
    * */



}

