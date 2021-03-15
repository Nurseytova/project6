package builder;

public class BuilderEx {
    public static void main(String[] args){
       Employee employee= new EmployeeBuilderImpl().setName("Dash").setSurname("Kiko").setExperience("3 years").build();
       employee.getEmployee();
    }
}
class Employee{
    /*attributes for employee*/
    public String name;
    public String surname;
    public int salary;
    public String experience;
    public void getEmployee(){
        System.out.println(name + " " + surname + " " + salary + " " + experience + " ");
    }
}

interface EmployeeBuilder{
    EmployeeBuilder setName(String name);
    EmployeeBuilder setSurname(String surname);
    EmployeeBuilder setSalary(int salary);
    EmployeeBuilder setExperience(String experience);
    Employee build();
}

class EmployeeBuilderImpl implements EmployeeBuilder{
    Employee employee=new Employee();

    @Override
    public EmployeeBuilder setName(String name) {
        employee.name=name;
        return this;
    }

    @Override
    public EmployeeBuilder setSurname(String surname) {
        employee.surname=surname;
        return this;
    }

    @Override
    public EmployeeBuilder setSalary(int salary) {
        employee.salary=salary;
        return this;    }

    @Override
    public EmployeeBuilder setExperience(String experience) {
        employee.experience=experience;
        return this;
    }

    @Override
    public Employee build() {
        return employee;
    }
}







