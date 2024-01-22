package io_learn;

import java.io.*;
import java.util.Objects;

/**
 * @author: CoolPro
 * @Desc:
 * @create: 2024-01-22 21:42
 **/

public class IOTest5 {
    public static void main(String[] args) throws Exception{
        //先确认这个文件夹是否存在
        String path = "src/io_learn/assets/dt/img";
        File dir = new File(path);
        if (!dir.isDirectory()){
            dir.mkdirs();
        }
        //确定文件夹下是否有这个文件
        String newFilePath = "src/io_learn/assets/dt/img/avatar.jpg";
        File file = new File(newFilePath);
        if (Objects.isNull(file) || file.exists()){
            //如果没有,就创建这个文件
            file.createNewFile();
        }
        //原文件地址
        String loadlFilePath = "src/io_learn/assets/img/avatar.jpg";
        //读取原文件
        InputStream input = new FileInputStream(loadlFilePath);
        //读取到的文件字节数组
        byte[] bytes = input.readAllBytes();
        input.close();
        //将读取到的字节数组写到新的位置
        OutputStream output = new FileOutputStream(newFilePath);
        output.write(bytes);
        output.close();
    }
}
