class GravityCalculator {

    public static void main(String[] arguments) {

        double gravity = -9.81;  // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.5 * gravity * fallingTime * fallingTime;
        finalPosition += initialVelocity * fallingTime;
        finalPosition += initialPosition;

        System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + " m."); // Original output was 0.0 m after 10s

        double a = -9.81;  // "acceleration" Earth's gravity in m/s^2
        double vi = 0.0; // initial velocity
        double t = 10.0; // time
        double xi = 0.0; // initial position
        double xt = 0.5 * (a * Math.pow(t, 2)) + (vi * t) + xi; // end position after t
       // x(t) = 0.5 × (a * t^2) + (vi *t) + xi


        System.out.println("The object's position after " + fallingTime + " seconds is " + xt + " m.");



    }
} 