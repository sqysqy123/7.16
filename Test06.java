package com.hp.day09;

import java.io.File;

/**
 * 获取并输出当前目录下所有文件的名字
 * @author Xiloer
 *
 */
public class Test06 {
    public static void main(String[] args) {
        File dir = new File(".");
        File[] subs = dir.listFiles();
        for(File sub : subs){
            if(sub.isFile()){
                System.out.println("目录:");
            }
            System.out.println(sub.getName());
        }

    }
}