package com.weboniselab;

import org.springframework.orm.hibernate3.HibernateTemplate;  

import java.util.*;  

public class EmployeeDao {
	HibernateTemplate template;
	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  
	}  
	public void saveEmployee(Employee e){  
	    template.save(e);  
	}  
	public void updateEmployee(Employee e){  
	    template.update(e);  
	}  
	public void deleteEmployee(Employee e){  
	    template.delete(e);  
	}  
	public Employee getById(int id){  
	    Employee e=(Employee)template.get(Employee.class,id);  
	    return e;  
	}   
	public List<Employee> getEmployees(){  
	    List<Employee> list=new ArrayList<Employee>();  
	    list=template.loadAll(Employee.class);  
	    return list;  
	}  

}