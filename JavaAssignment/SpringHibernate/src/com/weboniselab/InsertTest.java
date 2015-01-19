package com.weboniselab;



import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  


  
public class InsertTest {  
public static void main(String[] args) {  
      
    Resource r=new ClassPathResource("applicationContext.xml");  
    BeanFactory factory=new XmlBeanFactory(r);  
      
    EmployeeDao dao=(EmployeeDao)factory.getBean("d");  
      
    Employee e=new Employee();  
    e.setId(114);  
    e.setFirstName("naveen");  
    e.setLastName("patil");  
    e.setEmail("patil@gmail.com");  
    e.setPhone(89565856);  
      
      
    dao.updateEmployee(e);  
      
}  
}  
