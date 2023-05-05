import java.util.Scanner;

public class Physics {
    private double gravity=9.81;

    public double getGravity() {
        return gravity;
    }

    public void setGravity(double gravity) {
        this.gravity = gravity;
    }

    public double getPotentialEnergy(double mass, double height){
        return mass * gravity * height;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter mass");
        double mass = input.nextDouble();
        System.out.println("Enter height");
        double height = input.nextDouble();

        Physics physics = new Physics();
        double potentialEnergy = physics.getPotentialEnergy(mass, height);

        System.out.println("The Potential energy is " + potentialEnergy);

    }


}


