package homework.exam;

import homework.entry.emplyee.Coder;
import homework.entry.emplyee.Employee;
import homework.entry.emplyee.Manager;

/**
 * @author: CoolPro
 * @Desc: Employee(职工)测试类
 * @create: 2024-01-22 19:35
 **/

public class Ex8 {
    public static void main(String[] args) {
        Employee coder = new Coder("0025","长颈鹿艾迪","100000");
        Employee manager = new Manager("9527","河马酷睿","15000",3000);
        manager.intro();
        manager.showSalary();
        manager.work();
        coder.intro();
        coder.showSalary();
        coder.work();
    }
}
