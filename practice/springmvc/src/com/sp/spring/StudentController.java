package com.sp.spring;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;

@Controller
public class StudentController {
	@Autowired
	   ServletContext context; 

	   @RequestMapping(value = "/fileUploadPage", method = RequestMethod.GET)
	   public ModelAndView fileUploadPage() {
	      FileModel file = new FileModel();
	      ModelAndView modelAndView = new ModelAndView("fileUpload", "command", file);
	      return modelAndView;
	   }

	   @RequestMapping(value="/fileUploadPage", method = RequestMethod.POST)
	   public String fileUpload(@Validated FileModel file, BindingResult result, ModelMap model) throws IOException {
	      if (result.hasErrors()) {
	         System.out.println("validation errors");
	         return "fileUploadPage";
	      } else {            
	         System.out.println("Fetching file");
	         MultipartFile multipartFile = file.getFile();
	         String uploadPath = context.getRealPath("") + File.separator + "upload" + File.separator;
	         //Now do something with file...
	         FileCopyUtils.copy(file.getFile().getBytes(), new File(uploadPath+file.getFile().getOriginalFilename()));
	         String fileName = multipartFile.getOriginalFilename();
	         model.addAttribute("fileName", fileName);
	         return "success";
	      }
	   }
	   
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	   public String ff(ModelMap model) {
//		 System.out.println("hello world");
	     
	      return "index";
	 }
	
	@RequestMapping(value = "/staticPage", method = RequestMethod.GET)
	   public String redirect() {

	      return "redirect:/hello";
	   }

	   @RequestMapping(value = "/hello", method = RequestMethod.GET)
	   public String print(ModelMap model) {
		 System.out.println("hello world");
	      model.addAttribute("message", "Hello Spring MVC Framework!");
	      return "hello";
	 }
	   
   @RequestMapping(value = "/student", method = RequestMethod.GET)
   public ModelAndView student() {
	 
      return new ModelAndView("student", "command", new Student());
   }

   @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
   public String addStudent(@ModelAttribute("SpringWeb")Student student, 
   ModelMap model) {
      model.addAttribute("name", student.getName());
      model.addAttribute("age", student.getAge());
      model.addAttribute("id", student.getId());

      return "result";
   }
   
   @RequestMapping(value = "/user",method = RequestMethod.GET,produces="text/html; charset=UTF-8")
   public ModelAndView user(){
	   
	   return new ModelAndView("user","command",new User());
   }
   @RequestMapping(value ="/addUser",method = RequestMethod.POST,produces="text/html; charset=UTF-8")
   public String addUser(@ModelAttribute("SpringWeb")User user,ModelMap model){
	   System.out.println(user);
	   model.addAttribute("username",user.getUsername());
	   model.addAttribute("password", user.getPassword());
	   model.addAttribute("address", user.getAddress());
	   model.addAttribute("receivePaper", user.isReceivePaper());
	   model.addAttribute("favoriteFrameworks", user.getFavoriteFrameworks());
	   return "userlist";
   }
   
   @ModelAttribute("webFrameworkList")
   public List<String> getWebFrameworkList(){
      List<String> webFrameworkList = new ArrayList<String>();
      webFrameworkList.add("Spring MVC");
      webFrameworkList.add("Spring Boot");
      webFrameworkList.add("Struts 2");
      webFrameworkList.add("Apache Hadoop");
      return webFrameworkList;
   }

}