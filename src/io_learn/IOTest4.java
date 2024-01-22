package io_learn;

import java.awt.event.InputEvent;
import java.io.*;
import java.util.Objects;

/**
 * @author: CoolPro
 * @Desc: 拷贝小文件流程
 * @create: 2024-01-22 21:12
 **/

public class IOTest4 {
    public static void main(String[] args)throws Exception {
        //创建一个字节管道与文件接通
        String filePath = "src/io_learn/assets/dt/data.txt";
//        File file = new File(filePath);
//        if (!file.isDirectory()){
//            file.mkdir();
//            new File(filePath+"/data.txt").createNewFile();
//        }else {
//            new File(filePath+"/data.txt").createNewFile();
//        }
//
//        OutputStream output = new FileOutputStream(filePath+"/data.txt");
//        InputStream input = new FileInputStream("src/io_learn/assets/data.txt");
//        byte[] bytes = input.readAllBytes();
//        output.write(bytes);
//        byte[] bytes1 = "你好Java".getBytes();
//        output.write(bytes1,0,6);//表示从第0个字节写到第6个字节（不包括第六个字节），来实现将你好写入data.txt中
//        output.close();
//        input.close();
        //追加数据
        OutputStream fileOutputStream = new FileOutputStream(filePath,true);
        fileOutputStream.write("\n你好啊".getBytes());
    }
}
