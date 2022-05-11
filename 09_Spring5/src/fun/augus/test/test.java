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
    public void test4() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
