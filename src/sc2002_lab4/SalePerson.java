package sc2002_lab4;

import java.util.Objects;

public class SalePerson implements Comparable {
    private final String firstName;
    private final String lastName;
    private final int totalSales;

    public SalePerson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    @Override
    public String toString() {
        return "SalePerson{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", totalSales=" + totalSales +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SalePerson sp = (SalePerson) obj;
        return Objects.equals(this.getFirstName(), sp.getFirstName()) && Objects.equals(this.getLastName(), sp.getLastName());
    }

    @Override
    public int compareTo(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return -1;
        SalePerson sp = (SalePerson) obj;
        if (this.getTotalSales() < sp.getTotalSales()) {
            return -1;
        }
        else if (this.getTotalSales() > sp.getTotalSales()) {
            return 1;
        }
        else {
            return this.getLastName().compareTo(sp.getLastName());
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTotalSales() {
        return totalSales;
    }
}
