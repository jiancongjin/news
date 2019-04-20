package club.inger.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by inger on 2019/4/18.
 */
public class RandomUtil {
    private static List<Integer> list  = new ArrayList<>();

   public static List<Integer> getRandomList(int listSzie,int total){
       //Random rdm = new Random(System.currentTimeMillis());
       List<Integer> list  = new ArrayList<>();
       List<Double> rate= new ArrayList<>();
       for(int i = 0;i<listSzie;i++){
           rate.add(Math.random());
       }
       double sum = getSum(rate);
       for(int i = 0;i<listSzie;i++){
          list.add((int) (rate.get(i)/sum*total));
       }
       return list;

    }
    public static double getSum(List<Double> rate){
       double sum = 0;
       for(int i =0 ;i<rate.size();i++){
           sum += rate.get(i);
       }
       return sum ;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new List[]{getRandomList(9, 15)}));
    }
}
