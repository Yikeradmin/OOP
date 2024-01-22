package io_learn;

import java.beans.Encoder;
import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author: CoolPro
 * @Desc: IO 学习
 * @create: 2024-01-22 19:51
 **/

public class IOTest {
    public static void main(String[] args) throws IOException {
        File file = new File("src/io_learn/assets/data.txt");
        InputStream fileInputStream = new FileInputStream(file);
//        //读取文件字节,每次读取一个字节
//        int read = fileInputStream.read();
//        System.out.println(read);
//         read = fileInputStream.read();
//        System.out.println(read);
//         read = fileInputStream.read();
//        System.out.println(read);//当读取结束之后会返回-1
//        fileInputStream.close();

        //优化--使用循环改造上面代码

        int b;
        while((b = fileInputStream.read()) != -1){
            System.out.print((char)b);
        }

        //读取数据的性能很差
        //读取汉子输出会乱码

    }
}
