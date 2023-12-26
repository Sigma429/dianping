项目经验：

1. 常量尽量不要用魔法值，封装成常量工具类
2. redis改善登录注册流程，登录校验token，拦截器等
3. 先画流程图，再把逻辑写成注释，最后写代码
4. hutool工具库的使用
5. 实体类对象判断为空用null,集合类用null或isEmpty 
6. 包装类返回基本类型，要防止自动拆箱返回空指针，拿工具类判断下 eg:BooleanUtil.isTrue(flag)
7. 事务失效情况，spring对当前类做动态代理，用代理对象做事务处理，用this是没有事务功能的
8. 静态变量初始化可以放在静态代码块里
9. 数据库更新成功才更新redis，更新redis前加个判断数据库是否更新成功