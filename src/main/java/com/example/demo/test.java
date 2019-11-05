package com.example.demo;

import java.util.Arrays;
import java.util.List;

public class test {


    public static void main(String[] args) {
        String aa = "%%d2131;";
        String bb = aa.replaceFirst("^%", "");

        List l = Arrays.asList(bb.split("%"));
        l.forEach(s -> {
            if (s == null) {
                System.out.println(1);
            }
        });
    }


}
