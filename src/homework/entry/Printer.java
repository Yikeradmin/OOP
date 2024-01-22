package homework.entry;

/**
 * @author: CoolPro
 * @Desc: 打印机
 * @create: 2024-01-22 18:54
 **/

public class Printer {
    private int pSize;
    private String colorTheme;
    public void print(String message){
        System.out.printf("使用%s纸张和%s墨盒打印信息:%s",getpSize(), getColorTheme(),message);
    }

    public String getpSize() {
        return pSize+"A";
    }

    public void setpSize(int pSize) {
        this.pSize = pSize;
    }

    public String getColorTheme() {
        return colorTheme;
    }

    public void setColorTheme(String colorBox) {
        this.colorTheme = colorBox;
    }

    public Printer() {
    }

    public Printer(int pSize, String colorBox) {
        this.pSize = pSize;
        this.colorTheme = colorBox;
    }
}
