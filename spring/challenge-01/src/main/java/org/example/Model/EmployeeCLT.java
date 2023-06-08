package org.example.Model;

public non-sealed class EmployeeCLT extends Employee  {
    private final String Cpf;
    private final String StateOfBirth;

    public EmployeeCLT(String name, String email, Integer age, String cpf, String stateOfBirth) {
        super(name, email, age);
        Cpf = cpf;
        StateOfBirth = stateOfBirth;
    }

    @Override
    public String toString() {
        return "EmployeeCLT{" +
                "Id='" + this.getId() + '\'' +
                "Name='" + this.getName() + '\'' +
                "Email='" + this.getEmail() + '\'' +
                "Age='" + this.getAge() + '\'' +
                "Cpf='" + Cpf + '\'' +
                ", StateOfBirth='" + StateOfBirth + '\'' +
                '}';
    }
}
