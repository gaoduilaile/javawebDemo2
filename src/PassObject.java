/**
 * Created by gaoqiong on 2018/2/26
 */

public class PassObject {
    public static void main(String[] args){
        Letter x=new Letter();
        x.c='a';
        System.out.println("x.c: "+x.c);
        f(x);
        System.out.println("x.c: "+x.c);
    }
    static void f(Letter y){
        y.c='z';
    }
}

class Letter{
    char c;
}
