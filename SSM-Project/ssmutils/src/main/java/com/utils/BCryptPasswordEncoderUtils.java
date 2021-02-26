package com.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//加密
public class BCryptPasswordEncoderUtils {
    public static BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
    public static String encodePassword(String password){

        //哈希加盐处理  MD5加密  每次加密都会生成一个动态的盐
        return bCryptPasswordEncoder.encode(password);
    }

    public static void main(String[] args) {
        String password="123";
        String pwd = encodePassword(password);
        //$2a$10$tJHudmJh6MRPdiL7mv0yfe0nZJbDHuhl7sSTnqNC4DauMik9ppi4K
        //$2a$10$Ce8LB3jdYDZ2f6HB281zA.4eC7v6ziJdK8MMWg0Yu8ETMg5ToMpIe
        System.out.print(pwd);
//        String uuid = UUID.randomUUID().toString();
//        //去掉“-”符号
//        System.out.println(uuid.replaceAll("-", ""));

//        Date visitTime = new Date();//当前时间就是开始访问的时间
//        System.out.println(visitTime.toString());

    }
}
