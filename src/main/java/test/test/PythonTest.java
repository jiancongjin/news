package test;

import org.python.core.PyFunction;
import org.python.core.PyInteger;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by inger on 2019/4/9.
 */
public class PythonTest {
    public static void main(String[] args) {
       /* PythonInterpreter interpreter = new PythonInterpreter();
        interpreter.execfile("F:\\test.py");
        PyFunction pyFunction = interpreter.get("add",PyFunction.class);
        int a = 1,b =10;
        PyObject pyObject = pyFunction.__call__(new PyInteger(a),new PyInteger(b));
        System.out.println(pyObject);*/
        Process proc;
        try {
            proc = Runtime.getRuntime().exec("python D:\\1.py");// 执行py文件
            //用输入输出流来截取结果
            BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            String line = null;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
            proc.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
