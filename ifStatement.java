public class ifStatement {
    public static void main(String[] args) {
        /* Simple if statement, takes condition/expression with boolean value */
        if(true){
            System.out.println("True statement");
        }
        if(false){
            System.out.println("Skipped statement");
        }
        else{
            System.out.println("False statement");
        }
        /* If condition fails, goes to else block/scope */
        int num1 = 12, num2 = 20;
        if(num1 > num2){
            System.out.println("Num1 is greater");
        }
        else{
            System.out.println("Num2 is greater");
        }
        /* if else if */
        int iNum1 = 10, iNum2 = 12;
        if(iNum1 == iNum2){
            System.out.println("Equal Number");
        }
        else if(iNum1 > iNum2){
            System.out.println("iNum1 is greater");
        }
        else{
            System.err.println("iNum2 is greater");
        }
        /* Note that else should be at the last of the if statement */
        /* If Else If ladder, more that one else if */
        if(iNum1 < 0){
            System.out.println("iNum1 is negative");
        }
        else if(iNum2 < 0){
            System.out.println("iNum2 is negative");
        }
        else if(iNum1 == iNum2){
            System.out.println("Equal Number");
        }
        else if(iNum1 < iNum2){
            System.out.println("iNum1 is less");
        }
        else{
            System.out.println("Default execution if all fails");
        }
        /* Note that else is not mandatory and can be skipped */
        /* Question */
        int q1 = 10, q2 = 10;
        if(q1 >= q2){
            System.out.println("1st statement");
        }
        else if(q1 == q2){
            System.out.println("2nd statement");
        }
        else{
            System.out.println("Default stataement");
        }
        /* Nested if statement */
        int nNum1 = -10, nNum2 = 20;
        if(nNum1 < 0){
            if(nNum1 > nNum2){
                System.out.println("nNum1 is positive and greater");
            }
            else{
                System.out.println("nNum1 is negative and lesser");
            }
        }
        else{
            if(nNum1 > nNum2){
                System.out.println("nNum1 is positive and greater");
            }
            else{
                System.out.println("mNum1 is positive and lesser");
            }
        }
        /* task 
         * given the value below, add the total and take the avg
         * if any of the marking is less than 35, print "fail "
         * if avg is less than 60, print "3rd div"
         * if avg is less than 70, print "2nd div"
         * if avg is less than 80, print "1st div"
         * if avg is greater or equal to 80, print"distinction"
         */
        int math= 38, sci=60, eng=35;
        /*make total variable and average variable */
        int total=math+sci+ eng;
        System.out.println("total is " +total);
        int avg=total/3;
        System.out.println("average is "+avg);
        if(avg<35){
            System.out.println("fail");
        }else if(avg<60){
            System.out.println("3rd div");      
        }else if(avg<70){
            System.out.println("2nd div");      
        }else if(avg<80){
            System.out.println("1st div");      
        }else{
            System.out.println("Distinction");      
    }
    }
}
