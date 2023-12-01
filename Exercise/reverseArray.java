package Exercise;

public class reverseArray {
    
    public static void main(String[] args){

        int[] reverse_array = reverseIntgerArray(new int[]{1,5,7,8,8,0});
        for (int i : reverse_array) {
            System.out.println("Reverse value: \t"+ i);
        }     
    }

    public static int[] reverseIntgerArray(int[] array_value) {     
        // reverse arry holder
        int[] reverse_array = new int[array_value.length];
        int j=0;
        // loop through each values of the array 
        for (int i = array_value.length-1; i >=0 ; i--) {
            reverse_array[j++] = array_value[i];
        }
        return reverse_array;
    }
}
