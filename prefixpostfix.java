public class prefixpostfix {
    public static void main(String[] args) {
        /* Prefix, operator on the left side */
        int prefixValue = 10;
        System.out.println("Prefix Value changes here y" + ++prefixValue);
        System.out.println("Prefix remains same " + prefixValue);

        /* Post fix opreator on the right side */
        int postFixValue = 20;
        System.out.println("Postfix value doesnot change here " + postFixValue++);
        System.out.println("It changes in next line " + postFixValue);
    }
}
