class Array1{
    public static void main(String[] args){
        //will create an int typed array eg marks
        //will assign some mark into the array
        //and print it

        /*int mark1;
        mark1 = 80;
        int mark2;
        mark2 = 81;

        System.out.println("mark1 :"+ mark1);
        System.out.println("mark2 :"+ mark2);

        int[] marks = {70, 75};
        System.out.println("mark1 from array:"+ marks[0]);
        System.out.println("mark2 from array:"+ marks[1]);*/
        //marks = {70, 75};
        /*marks[0]=10;
        marks[1]=20;
        marks[2]=30;
        marks[3]=40;*/

        java.util.Scanner scan = new java.util.Scanner(System.in);
        int[] altmarks =  new int[6];
        for(int i=0;i<6;i++){
            System.out.println("Enter you mark");
            altmarks[i]=scan.nextInt();
        }

        for(int i=0;i<6;i++){
            //System.out.println("altmarks from array:"+ altmarks[i]);
        }


        /*if 70 is present in the array
            array[0] == 70 //true match found
            array[1] == 70 //false no match
            array[2] == 70 //true match found
            array[3] == 70 //true match found
            array[4] == 70 //true match found
            array[5] == 70 //true match found*/
        boolean wantToContinue = true;
        while(wantToContinue){
            System.out.println("Enter a number to search::");
            int searchterm = scan.nextInt();
            //System.out.println("arrys size is ::"+altmarks.length);
            for(int j=0;j<altmarks.length;j++){
                if(altmarks[j]==searchterm){
                    System.out.println("Match found at index::"+j);
                }
            }
            System.out.println("Do you want to exit: yes to exit, no to continue");
            String choise = scan.next();
            if(!choise.equals("no")){
                wantToContinue=false;
            }
        }

    }
}