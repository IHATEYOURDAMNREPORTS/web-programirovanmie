package wp.wp_work_4_2.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import wp.wp_work_4_2.entity.Student;
import wp.wp_work_4_2.service.ExecutionService;
import wp.wp_work_4_2.service.StudentService;

@Controller
@RequiredArgsConstructor
@Log
public class StudentController {
    private final StudentService studentService;
    private final ExecutionService executionService;

    @GetMapping("/students")
    @ModelAttribute
    public String listStudents(Model model){
        model.addAttribute("students", studentService.getAllStudents());
        return "executions";
    }
    @GetMapping("students/new")
    public String createStudentForm(Model model){
        Student student = new Student();
        model.addAttribute("student", student);
        model.addAttribute("executions", executionService.getAllExecutions());
        return "create_student";
    }
    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student) throws Exception{
        studentService.saveStudent(student);
        return "redirect:/students";
    }
    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model){
        model.addAttribute("student", studentService.getStudentById(id));
        model.addAttribute("executions", executionService.getAllExecutions());
        return "edit_student";
    }
    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model) {
        Student existingStudent = studentService.getStudentById(id);
        existingStudent.setId(id);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setMiddleName(student.getMiddleName());
        existingStudent.setExecutions(student.getExecutions());
        studentService.updateStudent(existingStudent);
        return "redirect:/students";
    }
    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }
    @GetMapping("/student/view/{id}")
    public String viewStudentForm(@PathVariable Long id, Model model){
        model.addAttribute("student", studentService.getStudentById(id));
        model.addAttribute("executions", executionService.getAllExecutions());
        return "edit_student";
    }
}
