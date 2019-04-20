package club.inger.util;

import java.util.*;

/**
 * Created by whisper_mdp on 2016/10/22.
 */
public class StringUtils {

    public static boolean isEmpty(Object... args){
        boolean flag = true;
        for(Object arg:args){
            if(arg != null){
                if(arg instanceof String){
                   if(arg.toString().trim().length() <=0){
                       flag = false;
                       break;
                   }
                }
            }else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static String getUUID(){
        String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
        return uuid.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(StringUtils.isEmpty("S","S"));
    }
}
