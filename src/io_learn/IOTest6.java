package io_learn;

import java.io.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Objects;

/**
 * @author: CoolPro
 * @Desc: 拷贝文件,带有进度条
 * @create: 2024-01-22 21:54
 **/

public class IOTest6 {
    public static void main(String[] args) throws Exception {
        //现在有一个需求,需要将src/io_learn/assets/sound.mp3拷贝到src/io_learn/assets/dt/audio/sound.mp3中，并显示拷贝的进度

        //确保写入流的路径是否通畅，这个地方为了确保文件夹存在
        // 目标文件夹位置
        String newFileDir = "src/io_learn/assets/dt/audio";
        File dir = new File(newFileDir);
        //判断一下是否存在这个文件夹
        if (!dir.isDirectory()){
            dir.mkdirs();
        }
        String newFilePath = newFileDir+"/sound.mp3";
        File file = new File(newFilePath);
        //判断目录下是否有和这个文件,如果没有那么就新建一个
        if (Objects.isNull(file) || file.exists()){
            file.createNewFile();
        }

        //到了这里就是目标文件夹存在且目标文件对象存在的情况
        //拿到源文件的输入流
        String localPath = "src/io_learn/assets/sound.mp3";
        long fileSize = new File(localPath).length();//获取文件的总大小,方便计算百分比
        InputStream input = new FileInputStream(localPath);
        OutputStream output = new FileOutputStream(newFilePath);
        int len;
        long size =0;
        
        byte[] buffer = new byte[10];//规定每次读取10byte的数据(总大小11.4Mb)
        while((len = input.read(buffer))!=-1){
            size+=len;
            output.write(buffer,0,len);
            System.out.println("当前进度:"+getPercent2(size,fileSize));
        }
        input.close();
        output.close();
    }
    public static String getPercent2(long x, long y) {
        double d1 = x * 1.0;
        double d2 = y * 1.0;
        // 设置保留几位小数， “.”后面几个零就保留几位小数，这里设置保留两位小数
        DecimalFormat decimalFormat = new DecimalFormat("##.00%");
        return decimalFormat.format(d1 / d2);
    }
}
