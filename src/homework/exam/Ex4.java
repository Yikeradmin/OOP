package homework.exam;

import homework.entry.Student;

import java.util.Scanner;

/**
 * @author: CoolPro
 * @Desc:
 * @create: 2024-01-22 18:37
 **/

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("输个ID:");
        String id = input.nextLine();
        System.out.print("取个名字吧:");
        String name = input.nextLine();
        System.out.print("他(她)的手机号是多少:");
        String phone = input.nextLine();
        System.out.print("多大了:");
        String age = input.nextLine();
        Student student = createStudent(id, name, age, phone);
        student.think();
        student.print();

    }

    static Student createStudent(String id, String name, String age, String phone) {
        return new Student(name, id, phone, age);
    }
}
