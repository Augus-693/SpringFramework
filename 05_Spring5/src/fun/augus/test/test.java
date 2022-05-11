package fun.augus.test;

import fun.augus.spring5.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
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
    public void testBean2() {
        //1 加载spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        //2 获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);

        emp.add();
    }
}
