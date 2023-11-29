package Exercise;

public class operationArray {
    
    public static void main(String[] args) {
        // sum of array 
        int[] arry_value = new int[] {1,6,8,9};
        int sum_value = sumOfArray(arry_value);
        System.out.println("Sum of array is:\t" + sum_value);
        sum_value = sumofArrayRecursive(arry_value, arry_value.length);
        System.out.println("Sum of Array Recursively:\t"+ sum_value);

        // get the avarage values of the array
        int avarage_value = avarageValue(arry_value);
        System.out.println("avarage value is:\t"+ avarage_value );

        // remove values form the array
        int[] to_remove_values = valueRemove(new int[]{1,2,4,6,8,6}, 2);
        System.out.println("Remove values to remove "+to_remove_values);

        
    }

    // Returns the sum of array 
    public static int sumOfArray(int[] array_value) {
        // variable to hold the sum of array
        int sum_array = 0;
        for (int i = 0; i < array_value.length; i++) {
            sum_array += array_value[i];
        }
        return sum_array;
    }

    // Return sum in Recursive option
    public static int sumofArrayRecursive(int[] array_value, int array_length) {
        if (array_length <= 0) {
            return 0;
        }else{
            return sumofArrayRecursive(array_value, array_length-1) + array_value[array_length-1];
        }
    }

    // Retun the avarage values of the arrays 
    public static int avarageValue(int[] array_value) {
        
        // get the avarage values of elements 
        return sumofArrayRecursive(array_value, array_value.length)/array_value.length;
    }

    // Return the Values of the Remove elements 
    public static int[] valueRemove( int[] array_value, int value_remove) {
        // remove the elements from the array values
         boolean values_found = false;
         //int count_remove = 0;

        for (int i = 0; i < array_value.length; i++) {
            if (array_value[i] == value_remove) 
            {
                 array_value[i] = 0;
                 values_found = true;
            }
        }

        if (values_found) 
        {
             int[] array_values = new int[array_value.length-1];
             for (int i = 0; i < array_value.length; i++) {
                if(array_value[i] !=0){
                      array_values[i] = array_value[i];
                }              
             }
            return  array_values;
        }
         return array_value;
    }
}
