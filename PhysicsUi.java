package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class PhysicsUi {
    JFrame frame = new JFrame("Welcome to Physics Calculator");
    JButton potentialEnergy = new JButton("Potential Energy:");
    JButton kineticEnergy = new JButton("Kinetic Energy:");
    JButton totalEnergy = new JButton("Total Energy:");
    JButton gravitationalEnergy = new JButton("Gravitational Energy:");

    public void mainUI() {
        frame.add(potentialEnergy);
        frame.add(kineticEnergy);
        frame.add(totalEnergy);
        frame.add(gravitationalEnergy);
        frame.setSize(200, 250);
        frame.setLayout(new GridLayout(3, 1));
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.PINK);

        // Daniella's part
        potentialEnergy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawPotentialEnergy();
            }
        });

        // Lois's part
        kineticEnergy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawKineticEnergy();
            }
        });

        // Saratu's part
        totalEnergy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawTotalEnergy();
            }
        });

        // Worthy's part
        gravitationalEnergy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawGravitationalEnergy();
            }
        });
    }

    // Daniella's part
    JFrame potentialEnergyFrame = new JFrame("Potential Energy");
    JTextField enterMass = new JTextField("Enter mass");
    JTextField enterHeight = new JTextField("Enter height:");
    JButton calculatePotentialEnergy = new JButton("Calculate potential energy");

    public void drawPotentialEnergy() {
        Energy energy = new Energy();
        potentialEnergyFrame.add(enterMass);
        potentialEnergyFrame.add(enterHeight);
        potentialEnergyFrame.add(calculatePotentialEnergy);
        potentialEnergyFrame.setLayout(new GridLayout(2, 1));
        potentialEnergyFrame.setSize(200, 250);
        potentialEnergyFrame.setVisible(true);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        calculatePotentialEnergy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float potentialEnergy1 = energy.potentialEnergy(Float.parseFloat(enterMass.getText()), Float.parseFloat(enterHeight.getText()));
                JOptionPane.showMessageDialog(null, potentialEnergy1);
            }
        });
    }


    // Lois's part
    JFrame kineticEnergyFrame = new JFrame("Kinetic Energy");
    JTextField enterMass1 = new JTextField("Enter mass");
    JTextField enterVelocity = new JTextField("Enter velocity:");
    JButton calculateKineticEnergy = new JButton("Calculate kinetic energy");

    public void drawKineticEnergy() {
        Energy energy = new Energy();
        kineticEnergyFrame.add(enterMass1);
        kineticEnergyFrame.add(enterVelocity);
        kineticEnergyFrame.add(calculateKineticEnergy);
        kineticEnergyFrame.setLayout(new GridLayout(2, 1));
        kineticEnergyFrame.setSize(200, 250);
        kineticEnergyFrame.setVisible(true);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        calculateKineticEnergy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float kineticEnergy1 = energy.potentialEnergy(Float.parseFloat(enterMass1.getText()), Float.parseFloat(enterVelocity.getText()));
                JOptionPane.showMessageDialog(null, kineticEnergy1);
            }
        });
    }

    // Saratu's Part

    JFrame totalEnergyFrame = new JFrame("Total Energy");
    JTextField enterPotentialEnergy = new JTextField("Enter potential energy");
    JTextField enterKineticEnergy = new JTextField("Enter kinetic energy:");
    JButton calculateTotalEnergy = new JButton("Calculate kinetic energy");

    public void drawTotalEnergy() {
        Energy energy = new Energy();
        totalEnergyFrame.add(enterPotentialEnergy);
        totalEnergyFrame.add(enterKineticEnergy);
        totalEnergyFrame.add(calculateTotalEnergy);
        totalEnergyFrame.setLayout(new GridLayout(2, 1));
        totalEnergyFrame.setSize(200, 250);
        totalEnergyFrame.setVisible(true);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        calculateTotalEnergy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float totalEnergy1 = energy.potentialEnergy(Float.parseFloat(enterPotentialEnergy.getText()), Float.parseFloat(enterKineticEnergy.getText()));
                JOptionPane.showMessageDialog(null, totalEnergy1);
            }
        });
    }

    JFrame gravitationalEnergyFrame = new JFrame("Gravitational Energy");
    JTextField enterMass2 = new JTextField("Enter mass:");
    JTextField enterHeight1 = new JTextField("Enter height:");
    JButton calculateGravitationalEnergy = new JButton("Calculate gravitational energy");

    public void drawGravitationalEnergy() {
        Energy energy = new Energy();
        gravitationalEnergyFrame.add(enterMass2);
        gravitationalEnergyFrame.add(enterHeight1);
        gravitationalEnergyFrame.add(calculateGravitationalEnergy);
        gravitationalEnergyFrame.setLayout(new GridLayout(2, 1));
        gravitationalEnergyFrame.setSize(200, 250);
        gravitationalEnergyFrame.setVisible(true);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        calculateGravitationalEnergy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float gravitationalEnergy1 = energy.potentialEnergy(Float.parseFloat(enterMass2.getText()), Float.parseFloat(enterHeight1.getText()));
                JOptionPane.showMessageDialog(null, gravitationalEnergy1);
            }
        });
    }
}


