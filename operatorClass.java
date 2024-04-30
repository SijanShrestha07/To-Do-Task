public class operatorClass {
    public static void main(String[] args) {
        /* Arithmetic Operator */
        int a= 10 , b = 20;
        int sum = a + b; // here + is an arithmetic opearator 
        System.out.println("The sum is " + sum);

        System.out.println("The difference is " + (a - b));
        System.out.println("The multiplication is " + (a * b));
        System.out.println("The division is " + (a / b));
        System.out.println("The modulo is " + (a % b));

        /* Assignment Operator */
        /* Declaration and assignment */
        int number1 = 10;
        int number2;
        /* Assignment after declaration */
        number2 = 20;
        /* assign value using += */
        System.out.println("Number2 after using += is " + (number2 += 10));
        /* assign value using *= */
        number2 *= 100; // This is same as doing number2 = number2 * 10
        System.out.println("Number2 after using *= is " + number2);

        /* Relational Operators */
        int rNumber1 = 9, rNumber2 = 20;
        System.out.println("Is rNumber1 equals to rNumber2 ?" + (rNumber1 == rNumber2));
        System.out.println("Is rNumber1 less then rNumber2 ?" + (rNumber1 < rNumber2));
        System.out.println("Is rNumber1 greater or equals to rNumber2? " + (rNumber1 >= rNumber2));
        System.out.println("Is rNUmber1 and rNumber2 not equals to rNumber2? " + (rNumber1 != rNumber2));
        
        /* Local Operator */
        int lNumber1 = 20 , lNumber2 = 22;
        boolean expression1 = lNumber1 == lNumber2;
        boolean expression2 = lNumber1 > lNumber2;
        System.out.println("And expression using && " + (expression1 && expression2));
        System.out.println("Or expression using || " + (expression1 || expression2));
        System.out.println("Not expression using ! " + (!expression1));

        /* Unary Expression */
        int uNumber1 = 10;
        uNumber1 ++; // same as uNumber1 = uNumber1 + 1;
        System.out.println("Unary Operator using ++" + uNumber1);
        uNumber1 --; // same as uNumber1 = uNumber1 - 1;
        System.out.println("Unary Operator using -- " + uNumber1);

        /* Ternary Operator */
        int tNumber1 = 20 ,tNumber2 = 20;
        boolean tExpression1 = tNumber1 == tNumber2;
        /* For ternary, First you define expression, if expression true
         * it returns value after "?"
         * if the expression is false
         * it returns the value after ":"
         * Syntax
         * Expression ? true statement : false statement
         */
        String output = tExpression1 ? "True Condition" : "False Condition";
        /* further be seen as
         * String Output;
         * if(tExpression1){
         *  output = "True Condition":
         * }else{
         *  output = "False Condition"
         * }
         */
        int numberOutput = tNumber2 > tNumber2 ? 10 : 20;
        System.out.println(output);
    }
}