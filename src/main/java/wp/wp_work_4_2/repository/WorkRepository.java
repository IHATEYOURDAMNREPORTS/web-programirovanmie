package wp.wp_work_4_2.repository;

import org.springframework.data.repository.CrudRepository;
import wp.wp_work_4_2.entity.Work;

import java.util.List;

public interface WorkRepository extends CrudRepository<Work, Long> {
    public List<Work> findAll();
//    public Work findWorkByFirstNameAndLastNameAndMiddleName(
//            String firstName,
//            String lastName,
//            String middleName
//    );
}
