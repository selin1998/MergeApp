import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] d1 = {1,2,3};
        int[] d2 = {10,11}; // 1,2,3,10,11

        int[] d1a = {1,3,5};
        int[] d2a = {2,4};  // 1,2,3,4,5

        MergeApp m=new MergeApp();
        System.out.println(Arrays.toString(m.merge(d1,d2)));
        System.out.println(Arrays.toString(m.merge(d1a,d2a)));
    }
}
