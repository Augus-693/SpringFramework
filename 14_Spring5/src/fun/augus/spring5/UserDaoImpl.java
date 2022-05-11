package fun.augus.spring5;

/**
 * @author: Augus
 * @project: SpringFramework
 * @package: fun.augus.spring5
 * @FileName: UserDaoImpl
 * @date 2022年04月27日 10:50
 * @version: 1.0
 */


public class UserDaoImpl implements UserDao {

    @Override
    public int add(int a, int b) {
        System.out.println("add方法执行了。。。。。。。。");
        return a + b;
    }

    @Override
    public String update(String id) {
        System.out.println("update方法执行了。。。。。。。。");
        return id;
    }
}
