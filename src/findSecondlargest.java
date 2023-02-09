import java.util.Collections;
import java.util.HashSet;

public class findSecondlargest {
    public static void main(String[] args) {
        int [] arr=new int[]{3,4,5,76,1,0,99,-111};
        int [] arr2=new int[]{1,-2222,3,4,5,76,1,0,99,-111,1000,99,1};
        find_SecondMAX_MIN(arr);
        find_SecondMAX_MIN(arr2);
    }

    static int[] find_SecondMAX_MIN(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i =0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        int max = Collections.max(hs);
        hs.remove(max);
        int second_max=Collections.max(hs);
        int min = Collections.min(hs);
        hs.remove(min);
        int second_min=Collections.min(hs);
        int[] result=new int[]{second_max,second_min};
        System.out.println(second_max);
        System.out.println(second_min);
        return result;

    }
}
