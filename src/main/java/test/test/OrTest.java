package test;

import club.inger.util.SensitiveWord;

/**
 * Created by inger on 2019/4/16.
 */
public class OrTest {
    public static void main(String[] args) {
        SensitiveWord sw = new SensitiveWord("CensorWords.txt");
        sw.InitializationWork();
        System.out.printf(sw.filterInfo("贱人寄单号呢"));
        int x = 0,y =2;
        if(x==1||test()==1){
            System.out.println("进入if");
        }
    }
    public static int test(){
        System.out.println("-----------或");
        return 1;
    }
}
