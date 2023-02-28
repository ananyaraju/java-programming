
import java.io.FileInputStream;
import java.io.ObjectInputStream;
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

public class EmployeeDeSerialize {
    public static void main(String[] args) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("demo.txt"))){            
            Employee e = (Employee)ois.readObject();
            System.out.println(e.getName()+" "+e.getSalary());

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}