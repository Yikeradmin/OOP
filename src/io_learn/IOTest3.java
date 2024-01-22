package io_learn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @author: CoolPro
 * @Desc:
 * @create: 2024-01-22 20:53
 **/

public class IOTest3 {
    public static void main(String[] args) throws Exception {
        //一次性读取全部字节到数组中
        InputStream input = new FileInputStream("src/io_learn/assets/data03.txt");
//        //准备一个字节数组,和文件大小一样大
//        File f =new File("src/io_learn/assets/data03.txt");
//        long length = f.length();
//        byte[] buffer = new byte[(int) length];
//        int read = input.read(buffer);
//        String s = new String(buffer);
//        System.out.println(s);
//        System.out.println(read);
//        input.close();
        byte[] bytes = input.readAllBytes();
        System.out.println(new String(bytes));
        input.close();
    }

}
