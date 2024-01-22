package homework.entry;

/**
 * @author: CoolPro
 * @Desc: 计算器
 * @create: 2024-01-22 18:11
 **/

public class Calculator {

    String multiplicationMethodNameHandle = "乘法";
    String additionMethodNameHandle = "加法";
    String divisionMethodNameHandle = "除法";
    String subtractionMethodNameHandle = "减法";

    public String getMultiplicationMethodNameHandle() {
        return multiplicationMethodNameHandle;
    }

    public void setMultiplicationMethodNameHandle(String multiplicationMethodNameHandle) {
        this.multiplicationMethodNameHandle = multiplicationMethodNameHandle;
    }

    public String getAdditionMethodNameHandle() {
        return additionMethodNameHandle;
    }

    public void setAdditionMethodNameHandle(String additionMethodNameHandle) {
        this.additionMethodNameHandle = additionMethodNameHandle;
    }

    public String getDivisionMethodNameHandle() {
        return divisionMethodNameHandle;
    }

    public void setDivisionMethodNameHandle(String divisionMethodNameHandle) {
        this.divisionMethodNameHandle = divisionMethodNameHandle;
    }

    public String getSubtractionMethodNameHandle() {
        return subtractionMethodNameHandle;
    }

    public void setSubtractionMethodNameHandle(String subtractionMethodNameHandle) {
        this.subtractionMethodNameHandle = subtractionMethodNameHandle;
    }

    /**
     * @Author: CoolPro
     * @Date: 2024/1/22
     * @Description: 计算num1和num2的和, 并返回
     * @Name: addition
     * @parmas: [num1, num2]
     * @return: int
     */
    public int addition(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * @Author: CoolPro
     * @Date: 2024/1/22
     * @Description: 计算num1和num2的积，并且返回
     * @Name: multiplication
     * @parmas: [num1, num2]
     * @return: int
     */
    public int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * @Author: CoolPro
     * @Date: 2024/1/22
     * @Description: 计算num1和num2的商，并且返回
     * @tips：当num2为0的时候，返回0,并且输出提示信息（提示信息自己定义）
     * @Name: division
     * @parmas: [num1, num2]
     * @return: int
     */
    public int division(int num1, int num2) {
        if (num2 == 0) return 0;
        return num1 / num2;
    }

    /**
     * @Author: CoolPro
     * @Date: 2024/1/22
     * @Description: 计算num1和num2的差，并且返回
     * @Name: subtraction
     * @parmas: [num1, num2]
     * @return: int
     */
    public int subtraction(int num1, int num2) {
        return num1 - num2;
    }
}
