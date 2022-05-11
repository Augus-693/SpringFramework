package fun.augus.spring5.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author: Augus
 * @project: SpringFramework
 * @package: fun.augus.spring5.aopanno
 * @FileName: PersonProxy
 * @date 2022年04月27日 14:01
 * @version: 1.0
 */

@Component
@Aspect
@Order(1)
public class PersonProxy {

    @Before(value = "execution(* fun.augus.spring5.aopanno.User.add(..))")
    public void afterReturning() {
        System.out.println("Person Before.........");
    }
}
