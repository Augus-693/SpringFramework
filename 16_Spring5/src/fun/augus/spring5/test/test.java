package fun.augus.spring5.test;

import fun.augus.spring5.aopxml.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Augus
 * @project: SpringFramework
 * @package: fun.augus.spring5.test
 * @FileName: test
 * @date 2022年04月27日 14:12
 * @version: 1.0
 */


public class test {

    @Test
    public void testAopXml() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }
}
