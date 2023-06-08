package org.example.Model;

public non-sealed class EmployeePJ extends Employee {
    private final String Cnpj;

    public EmployeePJ(String Name, String Email, Integer Age, String cnpj) {
        super(Name, Email, Age);
        Cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "EmployeePJ{" +
                "Id='" + this.getId() + '\'' +
                "Name='" + this.getName() + '\'' +
                "Email='" + this.getEmail() + '\'' +
                "Age='" + this.getAge() + '\'' +
                "Cnpj='" + Cnpj + '\'' +
                '}';
    }
}
