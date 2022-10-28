package com.yanzhen;

import java.io.File;

public class Person {

    public static void main(String[] args) {
        File file = new File("E:\\学生学籍管理-视频课程\\视频");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s.substring(0,s.length()-4));
        }
    }

}
