class ArrayMerge{
    public static void main(String[] args){
        int[] arr1 = {89,79,64,55,34};
        int[] arr2 = {81,74,60};
        
        //int[] merged = {89,79,64,55,34,81,74,60,53,64 }
        int [] merged = new int[arr1.length + arr2.length];
        int indexOfMerged = 0;
        for(int i=0; i<arr1.length; i++){
            merged[indexOfMerged] = arr1[i];
            indexOfMerged++;
        }

        for(int i=0;i<arr2.length;i++){
            merged[indexOfMerged] = arr2[i];
            indexOfMerged++;
        }
        
        for(int i=0;i<merged.length;i++){
            System.out.println(merged[i]);
        }
    }
}