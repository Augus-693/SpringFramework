package fun.augus.spring5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author: Augus
 * @project: SpringFramework
 * @package: fun.augus.spring5
 * @FileName: JDKProxy
 * @date 2022年04月27日 10:51
 * @version: 1.0
 */


public class JDKProxy {

    public static void main(String[] args) {
        // 创建接口实现类代理对象
        Class<?>[] interfaces = {UserDao.class};
        /*Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return null;
            }
        });*/
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int result = dao.add(1, 2);
        System.out.println("result:" + result);
    }
}
class UserDaoProxy implements InvocationHandler {

    //有参构造传递代理对象创建者
    private Object obj;
    public UserDaoProxy(Object obj){
        this.obj = obj;
    }

    //增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法之前
        System.out.println("方法之前执行...."+method.getName()+" :传递的参数..."+ Arrays.toString(args));

        //被增强的方法执行
        Object res = method.invoke(obj, args);

        //方法之后
        System.out.println("方法之后执行...."+obj);
        return res;
    }
}