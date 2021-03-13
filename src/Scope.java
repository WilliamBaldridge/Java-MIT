public class Scope {

    public static void main(String[] arguments) {
        int x = 5;

        if (x == 5) {
//            int x = 6; // needs x = reassignment
            int y = 72;
            System.out.println("x = " + x + " y = " + y);
        }

//        System.out.println("x = " + x + " y = " + y); // access x but not y inside if {} block...
    }

}
