package hu.webler.weblerspringbasicmultiwindowsthymeleaf.bootstrap;

import hu.webler.weblerspringbasicmultiwindowsthymeleaf.model.Student;
import lombok.Getter;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Getter
public class DataInitializer implements ApplicationRunner {

    private final List<Student> students = new ArrayList<>();
    @Override
    public void run(ApplicationArguments args) throws Exception {
        students.add(new Student("John", "Doe", "M."));
        students.add(new Student("Jane", "Doe", ""));
    }
}
