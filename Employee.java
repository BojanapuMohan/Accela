import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Employee {
	
	public int id;
	public String name;
	
	Employee(int id, String name){
		this.id = id;
		this.name = name;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}


class TestEmployee{
	
	public static void main(String[] args) {
		List<Employee> list= new LinkedList<Employee>();
		
		Employee e1 = new Employee(1, "Mohan1");
		Employee e2 = new Employee(2, "Mohan2");
		Employee e3 = new Employee(3, "Mohan3");
		Employee e4 = new Employee(2, "Mohan4");
		Employee e5 = new Employee(5, "Mohan5");
		Employee e6 = new Employee(7, "Mohan6");
		Employee e7 = new Employee(4, "Mohan7");
		Employee e8 = new Employee(6, "Mohan8");
		Employee e9 = new Employee(5, "Mohan9");
		Employee e10 = new Employee(3, "Mohan");
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		list.add(e8);
		list.add(e9);
		list.add(e10);
		  
		TestEmployee test = new TestEmployee();
		System.out.println("Identical Employees");
		test.getIdenticalIds(list);
		
		System.out.println("Ascending Order");
		List<Employee> copyList= new LinkedList<Employee>();
		copyList.addAll(list);
		Comparator<Employee> comparator = new Comparator<Employee>() {
		    @Override
		    public int compare(Employee emp1, Employee emp2) {
		        return emp1.getId() - emp2.getId(); 
		    }
		};
		
		Collections.sort(list, comparator);
		test.getAssendingOrder(list);


		//Print exact order
		System.out.println("Exact Order");
		test.orderList(copyList);

		
	}
	
	public void getIdenticalIds(List<Employee> list){
		Set<Integer> empSet=new HashSet<Integer>();
		for(Employee emp:list){
			if (empSet.add(emp.getId()) == false){
				System.out.println(emp.id);  
			}
		    
		}
	}
	
	public void getAssendingOrder(List<Employee> list){
		for(Employee emp:list){
			System.out.println(emp.id+" "+emp.name+" ");  
		    
		}
	}

	private void orderList(List<Employee> list) {
		for(Employee emp:list){
			System.out.println(emp.id+" "+emp.name+" ");  
		    
		}
	}
	
	
	
	
}

