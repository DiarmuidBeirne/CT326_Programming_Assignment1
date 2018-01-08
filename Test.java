// Driver for Employee hierarchy

// Java core packages
import org.joda.time.LocalDate;

import java.text.DecimalFormat;
import java.util.ArrayList;

// Java extension packages
import javax.swing.JOptionPane;

public class Test {
    //Diarmuid Beirne 15331436
    // test Employee hierarchy
    public static void main(String args[]) {
        Employee employee; // superclass reference
        ArrayList<Employee> employes; //declare employes Arraylist to hold Employes.
        String output = "";

        Boss boss = new Boss("John", "Smith", 800.0, new LocalDate(2012, 1, 4));

       /* CommissionWorker commissionWorker =
                new CommissionWorker(
                "Sue", "Jones", 400.0, 3.0, 150);

        PieceWorker pieceWorker =
                new PieceWorker("Bob", "Lewis", 2.5, 200);

        HourlyWorker hourlyWorker =
                new HourlyWorker("Karen", "Price", 13.75, 40);
*/
        DecimalFormat precision2 = new DecimalFormat("0.00");

        employes = new ArrayList<Employee>();

        //create employee objects
        HourlyWorker employee1 = new HourlyWorker("Aidan", "O'Shea", 10, 160, new LocalDate(2015, 01,25));
        HourlyWorker employee2 = new HourlyWorker("Andrew", "Moran", 12.50, 160, new LocalDate(2011, 05,23));
        Boss employee3 = new Boss("Leeroy", "Keegan", 1000, new LocalDate(2010, 04,21));
        HourlyWorker employee4 = new HourlyWorker("Tom", "Parsons", 10, 160, new LocalDate(2014, 11,4));
        //add employee objects to the array
        employes.add(employee1);
        employes.add(employee2);
        employes.add(employee3);
        employes.add(employee4);
        //calculate wages
        for (int i = 0; i < employes.size(); i++) {
            int bonus = 0;
            employes.get(i).earnings();
            if(new LocalDate().getYear() - employes.get(i).getJoinDate().getYear() >= 5)
            {
                bonus = 200;

            }

            System.out.println(employes.get(i).toString() + "Earned " + (employes.get(i).earnings() + bonus));
        }



/*// Employee reference to a Boss
        employee = boss;

        output += employee.toString() + " earned $"
                + precision2.format(employee.earnings()) + "\n"
                + boss.toString() + " earned $"
                + precision2.format(boss.earnings()) + "\n";

        // Employee reference to a CommissionWorker
        employee = commissionWorker;

        output += employee.toString() + " earned $"
                + precision2.format(employee.earnings()) + "\n"
                + commissionWorker.toString() + " earned $"
                + precision2.format(
                commissionWorker.earnings()) + "\n";

        // Employee reference to a PieceWorker
        employee = pieceWorker;

        output += employee.toString() + " earned $"
                + precision2.format(employee.earnings()) + "\n"
                + pieceWorker.toString() + " earned $"
                + precision2.format(pieceWorker.earnings()) + "\n";

// Employee reference to an HourlyWorker
        employee = hourlyWorker;

        output += employee.toString() + " earned $"
                + precision2.format(employee.earnings()) + "\n"
                + hourlyWorker.toString() + " earned $"
                + precision2.format(hourlyWorker.earnings()) + "\n";

        JOptionPane.showMessageDialog(null, output,
                "Demonstrating Polymorphism",
                JOptionPane.INFORMATION_MESSAGE);
*/
        System.exit(0);
    }
} // end class Test
