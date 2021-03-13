public class FooCorporation {

    public static void totalPay(double basePay, double hours) {

        if (basePay < 8.0) {
            System.out.println("You must be paid at least $8.00/hour");

        } else if (hours > 60) {
            System.out.println("You can't work more than 60 hours a week");

        } else {

            double overtimeHours = 0;
            if (hours > 40) {
                overtimeHours = hours - 40;
                hours = 40;
            }

            double pay = basePay * hours;
            pay += overtimeHours * basePay * 1.5;
            System.out.println("Pay this employee $" + pay);
        }

    }


    public static void main(String[] args) {

        totalPay(16, 61);
        totalPay(7.99, 60);

        totalPay(16, 40);
        totalPay(16, 44);



    }

}
