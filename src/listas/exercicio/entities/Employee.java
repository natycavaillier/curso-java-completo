package listas.exercicio.entities;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }


    //#region Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    //#endregion

    public void increaseSalary(Double percentage){
        salary = salary * (percentage / 100 + 1);
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", salary=" + String.format("%.2f", salary);
    }
    
    
}
