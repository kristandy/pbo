package minggu9_kasus3;

public class Salesperson implements Comparable {
    private String firstName, lastName;
    private int totalSales;

    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    public boolean equals(Object other) {
        return (lastName.equals(((Salesperson) other).getLastName())
                && firstName.equals(((Salesperson) other).getFirstName()));
    }

    // public int compareTo(Object other) {
    // int result;

    // return result;
    // }

    public int compareTo(Object other) {
        Salesperson otherSalesperson = (Salesperson) other;

        // Compare total sales
        int salesComparison = Integer.compare(totalSales, otherSalesperson.getSales());

        // If total sales are the same, compare by name
        if (salesComparison == 0) {
            int lastNameComparison = lastName.compareTo(otherSalesperson.getLastName());

            // If last names are the same, compare by first name
            if (lastNameComparison == 0) {
                return firstName.compareTo(otherSalesperson.getFirstName());
            }

            return lastNameComparison;
        }

        return salesComparison;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSales() {
        return totalSales;
    }
}
