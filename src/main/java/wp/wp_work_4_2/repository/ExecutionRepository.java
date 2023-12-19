package wp.wp_work_4_2.repository;

import org.springframework.data.repository.CrudRepository;
import wp.wp_work_4_2.entity.Execution;

import java.util.List;

public interface ExecutionRepository extends CrudRepository<Execution, Long> {
    public List<Execution> findAll();
//    public Execution findExecutionByFirstNameAndLastNameAndMiddleName(
//            String firstName,
//            String lastName,
//            String middleName
//    );
}