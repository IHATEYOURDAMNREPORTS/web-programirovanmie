package wp.wp_work_4_2.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import wp.wp_work_4_2.entity.Execution;
import wp.wp_work_4_2.service.ExecutionService;
import wp.wp_work_4_2.service.StudentService;
import wp.wp_work_4_2.service.WorkService;

@Controller
@RequiredArgsConstructor
@Log
public class ExecutionController {
    private final StudentService studentService;
    private final WorkService workService;
    private final ExecutionService executionService;

    @GetMapping("/executions")
    @ModelAttribute
    public String listExecutions(Model model){
        model.addAttribute("executions", executionService.getAllExecutions());
        return "executions";
    }
    @GetMapping("executions/new")
    public String createExecutionForm(Model model){
        Execution Execution = new Execution();
        model.addAttribute("execution", Execution);
        model.addAttribute("works", workService.getAllWorks());
        model.addAttribute("students", studentService.getAllStudents());
        return "create_execution";
    }
    @PostMapping("/executions")
    public String saveExecution(@ModelAttribute("execution") Execution execution) throws Exception{
        executionService.saveExecution(execution);
        return "redirect:/executions";
    }
    @GetMapping("/executions/edit/{id}")
    public String editExecutionForm(@PathVariable Long id, Model model){
        model.addAttribute("execution", executionService.getExecutionById(id));
        model.addAttribute("works", workService.getAllWorks());
        model.addAttribute("students", studentService.getAllStudents());
        return "edit_execution";
    }
    @PostMapping("/executions/{id}")
    public String updateExecution(@PathVariable Long id, @ModelAttribute("execution") Execution execution, Model model) {
        Execution existingExecution = executionService.getExecutionById(id) ;
        existingExecution.setId(id);
        existingExecution.setStatus(execution.getStatus());
        existingExecution.setWork(execution.getWork());
        existingExecution.setStudent(execution.getStudent());
        executionService.updateExecution(existingExecution);
        return "redirect:/executions";
    }
    @GetMapping("/executions/{id}")
    public String deleteExecution(@PathVariable Long id) {
        executionService.deleteExecutionById(id);
        return "redirect:/executions";
    }
    @GetMapping("/execution/view/{id}")
    public String viewExecutionForm(@PathVariable Long id, Model model){
        model.addAttribute("execution", executionService.getExecutionById(id));
        model.addAttribute("works", workService.getAllWorks());
        model.addAttribute("students", studentService.getAllStudents());
        return "view_execution";
    }
}
