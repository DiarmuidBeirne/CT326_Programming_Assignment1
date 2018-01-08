// Abstract base class Employee.

import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;


public abstract class Employee {

    private String firstName;
    private String lastName;
    private LocalDate joinDate;
    private static int uniqueID;
    private static int currentID = 100; //Unique ID's will start at 100 and increment upwards

    // constructor
    public Employee(String first, String last, LocalDate date) {
        firstName = first;
        lastName = last;
        joinDate = date;
        uniqueID = currentID;
        currentID++;

    }

    // get first name
    public String getFirstName() {
        return firstName;
    }

    // get last name
    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return firstName + ' ' + lastName;
    }

    public abstract double earnings() throws InvalidEarningsException;

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }
}
