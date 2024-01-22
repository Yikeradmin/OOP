package homework.entry.emplyee;

/**
 * @author: CoolPro
 * @Desc:
 * @create: 2024-01-22 19:16
 **/

public abstract class Employee implements EmployeeBehaviorInterface {
    public String id;
    String name;
    String salary;

    public Employee() {
    }

    public Employee(String id, String name, String salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public void showSalary() {
        System.out.printf("基本工资为:%s,奖金无\n",salary);
    }
}
