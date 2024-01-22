package homework.exam;

import homework.entry.Calculator;
import homework.entry.Circle;

import java.util.Random;

/**
 * @author: CoolPro
 * @Desc:
 * @create: 2024-01-22 18:17
 **/

public class Ex3 {
    static Random random = new Random();
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        testMultiplicationTest(calculator);
        testSubtractionTest(calculator);
        testAdditionTest(calculator);
        testDivisionTest(calculator);
    }
    static void testMultiplicationTest(Calculator calculator){
        System.out.printf("-----%s测试-----\n",calculator.getMultiplicationMethodNameHandle());
        for (int i = 0; i < 4; i++) {
            int i1 = random.nextInt(100);
            int i2 = random.nextInt(100);
            System.out.printf("calculator.multiplication(%d,%d) = %d\n",i1,i2,calculator.multiplication(i1,i2));
        }
    }
    static void testAdditionTest(Calculator calculator){
        System.out.printf("-----%s测试-----\n",calculator.getAdditionMethodNameHandle());
        for (int i = 0; i < 4; i++) {
            int i1 = random.nextInt(100);
            int i2 = random.nextInt(100);
            System.out.printf("calculator.addition(%d,%d) = %d\n",i1,i2,calculator.addition(i1,i2));
        }
    }
    static void testDivisionTest(Calculator calculator){
        System.out.printf("-----%s测试-----\n",calculator.getDivisionMethodNameHandle());
        for (int i = 0; i < 4; i++) {
            int i1 = random.nextInt(100);
            int i2 = random.nextInt(100);
            System.out.printf("calculator.division(%d,%d) = %d\n",i1,i2,calculator.division(i1,i2));
        }
    }
    static void testSubtractionTest(Calculator calculator){
        System.out.printf("-----%s测试-----\n",calculator.getSubtractionMethodNameHandle());
        for (int i = 0; i < 4; i++) {
            int i1 = random.nextInt(100);
            int i2 = random.nextInt(100);
            System.out.printf("calculator.subtraction(%d,%d) = %d\n",i1,i2,calculator.subtraction(i1,i2));
        }
    }
}
