public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int[] comboArray = new int[arr1.length + arr2.length];
        int counter = 0;
        while (counter < comboArray.length){
            for(int first = 0; first < arr1.length; first++) {
                comboArray[counter] = arr1[first];
                counter++;
            }
            
            for(int second = 0; second < arr1.length; second++) {
                comboArray[counter] = arr2[second];
                counter++;
            }
            
        }
       
        return comboArray;
    }
}
