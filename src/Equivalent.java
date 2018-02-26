import java.util.Random;

/**
 * Created by gaoqiong on 2018/2/26
 */

class Equivalent {
    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1 == n2);//比较的是两个对象的引用
        System.out.println(n1 != n2);
        System.out.println(n1.equals(n2));//比较的是两个对象的值

        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));//比较的是两个对象的值  虽然对象的i值是一样的 但并以意味着对象就一样


        Random random = new Random();
        int w = random.nextInt(100) + 1; //[0,100)   [1,101)  [1,100}
        if (w >= 50) {
            System.out.println("硬币是正面：" + w);
        } else {
            System.out.println("硬币是反面：" + w);
        }


        //Java 中, 看到像1.39e-43这样的 表达式时，它的含义是 1.39x(10的-43次方)
        float expFloat=1.39e-43f;
        System.out.println(expFloat);
        double expDouble=47e47d;
        double expDouble2=47e47;
        System.out.println("expDouble: " +expDouble+"  expDouble2: " +expDouble2);

    }
}

class Value {
    int i;
}
