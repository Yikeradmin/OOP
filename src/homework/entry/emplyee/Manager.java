package homework.entry.emplyee;

/**
 * @author: CoolPro
 * @Desc:
 * @create: 2024-01-22 19:33
 **/

public class Manager extends Employee{
    int bonus;

    public Manager(int bonus) {
        this.bonus = bonus;
    }

    public Manager(String id, String name, String salary, int bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    @Override
    public void intro() {
        System.out.println("经理姓名:"+getName());
        System.out.println("工号:"+getId());
    }

    @Override
    public void showSalary() {
        System.out.printf("基本工资为%s,奖金为%d\n",getSalary(),bonus);
    }

    @Override
    public void work() {
        System.out.println("正在努力做着管理工作,分配任务,检查员工提交上来的代码......");
    }
}
