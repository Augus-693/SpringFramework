package fun.augus.spring5;

/**
 * @author: Augus
 * @project: SpringFramework
 * @package: fun.augus.spring5
 * @FileName: User
 * @date 2022年04月05日 10:03
 * @version: 1.0
 */

/*
set方法注入属性
 */
public class User {

    private String userName;
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void showUser() {
        System.out.println(userName);
    }

}
