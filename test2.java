import java.util.ArrayList;
import java.util.List;

/**
 * test2
 */
public class test2 {

    public static void main(String[] args) {
        
       int a = 5;
       int b = 6;
       int c = 9;
       List<Integer> numbers = new ArrayList<>();
       numbers.add(a);
       numbers.add(b);
       numbers.add(c);
       System.out.println(getSum(numbers));
      

       }

       public static Integer getSum(List<Integer> list) {
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            result = result + list.get(i);
        }

        return result;

       }

    }

    


    
