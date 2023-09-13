interface Worker { 
 void doWork(); 
} 
abstract class Employee implements Worker { 
 String name; 
 Employee(String name) { 
 this.name = name; 
 } 
 void introduce() { 
 System.out.println("Hi, I'm " + name); 
 } 
} 
class Manager extends Employee { 
 Manager(String name) { 
 super(name); 
 } 
 @Override 
 public void doWork() { 
 System.out.println(name + " (Manager) is managing tasks"); 
 } 
} 
public class EmployeeTest { 
 public static void main(String[] args) { 
 Worker worker = new Manager("Alice"); 
 worker.doWork(); 
 Employee employee = (Employee) worker; 
 employee.introduce(); 
 } 
}