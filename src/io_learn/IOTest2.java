package io_learn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @author: CoolPro
 * @Desc: IO 练习2
 * @create: 2024-01-22 20:11
 **/

public class IOTest2 {
    public static void main(String[] args) throws Exception {
        //创建一个字节流代表对象与源文件接通
        InputStream input = new FileInputStream(new File("src/io_learn/assets/data02.txt"));
//        //开始读取一个文件中的字节数据
        byte[] buff = new byte[3];
//        int len = input.read(buff);
//        String s = new String(buff);
//        System.out.println(s);
//        System.out.println("单次读取的字节数量:"+len);
//        //千万要注意读取多少就倒处多少
//        int len2 = input.read(buff);
//        String s2 = new String(buff,0,len2);
//        System.out.println(s2);
//        System.out.println("单次读取的字节数量:"+len2);
        int b ;
        while ((b = input.read(buff))!=-1){
            String res = new String(buff,0,b);
            System.out.print(res);
        }
        input.close();
    }

}
