package wp.wp_work_4_2.service;

import wp.wp_work_4_2.entity.Execution;

import java.util.List;

public interface ExecutionService {
    List<Execution> getAllExecutions();
    Execution saveExecution(Execution Execution);
    Execution getExecutionById(Long id);
    Execution updateExecution(Execution Execution);
    void deleteExecutionById(Long id);
}