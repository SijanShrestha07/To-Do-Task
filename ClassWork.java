
public class ClassWork {
    public static void main(String[] args) {
        /* Task 1 */
        int rNumber1 = 20;

        System.out.println("Is the number greater than or equals to 18? " + (rNumber1 >= 18));


        /* Task 2 */
        int amount = 1000;
        double time = 2.5;
        double rate = 3;
        double Si = amount*time*rate/100;

        System.out.println(Si);


        /* Task 3 */
        double length = 25;
        double length = 30;
        double area = 30;
        double perimeter = 2*(length+breadth)
        System.out.println(area);
        System.out.println(perimeter);


        /*task 
         * Create a new Scanner obj name scan1
         * Prompt user for the following 
         * WHat is your name? --> save to string  name, use nextLine()
         * Are you over 18 --> Save to boolean status , use nextBoolean()
         * how many siblings do you have? --> Save int sibling, use nextLine()
         * print the output 
         * HEllo ,name
         * Over 18 status        */
        
         Scanner scan1 = new Scanner(System.in);
         System.out.println("What is your name? ");
         String name1= scan1.nextLine();
         System.out.println("Hello " + name1);
         
         System.out.println("are you over 18? ");
         Boolean age1= scan1.nextBoolean();
         System.out.println("age status: ");
         
         System.out.println("how many sibling? ");
         int sibling1= scan1.nextInt();
         System.out.println("you have "+ sibling1+"no. of sibling");
    }
}