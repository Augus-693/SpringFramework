package fun.augus.test;

import fun.augus.spring5.Orders;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Augus
 * @project: SpringFramework
 * @package: fun.augus.test
 * @FileName: test
 * @date 2022年04月05日 10:55
 * @version: 1.0
 */


public class test {

    @Test
    public void testBean3() {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步 获取创建bean实例对象");
        System.out.println(orders);

        //手动让bean实例销毁
        context.close();
    }
}
