package homework.entry.emplyee;

/**
 * @author: CoolPro
 * @Desc:
 * @create: 2024-01-22 19:21
 **/

public class Coder extends Employee{
    public Coder() {
    }

    public Coder(String id, String name, String salary) {
        super(id, name, salary);
    }

    @Override
    public void intro() {
        System.out.println("程序员姓名:"+getName());
        System.out.println("工号:"+getId());
    }

    @Override
    public void work() {
        System.out.println("正在努力写代码......");
    }
}
