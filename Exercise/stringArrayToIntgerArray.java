package Exercise;

/**
 * Chage String array to Intger Array value 
 */
public class stringArrayToIntgerArray {

    public static void main(String[] args) {
         int[] int_parsed = toIntegerArray(new String[]{"1","2","3"});

         for (int i = 0; i < int_parsed.length; i++) {
                  System.out.println(int_parsed[i]);
         }
        
    }

    // method changes String array value to Intger Arrau value (Intger.parseInt)
    public static int[] toIntegerArray(String string_array[]) {
        // create new Intger class object
        int[] intger_array = new int[string_array.length];
        int count = 0;
        for (String i : string_array) {
            intger_array[count++] = Integer.parseInt(i);
        }
        return intger_array;
    }
}