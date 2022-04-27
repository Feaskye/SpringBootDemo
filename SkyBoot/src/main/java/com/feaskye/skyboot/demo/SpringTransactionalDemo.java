package com.feaskye.skyboot.demo;

public class SpringTransactionalDemo {

    /*
    * 七个事务传播行为
    *
    PROPAGATION_REQUIRED如果存在一个事务，则支持当前事务。如果没有事务则开启一个新的事务。如果嵌套调用的两个方法都加了事务注解，并且运行在相同线程中，则这两个方法使用相同的事务中。如果运行在不同线程中，则会开启新的事务。
    PROPAGATION_SUPPORTS 如果存在一个事务，支持当前事务。如果没有事务，则非事务的执行。
    PROPAGATION_MANDATORY 如果已经存在一个事务，支持当前事务。如果不存在事务，则抛出异常IllegalTransactionStateException。
    PROPAGATION_REQUIRES_NEW 总是开启一个新的事务。需要使用JtaTransactionManager作为事务管理器。
    PROPAGATION_NOT_SUPPORTED 总是非事务地执行，并挂起任何存在的事务。需要使用JtaTransactionManager作为事务管理器。
    PROPAGATION_NEVER 总是非事务地执行，如果存在一个活动事务，则抛出异常。
    PROPAGATION_NESTED 如果一个活动的事务存在，则运行在一个嵌套的事务中。如果没有活动事务, 则按PROPAGATION_REQUIRED 属性执行。
    *
    * */




    /*
    * 事务5个隔离级别
    *
    * ISOLATION_DEFAULT 这是一个PlatfromTransactionManager默认的隔离级别，使用数据库默认的事务隔离级别.另外四个与JDBC的隔离级别相对应
ISOLATION_READ_UNCOMMITTED 这是事务最低的隔离级别，它充许别外一个事务可以看到这个事务未提交的数据。这种隔离级别会产生脏读，不可重复读和幻像读

ISOLATION_READ_COMMITTED 保证一个事务修改的数据提交后才能被另外一个事务读取。另外一个事务不能读取该事务未提交的数据。这种事务隔离级别可以避免脏读出现，但是可能会出现不可重复读和幻像读。

ISOLATION_REPEATABLE_READ 这种事务隔离级别可以防止脏读，不可重复读。但是可能出现幻像读。它除了保证一个事务不能读取另一个事务未提交的数据外，还保证了避免下面的情况产生(不可重复读)。

ISOLATION_SERIALIZABLE 这是花费最高代价但是最可靠的事务隔离级别。事务被处理为顺序执行。除了防止脏读，不可重复读外，还避免了幻像读。
    *
    * */



}
