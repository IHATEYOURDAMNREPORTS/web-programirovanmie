package wp.wp_work_4_2.service.impl;

import org.springframework.stereotype.Service;
import wp.wp_work_4_2.entity.Execution;
import wp.wp_work_4_2.repository.ExecutionRepository;
import wp.wp_work_4_2.service.ExecutionService;

import java.util.List;

@Service
public class ExecutionServiceImpl implements ExecutionService {
    private final ExecutionRepository ExecutionRepository;
    public ExecutionServiceImpl(ExecutionRepository ExecutionRepository){
        super();
        this.ExecutionRepository = ExecutionRepository;
    }
    @Override
    public List<Execution> getAllExecutions() {
        return ExecutionRepository.findAll();
    }

    @Override
    public Execution saveExecution(Execution Execution) {
        return ExecutionRepository.save(Execution);
    }

    @Override
    public Execution getExecutionById(Long id) {
        return ExecutionRepository.findById(id).get();
    }

    @Override
    public Execution updateExecution(Execution Execution) {
        return ExecutionRepository.save(Execution);
    }

    @Override
    public void deleteExecutionById(Long id) {
        ExecutionRepository.deleteById(id);
    }
}
