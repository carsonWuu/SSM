package com.cason.mapper;
 
import java.util.List;

import com.cason.bean.StudentBean;

 
public interface StudentBeanMapper {
 
      
    public int add(StudentBean StudentBean);  
       
      
//    public void delete(int id);  
//       
//      
//    public StudentBean get(int id);  
//     
//      
//    public int update(StudentBean StudentBean);   
       
      
    public List<StudentBean> list();
    
      
//    public int count();  
    
    
    
}