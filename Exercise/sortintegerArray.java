package Exercise;

/**
 * Sort array values 
 * 
 */
public class sortintegerArray {
    public static void main(String[] args) {

        int[] sorted_array = sortDecendingOrder(new int[] {1,5,7,2,9,0,1,6});
        for (int i : sorted_array) {
            System.out.println(i);
        }
        
    }

    // Sort the values of each in assending maner
    public static int[] sortAssendingArray(int[] unsorted_array){

        // degine exchanger value
        for (int i = 0; i < unsorted_array.length; i++) {
            
            for (int j = i; j < unsorted_array.length; j++) {
                
                if (unsorted_array[i] > unsorted_array[j]) {
                     int changes = unsorted_array[i];
                     unsorted_array[i] = unsorted_array[j];
                     unsorted_array[j] = changes;
                }

            }
        }
        return unsorted_array;
    }

    // Sort the values of Array in Decending  order 
    public static int[] sortDecendingOrder(int[] unsorted_array) {
        
        for (int i = 0; i < unsorted_array.length; i++) {
            
            for (int j = i; j < unsorted_array.length; j++) {
                
                if (unsorted_array[i] < unsorted_array[j]) {
                    int changes = unsorted_array[i];
                    unsorted_array[i] = unsorted_array[j];
                    unsorted_array[j] = changes;
                }
            }
        }
        return unsorted_array;
    }

}
