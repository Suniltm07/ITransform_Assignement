package com.capg.springmvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController 
{
	@Autowired
    private EmployeeDao employeeDao;

    @RequestMapping(value = "/employee",method=RequestMethod.POST)
    public ModelAndView saveEmployee(@ModelAttribute("employee") Employee employee)
    {
        try
        {
            if(employeeDao.getEmployeeById(employee.getId()) != null);
            employeeDao.updateEmployee(employee);
        }
        catch(EmptyResultDataAccessException e)
        {
            System.out.println("inside catch");
            employeeDao.saveEmployee(employee);
        }
        return new ModelAndView("redirect:/employees");
    }
    
    @RequestMapping(value = "/edit/{id}")
    public ModelAndView editEmployee(@ModelAttribute("employee") Employee employee,@PathVariable("id") int id)
    {
        ModelAndView model = new ModelAndView("employees");
        
        employee = employeeDao.getEmployeeById(id);
        List employeeList = employeeDao.getAllEmployees();
        
        model.addObject("employee",employee);        
        model.addObject("employeeList",employeeList);
        
        return model;
    }
    
    @RequestMapping(value = "/delete/{id}")
    public ModelAndView deleteEmployee(@ModelAttribute("employee") Employee employee,@PathVariable("id") int id)
    {
    	employeeDao.deleteEmployee(id);
        
        return new ModelAndView("redirect:/employees");
    }

    @RequestMapping(value = "/employees")
    public ModelAndView listEmployees(@ModelAttribute("employee") Employee employee)
    {
        ModelAndView model = new ModelAndView("employees");

        List employeeList = employeeDao.getAllEmployees();
        System.out.println(employeeList);
        model.addObject("employeeList", employeeList);
        
        return model;
    }

}
