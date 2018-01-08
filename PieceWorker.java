// PieceWorker class derived from Employee

import org.joda.time.LocalDate;

public final class PieceWorker extends Employee {

    private double wagePerPiece; // wage per piece output
    private int quantity; // output for week

    // constructor for class PieceWorker
    public PieceWorker(String first, String last,
            double wage, int numberOfItems, LocalDate startDate) {
        super(first, last, startDate); // call superclass constructor
        setWage(wage);
        setQuantity(numberOfItems);
    }

    // set PieceWorker's wage
    public void setWage(double wage) {
        wagePerPiece = (wage > 0 ? wage : 0);
    }

    // set number of items output
    public void setQuantity(int numberOfItems) {
        quantity = (numberOfItems > 0 ? numberOfItems : 0);
    }

    // determine PieceWorker's earnings
    public double earnings() {
        return quantity * wagePerPiece;
    }

    public String toString() {
        return "Piece worker: " + super.toString();
    }
}
