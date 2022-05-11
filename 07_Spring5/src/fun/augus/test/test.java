package fun.augus.test;

import fun.augus.spring5.Course;
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
    public void test3() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }
}
