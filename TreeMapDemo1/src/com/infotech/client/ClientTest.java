package com.infotech.client;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.infotech.model.Department;
import com.infotech.model.Employee;

public class ClientTest {

	public static void main(String[] args) {
		// create Employee class
		System.out.println("Please enter employee 1 information:");
		Employee e1 = new Employee();
		System.out.println("Please enter employee 2 information:");
		Employee e2 = new Employee();
		System.out.println("Please enter employee 3 information:");
		Employee e3 = new Employee();
		System.out.println("Please enter employee 4 information:");
		Employee e4 = new Employee();
		System.out.println("Please enter employee 5 information:");
		Employee e5 = new Employee();
		
		// create department class
		Department d1 = new Department(10001, "IT", "Boston");
		Department d2 = new Department(10002, "Finance", "Chennai");
		
		// create TreeMap
		Map<Employee,Department> empDeptMap = new TreeMap<>();
		
		// assign key and value to TreeMap
		empDeptMap.put(e1, d1);
		empDeptMap.put(e2, d1);
		empDeptMap.put(e3, d1);
		empDeptMap.put(e4, d2);
		empDeptMap.put(e5, d2);
		
		
		Set<Entry<Employee, Department>> entrySet = empDeptMap.entrySet(); // to get set view
		Iterator<Entry<Employee, Department>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Map.Entry<Employee, Department> entry = (Map.Entry<Employee,Department>) iterator.next();
			Employee employee = entry.getKey();
			Department department = entry.getValue();
			System.out.println(employee);
			System.out.println(department);
			System.out.println("===== ===== ===== ===== =====");
		}
	}
}
