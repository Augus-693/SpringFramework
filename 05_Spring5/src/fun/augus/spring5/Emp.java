package fun.augus.spring5;

/**
 * @author: Augus
 * @project: SpringFramework
 * @package: fun.augus.spring5
 * @FileName: Emp
 * @date 2022年04月05日 10:49
 * @version: 1.0
 */


public class Emp {
    private String ename;
    private String gender;
    //员工属于某一个部门，使用对象形式表示
    private Dept dept;

    //生成dept的get方法
    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void add() {
        System.out.println(ename+"::"+gender+"::"+dept);
    }
}
