//import java.util.Scanner;
class Loop{
    public static void main(String[] args){
        //print your name 5 times
        //using while
        /*if(false){
            System.out.println("My name is Sambit.");
        }else{
            System.out.println("My name is Xyz.");
        }*/
        java.util.Scanner scan = new java.util.Scanner(System.in);
        boolean doYouWantToContinue = true;
        /*while(doYouWantToContinue){
            System.out.println("My name is Sambit.");
            System.out.println("Do you want to continue? press any alphabet to yes and 'no' for quit.");
            String answer = scan.next();
            if(answer.equalsIgnoreCase("no")){
                doYouWantToContinue = false;
            }
        }*/

        //counter=1
        //check condition true counter<=5
        //print my name
        //counter = counter +1
        /*int counter = 1;
        while(counter<=5){
            System.out.println("My name is Sanjay");
            counter = counter +1;
        }*/

        //for(initialization;condition;increament)
        /*for(int counter2=1; counter2<=10; counter2++){
            System.out.println("My name is Sanjay");
        }*/

        /*int counter3=1;
        do{
            System.out.println("My name is Sanjay");
            counter3++;
        }while(false);*/


        System.out.println("My Calculator");
        for(boolean wantToContinue=true;  wantToContinue ; ){
            System.out.println("Do you want to perform calculation");
            String userchoise = scan.next();
            if(userchoise.equalsIgnoreCase("yes")){
                //calculation
                System.out.println("Enter two numbers");
                int number1 = scan.nextInt();
                int number2 = scan.nextInt();
                int result = number1 + number2;
                System.out.println("Enter operator like + - * / %");
                if(matching +){}
                    int result = number1 + number2;
                    System.out.println("Sum is "+result);
                }else if(-){

                }else{
                    System.out.println("Wrong operator ");
                }
            }else{
                wantToContinue=false;
            }
        }
    }
}