package wp.wp_work_4_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ImportResource;
import wp.wp_work_4_2.repository.ExecutionRepository;
import wp.wp_work_4_2.repository.StudentRepository;
import wp.wp_work_4_2.repository.WorkRepository;

@SpringBootApplication
@ImportResource("classpath:spring/spring-security.xml")
public class WpWork42Application {

	@Autowired
	ExecutionRepository executionRepository;
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private WorkRepository workRepository;

	public static void main(String[] args) {
		new SpringApplicationBuilder(WpWork42Application.class)
				.bannerMode(Banner.Mode.OFF)
				.run(args);
	}
}
