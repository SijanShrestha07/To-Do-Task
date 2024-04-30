public class DoWhile {
    public static void main(String[] args) {
        int num1=0;
        /* while checks the condition first */
        while(num1<0){
            System.out.println("this will not print since condition is false");
        }

        /*do while checks the condition after the loop 
         * meaning so while loop rins at least once even if condition is false
        */
        do{
            System.out.println("do while will check condiotion after the statement");
        }while(num1<0);
    }
    
}