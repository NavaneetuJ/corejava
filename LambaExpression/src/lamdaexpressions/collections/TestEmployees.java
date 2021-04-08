package lamdaexpressions.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Jungkook",1234));
		employees.add(new Employee("Taeyong",2345));
		employees.add(new Employee("Jimin",3456));
		employees.add(new Employee("RM",4567));
		employees.add(new Employee("suga",5678));
		System.out.println(employees);


		Comparator<Employee> c = (e1,e2) -> (e1.eid < e2.eid)? -1 :(e1.eid > e2.eid)? 1 :0;
		Comparator<Employee> n = (e1,e2) -> e1.name.compareTo(e2.name);

		Collections.sort(employees, n);
		System.out.println(employees);




	}

}
