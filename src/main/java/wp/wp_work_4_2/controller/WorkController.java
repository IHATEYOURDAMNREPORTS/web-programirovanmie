package wp.wp_work_4_2.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import wp.wp_work_4_2.entity.Work;
import wp.wp_work_4_2.service.ExecutionService;
import wp.wp_work_4_2.service.StudentService;
import wp.wp_work_4_2.service.WorkService;

@Controller
@RequiredArgsConstructor
@Log
public class WorkController {
    private final WorkService workService;
    private final ExecutionService executionService;

    @GetMapping("/works")
    @ModelAttribute
    public String listWorks(Model model){
        model.addAttribute("works", workService.getAllWorks());
        return "works";
    }
    @GetMapping("works/new")
    public String createWorkForm(Model model){
        Work work = new Work();
        model.addAttribute("work", work);
        model.addAttribute("executions", executionService.getAllExecutions());
        return "create_work";
    }
    @PostMapping("/works")
    public String saveWork(@ModelAttribute("work") Work work) throws Exception{
        workService.saveWork(work);
        return "redirect:/works";
    }
    @GetMapping("/works/edit/{id}")
    public String editWorkForm(@PathVariable Long id, Model model){
        model.addAttribute("work", workService.getWorkById(id));
        model.addAttribute("executions", executionService.getAllExecutions());
        return "edit_work";
    }
    @PostMapping("/works/{id}")
    public String updateWork(@PathVariable Long id, @ModelAttribute("Work") Work work, Model model) {
        Work existingWork = workService.getWorkById(id);
        existingWork.setId(id);
        existingWork.setCourse(work.getCourse());
        existingWork.setName(work.getName());
        existingWork.setExecutions(work.getExecutions());
        workService.updateWork(existingWork);
        return "redirect:/works";
    }
    @GetMapping("/works/{id}")
    public String deleteWork(@PathVariable Long id) {
        workService.deleteWorkById(id);
        return "redirect:/works";
    }
    @GetMapping("/work/view/{id}")
    public String viewWorkForm(@PathVariable Long id, Model model){
        model.addAttribute("work", workService.getWorkById(id));
        model.addAttribute("executions", executionService.getAllExecutions());
        return "edit_work";
    }
}
