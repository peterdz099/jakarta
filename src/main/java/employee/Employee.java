package employee;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private String position;

    public Employee() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public void setLastName(String surname) {
        this.lastName = surname;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPosition() {
        return position;
    }

    public String getLastName() {
        return lastName;
    }
}
