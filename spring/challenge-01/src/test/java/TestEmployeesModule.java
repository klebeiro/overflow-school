import org.example.Model.BaseEntity;
import org.example.Model.Employee;
import org.example.Model.EmployeeCLT;
import org.example.Model.EmployeePJ;
import org.example.Repository.GenericRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TestEmployeesModule {

    List<Employee> DB1 = new ArrayList<>();
    GenericRepository<Employee> EmployeeRepository1 = new GenericRepository<>(DB1);

    @Test
    public void CheckIfCanCreateAnEmployee() {
        // Arrange
        Employee Employee1 = new EmployeeCLT("Klênisson Mateus", "klenissonmateuspessoal@gmail.com", 18, "222.222.222-22", "CE");

        // Act
        EmployeeRepository1.Create(Employee1);

        // Assert
        assertEquals(Employee1, EmployeeRepository1.FindById(Employee1.getId()));
    }

    @Test
    public void CheckIfCanReturnAllEmployees() {
        // Arrange
        Employee Employee1 = new EmployeeCLT("Klênisson Mateus", "klenissonmateuspessoal@gmail.com", 18, "222.222.222-22", "CE");
        Employee Employee2 = new EmployeePJ("John Doe", "johndoe@gmail.com", 18, "CNPJ");

        EmployeeRepository1.Create(Employee1);
        EmployeeRepository1.Create(Employee2);

        // Act
        EmployeeRepository1.FindAll();

        // Assert
        assertEquals(DB1, EmployeeRepository1.FindAll());
    }

    @Test
    public void CheckIfCanFindEmployeeById() {
        // Arrange
        Employee Employee1 = new EmployeeCLT("Klênisson Mateus", "klenissonmateuspessoal@gmail.com", 18, "222.222.222-22", "CE");
        EmployeeRepository1.Create(Employee1);

        // Act
        var EmployeeReturned = EmployeeRepository1.FindById(Employee1.getId());

        // Assert
        assertEquals(Employee1, EmployeeReturned);
    }

    @Test
    public void CheckIfCanUpdateEmployee() {
        // Arrange
        Employee Employee1 = new EmployeeCLT("Klênisson Mateus", "klenissonmateuspessoal@gmail.com", 18, "222.222.222-22", "CE");
        EmployeeRepository1.Create(Employee1);

        Employee Employee3 = new EmployeeCLT("Klênisson Ribeiro", "klenissonmateuspessoal@gmail.com", 18, "222.222.222-22", "CE");
        Employee3.setId(Employee1.getId());

        // Act
        EmployeeRepository1.Update(Employee3);

        // Assert
        assertEquals(Employee3, EmployeeRepository1.FindById(Employee1.getId()));
    }

    @Test
    public void CheckIfCanDeleteEmployee() {
        // Arrange
        Employee Employee1 = new EmployeeCLT("Klênisson Mateus", "klenissonmateuspessoal@gmail.com", 18, "222.222.222-22", "CE");
        EmployeeRepository1.Create(Employee1);

        // Act
        EmployeeRepository1.Delete(0);

        // Assert
        assertNull(EmployeeRepository1.FindById(Employee1.getId()));
    }
}
