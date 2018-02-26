import java.util.Random;

/**
 * Created by gaoqiong on 2018/2/26
 */

class MathOps {
    public static void main(String[] args) {
        Random rand = new Random();
        int i, j, k;
        j = rand.nextInt(100) + 1;
        System.out.println("j: " + j);
        k = rand.nextInt(100) + 1;
        System.out.println("k: " + k);
        i = j + k;
        System.out.println("j+k: " + i);
        i = j - k;
        System.out.println("j-k: " + i);
        i = k / j;
        System.out.println("k/j: " + i);
        i = k * j;
        System.out.println("k*j: " + i);

        i = k % j;
        System.out.println("k%j: " + i);
        i = j % k;
        System.out.println("j%k: " + i);

        float u,v,w;
        u=rand.nextFloat()+1;
        System.out.println("u: " + u);
        v=rand.nextFloat()+1;
        System.out.println("v: " + v);
        w=rand.nextFloat()+1;
        System.out.println("w: " + w);

    }
}
