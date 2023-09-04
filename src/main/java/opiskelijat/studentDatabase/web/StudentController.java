package opiskelijat.studentDatabase.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import opiskelijat.studentDatabase.domain.Student;

@Controller
public class StudentController {
	
	@RequestMapping("/hello")
	public String showStudents(Model model){
		
	List<Student> opiskelijat = new ArrayList<>();
	opiskelijat.add(new Student("Maija", "Mäkelä"));
	opiskelijat.add(new Student("Elisa", "Aho"));
	opiskelijat.add(new Student("Kalle", "Koski"));
	
	model.addAttribute("opiskelijat", opiskelijat);
	return "studentList.html";
	}

}
