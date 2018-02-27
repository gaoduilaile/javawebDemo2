/**
 * Created by gaoqiong on 2018/2/26
 */

class MovePosition {
    public static void main(String[] args) {
        //左移操作符（<<） 能按照操作符右侧指定的位数将操作符左侧的数向左移动（在低位补0）
        //右移操作符（>>） 能按照操作符右侧指定的位数将操作符左侧的数向右移动

        //符号位正 高位插入0     符号为负 高位插入1


        int i = 1;
        System.out.println(i + "");
        i >>= 2;       //相当于i=i/2的2次方
        System.out.println(i + "");

        int i2 = 1;
        i2 <<= 7;       //相当于i=i*2的7次方
        System.out.println(i2 + "");


        int l = 1000;
        System.out.println(l + "");
        l >>= 2;
        System.out.println(l + "");

        int x = 1000;
        System.out.println(x + "");
        x >>= 5;
        System.out.println(x + "");

    }
}
