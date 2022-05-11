package fun.augus.spring5.test;

import fun.augus.spring5.aopanno.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Augus
 * @project: SpringFramework
 * @package: fun.augus.spring5.test
 * @FileName: test
 * @date 2022年04月27日 13:07
 * @version: 1.0
 */


public class test {

    @Test
    public void testAopAnno() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }
}
