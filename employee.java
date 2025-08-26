package Laboratorio;
public class employee {
    private String name;
    private int age;
    private double salary;
    private String type;
    private double benefits;

    public employee(String name, int age, double salary, String type, double benefits) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.type = type;
        this.benefits = benefits;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getType() {
        return type;
    }

    public double getBenefits() {
        return benefits;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBenefits(double benefits) {
        this.benefits = benefits;
    }
}
