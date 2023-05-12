// Energy.java

package UI;

public class Energy extends Formula{
    // Lois's part
    float kineticEnergy(float mass, float velocity) {
        return mass * velocity * velocity ;
    }

    // Daniella's part
    float potentialEnergy(float mass, float height) {
        return mass * getGravity() * height;
    }

    // Saratu's part
    int totalEnergy(int pEnergy, int kEnergy) {
        return pEnergy + kEnergy;
    }

    // Worthy's part
    float gravitationalEnergy(float mass, float height)
    {
        return mass * getGravity() * height;
    }
}
