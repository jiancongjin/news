package test.test;

import club.inger.util.EncodeUtil;

import java.io.UnsupportedEncodingException;

/**
 * Created by inger on 2019/4/18.
 */
public class EncodeTest {
    public static void main(String[] args) {
        try {
            System.out.println(EncodeUtil.getEncoding("小泽玛莉亚"));
            System.out.println(EncodeUtil.getEncoding(new String("小泽玛莉亚".getBytes("UTF-8"),"UTF-8")));
            System.out.println(new String("小泽玛莉亚".getBytes("UTF-8"),"utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
