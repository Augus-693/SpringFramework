package fun.augus.spring5;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author: Augus
 * @project: SpringFramework
 * @package: fun.augus.spring5
 * @FileName: MyBean
 * @date 2022年04月05日 13:46
 * @version: 1.0
 */


public class MyBean implements FactoryBean<Course> {

    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("abc");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
