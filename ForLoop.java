public class ForLoop {
    public static void main(String[] args) {
        for(int index = 0; index < 4; index ++){
            System.out.println("Loop " + index);
        }
        /* Make the table for the following  */
        for(int index = 10; index >=0 ; index --){
            System.out.println("Decrement " + index);
        }
        /* Nested for loop
         * For loop inside a for loop scope/block */
         for(int outer = 0; outer < 2; outer ++){
            for(int inner = 3; inner >=0 ; inner--){
                System.out.println("Inner Loop" + inner);
            }
            System.out.println("Outer Loop" + outer);
        }
        /* Test comment */
    }
}