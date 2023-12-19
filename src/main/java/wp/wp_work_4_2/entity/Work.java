package wp.wp_work_4_2.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "works")
@Data
@NoArgsConstructor
public class Work {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial", insertable=false, updatable=false)
    private Long id;

    @Column(columnDefinition = "name", nullable = false)
    private String name;

    @Column(columnDefinition = "course", nullable = false)
    private String course;

    @OneToMany(mappedBy =  "work")
    private Set<Execution> executions = new HashSet<>();
}