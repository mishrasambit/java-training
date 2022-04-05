import java.util.Scanner;
class IfElse{
    public static void main(String[] args){
        //print Enter your age
        //will assign the user age to a variable age of integer type
        //check if the age is greater than 18
        //if the condition true
            //You can vote
        //else 
            //you can not vote

        System.out.println("Enter your age");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        boolean canVote = age > 18; //true or false
        if(canVote){
            System.out.println("You can vote");
        }else{
            System.out.println("You can not vote");
        }
        

    }
}