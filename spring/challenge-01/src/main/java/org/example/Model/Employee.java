package org.example.Model;

import lombok.Getter;

@Getter
public sealed class Employee extends BaseEntity permits EmployeePJ, EmployeeCLT {
    private final String Name;
    private final String Email;
    private final Integer Age;

    public Employee(String name, String email, Integer age) {
        Name = name;
        Email = email;
        Age = age;
    }
}
