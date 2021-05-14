package belhard.java28;

import java.util.Objects;

public class Person {
    private final String firstName;
    private final String lastName;
    private final Gender gender;

    public Person(String firstName, String lastName, Gender genderS) {
        this.firstName = firstName;
        this.lastName = lastName;
        gender = genderS;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (! (obj instanceof Person)) return  false;
        if (!Objects.equals ( this.gender, ((Person) obj).gender )) return false;
        if (!Objects.equals ( this.firstName, ((Person) obj).firstName )) return false;
        return Objects.equals ( this.lastName, ((Person) obj).lastName );
    }

    @Override
    public int hashCode() {
        int hash;
        hash = this.firstName.hashCode ();
        hash = 31 * hash + (this.firstName !=null ? this.firstName.hashCode () : 0);
        return 31 * hash + (this.lastName != null ? this.lastName.hashCode () : 0);
    }

    @Override
    public String toString() {
        return this.firstName + ", " + this.lastName + ", " + this.gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }
}
