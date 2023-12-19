package wp.wp_work_4_2.service.impl;

import org.springframework.stereotype.Service;
import wp.wp_work_4_2.entity.Work;
import wp.wp_work_4_2.repository.WorkRepository;
import wp.wp_work_4_2.service.WorkService;

import java.util.List;

@Service
public class WorkServiceImpl implements WorkService {
    private final WorkRepository WorkRepository;
    public WorkServiceImpl(WorkRepository WorkRepository){
        super();
        this.WorkRepository = WorkRepository;
    }
    @Override
    public List<Work> getAllWorks() {
        return WorkRepository.findAll();
    }

    @Override
    public Work saveWork(Work Work) {
        return WorkRepository.save(Work);
    }

    @Override
    public Work getWorkById(Long id) {
        return WorkRepository.findById(id).get();
    }

    @Override
    public Work updateWork(Work Work) {
        return WorkRepository.save(Work);
    }

    @Override
    public void deleteWorkById(Long id) {
        WorkRepository.deleteById(id);
    }
}