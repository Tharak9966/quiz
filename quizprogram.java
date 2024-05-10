import java.util.Scanner;

public class quizprogram {
    
    public static void main(String[] args) {
        int i=0;
System.out.println(".......quiz application.......");
        System.out.println("what is the capital of india :");
        System.out.println("1.delhi"+'\n'+"2.punjab"+'\n'+"3.assam");
        Scanner myobj = new Scanner(System.in);
        System.out.println("enter your answerin (1,2,3):");
         int ans1 = myobj.nextInt();
        switch(ans1){
         case 1:
             System.out.println("correct answer");
             i++;
             break;
        case 2:
            System.out.println("wrong answer:the correct answer is:delhi");
            break;        
        case 3:
        System.out.println("wrong answer:the correct answer is:delhi");
        break;
        default :
         System.out.println("invalid input");
         break;
        }
             
               System.out.println("what is the sum of 80+50+60 :");
        System.out.println("1.190"+'\n'+"2.180"+'\n'+"3.200");
        
        System.out.println("enter your answerin (1,2,3):");
         int ans2 = myobj.nextInt();
        switch(ans2){
         case 1:
             System.out.println("correct answer");
             i++;
             break;
        case 2:
            System.out.println("wrong answer:the correct answer is:delhi");
            break;        
        case 3:
        System.out.println("wrong answer:the correct answer is:delhi");
        break;
        default :
        System.out.println("invalid input");
        break;
        } 
        System.out.println("what is our national bird:");
        System.out.println("1.flemingo"+'\n'+"2.woodpeaker"+'\n'+"3.peacock");
        System.out.println("enter your answerin (1,2,3):");
         int ans3 = myobj.nextInt();
        switch(ans3){
         case 1:
             System.out.println("wrong answer:the correct answer is:peacock");
             break;
        case 2:
            System.out.println("wrong answer:the correct answer is:peacock");
            break;        
        case 3:
        System.out.println("correct answer");
        i++;
        break;
        default :
        System.out.println("invalid input");
        break;

        }
        System.out.println("your score is="+i);
          
        if( i ==0) {
        System.out.println("better luck next time");
        }
        else if(i ==1) {
         System.out.println("better luck next time");
    }
     else if( i ==2) {
        System.out.println("you are good");
        }
        else{
        System.out.println("you are excellent");
}
        
         }}
