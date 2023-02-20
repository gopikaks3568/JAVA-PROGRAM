import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.text.NumberFormatter;

public class arrays {
    public static void main(String[] args) {
     //The old method of array representation with length specification
     //  int[] numbers=new int[5];
       //numbers[0]=2;
      // numbers[1]=3;
 

        int[] numbers={2,3,5,1,4};
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    
}
 