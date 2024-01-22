package homework.exam;

import homework.entry.Printer;

import java.util.Scanner;

/**
 * @author: CoolPro
 * @Desc: Printer(打印机测试类)
 * @create: 2024-01-22 18:58
 **/

public class Ex6 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Scanner  input = new Scanner(System.in);
        System.out.println("请输入纸张的尺寸：");
        String size = input.nextLine();
        printer.setpSize(Integer.parseInt(size));
        System.out.println("输入墨盒的规格：");
        String colorTheme = input.nextLine();
        printer.setColorTheme(colorTheme);
        System.out.println("输入要打印的信息：");
        String info = input.nextLine();
        printer.print(info);
    }
}
