import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
    private String name;
    private double salary;

    public Employee() {}

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
        
}

public class EmployeeSerialize {    
    public static void main(String[] args) {
        Employee emp = new Employee("Kumar", 46245);
        try(
            ObjectOutputStream obs = new ObjectOutputStream(new FileOutputStream("demo.txt"))
        ){
            obs.writeObject(emp);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}