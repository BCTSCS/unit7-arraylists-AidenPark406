import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOne {
    public static void main(String[] args) {
        // Creating ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();  // Type-safe list
        
        // Adding elements
        numbers.add(1);                // append in Python
        numbers.add(0, 2);    // insert in Python
        
        // Accessing elements
        int first = numbers.get(0);    // numbers[0] in Python
        int last = numbers.get(numbers.size() - 1);  // numbers[-1] in Python
        
        // Removing elements
        numbers.remove(numbers.size() - 1);  // pop() in Python
        numbers.remove(Integer.valueOf(1));   // remove(1) in Python
        numbers.remove(0);             // del numbers[0] in Python



        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        // nums.add("string");  -- will error; String does not match the Generically defined Integer data type

        nums.add(4);           // Add to end
        int length =  nums.size();  // Get length
        System.out.println("Length of list is: " + length);

        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("numbers1 is: " + numbers1);
        List<Integer> subset = numbers1.subList(1, 4);  // [2, 3, 4]
        System.out.println("subset is: " + subset);


    }
}
