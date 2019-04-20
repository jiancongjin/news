package test.test;

/**
 * Created by inger on 2019/4/17.
 */
public class ThreadTest implements Runnable{
    private  String name;
    public ThreadTest(){

    }
    public ThreadTest(String name){
        this.name = name;
    }
    @Override
    public void run() {
        for(int i=1;i<10;i++){
            System.out.println("进入run:--->"+i+name);
        }

    }

    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            System.out.println("main----------"+TEST.test());
        }
    }
}
class TEST{
    public static int test(){
        new Thread(new ThreadTest("c")).start();
        return 1;
    }
}
