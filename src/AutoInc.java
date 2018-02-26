/**
 * Created by gaoqiong on 2018/2/26
 */

class AutoInc {
    public static void main(String[] args) {
        int x, a, b;
        a = 3;
        b = 2;
//        x=-a;
//        x=a*-b;
        x = a * (-b);
        System.out.println("x: " + x);

        int i = 1;
        System.out.println("i: " + i);
        System.out.println("++i: " + ++i);//前缀 先执行算法   再打印
        System.out.println("i: " + i);
        System.out.println("i++: " + i++);//后缀  先打印     再执行算法
        System.out.println("i: " + i);
        System.out.println("--i: " + --i);
        System.out.println("i--: " + i--);
        System.out.println("i: " + i);
    }
}
