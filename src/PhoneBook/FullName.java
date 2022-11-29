package PhoneBook;

import java.util.Objects;

public class FullName {
    private final String name;
    private final String lastName;

    public FullName(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FullName fullName = (FullName) o;
        return name.equals(fullName.name) && lastName.equals(fullName.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }

    @Override
    public String toString() {
        return name + " " + lastName;
    }
}
