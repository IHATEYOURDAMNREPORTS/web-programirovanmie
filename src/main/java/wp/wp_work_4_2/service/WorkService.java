package wp.wp_work_4_2.service;

import wp.wp_work_4_2.entity.Work;

import java.util.List;

public interface WorkService {
    List<Work> getAllWorks();
    Work saveWork(Work Work);
    Work getWorkById(Long id);
    Work updateWork(Work Work);
    void deleteWorkById(Long id);
}
