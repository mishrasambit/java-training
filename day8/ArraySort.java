class ArraySort{
    public static void main(String[] args)
    {
        int[] arr1 = {89,79,64,55,34};
        for(int i=0; i<arr1.length; i++){
            //System.out.println("number :"+ arr1[i]);
            for(int j=0;j<arr1.length-1;j++){
                if(arr1[j] > arr1[j+1]){
                    int temp= arr1[j+1];
                    arr1[j+1] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }

        for(int i=0; i<arr1.length; i++){
            System.out.println("number :"+ arr1[i]);
        }
    }
}
