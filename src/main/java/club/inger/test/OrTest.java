package club.inger.test;

import club.inger.util.NewsTypeConvert;

/**
 * Created by inger on 2019/4/16.
 */
public class OrTest {
    public static void main(String[] args) {
        int x = 0,y =2;
        if(x==1||test()==1){
            System.out.println("进入if");
        }
        System.out.println(new NewsTypeConvert().getType("top"));
    }
    public static int test(){
        System.out.println("-----------或");
        return 1;
    }
}
