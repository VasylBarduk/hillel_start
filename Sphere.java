package Lesson3;

public class Sphere {
    public static void main(String[] args ) {
        int rOne = 1;
        double rTwo = 0.8;
        double rThre = 0.9;
        double density = 0.4;
        double volume = 4/3 * 3.14 * ((rOne+rTwo+rThre)*(rOne+rTwo+rThre)*(rOne+rTwo+rThre));
        double weightBall = density*volume;
        System.out.println("Weight = " +weightBall);
        }

}

