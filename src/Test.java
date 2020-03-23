/**
 * Created by ZM on 2020/3/19 0019 21:19.
 */
public class Test {
    static int a = 1;
    static int b = 2;

    public static void main(String[] args) {
        a++;
        b++;
        for (String arg : args) {
            System.out.println("arg = [" + arg + "]");
            System.out.println("over");
        }
        System.out.println("Test.main");
        int a = 11;
        System.out.println("a = " + a);
        System.out.println("a");
    }

    public void method(){
        System.out.println("Test.method");
    }
}
