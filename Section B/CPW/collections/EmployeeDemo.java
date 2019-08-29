import java.util.Map;
import java.util.HashMap;
import java.util.Optional;
import java.util.Scanner;

public class EmployeeDemo{
    public static void main(String args[]){
        Map<Integer,Employee> employees = new HashMap<Integer,Employee>();
    
        for(int i=0; i<3; i++){
            Employee emp = new Employee("emp "+(i+1),"position "+(i+1));
            employees.put(emp.getId(), emp);
        }
        Scanner scan = new Scanner(System.in);
        int choice = 1;
        System.out.println("Enter 1 to search by id, Enter 2 to search by name");
        choice = scan.nextInt();
        switch(choice){
            case 1:
            System.out.println("Enter id of the employee to search for ");
            Integer id = scan.nextInt();
            Employee emp = employees.get(id);
            if(emp!=null){
                System.out.println("Target employee info: Id "+emp.getId() + "\t Name "+emp.getName()+ "\t Position "+ emp.getPosition());
            }else{
                System.out.println("Employee not found");
            }
            break;
            case 2:
            System.out.println("Enter name of the employee to search for ");
            scan.nextLine();
            String name = scan.nextLine();
            Optional<Employee> employee = employees.values().stream().filter(e -> e.getName().equals(name)).findFirst();
             emp = employee.orElse(null);
             if(emp!=null){
                System.out.println("Target employee info: Id "+emp.getId() + "\t Name "+emp.getName()+ "\t Position "+ emp.getPosition());
            }else{
                System.out.println("Employee not found");
            }
            break;
        }
    }
}